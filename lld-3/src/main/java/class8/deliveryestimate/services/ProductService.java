package class8.deliveryestimate.services;

import class8.deliveryestimate.exceptions.AddressNotFoundException;
import class8.deliveryestimate.exceptions.ProductNotFoundException;

import java.util.Date;

public interface ProductService {
    public Date estimateDeliveryDate(int productId, int addressId) throws ProductNotFoundException, AddressNotFoundException;
}
