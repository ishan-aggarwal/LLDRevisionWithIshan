package class5.managewaitlist.models;

import java.util.Date;
import java.util.Objects;

public class WaitListPosition extends BaseModel{
    private User user;
    private Date insertedAt;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getInsertedAt() {
        return insertedAt;
    }

    public void setInsertedAt(Date insertedAt) {
        this.insertedAt = insertedAt;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof WaitListPosition)) return false;
//        WaitListPosition that = (WaitListPosition) o;
//        return this.user.getId() == that.user.getId();
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(user.getId());
//    }

}
