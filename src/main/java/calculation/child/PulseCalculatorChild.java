package calculation.child;


import domains.CmedPerson;
import domains.CmedStatusRemarks;
import domains.UserMeasurement;

/**
 * Author: rezaul || Date: 4/3/17.
 */

public class PulseCalculatorChild {

    private static final String LOW = "low";
    private static final String NORMAL = "normal";
    private static final String HIGH = "high";
    private static final String UNKNOWN = "unknown";

    private static final String SEVERITY_ABNORMAL = "alarming";
    private static final String SEVERITY_NORMAL = "healthy";

    public static CmedStatusRemarks examinePulse(UserMeasurement userMeasurement) {

        CmedPerson user = userMeasurement.getPerson();

        int minRate, maxRate;
        CmedStatusRemarks cmedStatusRemarks = new CmedStatusRemarks();

        // 1-2 yrs
        if (user.getAgeInMonths() >= 12 && user.getAgeInMonths() <= 35) {
                minRate = 98;
                maxRate = 140;
            cmedStatusRemarks = getStatusForPulse(userMeasurement.getValue1(), minRate, maxRate);

            //3-5 yrs
        } else if (user.getAgeInMonths() >= 36 && user.getAgeInMonths() <= 71) {

                minRate = 80;
                maxRate = 120;
                cmedStatusRemarks = getStatusForPulse(userMeasurement.getValue1(), minRate, maxRate);


        } else if (user.getAgeInMonths() >= 72 && user.getAgeInMonths() <= 143){
                minRate = 75;
                maxRate = 118;
                cmedStatusRemarks = getStatusForPulse(userMeasurement.getValue1(), minRate, maxRate);

        } else if(user.getAgeInMonths() >= 144){
                minRate = 60;
                maxRate = 100;
                cmedStatusRemarks = getStatusForPulse(userMeasurement.getValue1(), minRate, maxRate);

        } else {

            cmedStatusRemarks.setStatus(UNKNOWN);
            cmedStatusRemarks.setRemarksFinal(UNKNOWN+" - "+UNKNOWN);
        }

        return  cmedStatusRemarks;

    }

    private static CmedStatusRemarks getStatusForPulse(Double value1, int minRate, int maxRate) {

        CmedStatusRemarks cmedStatusRemarks = new CmedStatusRemarks();

        if (value1 >= minRate && value1 <= maxRate) {
            cmedStatusRemarks.setStatus(NORMAL);
            cmedStatusRemarks.setSeverity(SEVERITY_NORMAL);
        } else if (value1 < minRate) {
            cmedStatusRemarks.setStatus(LOW);
            cmedStatusRemarks.setSeverity(SEVERITY_ABNORMAL);
        } else if (value1 > maxRate) {
            cmedStatusRemarks.setStatus(HIGH);
            cmedStatusRemarks.setSeverity(SEVERITY_ABNORMAL);
        } else {
            cmedStatusRemarks.setStatus(UNKNOWN);
            cmedStatusRemarks.setSeverity(UNKNOWN);
        }

        cmedStatusRemarks.setRemarksFinal(minRate+" - "+maxRate);

        return cmedStatusRemarks;

    }


}
