package class5.managewaitlist.repositories;

import class5.managewaitlist.models.WaitListPosition;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryWaitListPositionRepositoryImpl implements WaitListPositionRepository {

    private Map<Long, WaitListPosition> map;
    List<WaitListPosition> list = new ArrayList<>();

    public InMemoryWaitListPositionRepositoryImpl() {
        this.map = new HashMap<>();
    }

    private static int idCounter = 0;

    @Override
    public WaitListPosition save(WaitListPosition waitListPosition) {
        if(waitListPosition.getId() == 0){
            waitListPosition.setId(++idCounter);
        }
        map.put(waitListPosition.getId(), waitListPosition);
        list.add(waitListPosition);
        return waitListPosition;
    }

    @Override
    public List<WaitListPosition> findAll() {
        // return map.values().stream().toList();
//        return new ArrayList<>(list);
        return list;
    }

    @Override
    public WaitListPosition delete(WaitListPosition waitListPosition) {


        list.remove(waitListPosition);
        return waitListPosition;

        // return map.remove(waitListPosition.getId());

    }
}
