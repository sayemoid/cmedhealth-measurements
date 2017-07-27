package calculation.common;


import calculation.adult.BMICalculatorAdult;
import calculation.adult.BPCalculatorAdult;
import calculation.adult.BloodSugarAdult;
import calculation.adult.PulseCalculatorAdult;
import calculation.child.*;
import domains.CmedStatusRemarks;
import domains.UserMeasurement;

import java.text.DecimalFormat;

/**
 * Created by rezaul on 5/25/17.
 */
public class MeasurementCalculator {

    private static DecimalFormat df = new DecimalFormat(".##");

    private static final String EMPTY_STRING = "";

    public static UserMeasurement getHeight(UserMeasurement measurement) throws Exception {

        if (measurement.getValue1() == null) {
            throw new Exception("Value1 not found!");
        }

        if (measurement.getPerson().getBirthday() == null) {
            measurement.setStatus(EMPTY_STRING);
            measurement.setRemarks(EMPTY_STRING);
            measurement.setSeverity(EMPTY_STRING);
        } else {
            if (measurement.getPerson().getGender() == null) {
                measurement.setStatus(EMPTY_STRING);
                measurement.setRemarks(EMPTY_STRING);
                measurement.setSeverity(EMPTY_STRING);
            } else {
                CmedStatusRemarks cmedStatusRemarks = HeightCalculatorChild.examineHeight(measurement);

                measurement = setCmedRemarks(measurement, cmedStatusRemarks);
            }
        }

        return measurement;
    }

    public static UserMeasurement getSpO2(UserMeasurement measurement) throws Exception {

        if (measurement.getValue1() == null) {
            throw new Exception("Value 1 not found!");
        }

        CmedStatusRemarks cmedStatusRemarks = Spo2CalculatorCommon.examineSpo2(measurement);

        measurement = setCmedRemarks(measurement, cmedStatusRemarks);

        return measurement;
    }

    public static UserMeasurement getTemp(UserMeasurement measurement) throws Exception {

        if (measurement.getValue1() == null) {
            throw new Exception("Value 1 not found!");
        }

        CmedStatusRemarks cmedStatusRemarks = TemparatureCalculatorCommon.examineTemp(measurement);

        measurement = setCmedRemarks(measurement, cmedStatusRemarks);


        return measurement;
    }

    //Pulse Rate For Measurement
    public static UserMeasurement getPulseRate(UserMeasurement measurement) throws Exception {


        if (measurement.getValue1() == null) {
            throw new Exception("Value 1 not found!");
        }

        CmedStatusRemarks cmedStatusRemarks;

        if (measurement.getPerson().getBirthday() == null) {

            measurement.setStatus(EMPTY_STRING);
            measurement.setRemarks(EMPTY_STRING);
            measurement.setSeverity(EMPTY_STRING);

        } else {

            if (measurement.getPerson().isUserAdult()) {
                cmedStatusRemarks = PulseCalculatorAdult.examineAdultPulse(measurement);
                measurement = setCmedRemarks(measurement, cmedStatusRemarks);

            } else {
                cmedStatusRemarks = PulseCalculatorChild.examinePulse(measurement);
                measurement = setCmedRemarks(measurement, cmedStatusRemarks);

            }
        }


        return measurement;
    }

