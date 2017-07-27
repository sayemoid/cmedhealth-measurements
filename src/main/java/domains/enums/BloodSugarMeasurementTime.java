package domains.enums;

/**
 * Created by rezaul on 5/18/17.
 */
public enum BloodSugarMeasurementTime {

    BEFORE_DAWN("BEFORE_DAWN","Before Dawn"),
    BEFORE_BREAKFAST("BEFORE_BREAKFAST", "Before Breakfast"),
    BEFORE_LUNCH("BEFORE_LUNCH", "Before Lunch"),
    BEFORE_DINNER("BEFORE_DINNER", "Before Dinner"),
    BEFORE_SLEEP("BEFORE_SLEEP", "Before Sleep"),
    AFTER_BREAKFAST("AFTER_BREAKFAST","After Breakfast"),
    AFTER_LUNCH("AFTER_LUNCH", "After Lunch"),
    AFTER_DINNER("AFTER_DINNER", "After Dinner"),
    UNKNOWN("UNKNOWN", "Unknown"),
    RANDOM("RANDOM","Random"),
    AFTER("AFTER", "after"),
    BEFORE("BEFORE", "before");

    private String code;
    private String name;
    BloodSugarMeasurementTime(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
