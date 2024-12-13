package class2.q3.generateinvoices.repositories;

import class2.q3.generateinvoices.models.CustomerSession;

import java.util.Optional;

public interface CustomerSessionRepository {
    public CustomerSession save(CustomerSession customerSession);

    public Optional<CustomerSession> findActiveCustomerSessionByUserId(long userId);
}
