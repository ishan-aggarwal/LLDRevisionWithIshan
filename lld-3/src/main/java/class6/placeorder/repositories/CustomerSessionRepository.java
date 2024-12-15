package class6.placeorder.repositories;

import class6.placeorder.models.CustomerSession;

import java.util.Optional;

public interface CustomerSessionRepository {
    public CustomerSession save(CustomerSession customerSession);

    public Optional<CustomerSession> findActiveCustomerSessionByUserId(long userId);

}
