package class5.parkinglotcapacity.models;

import java.util.Date;

public class BaseModel {
    private long id;
    private Date createdAt;
    private Date updatedAt;

    public BaseModel(long id) {
        this.id = id;
        this.createdAt = new Date();
        this.updatedAt = new Date();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }
}
