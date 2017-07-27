package calculation.adult;

import domains.CmedStatusRemarks;
import domains.UserMeasurement;

/**
 * Created by rezaul on 5/13/17.
 */
public class BPCalculatorAdult {

    public static final String LOW = "low";
    public static final String NORMAL = "normal";
    public static final String HIGH_NORMAL = "high_normal";
    public static final String MILD_HIGH = "mild_high";
    public static final String MODERATE_HIGH = "moderate_high";
    public static final String SEVERE_HIGH = "severe_high";
    public static final String ABNORMAL = "abnormal";

    public static final String SEVERITY_HEALTHY = "healthy";
    public static final String SEVERITY_ALARMING = "alarming";
    public static final String SEVERITY_EMERGENCY = "emergency";
    public static final String SEVERITY_ABNORMAL = "alarming";

    public static CmedStatusRemarks examineAdultBP(UserMeasurement userMeasurement) {

        CmedStatusRemarks systolicStatusRemarks = getStatusAndRemarksForSystolic(userMeasurement);
        CmedStatusRemarks diastolicStatusRemarks = getStatusAndRemarksForDiastolic(userMeasurement);

        String bpStatus = getFinalStatus(systolicStatusRemarks, diastolicStatusRemarks);
        String bpRemarks = "Sys(" + systolicStatusRemarks.getRemarksMin() + "-" + systolicStatusRemarks.getRemarksMax() + ")" + " Dia(" + diastolicStatusRemarks.getRemarksMin() + "-" + diastolicStatusRemarks.getRemarksMax() + ")";

        CmedStatusRemarks finalStatusRemarks = new CmedStatusRemarks();

        if (bpStatus.equals(LOW)) {
            finalStatusRemarks.setSeverity(SEVERITY_EMERGENCY);
        } else if (bpStatus.equals(NORMAL)) {
            finalStatusRemarks.setSeverity(SEVERITY_HEALTHY);
        } else if (bpStatus.equals(HIGH_NORMAL)) {
            finalStatusRemarks.setSeverity(SEVERITY_HEALTHY);
        } else if (bpStatus.equals(MILD_HIGH)) {
            finalStatusRemarks.setSeverity(SEVERITY_ALARMING);
        } else if (bpStatus.equals(MODERATE_HIGH)) {
            finalStatusRemarks.setSeverity(SEVERITY_EMERGENCY);
        } else if (bpStatus.equals(SEVERE_HIGH)) {
            finalStatusRemarks.setSeverity(SEVERITY_EMERGENCY);
        } else if (bpStatus.equals(ABNORMAL)){
            finalStatusRemarks.setSeverity(SEVERITY_ABNORMAL);
        }else {
            finalStatusRemarks.setSeverity("unknown");
        }

        finalStatusRemarks.setStatus(bpStatus);
        finalStatusRemarks.setRemarksFinal(bpRemarks);

        return finalStatusRemarks;

    }

