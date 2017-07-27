package calculation.adult;


import domains.CmedStatusRemarks;
import domains.UserMeasurement;
import domains.enums.BloodSugarMeasurementTime;

/**
 * Created by rezaul on 5/16/17.
 */
public class BloodSugarAdult {

    public static final String DIABETES_VERY_LOW = "very_low";
    public static final String DIABETES_LOW = "low";
    public static final String DIABETES_NORMAL = "normal";
    public static final String DIABETES_HIGH = "high";
    public static final String DIABETES_HIGH_NORMAL = "high_normal";
    public static final String DIABETES_VERY_HIGH = "very_high";

    public static final String DIABETES_SEVERITY_VERY_LOW = "emergency";
    public static final String DIABETES_SEVERITY_LOW = "alarming";
    public static final String DIABETES_SEVERITY_NORMAL = "healthy";
    public static final String DIABETES_SEVERITY_HIGH = "emergency";
    public static final String DIABETES_SEVERITY_HIGH_NORMAL = "alarming";
    public static final String DIABETES_SEVERITY_VERY_HIGH = "emergency";

    public static CmedStatusRemarks examineAdultBloodSugar(UserMeasurement userMeasurement, String bloodSugarMeasurementTimeTag) {

        CmedStatusRemarks cmedStatusRemarks = new CmedStatusRemarks();

        String[] tags = bloodSugarMeasurementTimeTag.split("_");
        String bloodSugarMeasurementTimeTagShortCode = tags[0];

        System.out.println("TAG: "+bloodSugarMeasurementTimeTagShortCode);

        if (bloodSugarMeasurementTimeTagShortCode.equals(BloodSugarMeasurementTime.BEFORE.getCode())) {
            final Double maxVeryLow = 2.8, minLow = 2.9, maxLow = 3.9, minNormal = 4.0, maxNormal = 6.0, minHighNormal = 6.1, maxHighNormal = 6.9, minVeryHigh = 7.0;
            cmedStatusRemarks = getStatusAndRemarksForBloodSugarAdult(userMeasurement, maxVeryLow, minLow, maxLow, minNormal, maxNormal, minHighNormal, maxHighNormal, minVeryHigh);
        } else if (bloodSugarMeasurementTimeTagShortCode.equals(BloodSugarMeasurementTime.AFTER.getCode())) {
            final Double maxVeryLow = 3.5, minLow = 3.6, maxLow = 5.5, minNormal = 5.6, maxNormal = 7.8, minHighNormal = 7.9, maxHighNormal = 11.0, minVeryHigh = 11.1;
            cmedStatusRemarks = getStatusAndRemarksForBloodSugarAdult(userMeasurement, maxVeryLow, minLow, maxLow, minNormal, maxNormal, minHighNormal, maxHighNormal, minVeryHigh);
        } else if (bloodSugarMeasurementTimeTagShortCode.equals(BloodSugarMeasurementTime.RANDOM.getCode())) {
            cmedStatusRemarks = getRandomStatusAndRemarksForBloodSugarAdult(userMeasurement);
        } else {
            cmedStatusRemarks.setRemarksFinal("unknown - unknown");
            cmedStatusRemarks.setStatus("unknown");
        }


        switch (bloodSugarMeasurementTimeTag) {
            case "BEFORE_DAWN":
                cmedStatusRemarks.setTagName(BloodSugarMeasurementTime.BEFORE_DAWN.getName());
                break;
            case "BEFORE_BREAKFAST":
                cmedStatusRemarks.setTagName(BloodSugarMeasurementTime.BEFORE_BREAKFAST.getName());
                break;
            case "BEFORE_LUNCH":
                cmedStatusRemarks.setTagName(BloodSugarMeasurementTime.BEFORE_LUNCH.getName());
                break;
            case "BEFORE_DINNER":
                cmedStatusRemarks.setTagName(BloodSugarMeasurementTime.BEFORE_DINNER.getName());
                break;
            case "BEFORE_SLEEP":
                cmedStatusRemarks.setTagName(BloodSugarMeasurementTime.BEFORE_SLEEP.getName());
                break;
            case "AFTER_BREAKFAST":
                cmedStatusRemarks.setTagName(BloodSugarMeasurementTime.AFTER_BREAKFAST.getName());
                break;
            case "AFTER_LUNCH":
                cmedStatusRemarks.setTagName(BloodSugarMeasurementTime.AFTER_LUNCH.getName());
                break;
            case "AFTER_DINNER":
                cmedStatusRemarks.setTagName(BloodSugarMeasurementTime.AFTER_DINNER.getName());
                break;
            case "RANDOM":
                cmedStatusRemarks.setTagName(BloodSugarMeasurementTime.RANDOM.getName());
                break;
            default:
                cmedStatusRemarks.setTagName(BloodSugarMeasurementTime.UNKNOWN.getName());
                break;
        }

        cmedStatusRemarks.setTagCode(bloodSugarMeasurementTimeTag);
        return cmedStatusRemarks;

    }

