package calculation.common;


import domains.CmedStatusRemarks;
import domains.UserMeasurement;

/**
 * Created by rezaul on 5/16/17.
 */
public class Spo2CalculatorCommon {

    private static final String NORMAL = "normal";
    private static final String ALARMING = "alarming";
    private static final String EMERGENCY = "emergency";

    private static final String SEVERITY_NORMAL = "healthy";
    private static final String SEVERITY_ALARMING = "alarming";
    private static final String SEVERITY_EMERGENCY = "emergency";

    public static CmedStatusRemarks examineSpo2(UserMeasurement userMeasurement) {

        return getStatusAndRemarksForSpo2(userMeasurement);

    }

    private static CmedStatusRemarks getStatusAndRemarksForSpo2(UserMeasurement userMeasurement) {

        CmedStatusRemarks cmedStatusRemarks = new CmedStatusRemarks();

        final Double minNormal = 95.0, maxNormal = 100.0, minAlarming = 91.0, maxAlarming = 94.0, maxEmergency = 90.0;

        if (userMeasurement.getValue1() <= maxEmergency) {
            cmedStatusRemarks.setStatus(EMERGENCY);
            cmedStatusRemarks.setSeverity(SEVERITY_EMERGENCY);
        } else if (userMeasurement.getValue1() >= minAlarming && userMeasurement.getValue1() <= maxAlarming) {
            cmedStatusRemarks.setStatus(ALARMING);
            cmedStatusRemarks.setSeverity(SEVERITY_ALARMING);
        } else if (userMeasurement.getValue1() >= minNormal && userMeasurement.getValue1() <= maxNormal) {
            cmedStatusRemarks.setStatus(NORMAL);
            cmedStatusRemarks.setSeverity(SEVERITY_NORMAL);
        } else {
            cmedStatusRemarks.setStatus("unknown");
            cmedStatusRemarks.setSeverity("unknown");

        }

        cmedStatusRemarks.setRemarksFinal(minNormal+" - "+maxNormal);

        return cmedStatusRemarks;
    }
}
