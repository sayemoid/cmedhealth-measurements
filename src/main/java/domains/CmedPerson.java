package domains;

import org.joda.time.LocalDate;
import org.joda.time.Months;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Rajaul Islam on 5/30/2017.
 */

public class CmedPerson extends BaseEntity{

    private Date birthday;

    private String gender;

    private double height;
    private double weight;

    private String dob;

    public String getDob() {
        SimpleDateFormat sdfr = new SimpleDateFormat("MM/DD/yyyy");
        return sdfr.format(birthday);
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

//    public Integer getAgeInMonths() {
//        if(birthday == null)
//            return 0;
//        Calendar cal = Calendar.getInstance();
//        cal.setTime(this.birthday);
//        LocalDateTime birthDate = LocalDateTime.ofInstant(cal.getTime().toInstant(), ZoneId.systemDefault());
//        Duration duration = Duration.between(birthDate, LocalDateTime.now());
//        return Math.toIntExact((duration.toDays() / 30));
//    }

    public Integer getAgeInMonths() {
        LocalDate birthdate = new LocalDate(birthday);
        LocalDate now = new LocalDate();
        return Months.monthsBetween(birthdate,now).getMonths();
    }

    public boolean isUserAdult() {

        return getAgeInMonths() >= 216;
    }



}
