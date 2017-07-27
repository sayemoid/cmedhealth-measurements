package domains.enums;

/**
 * Created by Rezaul on 5/9/2017.
 */
public enum Gender {

    m("m"),
    f("f"),
    u("u"),
    o("o");

    private String label;

    Gender(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