    private static CmedStatusRemarks getStatusAndRemarksForBloodSugarAdult(UserMeasurement userMeasurement, Double maxVeryLow, Double minLow, Double maxLow, Double minNormal, Double maxNormal, Double minHighNormal, Double maxHighNormal, Double minVeryHigh) {

        CmedStatusRemarks cmedStatusRemarks = new CmedStatusRemarks();

        if (userMeasurement.getValue1() <= maxVeryLow) {
            cmedStatusRemarks.setStatus(DIABETES_VERY_LOW);
            cmedStatusRemarks.setSeverity(DIABETES_SEVERITY_VERY_LOW);
        } else if (userMeasurement.getValue1() >= minLow && userMeasurement.getValue1() <= maxLow) {
            cmedStatusRemarks.setStatus(DIABETES_LOW);
            cmedStatusRemarks.setSeverity(DIABETES_SEVERITY_LOW);
        } else if (userMeasurement.getValue1() >= minNormal && userMeasurement.getValue1() <= maxNormal) {
            cmedStatusRemarks.setStatus(DIABETES_NORMAL);
            cmedStatusRemarks.setSeverity(DIABETES_SEVERITY_NORMAL);
        } else if (userMeasurement.getValue1() >= minHighNormal && userMeasurement.getValue1() <= maxHighNormal) {
            cmedStatusRemarks.setStatus(DIABETES_HIGH_NORMAL);
            cmedStatusRemarks.setSeverity(DIABETES_SEVERITY_HIGH_NORMAL);
        } else if (userMeasurement.getValue1() >= minVeryHigh) {
            cmedStatusRemarks.setStatus(DIABETES_VERY_HIGH);
            cmedStatusRemarks.setSeverity(DIABETES_SEVERITY_VERY_HIGH);
        }

        cmedStatusRemarks.setRemarksFinal(minNormal+" - "+maxNormal);

        return cmedStatusRemarks;

    }


    private static CmedStatusRemarks getRandomStatusAndRemarksForBloodSugarAdult(UserMeasurement userMeasurement) {

        CmedStatusRemarks cmedStatusRemarks = new CmedStatusRemarks();
        final Double minNormal = 3.3, maxNormal = 7.8;

        if (userMeasurement.getValue1() >= minNormal && userMeasurement.getValue1() <= maxNormal) {
            cmedStatusRemarks.setStatus(DIABETES_NORMAL);
            cmedStatusRemarks.setSeverity(DIABETES_SEVERITY_NORMAL);
        } else if (userMeasurement.getValue1() > maxNormal) {
            cmedStatusRemarks.setStatus(DIABETES_HIGH);
            cmedStatusRemarks.setSeverity(DIABETES_SEVERITY_HIGH);
        } else if (userMeasurement.getValue1() < minNormal) {
            cmedStatusRemarks.setStatus(DIABETES_LOW);
            cmedStatusRemarks.setSeverity(DIABETES_SEVERITY_LOW);
        }

        cmedStatusRemarks.setRemarksFinal(minNormal+" - "+maxNormal);

        return cmedStatusRemarks;
    }



}
