package calculation.common.utils;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * Author: rezaul || Date: 4/5/17.
 */
public class Utility {

    public static int getAgeInMonths(Date dob) {

        String dbString = dob.toString();

        String[] parts = dbString.split("-");
        System.out.println(dbString);
        int day = Integer.parseInt(parts[0]); // 004
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);
        LocalDate birthday = LocalDate.of(year, month, day);

        return  (int) birthday.until(LocalDate.now(), ChronoUnit.MONTHS);
    }

    public static double getBMIByHeightAndWeight(double height, double weight) {
//(Weight in Kilograms / (Height in Meters x Height in Meters))
        return (weight / ((height * 0.01) * (height * 0.01)));
    }

    public static double getInchFromCm(double height) {

        return (height*0.393701);
    }

    public static String getFeetFromCm(double height) {
        double inch = height*0.393701;
        int feetHeight = (int) (inch/12);
        int inchHeight = (int) (inch%12);

        return feetHeight+"\'"+inchHeight+"\"";

    }

    public static String getFeetFromInch(double height) {
        int feetHeight = (int) (height/12);
        int inchHeight = (int) (height%12);

        return feetHeight+"\'"+inchHeight+"\"";

    }


/*    public static Boolean isDuplicateCmedId() {
        User existingUser = userService.findByCmedId(cmedId);
        if (existingUser!=null)
        {
            System.out.println("Result: "+bindingResult.toString());
            List<String> districts = new ArrayList<>();

            for (District district : District.values()) {
                // do what you want
                districts.add(district.getName());
            }

            model.addAttribute("districts", districts);
            model.addAttribute("company_code", code);
            model.addAttribute("cmed_id_exists", "CMED ID is already taken. Please choose another one.");

            return "corporate/add_member";
        }
    }*/
}