    private static String getFinalStatus(CmedStatusRemarks systolicStatusRemarks, CmedStatusRemarks diastolicStatusRemarks) {

        if (systolicStatusRemarks.getStatus().equals(diastolicStatusRemarks.getStatus())) {
            return systolicStatusRemarks.getStatus();
        } else if (systolicStatusRemarks.getStatus().equals(LOW) && diastolicStatusRemarks.getStatus().equals(NORMAL)) {
            return systolicStatusRemarks.getStatus();
        } else if (systolicStatusRemarks.getStatus().equals(LOW) && diastolicStatusRemarks.getStatus().equals(HIGH_NORMAL)) {
            //Dr. Sarwar suggested its abnormal status. But at low can be considered but not recommended. diastolic can never e higher than systolic.
            return ABNORMAL;
        }  else if (systolicStatusRemarks.getStatus().equals(LOW) && diastolicStatusRemarks.getStatus().equals(MILD_HIGH)) {
            //Dr. Sarwar suggested its abnormal status. diastolic can never e higher than systolic.
            return ABNORMAL;
        } else if (systolicStatusRemarks.getStatus().equals(LOW) && diastolicStatusRemarks.getStatus().equals(MODERATE_HIGH)) {
            // Dr. Sarwar suggested its abnormal status. diastolic can never e higher than systolic.
            return ABNORMAL;
        } else if (systolicStatusRemarks.getStatus().equals(LOW) && diastolicStatusRemarks.getStatus().equals(SEVERE_HIGH)) {
            // Dr. Sarwar suggested its abnormal status. diastolic can never e higher than systolic.
            return ABNORMAL;
        } else if (systolicStatusRemarks.getStatus().equals(NORMAL) && diastolicStatusRemarks.getStatus().equals(LOW)) {
            return diastolicStatusRemarks.getStatus();
        } else if (systolicStatusRemarks.getStatus().equals(NORMAL) && diastolicStatusRemarks.getStatus().equals(HIGH_NORMAL)) {
            return diastolicStatusRemarks.getStatus();
        } else if (systolicStatusRemarks.getStatus().equals(NORMAL) && diastolicStatusRemarks.getStatus().equals(MILD_HIGH)) {
            return diastolicStatusRemarks.getStatus();
        } else if (systolicStatusRemarks.getStatus().equals(NORMAL) && diastolicStatusRemarks.getStatus().equals(MODERATE_HIGH)) {
            return diastolicStatusRemarks.getStatus();
        } else if (systolicStatusRemarks.getStatus().equals(NORMAL) && diastolicStatusRemarks.getStatus().equals(SEVERE_HIGH)) {
            return diastolicStatusRemarks.getStatus();
        } else if (systolicStatusRemarks.getStatus().equals(HIGH_NORMAL) && diastolicStatusRemarks.getStatus().equals(LOW)) {
            return MILD_HIGH;
        } else if (systolicStatusRemarks.getStatus().equals(HIGH_NORMAL) && diastolicStatusRemarks.getStatus().equals(NORMAL)) {
            return systolicStatusRemarks.getStatus();
        } else if (systolicStatusRemarks.getStatus().equals(HIGH_NORMAL) && diastolicStatusRemarks.getStatus().equals(MILD_HIGH)) {
            return diastolicStatusRemarks.getStatus();
        } else if (systolicStatusRemarks.getStatus().equals(HIGH_NORMAL) && diastolicStatusRemarks.getStatus().equals(MODERATE_HIGH)) {
            return diastolicStatusRemarks.getStatus();
        } else if (systolicStatusRemarks.getStatus().equals(HIGH_NORMAL) && diastolicStatusRemarks.getStatus().equals(SEVERE_HIGH)) {
            return diastolicStatusRemarks.getStatus();
        } else if (systolicStatusRemarks.getStatus().equals(MILD_HIGH) && diastolicStatusRemarks.getStatus().equals(LOW)) {
            return systolicStatusRemarks.getStatus();
        } else if (systolicStatusRemarks.getStatus().equals(MILD_HIGH) && diastolicStatusRemarks.getStatus().equals(NORMAL)) {
            return systolicStatusRemarks.getStatus();
        } else if (systolicStatusRemarks.getStatus().equals(MILD_HIGH) && diastolicStatusRemarks.getStatus().equals(HIGH_NORMAL)) {
            return systolicStatusRemarks.getStatus();
        } else if (systolicStatusRemarks.getStatus().equals(MILD_HIGH) && diastolicStatusRemarks.getStatus().equals(MODERATE_HIGH)) {
            return diastolicStatusRemarks.getStatus();
        } else if (systolicStatusRemarks.getStatus().equals(MILD_HIGH) && diastolicStatusRemarks.getStatus().equals(SEVERE_HIGH)) {
            return diastolicStatusRemarks.getStatus();
        } else if (systolicStatusRemarks.getStatus().equals(MODERATE_HIGH) && diastolicStatusRemarks.getStatus().equals(LOW)) {
            return systolicStatusRemarks.getStatus();
        } else if (systolicStatusRemarks.getStatus().equals(MODERATE_HIGH) && diastolicStatusRemarks.getStatus().equals(NORMAL)) {
            return systolicStatusRemarks.getStatus();
        } else if (systolicStatusRemarks.getStatus().equals(MODERATE_HIGH) && diastolicStatusRemarks.getStatus().equals(HIGH_NORMAL)) {
            return systolicStatusRemarks.getStatus();
        } else if (systolicStatusRemarks.getStatus().equals(MODERATE_HIGH) && diastolicStatusRemarks.getStatus().equals(MILD_HIGH)) {
            return systolicStatusRemarks.getStatus();
        } else if (systolicStatusRemarks.getStatus().equals(MODERATE_HIGH) && diastolicStatusRemarks.getStatus().equals(SEVERE_HIGH)) {
            return diastolicStatusRemarks.getStatus();
        } else if (systolicStatusRemarks.getStatus().equals(SEVERE_HIGH) && diastolicStatusRemarks.getStatus().equals(LOW)) {
            return systolicStatusRemarks.getStatus();
        } else if (systolicStatusRemarks.getStatus().equals(SEVERE_HIGH) && diastolicStatusRemarks.getStatus().equals(NORMAL)) {
            return systolicStatusRemarks.getStatus();
        } else if (systolicStatusRemarks.getStatus().equals(SEVERE_HIGH) && diastolicStatusRemarks.getStatus().equals(HIGH_NORMAL)) {
            return systolicStatusRemarks.getStatus();
        } else if (systolicStatusRemarks.getStatus().equals(SEVERE_HIGH) && diastolicStatusRemarks.getStatus().equals(MILD_HIGH)) {
            return systolicStatusRemarks.getStatus();
        } else if (systolicStatusRemarks.getStatus().equals(SEVERE_HIGH) && diastolicStatusRemarks.getStatus().equals(MODERATE_HIGH)) {
            return systolicStatusRemarks.getStatus();
        } else {
            return "unknown";
        }
    }

