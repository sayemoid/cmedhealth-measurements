package calculation.child;


import domains.CmedPerson;
import domains.CmedStatusRemarks;
import domains.UserMeasurement;

/**
 * Author: rezaul || Date: 4/3/17.
 */
public class BloodPressureCalculatorChild {

    private static final String LOW = "low";
    private static final String NORMAL = "normal";
    private static final String HIGH = "high";

    private static final String SEVERITY_HEALTHY = "healthy";
    private static final String SEVERITY_EMERGENCY = "emergency";

    public static CmedStatusRemarks examineChildBP(UserMeasurement userMeasurement) {

        CmedPerson user = userMeasurement.getPerson();

        int minSysRate, maxSysRate, minDiRate, maxDiRate;
        CmedStatusRemarks status ;

        // 1-2 yrs
        if (user.getAgeInMonths() >= 12 && user.getAgeInMonths() <= 35) {
            minSysRate = 86;
            maxSysRate = 106;
            minDiRate = 42;
            maxDiRate = 63;
            status = getStatusForBP(userMeasurement.getValue1(), userMeasurement.getValue2(),  minSysRate, maxSysRate, minDiRate, maxDiRate);
        } else if (user.getAgeInMonths() >= 36 && user.getAgeInMonths() <= 71) {
            minSysRate = 89;
            maxSysRate = 112;
            minDiRate = 46;
            maxDiRate = 72;
            status = getStatusForBP(userMeasurement.getValue1(), userMeasurement.getValue2(),  minSysRate, maxSysRate, minDiRate, maxDiRate);
        } else if (user.getAgeInMonths() >= 72 && user.getAgeInMonths() <= 119) {

            minSysRate = 97;
            maxSysRate = 115;
            minDiRate = 57;
            maxDiRate = 76;
            status = getStatusForBP(userMeasurement.getValue1(), userMeasurement.getValue2(),  minSysRate, maxSysRate, minDiRate, maxDiRate);

        } else if (user.getAgeInMonths() >= 120 && user.getAgeInMonths() <= 143) {
            minSysRate = 102;
            maxSysRate = 120;
            minDiRate = 61;
            maxDiRate = 80;
            status = getStatusForBP(userMeasurement.getValue1(), userMeasurement.getValue2(),  minSysRate, maxSysRate, minDiRate, maxDiRate);

        } else if (user.getAgeInMonths() >= 144 && user.getAgeInMonths() <= 240) {
            minSysRate = 110;
            maxSysRate = 131;
            minDiRate = 64;
            maxDiRate = 83;
            status = getStatusForBP(userMeasurement.getValue1(), userMeasurement.getValue2(),  minSysRate, maxSysRate, minDiRate, maxDiRate);

        } else if (user.getAgeInMonths() >= 241) {
            minSysRate = 90;
            maxSysRate = 120;
            minDiRate = 61;
            maxDiRate = 80;
            status = getStatusForBP(userMeasurement.getValue1(), userMeasurement.getValue2(),  minSysRate, maxSysRate, minDiRate, maxDiRate);

        } else
        {
            CmedStatusRemarks finalStatusRemarks = new CmedStatusRemarks();
            finalStatusRemarks.setStatus("unknown");
            finalStatusRemarks.setRemarksFinal("unknown");

            status = finalStatusRemarks;
        }

        return status;
    }

