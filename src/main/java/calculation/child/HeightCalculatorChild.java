package calculation.child;


import calculation.common.utils.Utility;
import domains.CmedPerson;
import domains.CmedStatusRemarks;
import domains.UserMeasurement;
import domains.enums.Gender;

/**
 * Author: rezaul || Date: 4/6/17.
 */
public class HeightCalculatorChild {

    private static final String HEIGHT_SHORT = "short";
    private static final String HEIGHT_TALL = "tall";
    private static final String HEIGHT_NORMAL = "normal";


    private static final String HEIGHT_SEVERITY_SHORT = "alarming";
    private static final String HEIGHT_SEVERITY_NORMAL = "healthy";
    private static final String HEIGHT_SEVERITY_TALL = "alarming";

    public static CmedStatusRemarks examineHeight(UserMeasurement userMeasurement) {

        CmedPerson user = userMeasurement.getPerson();

        double minNormalHeight, maxNormalHeight;

        CmedStatusRemarks cmedStatusRemarks = new CmedStatusRemarks();

        System.out.println("AGe: "+ user.getAgeInMonths());

        // 2 yrs
        if (user.getAgeInMonths()>=24 && user.getAgeInMonths()<=29){

            if (user.getGender().equals(Gender.m.getLabel())) {

                minNormalHeight = 32;
                maxNormalHeight = 36.9;

            } else if (user.getGender().equals(Gender.f.getLabel()) ) {

                minNormalHeight = 31;
                maxNormalHeight = 35.9;

            } else {
                return  returnUnknownResult();
            }

            cmedStatusRemarks = getStatusForHeight(userMeasurement.getValue1(), minNormalHeight, maxNormalHeight);

            // 2.5 yrs
        } else if (user.getAgeInMonths()>=30 && user.getAgeInMonths()<=35) {

            if (user.getGender().equals(Gender.m.getLabel())) {

                minNormalHeight = 34;
                maxNormalHeight = 37.9;

            } else if (user.getGender().equals(Gender.f.getLabel()) ) {

                minNormalHeight = 33;
                maxNormalHeight = 37.9;

            } else {
                return  returnUnknownResult();
            }

            cmedStatusRemarks = getStatusForHeight(userMeasurement.getValue1(), minNormalHeight, maxNormalHeight);

            // 3 yrs
        } else if (user.getAgeInMonths()>=36 && user.getAgeInMonths()<=41) {

            if (user.getGender().equals(Gender.m.getLabel())) {

                minNormalHeight = 35;
                maxNormalHeight = 39.9;
                cmedStatusRemarks = getStatusForHeight(userMeasurement.getValue1(), minNormalHeight, maxNormalHeight);

            } else if (user.getGender().equals(Gender.f.getLabel()) ) {

                minNormalHeight = 34;
                maxNormalHeight = 39.9;
                cmedStatusRemarks = getStatusForHeight(userMeasurement.getValue1(), minNormalHeight, maxNormalHeight);

            } else {
                return  returnUnknownResult();
            }

            // 3.5 yrs
        }  else if (user.getAgeInMonths()>=42 && user.getAgeInMonths()<=47) {

                if (user.getGender().equals(Gender.m.getLabel())) {

                minNormalHeight = 36;
                maxNormalHeight = 40.9;

                } else if (user.getGender().equals(Gender.f.getLabel()) ) {

                minNormalHeight = 35;
                maxNormalHeight = 40.9;

            } else {
                return  returnUnknownResult();
            }

            cmedStatusRemarks = getStatusForHeight(userMeasurement.getValue1(), minNormalHeight, maxNormalHeight);

            // 4 yrs
        } else if (user.getAgeInMonths()>=48 && user.getAgeInMonths()<=53) {

                if (user.getGender().equals(Gender.m.getLabel())) {

                minNormalHeight = 37;
                maxNormalHeight = 42.9;

                } else if (user.getGender().equals(Gender.f.getLabel()) ) {

                minNormalHeight = 36;
                maxNormalHeight = 42.9;

            } else {
                return  returnUnknownResult();
            }

            cmedStatusRemarks = getStatusForHeight(userMeasurement.getValue1(), minNormalHeight, maxNormalHeight);

            // 4.5 yrs
        } else if (user.getAgeInMonths()>=54 && user.getAgeInMonths()<=59) {

                if (user.getGender().equals(Gender.m.getLabel())) {

                minNormalHeight = 38;
                maxNormalHeight = 43.9;

                } else if (user.getGender().equals(Gender.f.getLabel()) ) {

                minNormalHeight = 38;
                maxNormalHeight = 43.9;

            } else {
                return  returnUnknownResult();
            }

            cmedStatusRemarks = getStatusForHeight(userMeasurement.getValue1(), minNormalHeight, maxNormalHeight);

            // 5yrs
        } else if (user.getAgeInMonths()>=60 && user.getAgeInMonths()<=65) {

                if (user.getGender().equals(Gender.m.getLabel())) {

                minNormalHeight = 39;
                maxNormalHeight = 45.9;

                } else if (user.getGender().equals(Gender.f.getLabel()) ) {

                minNormalHeight = 39;
                maxNormalHeight = 45.9;

            } else {
                return  returnUnknownResult();
            }

            cmedStatusRemarks = getStatusForHeight(userMeasurement.getValue1(), minNormalHeight, maxNormalHeight);

            // 5.5 yrs
        } else if (user.getAgeInMonths()>=66 && user.getAgeInMonths()<=71) {

                if (user.getGender().equals(Gender.m.getLabel())) {

                minNormalHeight = 41;
                maxNormalHeight = 46.9;

                } else if (user.getGender().equals(Gender.f.getLabel()) ) {

                minNormalHeight = 40;
                maxNormalHeight = 47.9;

            } else {
                return  returnUnknownResult();
            }

            cmedStatusRemarks = getStatusForHeight(userMeasurement.getValue1(), minNormalHeight, maxNormalHeight);


            // 6 yrs
        } else if (user.getAgeInMonths()>=72 && user.getAgeInMonths()<=75) {

                if (user.getGender().equals(Gender.m.getLabel())) {

                minNormalHeight = 42;
                maxNormalHeight = 48.9;

                } else if (user.getGender().equals(Gender.f.getLabel()) ) {

                minNormalHeight = 41;
                maxNormalHeight = 48.9;

            } else {
                return  returnUnknownResult();
            }

            cmedStatusRemarks = getStatusForHeight(userMeasurement.getValue1(), minNormalHeight, maxNormalHeight);


            // 6.5 yrs
        } else if (user.getAgeInMonths()>=76 && user.getAgeInMonths()<=83) {

                if (user.getGender().equals(Gender.m.getLabel())) {

                minNormalHeight = 43;
                maxNormalHeight = 49.9;

                } else if (user.getGender().equals(Gender.f.getLabel()) ) {

                minNormalHeight = 43;
                maxNormalHeight = 50.9;

            } else {
                return  returnUnknownResult();
            }

            cmedStatusRemarks = getStatusForHeight(userMeasurement.getValue1(), minNormalHeight, maxNormalHeight);

            // 7 yrs
        } else if (user.getAgeInMonths()>=84 && user.getAgeInMonths()<=89) {

                if (user.getGender().equals(Gender.m.getLabel())) {

                minNormalHeight = 44;
                maxNormalHeight = 50.9;

                } else if (user.getGender().equals(Gender.f.getLabel()) ) {

                minNormalHeight = 44;
                maxNormalHeight = 51.9;

            } else {
                return  returnUnknownResult();
            }

            cmedStatusRemarks = getStatusForHeight(userMeasurement.getValue1(), minNormalHeight, maxNormalHeight);


            // 7.5 yrs
        } else if (user.getAgeInMonths()>=90 && user.getAgeInMonths()<=95) {

                if (user.getGender().equals(Gender.m.getLabel())) {

                minNormalHeight = 45;
                maxNormalHeight = 52.9;

                } else if (user.getGender().equals(Gender.f.getLabel()) ) {

                minNormalHeight = 45;
                maxNormalHeight = 53.9;

            } else {
                return  returnUnknownResult();
            }

            cmedStatusRemarks = getStatusForHeight(userMeasurement.getValue1(), minNormalHeight, maxNormalHeight);


            // 8 yrs
        } else if (user.getAgeInMonths()>=96 && user.getAgeInMonths()<=101) {

                if (user.getGender().equals(Gender.m.getLabel())) {

                minNormalHeight = 47;
                maxNormalHeight = 53.9;

                } else if (user.getGender().equals(Gender.f.getLabel()) ) {

                minNormalHeight = 46;
                maxNormalHeight = 54.9;

            } else {
                return returnUnknownResult();
            }

            cmedStatusRemarks = getStatusForHeight(userMeasurement.getValue1(), minNormalHeight, maxNormalHeight);


            // 8.5 yrs
        } else if (user.getAgeInMonths()>=101 && user.getAgeInMonths()<=107) {

                if (user.getGender().equals(Gender.m.getLabel())) {

                minNormalHeight = 46;
                maxNormalHeight = 54.9;

                } else if (user.getGender().equals(Gender.f.getLabel()) ) {

                minNormalHeight = 47;
                maxNormalHeight = 55.9;

            } else {
                return  returnUnknownResult();
            }

            cmedStatusRemarks = getStatusForHeight(userMeasurement.getValue1(), minNormalHeight, maxNormalHeight);


            // 9 yrs
        } else if (user.getAgeInMonths()>=108 && user.getAgeInMonths()<=113) {

                if (user.getGender().equals(Gender.m.getLabel())) {

                minNormalHeight = 47;
                maxNormalHeight = 56.9;

                } else if (user.getGender().equals(Gender.f.getLabel()) ) {

                minNormalHeight = 48;
                maxNormalHeight = 56.9;

            } else {
                return  returnUnknownResult();
            }

            cmedStatusRemarks = getStatusForHeight(userMeasurement.getValue1(), minNormalHeight, maxNormalHeight);


            // 9.5 yrs
        } else if (user.getAgeInMonths()>=114 && user.getAgeInMonths()<=119) {

                if (user.getGender().equals(Gender.m.getLabel())) {

                minNormalHeight = 49;
                maxNormalHeight = 57.9;

                } else if (user.getGender().equals(Gender.f.getLabel()) ) {

                minNormalHeight = 49;
                maxNormalHeight = 57.9;

            } else {
                return  returnUnknownResult();
            }

            cmedStatusRemarks = getStatusForHeight(userMeasurement.getValue1(), minNormalHeight, maxNormalHeight);


            // 10 yrs
        } else if (user.getAgeInMonths()>=120 && user.getAgeInMonths()<=125) {

                if (user.getGender().equals(Gender.m.getLabel())) {

                minNormalHeight = 50;
                maxNormalHeight = 58.9;

                } else if (user.getGender().equals(Gender.f.getLabel()) ) {

                minNormalHeight = 49;
                maxNormalHeight = 58.9;

            } else {
                return  returnUnknownResult();
            }

            cmedStatusRemarks = getStatusForHeight(userMeasurement.getValue1(), minNormalHeight, maxNormalHeight);


            // 10.5 yrs
        } else if (user.getAgeInMonths()>=126 && user.getAgeInMonths()<=131) {

                if (user.getGender().equals(Gender.m.getLabel())) {

                minNormalHeight = 51;
                maxNormalHeight = 59.9;

                } else if (user.getGender().equals(Gender.f.getLabel()) ) {

                minNormalHeight = 50;
                maxNormalHeight = 60.9;

            } else {
                return  returnUnknownResult();
            }

            cmedStatusRemarks = getStatusForHeight(userMeasurement.getValue1(), minNormalHeight, maxNormalHeight);

            // 11 yrs
        } else if (user.getAgeInMonths()>=132 && user.getAgeInMonths()<=137) {


                if (user.getGender().equals(Gender.m.getLabel())) {

                minNormalHeight = 52;
                maxNormalHeight = 60.9;

                } else if (user.getGender().equals(Gender.f.getLabel()) ) {

                minNormalHeight = 51;
                maxNormalHeight = 61.9;

            } else {
                return  returnUnknownResult();
            }

            cmedStatusRemarks = getStatusForHeight(userMeasurement.getValue1(), minNormalHeight, maxNormalHeight);

            // 11.5 yrs
        } else if (user.getAgeInMonths()>=138 && user.getAgeInMonths()<=143) {

                if (user.getGender().equals(Gender.m.getLabel())) {

                minNormalHeight = 53;
                maxNormalHeight = 61.9;

                } else if (user.getGender().equals(Gender.f.getLabel()) ) {

                minNormalHeight = 53;
                maxNormalHeight = 63.9;

            } else {
                return  returnUnknownResult();
            }

            cmedStatusRemarks = getStatusForHeight(userMeasurement.getValue1(), minNormalHeight, maxNormalHeight);

            // 12 yrs
        } else if (user.getAgeInMonths()>=144 && user.getAgeInMonths()<=149) {

                if (user.getGender().equals(Gender.m.getLabel())) {

                minNormalHeight = 54;
                maxNormalHeight = 62.9;

                } else if (user.getGender().equals(Gender.f.getLabel()) ) {

                minNormalHeight = 54;
                maxNormalHeight = 64.9;

            } else {
                return  returnUnknownResult();
            }

            cmedStatusRemarks = getStatusForHeight(userMeasurement.getValue1(), minNormalHeight, maxNormalHeight);


            // 12.5 yrs
        } else if (user.getAgeInMonths()>=150 && user.getAgeInMonths()<=155) {

                if (user.getGender().equals(Gender.m.getLabel())) {

                minNormalHeight = 55;
                maxNormalHeight = 64.9;

                } else if (user.getGender().equals(Gender.f.getLabel()) ) {

                minNormalHeight = 55;
                maxNormalHeight = 65.9;

            } else {
                return  returnUnknownResult();
            }

            cmedStatusRemarks = getStatusForHeight(userMeasurement.getValue1(), minNormalHeight, maxNormalHeight);

            // 13 yrs

        } else if (user.getAgeInMonths()>=156 && user.getAgeInMonths()<=161) {

                if (user.getGender().equals(Gender.m.getLabel())) {

                minNormalHeight = 56;
                maxNormalHeight = 65.9;

                } else if (user.getGender().equals(Gender.f.getLabel()) ) {

                minNormalHeight = 57;
                maxNormalHeight = 66.9;

            } else {
                return  returnUnknownResult();
            }

            cmedStatusRemarks = getStatusForHeight(userMeasurement.getValue1(), minNormalHeight, maxNormalHeight);


            // 13.5 yrs
        } else if (user.getAgeInMonths()>=162 && user.getAgeInMonths()<=167) {

                if (user.getGender().equals(Gender.m.getLabel())) {

                minNormalHeight = 58;
                maxNormalHeight = 67.9;

                } else if (user.getGender().equals(Gender.f.getLabel()) ) {

                minNormalHeight = 58;
                maxNormalHeight = 67.9;

            } else {
                return  returnUnknownResult();
            }

            cmedStatusRemarks = getStatusForHeight(userMeasurement.getValue1(), minNormalHeight, maxNormalHeight);

            // 14 yrs
        } else if (user.getAgeInMonths()>=168 && user.getAgeInMonths()<=173) {

                if (user.getGender().equals(Gender.m.getLabel())) {

                minNormalHeight = 59;
                maxNormalHeight = 68.9;

                } else if (user.getGender().equals(Gender.f.getLabel()) ) {

                minNormalHeight = 58;
                maxNormalHeight = 67.9;

            } else {
                return  returnUnknownResult();
            }

            cmedStatusRemarks = getStatusForHeight(userMeasurement.getValue1(), minNormalHeight, maxNormalHeight);

            // 14.5 yrs
        } else if (user.getAgeInMonths()>=174 && user.getAgeInMonths()<=179) {

                if (user.getGender().equals(Gender.m.getLabel())) {

                minNormalHeight = 60;
                maxNormalHeight = 70.9;

                } else if (user.getGender().equals(Gender.f.getLabel()) ) {

                minNormalHeight = 59;
                maxNormalHeight = 68.9;

            } else {
                return  returnUnknownResult();
            }

            cmedStatusRemarks = getStatusForHeight(userMeasurement.getValue1(), minNormalHeight, maxNormalHeight);

            // 15 yrs
        } else if (user.getAgeInMonths()>=180 && user.getAgeInMonths()<=185) {

                if (user.getGender().equals(Gender.m.getLabel())) {

                minNormalHeight = 61;
                maxNormalHeight = 71.9;

                } else if (user.getGender().equals(Gender.f.getLabel()) ) {

                minNormalHeight = 59;
                maxNormalHeight = 68.9;

            } else {
                return  returnUnknownResult();
            }

            cmedStatusRemarks = getStatusForHeight(userMeasurement.getValue1(), minNormalHeight, maxNormalHeight);


            // 15.5 yrs
        } else if (user.getAgeInMonths()>=186 && user.getAgeInMonths()<=191) {

                if (user.getGender().equals(Gender.m.getLabel())) {

                minNormalHeight = 63;
                maxNormalHeight = 71.9;

                } else if (user.getGender().equals(Gender.f.getLabel()) ) {

                minNormalHeight = 59;
                maxNormalHeight = 68.9;

            } else {
                return  returnUnknownResult();
            }

            cmedStatusRemarks = getStatusForHeight(userMeasurement.getValue1(), minNormalHeight, maxNormalHeight);


            // 16 yrs
        } else if (user.getAgeInMonths()>=192 && user.getAgeInMonths()<=197) {

                if (user.getGender().equals(Gender.m.getLabel())) {

                minNormalHeight = 63;
                maxNormalHeight = 72.9;

                } else if (user.getGender().equals(Gender.f.getLabel()) ) {

                minNormalHeight = 59;
                maxNormalHeight = 68.9;

            } else {
                return  returnUnknownResult();
            }

            cmedStatusRemarks = getStatusForHeight(userMeasurement.getValue1(), minNormalHeight, maxNormalHeight);


            // 16.5 yrs
        } else if (user.getAgeInMonths()>=198 && user.getAgeInMonths()<=203) {

                if (user.getGender().equals(Gender.m.getLabel())) {

                minNormalHeight = 64;
                maxNormalHeight = 72.9;

                } else if (user.getGender().equals(Gender.f.getLabel()) ) {

                minNormalHeight = 59;
                maxNormalHeight = 68.9;

            } else {
                return  returnUnknownResult();
            }

            cmedStatusRemarks = getStatusForHeight(userMeasurement.getValue1(), minNormalHeight, maxNormalHeight);

            // 17 yrs
        } else if (user.getAgeInMonths()>=204 && user.getAgeInMonths()<=209) {

                if (user.getGender().equals(Gender.m.getLabel())) {

                minNormalHeight = 64;
                maxNormalHeight = 73.9;

                } else if (user.getGender().equals(Gender.f.getLabel()) ) {

                minNormalHeight = 59;
                maxNormalHeight = 68.9;

            } else {
                return  returnUnknownResult();
            }

            cmedStatusRemarks = getStatusForHeight(userMeasurement.getValue1(), minNormalHeight, maxNormalHeight);

            // 17.5 yrs
        } else if (user.getAgeInMonths()>=210 && user.getAgeInMonths()<=215) {

                if (user.getGender().equals(Gender.m.getLabel())) {

                minNormalHeight = 65;
                maxNormalHeight = 73.9;

                } else if (user.getGender().equals(Gender.f.getLabel()) ) {

                minNormalHeight = 59;
                maxNormalHeight = 68.9;

            } else {
                return  returnUnknownResult();
            }

            cmedStatusRemarks = getStatusForHeight(userMeasurement.getValue1(), minNormalHeight, maxNormalHeight);


            // 18 yrs
        } else if (user.getAgeInMonths()>=216 && user.getAgeInMonths()<=217) {

                if (user.getGender().equals(Gender.m.getLabel())) {

                minNormalHeight = 65;
                maxNormalHeight = 73.9;

                } else if (user.getGender().equals(Gender.f.getLabel()) ) {

                minNormalHeight = 59;
                maxNormalHeight = 68.9;

            } else {
                return  returnUnknownResult();
            }

            cmedStatusRemarks = getStatusForHeight(userMeasurement.getValue1(), minNormalHeight, maxNormalHeight);


            // 18.5 yrs
        } else if (user.getAgeInMonths()>=217 && user.getAgeInMonths()<=227) {


                if (user.getGender().equals(Gender.m.getLabel())) {

                minNormalHeight = 65;
                maxNormalHeight = 73.9;

                } else if (user.getGender().equals(Gender.f.getLabel()) ) {

                minNormalHeight = 59;
                maxNormalHeight = 68.9;

            } else {
                return  returnUnknownResult();
            }

            cmedStatusRemarks = getStatusForHeight(userMeasurement.getValue1(), minNormalHeight, maxNormalHeight);

            // 19 yrs
        } else if (user.getAgeInMonths()>=228 && user.getAgeInMonths()<=233) {

                if (user.getGender().equals(Gender.m.getLabel())) {

                minNormalHeight = 65;
                maxNormalHeight = 73.9;

                } else if (user.getGender().equals(Gender.f.getLabel()) ) {

                minNormalHeight = 59;
                maxNormalHeight = 68.9;

            } else {
                return  returnUnknownResult();
            }

            cmedStatusRemarks = getStatusForHeight(userMeasurement.getValue1(), minNormalHeight, maxNormalHeight);

        } else if (user.getAgeInMonths()>=234 && user.getAgeInMonths()<=239) {

                if (user.getGender().equals(Gender.m.getLabel())) {

                minNormalHeight = 65;
                maxNormalHeight = 73.9;

                } else if (user.getGender().equals(Gender.f.getLabel()) ) {

                minNormalHeight = 59;
                maxNormalHeight = 68.9;

            } else {
                return  returnUnknownResult();
            }

            cmedStatusRemarks = getStatusForHeight(userMeasurement.getValue1(), minNormalHeight, maxNormalHeight);

        } else if (user.getAgeInMonths()==240) {

                if (user.getGender().equals(Gender.m.getLabel())) {

                minNormalHeight = 65;
                maxNormalHeight = 73.9;

                } else if (user.getGender().equals(Gender.f.getLabel()) ) {

                minNormalHeight = 59;
                maxNormalHeight = 68.9;

            } else {
                return  returnUnknownResult();
            }

            cmedStatusRemarks = getStatusForHeight(userMeasurement.getValue1(), minNormalHeight, maxNormalHeight);

        } else {
            cmedStatusRemarks = returnUnknownResult();
        }

            return cmedStatusRemarks;
    }

