package calculation.common;


import domains.CmedStatusRemarks;
import domains.UserMeasurement;

/**
 * Created by rezaul on 5/16/17.
 */

public class TemparatureCalculatorCommon {


    public static final String NORMAL = "normal";
    public static final String ALARMING_LOW = "low";
    public static final String ALARMING_FEVER = "fever";
    public static final String EMERGENCY = "emergency";

    public static final String SEVERITY_NORMAL = "healthy";
    public static final String SEVERITY_ALARMING_LOW = "alarming";
    public static final String SEVERITY_ALARMING_FEVER = "alarming";
    public static final String SEVERITY_EMERGENCY = "emergency";

    public static CmedStatusRemarks examineTemp(UserMeasurement userMeasurement) {

        return getStatusAndRemarksForTemp(userMeasurement);

    }

    private static CmedStatusRemarks getStatusAndRemarksForTemp(UserMeasurement userMeasurement) {

        CmedStatusRemarks cmedStatusRemarks = new CmedStatusRemarks();

        final Double minNormal = 97.7, maxNormal = 99.5, minLow = 95.1, maxLow = 97.6, minFever = 99.5, maxFever = 103.9, maxLowEmergency = 95.0, minHighEmergency = 104.0;

        if (userMeasurement.getValue1() <= maxLowEmergency) {
            cmedStatusRemarks.setStatus(EMERGENCY);
            cmedStatusRemarks.setSeverity(SEVERITY_EMERGENCY);
        } else if (userMeasurement.getValue1() >= minNormal && userMeasurement.getValue1() <= maxNormal) {
            cmedStatusRemarks.setStatus(NORMAL);
            cmedStatusRemarks.setSeverity(SEVERITY_NORMAL);
        } else if (userMeasurement.getValue1() >= minLow && userMeasurement.getValue1() <= maxLow) {
            cmedStatusRemarks.setStatus(ALARMING_LOW);
            cmedStatusRemarks.setSeverity(SEVERITY_ALARMING_LOW);
        } else if (userMeasurement.getValue1() >= minFever && userMeasurement.getValue1() <= maxFever) {
            cmedStatusRemarks.setStatus(ALARMING_FEVER);
            cmedStatusRemarks.setSeverity(SEVERITY_ALARMING_FEVER);
        } else if (userMeasurement.getValue1() >= minHighEmergency){
            userMeasurement.setStatus(EMERGENCY);
            cmedStatusRemarks.setSeverity(SEVERITY_EMERGENCY);
        } else {
            userMeasurement.setStatus("unknown");
            cmedStatusRemarks.setSeverity("unknown");

        }

        cmedStatusRemarks.setRemarksFinal(minNormal+" - "+maxNormal);

        return cmedStatusRemarks;
    }
}
