package calculation.child;


import domains.CmedPerson;
import domains.CmedStatusRemarks;
import domains.UserMeasurement;
import domains.enums.Gender;

import java.text.DecimalFormat;

/**
 * Author: rezaul || Date: 4/3/17.
 */
public class BMICalculatorChild {

    private static final String BMI_UNDERWEIGHT = "underweight";
    private static final String BMI_NORMAL = "normal";
    private static final String BMI_OVERWEIGHT = "overweight";
    private static final String BMI_OBESITY = "obesity";

    private static final String BMI_SEVERITY_UNDERWEIGHT = "alarming";
    private static final String BMI_SEVERITY_NORMAL = "healthy";
    private static final String BMI_SEVERITY_OVERWEIGHT = "alarming";
    private static final String BMI_SEVERITY_OBESITY = "emergency";

    public static CmedStatusRemarks examineChildBMI(UserMeasurement userMeasurement) {
        CmedPerson user = userMeasurement.getPerson();

        if (user.getGender().equals(Gender.m)) {
            return calculateBMIForMale(user, userMeasurement);
        } else if (user.getGender().equals(Gender.f)) {
            return calculateBMIForFemale(user, userMeasurement);
        } else {
            return new CmedStatusRemarks("Unknown", "Unknown", "-");
        }
    }