    private static CmedStatusRemarks getStatusForBP(Double value1, Double value2, int minSysRate, int maxSysRate, int minDiRate, int maxDiRate) {

        CmedStatusRemarks finalStatusRemarks = new CmedStatusRemarks();


        String sysStatus, diStatus;

        if (value1 < minSysRate ) {
            sysStatus =  "low";
        } else if (value1 > maxSysRate) {
            sysStatus = "high";
        } else {
            sysStatus = "normal";
        }

        if (value2 < minDiRate) {
            diStatus = "low";
        } else if (value2 > maxDiRate) {
            diStatus = "high";
        } else {
            diStatus = "normal";
        }

        if (sysStatus.equals(diStatus)) {
            if (sysStatus.equals("low")) {
                finalStatusRemarks.setStatus(LOW);
                finalStatusRemarks.setSeverity(SEVERITY_EMERGENCY);
                finalStatusRemarks.setRemarksFinal(minSysRate+"-"+maxSysRate+"-"+minDiRate+"-"+maxDiRate);
                return finalStatusRemarks;
            } else if (sysStatus.equals("high")) {
                finalStatusRemarks.setStatus(HIGH);
                finalStatusRemarks.setSeverity(SEVERITY_EMERGENCY);
                finalStatusRemarks.setRemarksFinal(minSysRate+"-"+maxSysRate+"-"+minDiRate+"-"+maxDiRate);
                return finalStatusRemarks;
            } else {
                finalStatusRemarks.setStatus(NORMAL);
                finalStatusRemarks.setSeverity(SEVERITY_HEALTHY);
                finalStatusRemarks.setRemarksFinal(minSysRate+"-"+maxSysRate+"-"+minDiRate+"-"+maxDiRate);
                return finalStatusRemarks;
            }
        } else if (sysStatus.equals("normal") && (diStatus.equals("low"))) {
            finalStatusRemarks.setStatus(LOW);
            finalStatusRemarks.setSeverity(SEVERITY_EMERGENCY);
            finalStatusRemarks.setRemarksFinal(minSysRate+"-"+maxSysRate+"-"+minDiRate+"-"+maxDiRate);
            return finalStatusRemarks;
        } else if (sysStatus.equals("normal") && (diStatus.equals("high"))) {
            finalStatusRemarks.setStatus(HIGH);
            finalStatusRemarks.setSeverity(SEVERITY_EMERGENCY);
            finalStatusRemarks.setRemarksFinal(minSysRate+"-"+maxSysRate+"-"+minDiRate+"-"+maxDiRate);
            return finalStatusRemarks;        }
            else if (sysStatus.equals("low") && (diStatus.equals("normal"))) {
            finalStatusRemarks.setStatus(LOW);
            finalStatusRemarks.setSeverity(SEVERITY_EMERGENCY);
            finalStatusRemarks.setRemarksFinal(minSysRate+"-"+maxSysRate+"-"+minDiRate+"-"+maxDiRate);
            return finalStatusRemarks;
        } else if (sysStatus.equals("low") && (diStatus.equals("low"))) {
            finalStatusRemarks.setStatus(LOW);
            finalStatusRemarks.setSeverity(SEVERITY_EMERGENCY);
            finalStatusRemarks.setRemarksFinal(minSysRate+"-"+maxSysRate+"-"+minDiRate+"-"+maxDiRate);
            return finalStatusRemarks;        }
            else if (sysStatus.equals("low") && (diStatus.equals("high"))) {
            finalStatusRemarks.setStatus(HIGH);
            finalStatusRemarks.setSeverity(SEVERITY_EMERGENCY);
            finalStatusRemarks.setRemarksFinal(minSysRate+"-"+maxSysRate+"-"+minDiRate+"-"+maxDiRate);
            return finalStatusRemarks;        }
            else if (sysStatus.equals("high") && (diStatus.equals("high"))) {
            finalStatusRemarks.setStatus(HIGH);
            finalStatusRemarks.setSeverity(SEVERITY_EMERGENCY);
            finalStatusRemarks.setRemarksFinal(minSysRate+"-"+maxSysRate+"-"+minDiRate+"-"+maxDiRate);
            return finalStatusRemarks;        }
            else if (sysStatus.equals("high") && (diStatus.equals("normal"))) {
            finalStatusRemarks.setStatus(HIGH);
            finalStatusRemarks.setSeverity(SEVERITY_EMERGENCY);
            finalStatusRemarks.setRemarksFinal(minSysRate+"-"+maxSysRate+"-"+minDiRate+"-"+maxDiRate);
            return finalStatusRemarks;        }
            else if (sysStatus.equals("high") && (diStatus.equals("low"))) {
            finalStatusRemarks.setStatus(HIGH);
            finalStatusRemarks.setSeverity(SEVERITY_EMERGENCY);
            finalStatusRemarks.setRemarksFinal(minSysRate+"-"+maxSysRate+"-"+minDiRate+"-"+maxDiRate);
            return finalStatusRemarks;        }
            else {
            finalStatusRemarks.setStatus("unknown");
            finalStatusRemarks.setSeverity("unknown");
            finalStatusRemarks.setRemarksFinal(minSysRate+"-"+maxSysRate+"-"+minDiRate+"-"+maxDiRate);
            return finalStatusRemarks;
        }
    }

}
