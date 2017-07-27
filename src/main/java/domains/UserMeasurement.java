package domains;

import java.util.Date;
import java.util.List;

/**
 * Created by rezaul on 5/13/17.
 */
public class UserMeasurement extends BaseEntity{

    public UserMeasurement() {
    }

    private CmedPerson person;


    private Double value1;

    private Double value2;

    private Double value3;

    private String status;

    private String severity;

    private String remarks;

    private CmedStatusRemarks cmedStatusRemarks;

    private List<CmedMeasurementTag> tag;

    public Date getMeasuredAt() {
        return super.getCreated();
    }


    public Double getValue1() {
        return value1;
    }

    public void setValue1(Double value1) {
        this.value1 = value1;
    }

    public Double getValue2() {
        return value2;
    }

    public void setValue2(Double value2) {
        this.value2 = value2;
    }

    public Double getValue3() {
        return value3;
    }

    public void setValue3(Double value3) {
        this.value3 = value3;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public CmedStatusRemarks getCmedStatusRemarks() {
        return cmedStatusRemarks;
    }

    public void setCmedStatusRemarks(CmedStatusRemarks cmedStatusRemarks) {
        this.cmedStatusRemarks = cmedStatusRemarks;
    }

    public List<CmedMeasurementTag> getTag() {
        return tag;
    }

    public void setTag(List<CmedMeasurementTag> tag) {
        this.tag = tag;
    }

    public CmedPerson getPerson() {
        return person;
    }

    public void setPerson(CmedPerson person) {
        this.person = person;
    }
}
