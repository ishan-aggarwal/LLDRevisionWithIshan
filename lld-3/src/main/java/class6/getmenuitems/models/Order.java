package class6.getmenuitems.models;

import java.util.Map;

public class Order extends BaseModel{
    private String id;
    private Customer customer;
    private Map<MenuItem, Integer> orderedItems;
}