        public static CmedStatusRemarks calculateBMIForMale(CmedPerson user, UserMeasurement userMeasurement) {

        double underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin;
        CmedStatusRemarks cmedStatusRemarksForMale = new CmedStatusRemarks();

        // Age 2 yr
        if (user.getAgeInMonths()>=24 && user.getAgeInMonths()<=29){

            underWeightMax = 14.5;
            normalMin = 14.5;
            normalMax = 18;
            overWeightMin = 18;
            overWeightMax = 19;
            obesityMin = 19;

            cmedStatusRemarksForMale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 2.5 yr
        } else if (user.getAgeInMonths()>=30 && user.getAgeInMonths()<=35) {

            underWeightMax = 14.5;
            normalMin = 14.5;
            normalMax = 17.5;
            overWeightMin = 17.5;
            overWeightMax = 18.5;
            obesityMin = 18.5;

            cmedStatusRemarksForMale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 3 yr
        } else if (user.getAgeInMonths()>=36 && user.getAgeInMonths()<=41) {

            underWeightMax = 14.5;
            normalMin = 14.5;
            normalMax = 17.5;
            overWeightMin = 17.5;
            overWeightMax = 18.3;
            obesityMin = 18.3;

            cmedStatusRemarksForMale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 3.5 yr

        } else if (user.getAgeInMonths()>=42 && user.getAgeInMonths()<=47) {

            underWeightMax = 14.2;
            normalMin = 14.2;
            normalMax = 17;
            overWeightMin = 17;
            overWeightMax = 18;
            obesityMin = 18;

            cmedStatusRemarksForMale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 4 yr

        } else if (user.getAgeInMonths()>=48 && user.getAgeInMonths()<=53) {

            underWeightMax = 14;
            normalMin = 14;
            normalMax = 17;
            overWeightMin = 17;
            overWeightMax = 18;
            obesityMin = 18;

            cmedStatusRemarksForMale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 4.5 yr

        } else if (user.getAgeInMonths()>=54 && user.getAgeInMonths()<=59) {

            underWeightMax = 14;
            normalMin = 14;
            normalMax = 16.9;
            overWeightMin = 16.9;
            overWeightMax = 17.9;
            obesityMin = 17.9;

            cmedStatusRemarksForMale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 5 yr
        } else if (user.getAgeInMonths()>=60 && user.getAgeInMonths()<=65) {

            underWeightMax = 13.9;
            normalMin = 13.9;
            normalMax = 16.9;
            overWeightMin = 16.9;
            overWeightMax = 18;
            obesityMin = 18;

            cmedStatusRemarksForMale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

        // Age 5.5 yr
        } else if (user.getAgeInMonths()>=66 && user.getAgeInMonths()<=71) {
            underWeightMax = 13.8;
            normalMin = 13.8;
            normalMax = 16.9;
            overWeightMin = 16.9;
            overWeightMax = 18.1;
            obesityMin = 18.1;

            cmedStatusRemarksForMale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 6 yr
        } else if (user.getAgeInMonths()>=72 && user.getAgeInMonths()<=77) {
            underWeightMax = 13.8;
            normalMin = 13.8;
            normalMax = 17;
            overWeightMin = 17;
            overWeightMax = 18.5;
            obesityMin = 18.5;

            cmedStatusRemarksForMale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 6.5 yr
        } else if (user.getAgeInMonths()>=78 && user.getAgeInMonths()<=83) {
            underWeightMax = 13.8;
            normalMin = 13.8;
            normalMax = 17.1;
            overWeightMin = 17.1;
            overWeightMax = 18.8;
            obesityMin = 18.8;

            cmedStatusRemarksForMale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 7 yr
        } else if (user.getAgeInMonths()>=84 && user.getAgeInMonths()<=89) {
            underWeightMax = 13.8;
            normalMin = 13.8;
            normalMax = 17.4;
            overWeightMin = 17.4;
            overWeightMax = 19.1;
            obesityMin = 19.1;

            cmedStatusRemarksForMale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 7.5 yr
        }  else if (user.getAgeInMonths()>=90 && user.getAgeInMonths()<=95) {
            underWeightMax = 13.8;
            normalMin = 13.8;
            normalMax = 17.6;
            overWeightMin = 17.6;
            overWeightMax = 19.5;
            obesityMin = 19.5;

            cmedStatusRemarksForMale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 8 yr
        } else if (user.getAgeInMonths()>=96 && user.getAgeInMonths()<=101) {

            underWeightMax = 13.9;
            normalMin = 13.9;
            normalMax = 18;
            overWeightMin = 18;
            overWeightMax = 20;
            obesityMin = 20;

            cmedStatusRemarksForMale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 8.5 yr
        } else if (user.getAgeInMonths()>=102 && user.getAgeInMonths()<=107) {

            underWeightMax = 13.9;
            normalMin = 13.9;
            normalMax = 18.3;
            overWeightMin = 18.3;
            overWeightMax = 20.5;
            obesityMin = 20.5;

            cmedStatusRemarksForMale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 9 yr
        } else if (user.getAgeInMonths()>=108 && user.getAgeInMonths()<=113) {
            underWeightMax = 14;
            normalMin = 14;
            normalMax = 18.5;
            overWeightMin = 18.5;
            overWeightMax = 21;
            obesityMin = 21;

            cmedStatusRemarksForMale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 9.5 yr

        } else if (user.getAgeInMonths()>=114 && user.getAgeInMonths()<=119) {
            underWeightMax = 14;
            normalMin = 14;
            normalMax = 19;
            overWeightMin = 19;
            overWeightMax = 21.5;
            obesityMin = 21.5;

            cmedStatusRemarksForMale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 10 yr
        } else if (user.getAgeInMonths()>=120 && user.getAgeInMonths()<=125) {
            underWeightMax = 14.2;
            normalMin = 14.2;
            normalMax = 19.4;
            overWeightMin = 19.4;
            overWeightMax = 22.1;
            obesityMin = 22.1;

            cmedStatusRemarksForMale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 10.5 yr

        } else if (user.getAgeInMonths()>=126 && user.getAgeInMonths()<=131) {
            underWeightMax = 14.4;
            normalMin = 14.4;
            normalMax = 19.8;
            overWeightMin = 19.8;
            overWeightMax = 22.6;
            obesityMin = 22.6;

            cmedStatusRemarksForMale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 11 yr

        } else if (user.getAgeInMonths()>=132 && user.getAgeInMonths()<=137) {
            underWeightMax = 14.5;
            normalMin = 14.5;
            normalMax = 20.1;
            overWeightMin = 20.1;
            overWeightMax = 23.1;
            obesityMin = 23.1;

            cmedStatusRemarksForMale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 11.5 yr
        } else if (user.getAgeInMonths()>=138 && user.getAgeInMonths()<=143) {
            underWeightMax = 14.8;
            normalMin = 14.8;
            normalMax = 20.5;
            overWeightMin = 20.5;
            overWeightMax = 23.6;
            obesityMin = 23.6;

            cmedStatusRemarksForMale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 12 yr
        } else if (user.getAgeInMonths()>=144 && user.getAgeInMonths()<=149) {
            underWeightMax = 15;
            normalMin = 15;
            normalMax = 21;
            overWeightMin = 21;
            overWeightMax = 24.1;
            obesityMin = 24.1;

            cmedStatusRemarksForMale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 12.5 yr
        } else if (user.getAgeInMonths()>=150 && user.getAgeInMonths()<=155) {
            underWeightMax = 15.2;
            normalMin = 15.2;
            normalMax = 21.4;
            overWeightMin = 21.4;
            overWeightMax = 24.6;
            obesityMin = 24.6;

            cmedStatusRemarksForMale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 13 yr
        } else if (user.getAgeInMonths()>=156 && user.getAgeInMonths()<=161) {
            underWeightMax = 15.5;
            normalMin = 15.5;
            normalMax = 21.9;
            overWeightMin = 21.9;
            overWeightMax = 25.1;
            obesityMin = 25.1;

            cmedStatusRemarksForMale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 13.5 yr
        } else if (user.getAgeInMonths()>=162 && user.getAgeInMonths()<=167) {
            underWeightMax = 15.6;
            normalMin = 15.6;
            normalMax = 22.2;
            overWeightMin = 22.2;
            overWeightMax = 25.5;
            obesityMin = 25.5;

            cmedStatusRemarksForMale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 14 yr
        } else if (user.getAgeInMonths()>=168 && user.getAgeInMonths()<=173) {
            underWeightMax = 16;
            normalMin = 16;
            normalMax = 22.6;
            overWeightMin = 22.6;
            overWeightMax = 26;
            obesityMin = 26;

            cmedStatusRemarksForMale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 14.5 yr
        } else if (user.getAgeInMonths()>=174 && user.getAgeInMonths()<=179) {
            underWeightMax = 16.2;
            normalMin = 16.2;
            normalMax = 23;
            overWeightMin = 23;
            overWeightMax = 26.5;
            obesityMin = 26.5;

            cmedStatusRemarksForMale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 15 yr
        } else if (user.getAgeInMonths()>=180 && user.getAgeInMonths()<=185) {
            underWeightMax = 16.5;
            normalMin = 16.5;
            normalMax = 23.5;
            overWeightMin = 23.5;
            overWeightMax = 26.8;
            obesityMin = 26.8;

            cmedStatusRemarksForMale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);


            // Age 15.5 yr
        } else if (user.getAgeInMonths()>=186 && user.getAgeInMonths()<=191) {
            underWeightMax = 16.9;
            normalMin = 16.9;
            normalMax = 23.9;
            overWeightMin = 23.9;
            overWeightMax = 27.1;
            obesityMin = 27.1;

            cmedStatusRemarksForMale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);


