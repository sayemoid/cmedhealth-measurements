package domains;


/**
 * Created by rezaul on 5/15/17.
 */
public class CmedStatusRemarks extends BaseEntity{

    private String status;
    private String severity;
    private String remarksMin;
    private String remarksMax;
    private String remarksFinal;
    private String tagCode;
    private String tagName;

    public CmedStatusRemarks(String status, String severity, String remarksFinal) {
        this.status = status;
        this.severity = severity;
        this.remarksFinal = remarksFinal;
    }

    public CmedStatusRemarks() {
    }

    public String getTagCode() {
        return tagCode;
    }

    public void setTagCode(String tagCode) {
        this.tagCode = tagCode;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemarksMin() {
        return remarksMin;
    }

    public void setRemarksMin(String remarksMin) {
        this.remarksMin = remarksMin;
    }

    public String getRemarksMax() {
        return remarksMax;
    }

    public void setRemarksMax(String remarksMax) {
        this.remarksMax = remarksMax;
    }

    public String getRemarksFinal() {
        return remarksFinal;
    }

    public void setRemarksFinal(String remarksFinal) {
        this.remarksFinal = remarksFinal;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }
}
