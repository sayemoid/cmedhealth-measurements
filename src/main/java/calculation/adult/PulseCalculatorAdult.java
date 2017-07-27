package calculation.adult;


import domains.CmedStatusRemarks;
import domains.UserMeasurement;

/**
 * Author: rezaul || Date: 4/3/17.
 */

public class PulseCalculatorAdult {

    public static final String ABNORMAL = "abnormal";
    public static final String NORMAL = "normal";

    public static final String SEVERITY_ABNORMAL = "alarming";
    public static final String SEVERITY_NORMAL = "healthy";

    public static CmedStatusRemarks examineAdultPulse(UserMeasurement userMeasurement) {

        return getStatusAndRemarksForPulse(userMeasurement);

    }

    private static CmedStatusRemarks getStatusAndRemarksForPulse(UserMeasurement userMeasurement) {

        CmedStatusRemarks cmedStatusRemarks = new CmedStatusRemarks();

        final Double normalMin = 60.0, normalMax = 100.0;

        if (userMeasurement.getValue1() >= normalMin && userMeasurement.getValue1() <= normalMax) {

            cmedStatusRemarks.setStatus(NORMAL);
            cmedStatusRemarks.setSeverity(SEVERITY_NORMAL);
            cmedStatusRemarks.setRemarksFinal(normalMin +" - "+normalMax);

        } else {

            cmedStatusRemarks.setRemarksFinal(normalMin +" - "+normalMax);
            cmedStatusRemarks.setStatus(ABNORMAL);
            cmedStatusRemarks.setSeverity(SEVERITY_ABNORMAL);

        }

        return cmedStatusRemarks;

    }


}
