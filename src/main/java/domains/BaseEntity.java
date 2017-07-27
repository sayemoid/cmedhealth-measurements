package domains;

import java.util.Date;

/**
 * Created by user on 5/8/17.
 */
public class BaseEntity {

    private Long id;

    private Date created;

    private Date lastUpdated;

    public Long getId() {
        return id;
    }

    public Date getCreated() {
        return created;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }
}
