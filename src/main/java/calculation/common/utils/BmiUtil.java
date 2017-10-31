package calculation.common.utils;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class BmiUtil {
    public static String MIN = "min";
    public static String MAX = "max";

    public static double getNormalWeight(Date birthday, int height) {
        Map<String, Double> normalRange = getNormalBmiRange(birthday);
        double bmiMax = normalRange.get(MAX);
        return getWeight(bmiMax, height);
    }

    public static double getWeight(double bmi, int height) {
        double heightInMeter = ((double) height) / 100;
        return bmi * heightInMeter * heightInMeter;
    }

    public static Map<String, Double> getNormalBmiRange(Date birthday) {

        double normalMin, normalMax;
        int ageInMonths = Utility.getAgeInMonths(birthday);

        Map<String, Double> nMap = new HashMap<>();

        // Age 2 yr
        if (ageInMonths >= 24 && ageInMonths <= 29) {

            normalMin = 14.5;
            normalMax = 18;
            nMap.put(MIN, normalMin);
            nMap.put(MAX, normalMax);
            return nMap;

            // Age 2.5 yr
        } else if (ageInMonths >= 30 && ageInMonths <= 35) {

            normalMin = 14.5;
            normalMax = 17.5;
            nMap.put(MIN, normalMin);
            nMap.put(MAX, normalMax);
            return nMap;

            // Age 3 yr
        } else if (ageInMonths >= 36 && ageInMonths <= 41) {

            normalMin = 14.5;
            normalMax = 17.5;
            nMap.put(MIN, normalMin);
            nMap.put(MAX, normalMax);
            return nMap;

            // Age 3.5 yr

        } else if (ageInMonths >= 42 && ageInMonths <= 47) {

            normalMin = 14.2;
            normalMax = 17;
            nMap.put(MIN, normalMin);
            nMap.put(MAX, normalMax);
            return nMap;

            // Age 4 yr

        } else if (ageInMonths >= 48 && ageInMonths <= 53) {

            normalMin = 14;
            normalMax = 17;
            nMap.put(MIN, normalMin);
            nMap.put(MAX, normalMax);
            return nMap;

            // Age 4.5 yr

        } else if (ageInMonths >= 54 && ageInMonths <= 59) {

            normalMin = 14;
            normalMax = 16.9;
            nMap.put(MIN, normalMin);
            nMap.put(MAX, normalMax);
            return nMap;


            // Age 5 yr
        } else if (ageInMonths >= 60 && ageInMonths <= 65) {

            normalMin = 13.9;
            normalMax = 16.9;
            nMap.put(MIN, normalMin);
            nMap.put(MAX, normalMax);
            return nMap;

            // Age 5.5 yr
        } else if (ageInMonths >= 66 && ageInMonths <= 71) {

            normalMin = 13.8;
            normalMax = 16.9;
            nMap.put(MIN, normalMin);
            nMap.put(MAX, normalMax);
            return nMap;

            // Age 6 yr
        } else if (ageInMonths >= 72 && ageInMonths <= 77) {
            normalMin = 13.8;
            normalMax = 17;
            nMap.put(MIN, normalMin);
            nMap.put(MAX, normalMax);
            return nMap;


            // Age 6.5 yr
        } else if (ageInMonths >= 78 && ageInMonths <= 83) {

            normalMin = 13.8;
            normalMax = 17.1;
            nMap.put(MIN, normalMin);
            nMap.put(MAX, normalMax);
            return nMap;


            // Age 7 yr
        } else if (ageInMonths >= 84 && ageInMonths <= 89) {
            normalMin = 13.8;
            normalMax = 17.4;
            nMap.put(MIN, normalMin);
            nMap.put(MAX, normalMax);
            return nMap;


            // Age 7.5 yr
        } else if (ageInMonths >= 90 && ageInMonths <= 95) {

            normalMin = 13.8;
            normalMax = 17.6;
            nMap.put(MIN, normalMin);
            nMap.put(MAX, normalMax);
            return nMap;


            // Age 8 yr
        } else if (ageInMonths >= 96 && ageInMonths <= 101) {

            normalMin = 13.9;
            normalMax = 18;
            nMap.put(MIN, normalMin);
            nMap.put(MAX, normalMax);
            return nMap;


            // Age 8.5 yr
        } else if (ageInMonths >= 102 && ageInMonths <= 107) {

            normalMin = 13.9;
            normalMax = 18.3;
            nMap.put(MIN, normalMin);
            nMap.put(MAX, normalMax);
            return nMap;


            // Age 9 yr
        } else if (ageInMonths >= 108 && ageInMonths <= 113) {

            normalMin = 14;
            normalMax = 18.5;
            nMap.put(MIN, normalMin);
            nMap.put(MAX, normalMax);
            return nMap;


            // Age 9.5 yr

        } else if (ageInMonths >= 114 && ageInMonths <= 119) {

            normalMin = 14;
            normalMax = 19;
            nMap.put(MIN, normalMin);
            nMap.put(MAX, normalMax);
            return nMap;


            // Age 10 yr
        } else if (ageInMonths >= 120 && ageInMonths <= 125) {

            normalMin = 14.2;
            normalMax = 19.4;
            nMap.put(MIN, normalMin);
            nMap.put(MAX, normalMax);
            return nMap;


            // Age 10.5 yr

        } else if (ageInMonths >= 126 && ageInMonths <= 131) {

            normalMin = 14.4;
            normalMax = 19.8;
            nMap.put(MIN, normalMin);
            nMap.put(MAX, normalMax);
            return nMap;


            // Age 11 yr

        } else if (ageInMonths >= 132 && ageInMonths <= 137) {

            normalMin = 14.5;
            normalMax = 20.1;
            nMap.put(MIN, normalMin);
            nMap.put(MAX, normalMax);
            return nMap;


            // Age 11.5 yr
        } else if (ageInMonths >= 138 && ageInMonths <= 143) {

            normalMin = 14.8;
            normalMax = 20.5;
            nMap.put(MIN, normalMin);
            nMap.put(MAX, normalMax);
            return nMap;


            // Age 12 yr
        } else if (ageInMonths >= 144 && ageInMonths <= 149) {

            normalMin = 15;
            normalMax = 21;
            nMap.put(MIN, normalMin);
            nMap.put(MAX, normalMax);
            return nMap;

            // Age 12.5 yr
        } else if (ageInMonths >= 150 && ageInMonths <= 155) {

            normalMin = 15.2;
            normalMax = 21.4;
            nMap.put(MIN, normalMin);
            nMap.put(MAX, normalMax);
            return nMap;


            // Age 13 yr
        } else if (ageInMonths >= 156 && ageInMonths <= 161) {

            normalMin = 15.5;
            normalMax = 21.9;
            nMap.put(MIN, normalMin);
            nMap.put(MAX, normalMax);
            return nMap;


            // Age 13.5 yr
        } else if (ageInMonths >= 162 && ageInMonths <= 167) {

            normalMin = 15.6;
            normalMax = 22.2;
            nMap.put(MIN, normalMin);
            nMap.put(MAX, normalMax);
            return nMap;


            // Age 14 yr
        } else if (ageInMonths >= 168 && ageInMonths <= 173) {

            normalMin = 16;
            normalMax = 22.6;
            nMap.put(MIN, normalMin);
            nMap.put(MAX, normalMax);
            return nMap;


            // Age 14.5 yr
        } else if (ageInMonths >= 174 && ageInMonths <= 179) {

            normalMin = 16.2;
            normalMax = 23;
            nMap.put(MIN, normalMin);
            nMap.put(MAX, normalMax);
            return nMap;


            // Age 15 yr
        } else if (ageInMonths >= 180 && ageInMonths <= 185) {

            normalMin = 16.5;
            normalMax = 23.5;
            nMap.put(MIN, normalMin);
            nMap.put(MAX, normalMax);
            return nMap;


            // Age 15.5 yr
        } else if (ageInMonths >= 186 && ageInMonths <= 191) {

            normalMin = 16.9;
            normalMax = 23.9;
            nMap.put(MIN, normalMin);
            nMap.put(MAX, normalMax);
            return nMap;


            // Age 16 yr
        } else if (ageInMonths >= 192 && ageInMonths <= 197) {

            normalMin = 17;
            normalMax = 24.1;
            nMap.put(MIN, normalMin);
            nMap.put(MAX, normalMax);
            return nMap;


            // Age 16.5 yr
        } else if (ageInMonths >= 198 && ageInMonths <= 203) {

            normalMin = 17.4;
            normalMax = 24.5;
            nMap.put(MIN, normalMin);
            nMap.put(MAX, normalMax);
            return nMap;


            // Age 17 yr
        } else if (ageInMonths >= 204 && ageInMonths <= 209) {

            normalMin = 17.6;
            normalMax = 24.9;
            nMap.put(MIN, normalMin);
            nMap.put(MAX, normalMax);
            return nMap;


            // Age 17.5 yr
        } else if (ageInMonths >= 210 && ageInMonths <= 215) {

            normalMin = 18;
            normalMax = 25.3;
            nMap.put(MIN, normalMin);
            nMap.put(MAX, normalMax);
            return nMap;


            // Age 18 yr
        } else if (ageInMonths >= 216 && ageInMonths <= 221) {

            normalMin = 18.2;
            normalMax = 25.6;
            nMap.put(MIN, normalMin);
            nMap.put(MAX, normalMax);
            return nMap;


            // Age 18.5 yr
        } else if (ageInMonths >= 222 && ageInMonths <= 227) {

            normalMin = 18.6;
            normalMax = 26;
            nMap.put(MIN, normalMin);
            nMap.put(MAX, normalMax);
            return nMap;


            // Age 19 yr
        } else if (ageInMonths >= 228 && ageInMonths <= 233) {

            normalMin = 18.6;
            normalMax = 26;
            nMap.put(MIN, normalMin);
            nMap.put(MAX, normalMax);
            return nMap;


            // Age 19.5 yr
        } else if (ageInMonths >= 234 && ageInMonths <= 239) {

            normalMin = 18.9;
            normalMax = 26.6;
            nMap.put(MIN, normalMin);
            nMap.put(MAX, normalMax);
            return nMap;


            // Age 20 yr
        } else if (ageInMonths >= 240) {

            normalMin = 19.1;
            normalMax = 27;
            nMap.put(MIN, normalMin);
            nMap.put(MAX, normalMax);
            return nMap;


        } else {
            normalMin = 18;
            normalMax = 24.9;
            nMap.put(MIN, normalMin);
            nMap.put(MAX, normalMax);
            return nMap;
        }
    }
}