    private static CmedStatusRemarks returnUnknownResult() {

        CmedStatusRemarks cmedStatusRemarks = new CmedStatusRemarks();
        cmedStatusRemarks.setStatus("unknown");
        cmedStatusRemarks.setRemarksFinal("unknown - unknown");

        return cmedStatusRemarks;
    }

    private static CmedStatusRemarks getStatusForHeight(Double heightValue, double minNormalHeight, double maxNormalHeight) {

        heightValue = Utility.getInchFromCm(heightValue);
        String minNormalHeightInFeet = Utility.getFeetFromInch(minNormalHeight);
        String maxNormalHeightInFeet = Utility.getFeetFromInch(maxNormalHeight);

        CmedStatusRemarks cmedStatusRemarks =  new CmedStatusRemarks();
        cmedStatusRemarks.setRemarksFinal(minNormalHeightInFeet+" - "+maxNormalHeightInFeet);


        if (heightValue < minNormalHeight) {
            cmedStatusRemarks.setStatus(HEIGHT_SHORT);
            cmedStatusRemarks.setSeverity(HEIGHT_SEVERITY_SHORT);
        } else if (heightValue > maxNormalHeight) {
            cmedStatusRemarks.setStatus(HEIGHT_TALL);
            cmedStatusRemarks.setSeverity(HEIGHT_SEVERITY_TALL);
        } else {
            cmedStatusRemarks.setStatus(HEIGHT_NORMAL);
            cmedStatusRemarks.setSeverity(HEIGHT_SEVERITY_NORMAL);
        }

        return cmedStatusRemarks;
    }
}
