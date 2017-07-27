package calculation.adult;

import domains.CmedStatusRemarks;
import domains.UserMeasurement;

/**
 * Created by rezaul on 5/16/17.
 */
public class BMICalculatorAdult {

    private static final String BMI_UNDERWEIGHT = "underweight";
    private static final String BMI_NORMAL = "normal";
    private static final String BMI_OVERWEIGHT = "overweight";
    private static final String BMI_OBESITY = "obesity";

    private static final String BMI_SEVERITY_UNDERWEIGHT = "alarming";
    private static final String BMI_SEVERITY_NORMAL = "healthy";
    private static final String BMI_SEVERITY_OVERWEIGHT = "alarming";
    private static final String BMI_SEVERITY_OBESITY = "emergency";

    public static CmedStatusRemarks examineAdultBMI(UserMeasurement userMeasurement) {

       // userMeasurement.setValue2(getBMIValue(userMeasurement.getValue1(), userMeasurement.getValue3()));

        return getStatusAndRemarksForBMI(userMeasurement);

    }



    private static CmedStatusRemarks getStatusAndRemarksForBMI(UserMeasurement userMeasurement) {

        CmedStatusRemarks cmedStatusRemarks = new CmedStatusRemarks();

        final Double maxUnderWeight = 18.4, minNormal = 18.5, maxNormal = 24.9, minOverWeight = 25.0, maxOverWeight = 29.9, minObesity = 30.0;

        if (userMeasurement.getValue2() <= maxUnderWeight) {
            cmedStatusRemarks.setStatus(BMI_UNDERWEIGHT);
            cmedStatusRemarks.setSeverity(BMI_SEVERITY_UNDERWEIGHT);
        } else if (userMeasurement.getValue2() >= minNormal && userMeasurement.getValue2() <= maxNormal) {
            cmedStatusRemarks.setStatus(BMI_NORMAL);
            cmedStatusRemarks.setSeverity(BMI_SEVERITY_NORMAL);
        } else if (userMeasurement.getValue2() >= minOverWeight && userMeasurement.getValue2() <= maxOverWeight) {
            cmedStatusRemarks.setStatus(BMI_OVERWEIGHT);
            cmedStatusRemarks.setSeverity(BMI_SEVERITY_OVERWEIGHT);
        } else if (userMeasurement.getValue2() >= minObesity) {
            cmedStatusRemarks.setStatus(BMI_OBESITY);
            cmedStatusRemarks.setSeverity(BMI_SEVERITY_OBESITY);
        }

        cmedStatusRemarks.setRemarksFinal(minNormal+" - "+maxNormal);

        return cmedStatusRemarks;
    }


}