            // Age 16 yr
        } else if (user.getAgeInMonths()>=192 && user.getAgeInMonths()<=197) {
            underWeightMax = 17;
            normalMin = 17;
            normalMax = 24.1;
            overWeightMin = 24.1;
            overWeightMax = 27.5;
            obesityMin = 27.5;

            cmedStatusRemarksForMale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);


            // Age 16.5 yr
        } else if (user.getAgeInMonths()>=198 && user.getAgeInMonths()<=203) {
            underWeightMax = 17.4;
            normalMin = 17.4;
            normalMax = 24.5;
            overWeightMin = 24.5;
            overWeightMax = 27.9;
            obesityMin = 27.9;

            cmedStatusRemarksForMale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);


            // Age 17 yr
        } else if (user.getAgeInMonths()>=204 && user.getAgeInMonths()<=209) {
            underWeightMax = 17.6;
            normalMin = 17.6;
            normalMax = 24.9;
            overWeightMin = 24.9;
            overWeightMax = 28.2;
            obesityMin = 28.2;

            cmedStatusRemarksForMale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);


            // Age 17.5 yr
        } else if (user.getAgeInMonths()>=210 && user.getAgeInMonths()<=215) {
            underWeightMax = 18;
            normalMin = 18;
            normalMax = 25.3;
            overWeightMin = 25.3;
            overWeightMax = 28.5;
            obesityMin = 28.5;

            cmedStatusRemarksForMale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 18 yr
        } else if (user.getAgeInMonths()>=216 && user.getAgeInMonths()<=221) {
            underWeightMax = 18.2;
            normalMin = 18.2;
            normalMax = 25.6;
            overWeightMin = 25.6;
            overWeightMax = 29;
            obesityMin = 29;

            cmedStatusRemarksForMale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 18.5 yr
        } else if (user.getAgeInMonths()>=222 && user.getAgeInMonths()<=227) {
            underWeightMax = 18.6;
            normalMin = 18.6;
            normalMax = 26;
            overWeightMin = 26;
            overWeightMax = 29;
            obesityMin = 29;

            cmedStatusRemarksForMale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 19 yr
        } else if (user.getAgeInMonths()>=222 && user.getAgeInMonths()<=227) {
            underWeightMax = 18.6;
            normalMin = 18.6;
            normalMax = 26;
            overWeightMin = 26;
            overWeightMax = 29.6;
            obesityMin = 29.6;

            cmedStatusRemarksForMale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);


            // Age 19.5 yr
        } else if (user.getAgeInMonths()>=234 && user.getAgeInMonths()<=239) {
            underWeightMax = 18.9;
            normalMin = 18.9;
            normalMax = 26.6;
            overWeightMin = 26.6;
            overWeightMax = 30;
            obesityMin = 30;

            cmedStatusRemarksForMale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 20 yr
        } else if (user.getAgeInMonths()>=240) {
            underWeightMax = 19.1;
            normalMin = 19.1;
            normalMax = 27;
            overWeightMin = 27;
            overWeightMax = 30.6;
            obesityMin = 30.6;

            cmedStatusRemarksForMale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

        } else {
            cmedStatusRemarksForMale.setStatus("unknown");
            cmedStatusRemarksForMale.setRemarksFinal("unknown-unknown");
        }


        return cmedStatusRemarksForMale;
    }

    private static CmedStatusRemarks getStatusForBMI(Double bmi, double underWeightMax,  double normalMin, double normalMax, double overWeightMin, double overWeightMax, double obesityMin) {

        DecimalFormat df = new DecimalFormat("#.0");
        CmedStatusRemarks cmedStatusRemarks = new CmedStatusRemarks();
        String status = "", minRemarks = String.valueOf(normalMin), maxRemarks = (df.format((normalMax-.1)));

        if (bmi < underWeightMax) {

            status = BMI_UNDERWEIGHT;
            cmedStatusRemarks.setSeverity(BMI_SEVERITY_UNDERWEIGHT);

        } else if (bmi >= normalMin &&  bmi < normalMax) {

            status = BMI_NORMAL;
            cmedStatusRemarks.setSeverity(BMI_SEVERITY_NORMAL);

        } else if (bmi >= overWeightMin && bmi < overWeightMax) {

            status = BMI_OVERWEIGHT;
            cmedStatusRemarks.setSeverity(BMI_SEVERITY_OVERWEIGHT);

        } else {

            status = BMI_OBESITY;
            cmedStatusRemarks.setSeverity(BMI_SEVERITY_OBESITY);
        }

        cmedStatusRemarks.setStatus(status);
        cmedStatusRemarks.setRemarksFinal(minRemarks+"-"+maxRemarks);

        return cmedStatusRemarks;
    }

    private static CmedStatusRemarks calculateBMIForFemale(CmedPerson user, UserMeasurement userMeasurement) {

        double underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin;
        CmedStatusRemarks cmedStatusRemarksForFemale = new CmedStatusRemarks();

        //cmedPerson.getCmedMeasurement().setValue2(cmedPerson.getCmedMeasurement().getValue1() / (cmedPerson.getCmedMeasurement().getValue3() * cmedPerson.getCmedMeasurement().getValue3() ));

        // Age 1 yr to 2 yr
        if (user.getAgeInMonths()>=24 && user.getAgeInMonths()<=29){

            underWeightMax = 14.4;
            normalMin = 14.4;
            normalMax = 18;
            overWeightMin = 18;
            overWeightMax = 19;
            obesityMin = 19;

            cmedStatusRemarksForFemale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 2.5 yr
        } else if (user.getAgeInMonths()>=30 && user.getAgeInMonths()<=35) {

            underWeightMax = 14.2;
            normalMin = 14.2;
            normalMax = 17.6;
            overWeightMin = 17.6;
            overWeightMax = 18.6;
            obesityMin = 18.6;

            cmedStatusRemarksForFemale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 3 yr
        } else if (user.getAgeInMonths()>=36 && user.getAgeInMonths()<=41) {

            underWeightMax = 14;
            normalMin = 14;
            normalMax = 17.2;
            overWeightMin = 17.2;
            overWeightMax = 18.3;
            obesityMin = 18.3;

            cmedStatusRemarksForFemale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 3.5 yr

        } else if (user.getAgeInMonths()>=42 && user.getAgeInMonths()<=47) {

            underWeightMax = 13.8;
            normalMin = 13.8;
            normalMax = 17;
            overWeightMin = 17;
            overWeightMax = 18;
            obesityMin = 18;

            cmedStatusRemarksForFemale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 4 yr

        } else if (user.getAgeInMonths()>=48 && user.getAgeInMonths()<=53) {

            underWeightMax = 13.8;
            normalMin = 13.8;
            normalMax = 16.8;
            overWeightMin = 16.8;
            overWeightMax = 18;
            obesityMin = 18;

            cmedStatusRemarksForFemale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 4.5 yr

        } else if (user.getAgeInMonths()>=54 && user.getAgeInMonths()<=59) {

            underWeightMax = 13.6;
            normalMin = 13.6;
            normalMax = 16.8;
            overWeightMin = 16.8;
            overWeightMax = 18.1;
            obesityMin = 18.1;

            cmedStatusRemarksForFemale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 5 yr
        } else if (user.getAgeInMonths()>=60 && user.getAgeInMonths()<=65) {

            underWeightMax = 13.6;
            normalMin = 13.6;
            normalMax = 16.8;
            overWeightMin = 16.8;
            overWeightMax = 18.2;
            obesityMin = 18.2;

            cmedStatusRemarksForFemale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 5.5 yr
        } else if (user.getAgeInMonths()>=66 && user.getAgeInMonths()<=71) {
            underWeightMax = 13.4;
            normalMin = 13.4;
            normalMax = 16.9;
            overWeightMin = 16.9;
            overWeightMax = 18.5;
            obesityMin = 18.5;

            cmedStatusRemarksForFemale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 6 yr
        } else if (user.getAgeInMonths()>=72 && user.getAgeInMonths()<=77) {
            underWeightMax = 13.4;
            normalMin = 13.4;
            normalMax = 17.1;
            overWeightMin = 17.1;
            overWeightMax = 18.8;
            obesityMin = 18.8;

            cmedStatusRemarksForFemale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 6.5 yr
        } else if (user.getAgeInMonths()>=78 && user.getAgeInMonths()<=83) {
            underWeightMax = 13.4;
            normalMin = 13.4;
            normalMax = 17.4;
            overWeightMin = 17.4;
            overWeightMax = 19.2;
            obesityMin = 19.2;

            cmedStatusRemarksForFemale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 7 yr
        } else if (user.getAgeInMonths()>=84 && user.getAgeInMonths()<=89) {
            underWeightMax = 13.4;
            normalMin = 13.4;
            normalMax = 17.6;
            overWeightMin = 17.6;
            overWeightMax = 19.6;
            obesityMin = 19.6;

            cmedStatusRemarksForFemale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 7.5 yr
        }  else if (user.getAgeInMonths()>=90 && user.getAgeInMonths()<=95) {
            underWeightMax = 13.5;
            normalMin = 13.5;
            normalMax = 18;
            overWeightMin = 18;
            overWeightMax = 20.2;
            obesityMin = 20.2;

            cmedStatusRemarksForFemale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 8 yr
        } else if (user.getAgeInMonths()>=96 && user.getAgeInMonths()<=101) {

            underWeightMax = 13.6;
            normalMin = 13.6;
            normalMax = 18.3;
            overWeightMin = 18.3;
            overWeightMax = 20.8;
            obesityMin = 20.8;

            cmedStatusRemarksForFemale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 8.5 yr
        } else if (user.getAgeInMonths()>=102 && user.getAgeInMonths()<=107) {

            underWeightMax = 13.6;
            normalMin = 13.6;
            normalMax = 18.8;
            overWeightMin = 18.8;
            overWeightMax = 21.2;
            obesityMin = 21.2;

            cmedStatusRemarksForFemale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 9 yr
        } else if (user.getAgeInMonths()>=108 && user.getAgeInMonths()<=113) {
            underWeightMax = 13.8;
            normalMin = 13.8;
            normalMax = 19.1;
            overWeightMin = 19.1;
            overWeightMax = 21.8;
            obesityMin = 21.8;

            cmedStatusRemarksForFemale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 9.5 yr

        } else if (user.getAgeInMonths()>=114 && user.getAgeInMonths()<=119) {
            underWeightMax = 13.9;
            normalMin = 13.9;
            normalMax = 19.5;
            overWeightMin = 19.5;
            overWeightMax = 22.3;
            obesityMin = 22.3;

            cmedStatusRemarksForFemale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 10 yr
        } else if (user.getAgeInMonths()>=120 && user.getAgeInMonths()<=125) {
            underWeightMax = 14;
            normalMin = 14;
            normalMax = 20;
            overWeightMin = 20;
            overWeightMax = 23;
            obesityMin = 23;

            cmedStatusRemarksForFemale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 10.5 yr

        } else if (user.getAgeInMonths()>=126 && user.getAgeInMonths()<=131) {
            underWeightMax = 14.2;
            normalMin = 14.2;
            normalMax = 20.4;
            overWeightMin = 20.4;
            overWeightMax = 23.5;
            obesityMin = 23.5;

            cmedStatusRemarksForFemale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 11 yr

        } else if (user.getAgeInMonths()>=132 && user.getAgeInMonths()<=137) {
            underWeightMax = 14.4;
            normalMin = 14.4;
            normalMax = 20.8;
            overWeightMin = 20.8;
            overWeightMax = 24;
            obesityMin = 24;

            cmedStatusRemarksForFemale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 11.5 yr
        } else if (user.getAgeInMonths()>=138 && user.getAgeInMonths()<=143) {
            underWeightMax = 14.6;
            normalMin = 14.6;
            normalMax = 21.3;
            overWeightMin = 21.3;
            overWeightMax = 24.8;
            obesityMin = 24.8;

            cmedStatusRemarksForFemale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 12 yr
        } else if (user.getAgeInMonths()>=144 && user.getAgeInMonths()<=149) {
            underWeightMax = 14.8;
            normalMin = 14.8;
            normalMax = 21.8;
            overWeightMin = 21.8;
            overWeightMax = 25.2;
            obesityMin = 25.2;

            cmedStatusRemarksForFemale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 12.5 yr
        } else if (user.getAgeInMonths()>=150 && user.getAgeInMonths()<=155) {
            underWeightMax = 15;
            normalMin = 15;
            normalMax = 22.1;
            overWeightMin = 22.1;
            overWeightMax = 25.7;
            obesityMin = 25.7;

            cmedStatusRemarksForFemale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 13 yr
        } else if (user.getAgeInMonths()>=156 && user.getAgeInMonths()<=161) {
            underWeightMax = 15.2;
            normalMin = 15.2;
            normalMax = 22.5;
            overWeightMin = 22.5;
            overWeightMax = 26.2;
            obesityMin = 26.2;

            cmedStatusRemarksForFemale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 13.5 yr
        } else if (user.getAgeInMonths()>=162 && user.getAgeInMonths()<=167) {
            underWeightMax = 15.6;
            normalMin = 15.6;
            normalMax = 22.9;
            overWeightMin = 22.9;
            overWeightMax = 26.8;
            obesityMin = 26.8;

            cmedStatusRemarksForFemale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 14 yr
        } else if (user.getAgeInMonths()>=168 && user.getAgeInMonths()<=173) {
            underWeightMax = 15.8;
            normalMin = 15.8;
            normalMax = 23.2;
            overWeightMin = 23.2;
            overWeightMax = 27.2;
            obesityMin = 27.2;

            cmedStatusRemarksForFemale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 14.5 yr
        } else if (user.getAgeInMonths()>=174 && user.getAgeInMonths()<=179) {
            underWeightMax = 16;
            normalMin = 16;
            normalMax = 23.7;
            overWeightMin = 23.7;
            overWeightMax = 27.6;
            obesityMin = 27.6;

            cmedStatusRemarksForFemale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 15 yr
        } else if (user.getAgeInMonths()>=180 && user.getAgeInMonths()<=185) {
            underWeightMax = 16.3;
            normalMin = 16.3;
            normalMax = 24;
            overWeightMin = 24;
            overWeightMax = 28;
            obesityMin = 28;

            cmedStatusRemarksForFemale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);


            // Age 15.5 yr
        } else if (user.getAgeInMonths()>=186 && user.getAgeInMonths()<=191) {
            underWeightMax = 16.6;
            normalMin = 16.6;
            normalMax = 24.4;
            overWeightMin = 24.4;
            overWeightMax = 28.4;
            obesityMin = 28.4;

            cmedStatusRemarksForFemale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);


            // Age 16 yr
        } else if (user.getAgeInMonths()>=192 && user.getAgeInMonths()<=197) {
            underWeightMax = 16.8;
            normalMin = 16.8;
            normalMax = 24.6;
            overWeightMin = 24.6;
            overWeightMax = 28.8;
            obesityMin = 28.8;

            cmedStatusRemarksForFemale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);


            // Age 16.5 yr
        } else if (user.getAgeInMonths()>=198 && user.getAgeInMonths()<=203) {
            underWeightMax = 17;
            normalMin = 17;
            normalMax = 25;
            overWeightMin = 25;
            overWeightMax = 29.2;
            obesityMin = 29.2;

            cmedStatusRemarksForFemale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);


            // Age 17 yr
        } else if (user.getAgeInMonths()>=204 && user.getAgeInMonths()<=209) {
            underWeightMax = 17.2;
            normalMin = 17.2;
            normalMax = 25.2;
            overWeightMin = 25.2;
            overWeightMax = 29.6;
            obesityMin = 29.6;

            cmedStatusRemarksForFemale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);


            // Age 17.5 yr
        } else if (user.getAgeInMonths()>=210 && user.getAgeInMonths()<=215) {
            underWeightMax = 17.4;
            normalMin = 17.4;
            normalMax = 25.4;
            overWeightMin = 25.4;
            overWeightMax = 29.9;
            obesityMin = 29.9;

            cmedStatusRemarksForFemale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 18 yr
        } else if (user.getAgeInMonths()>=216 && user.getAgeInMonths()<=221) {
            underWeightMax = 17.5;
            normalMin = 17.5;
            normalMax = 25.6;
            overWeightMin = 25.6;
            overWeightMax = 30.3;
            obesityMin = 30.3;

            cmedStatusRemarksForFemale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 18.5 yr
        } else if (user.getAgeInMonths()>=222 && user.getAgeInMonths()<=227) {
            underWeightMax = 17.7;
            normalMin = 17.7;
            normalMax = 25.9;
            overWeightMin = 25.9;
            overWeightMax = 30.6;
            obesityMin = 30.6;

            cmedStatusRemarksForFemale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 19 yr
        } else if (user.getAgeInMonths()>=222 && user.getAgeInMonths()<=227) {
            underWeightMax = 17.8;
            normalMin = 17.8;
            normalMax = 26;
            overWeightMin = 26;
            overWeightMax = 31;
            obesityMin = 31;

            cmedStatusRemarksForFemale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);


            // Age 19.5 yr
        } else if (user.getAgeInMonths()>=234 && user.getAgeInMonths()<=239) {
            underWeightMax = 17.8;
            normalMin = 17.8;
            normalMax = 26.2;
            overWeightMin = 26.2;
            overWeightMax = 31.4;
            obesityMin = 31.4;

            cmedStatusRemarksForFemale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

            // Age 20 yr
        } else if (user.getAgeInMonths()>=240) {
            underWeightMax = 17.8;
            normalMin = 17.8;
            normalMax = 26.5;
            overWeightMin = 26.5;
            overWeightMax = 31.8;
            obesityMin = 31.8;

            cmedStatusRemarksForFemale =  getStatusForBMI(userMeasurement.getValue2(), underWeightMax, normalMin, normalMax, overWeightMin, overWeightMax, obesityMin);

        } else {
            cmedStatusRemarksForFemale.setRemarksFinal("Unknown-Unknown");
            cmedStatusRemarksForFemale.setStatus("Unknown");

        }

        return cmedStatusRemarksForFemale;
    }


}