    //Blood Sugar For Measurement
    public static UserMeasurement getBloodSugar(UserMeasurement measurement) throws Exception {

        if (measurement.getValue1() == null) {
            throw new Exception("Value 1 not found!");
        }

        CmedStatusRemarks cmedStatusRemarks;

        System.out.println("Age in Months:"+measurement.getPerson().getAgeInMonths());

        if (measurement.getPerson().getBirthday() == null) {
            measurement.setStatus(EMPTY_STRING);
            measurement.setRemarks(EMPTY_STRING);
            measurement.setSeverity(EMPTY_STRING);
        } else {
            if (measurement.getPerson().isUserAdult()) {

                if (measurement.getTag() == null || measurement.getTag().isEmpty() || measurement.getTag().get(0) == null || measurement.getTag().get(0).getCode() == null || measurement.getTag().get(0).getCode().isEmpty())
                    throw new Exception("Error in Tag");

                cmedStatusRemarks = BloodSugarAdult.examineAdultBloodSugar(measurement, measurement.getTag().get(0).getCode());
                measurement = setCmedRemarks(measurement, cmedStatusRemarks);

            } else {
                cmedStatusRemarks = BloodSugarCalculatorChild.examineBloodSugar(measurement);
                measurement = setCmedRemarks(measurement, cmedStatusRemarks);

            }

        }

        return measurement;
    }

    //BP Status from Measurement
    public static UserMeasurement getBPStatus(UserMeasurement measurement) throws Exception {

        if (measurement.getValue1() == null) {
            throw new Exception("Value 1 not found!");
        }

        if (measurement.getValue2() == null) {
            throw new Exception("Value 2 not found!");
        }

        CmedStatusRemarks cmedStatusRemarks;

        if (measurement.getPerson().getBirthday() == null) {
            measurement.setStatus(EMPTY_STRING);
            measurement.setRemarks(EMPTY_STRING);
            measurement.setSeverity(EMPTY_STRING);
        } else {
            if (measurement.getPerson().isUserAdult()) {
                cmedStatusRemarks = BPCalculatorAdult.examineAdultBP(measurement);
                measurement = setCmedRemarks(measurement, cmedStatusRemarks);

            } else {
                cmedStatusRemarks = BloodPressureCalculatorChild.examineChildBP(measurement);
                measurement = setCmedRemarks(measurement, cmedStatusRemarks);
            }
        }

        return measurement;
    }

    //BMI Status from Measurement
    public static UserMeasurement getBmiStatus(UserMeasurement measurement) throws Exception {

        if (measurement.getValue1() == null) {
            throw new Exception("Value 1 not found!");
        }

        if (measurement.getValue3() == null) {
            throw new Exception("Value 3 not found!");
        }

        Double value2 = getBMIValue(measurement.getValue1(), measurement.getValue3());
        measurement.setValue2(Double.valueOf(df.format(value2)));

        CmedStatusRemarks cmedStatusRemarks;

        if (measurement.getPerson().getBirthday() == null) {
            measurement.setStatus(EMPTY_STRING);
            measurement.setRemarks(EMPTY_STRING);
            measurement.setSeverity(EMPTY_STRING);
        } else {
            if (measurement.getPerson().isUserAdult()) {
                cmedStatusRemarks = BMICalculatorAdult.examineAdultBMI(measurement);
                measurement = setCmedRemarks(measurement, cmedStatusRemarks);

            } else {

                if (measurement.getPerson().getGender() == null) {
                    measurement.setStatus(EMPTY_STRING);
                    measurement.setRemarks(EMPTY_STRING);
                    measurement.setSeverity(EMPTY_STRING);
                } else {
                    cmedStatusRemarks = BMICalculatorChild.examineChildBMI(measurement);
                    measurement = setCmedRemarks(measurement, cmedStatusRemarks);
                }
            }
        }

        return measurement;
    }

    private static UserMeasurement setCmedRemarks(UserMeasurement measurement, CmedStatusRemarks cmedStatusRemarks) {

        measurement.setStatus(cmedStatusRemarks.getStatus());
        measurement.setRemarks(cmedStatusRemarks.getRemarksFinal());

        if (cmedStatusRemarks.getSeverity() == null) {
            cmedStatusRemarks.setSeverity("unknown");
        }
        measurement.setSeverity(cmedStatusRemarks.getSeverity());
        measurement.setCmedStatusRemarks(cmedStatusRemarks);

        return measurement;
    }


    private static Double getBMIValue(Double value1, Double value3) {

        return value1/((value3*value3)/10000);
    }

}
