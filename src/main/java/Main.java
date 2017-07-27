import calculation.common.MeasurementCalculator;
import domains.CmedMeasurementTag;
import domains.CmedPerson;
import domains.UserMeasurement;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sayem on 27-Jul-17.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        CmedPerson cmedPerson = new CmedPerson();
        cmedPerson.setBirthday(dateFormat.parse("2013/03/10"));
        cmedPerson.setGender("f");
        UserMeasurement userMeasurement = new UserMeasurement();
        CmedMeasurementTag tag = new CmedMeasurementTag();
        tag.setName("BEFORE_DAWN");
        tag.setCode("BEFORE_DAWN");
        List<CmedMeasurementTag> measurementTags = new ArrayList<>();
        measurementTags.add(tag);
        userMeasurement.setPerson(cmedPerson);
        userMeasurement.setValue1(7.9d);
        userMeasurement.setValue3(135d);
        userMeasurement.setTag(measurementTags);
        userMeasurement = MeasurementCalculator.getTemp(userMeasurement);

        System.out.println("Status: "+userMeasurement.getStatus()+" Severity: "+userMeasurement.getSeverity());
    }
}
