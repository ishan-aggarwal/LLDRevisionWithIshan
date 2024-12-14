package class5.managewaitlist.repositories;

import class5.managewaitlist.models.WaitListPosition;

import java.util.List;

public interface WaitListPositionRepository {

    WaitListPosition save(WaitListPosition waitListPosition);

    List<WaitListPosition> findAll();

    WaitListPosition delete(WaitListPosition waitListPosition);
}
