package class6.addmenuitems.models;

import java.util.Map;

public class Order extends BaseModel{
    private String id;
    private Customer customer;
    private Map<MenuItem, Integer> orderedItems;
}
