package class8.cancelorder.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
@Entity(name = "orders")
public class Order extends BaseModel{
    @ManyToOne
    private User user;
    @OneToMany
    private List<OrderDetail> orderDetails;
    private OrderStatus orderStatus;
}