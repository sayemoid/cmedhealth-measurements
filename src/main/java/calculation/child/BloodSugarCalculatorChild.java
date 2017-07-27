package calculation.child;


import domains.CmedPerson;
import domains.CmedStatusRemarks;
import domains.UserMeasurement;

/**
 * Author: rezaul || Date: 4/9/17.
 */
public class BloodSugarCalculatorChild {

    private static final String LOW = "low";
    private static final String NORMAL = "normal";
    private static final String HIGH = "high";

    private static final String SEVERITY_HEALTHY = "healthy";
    private static final String SEVERITY_EMERGENCY = "emergency";

    public static CmedStatusRemarks examineBloodSugar(UserMeasurement cmedMeasurement) {

        CmedPerson user = cmedMeasurement.getPerson();

        double minRate, maxRate;
        CmedStatusRemarks cmedStatusRemarks;

     if (user.getAgeInMonths() >= 12 && user.getAgeInMonths() <= 71) {

         minRate = 5.6;
         maxRate = 11.1;

         cmedStatusRemarks = getStatusForBloodSugar(cmedMeasurement.getValue1(), minRate, maxRate);

     } else if (user.getAgeInMonths() >= 72 && user.getAgeInMonths() <= 155) {

         minRate = 5;
         maxRate = 10;

         cmedStatusRemarks = getStatusForBloodSugar(cmedMeasurement.getValue1(), minRate, maxRate);

     } else if (user.getAgeInMonths() >= 156 && user.getAgeInMonths() <= 227)  {

         minRate = 5;
         maxRate = 8.3;

         cmedStatusRemarks = getStatusForBloodSugar(cmedMeasurement.getValue1(), minRate, maxRate);

     } else if (user.getAgeInMonths() >= 228)  {

         minRate = 3.33;
         maxRate = 7.8;

         cmedStatusRemarks = getStatusForBloodSugar(cmedMeasurement.getValue1(), minRate, maxRate);

     }  else {

         cmedStatusRemarks= new CmedStatusRemarks();
         cmedStatusRemarks.setStatus("Unknown");
         cmedStatusRemarks.setRemarksFinal("Unknown-Unknown");
     }

        return cmedStatusRemarks;

    }

    private static CmedStatusRemarks getStatusForBloodSugar(Double value1, double minRate, double maxRate) {

        CmedStatusRemarks cmedStatusRemarks = new CmedStatusRemarks();
        cmedStatusRemarks.setRemarksFinal(minRate+" - "+maxRate);

        if (value1 >= minRate && value1 <= maxRate) {
            cmedStatusRemarks.setStatus(NORMAL);
            cmedStatusRemarks.setSeverity(SEVERITY_HEALTHY);
        } else if (value1 < minRate) {
            cmedStatusRemarks.setStatus(LOW);
            cmedStatusRemarks.setSeverity(SEVERITY_EMERGENCY);
        } else if (value1 > maxRate) {
            cmedStatusRemarks.setStatus(HIGH);
            cmedStatusRemarks.setSeverity(SEVERITY_EMERGENCY);
        } else {
            cmedStatusRemarks.setStatus("unknown");
        }

        return cmedStatusRemarks;
    }
}