    private static CmedStatusRemarks getStatusAndRemarksForSystolic(UserMeasurement userMeasurement) {

        final int lowMax = 89, normalMin = 90, normalMax = 120, highNormalMin = 121, highNormalMax = 139, mildHighMin = 140, mildHighMax = 159, moderateHighMin = 160, moderateHighMax = 179, severeHighMin = 180;

        CmedStatusRemarks cmedStatusRemarks = new CmedStatusRemarks();

        if (userMeasurement.getValue1()  <= lowMax) {

            cmedStatusRemarks.setRemarksMin("Less");
            cmedStatusRemarks.setRemarksMax(String.valueOf(lowMax));
            cmedStatusRemarks.setStatus(LOW);


        } else if (normalMin <= userMeasurement.getValue1() && userMeasurement.getValue1()  <= normalMax) {

            cmedStatusRemarks.setRemarksMin(String.valueOf(normalMin));
            cmedStatusRemarks.setRemarksMax(String.valueOf(normalMax));
            cmedStatusRemarks.setStatus(NORMAL);



        } else if (highNormalMin <= userMeasurement.getValue1() && userMeasurement.getValue1()  <= highNormalMax) {

            cmedStatusRemarks.setRemarksMin(String.valueOf(highNormalMin));
            cmedStatusRemarks.setRemarksMax(String.valueOf(highNormalMax));
            cmedStatusRemarks.setStatus(HIGH_NORMAL);



        } else if (mildHighMin <= userMeasurement.getValue1() && userMeasurement.getValue1()  <= mildHighMax) {

            cmedStatusRemarks.setRemarksMin(String.valueOf(mildHighMin));
            cmedStatusRemarks.setRemarksMax(String.valueOf(mildHighMax));
            cmedStatusRemarks.setStatus(MILD_HIGH);



        } else if (moderateHighMin <= userMeasurement.getValue1() && userMeasurement.getValue1()  <= moderateHighMax) {

            cmedStatusRemarks.setRemarksMin(String.valueOf(moderateHighMin));
            cmedStatusRemarks.setRemarksMax(String.valueOf(moderateHighMax));
            cmedStatusRemarks.setStatus(MODERATE_HIGH);



        } else if (severeHighMin <= userMeasurement.getValue1()){

            cmedStatusRemarks.setRemarksMin(String.valueOf(severeHighMin));
            cmedStatusRemarks.setRemarksMax("More");
            cmedStatusRemarks.setStatus(SEVERE_HIGH);

        }

        return cmedStatusRemarks;
    }

    private static CmedStatusRemarks getStatusAndRemarksForDiastolic(UserMeasurement userMeasurement) {

        final int lowMax = 60, normalMin = 61, normalMax = 80, highNormalMin = 81, highNormalMax = 89, mildHighMin = 90, mildHighMax = 99, moderateHighMin = 100, moderateHighMax = 109, severeHighMin = 110;

        CmedStatusRemarks cmedStatusRemarks = new CmedStatusRemarks();

        if ( userMeasurement.getValue2()  <= lowMax) {

            cmedStatusRemarks.setRemarksMin("less");
            cmedStatusRemarks.setRemarksMax(String.valueOf(lowMax));
            cmedStatusRemarks.setStatus(LOW);


        } else if (normalMin <= userMeasurement.getValue2() && userMeasurement.getValue2()  <= normalMax) {

            cmedStatusRemarks.setRemarksMin(String.valueOf(normalMin));
            cmedStatusRemarks.setRemarksMax(String.valueOf(normalMax));
            cmedStatusRemarks.setStatus(NORMAL);


        } else if (highNormalMin <= userMeasurement.getValue2() && userMeasurement.getValue2()  <= highNormalMax) {

            cmedStatusRemarks.setRemarksMin(String.valueOf(highNormalMin));
            cmedStatusRemarks.setRemarksMax(String.valueOf(highNormalMax));
            cmedStatusRemarks.setStatus(HIGH_NORMAL);


        } else if (mildHighMin <= userMeasurement.getValue2() && userMeasurement.getValue2()  <= mildHighMax) {

            cmedStatusRemarks.setRemarksMin(String.valueOf(mildHighMin));
            cmedStatusRemarks.setRemarksMax(String.valueOf(mildHighMax));
            cmedStatusRemarks.setStatus(MILD_HIGH);


        } else if (moderateHighMin <= userMeasurement.getValue2() && userMeasurement.getValue2()  <= moderateHighMax) {

            cmedStatusRemarks.setRemarksMin(String.valueOf(moderateHighMin));
            cmedStatusRemarks.setRemarksMax(String.valueOf(moderateHighMax));
            cmedStatusRemarks.setStatus(MODERATE_HIGH);


        } else if (severeHighMin <= userMeasurement.getValue2()){

            cmedStatusRemarks.setRemarksMin(String.valueOf(severeHighMin));
            cmedStatusRemarks.setRemarksMax(String.valueOf("More"));
            cmedStatusRemarks.setStatus(SEVERE_HIGH);

        }

        return cmedStatusRemarks;
    }
}