package domains.enums;

/**
 * Created by AKM Rezaul Alam on 7/10/17.
 * Email: contact@rezaul.me
 * URL: rezaul.me
 */
public enum Status {

    HEALTHY("healthy", 1),
    ALARMING("alarming", 2),
    EMERGENCY("emergency", 3),
    UNKNOWN("unknown", 0);

    private String statusLabel;
    private int statusRating;

    Status(String statusLabel, int statusRating) {
        this.statusRating = statusRating;
        this.statusLabel = statusLabel;
    }

    public int getStatusRating() {
        return statusRating;
    }

    public String getStatusLabel() {
        return statusLabel;
    }
}
