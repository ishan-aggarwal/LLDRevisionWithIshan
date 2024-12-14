package class5.changepaymentgateway.repositories;

import class5.changepaymentgateway.models.Bill;

import java.util.Optional;

public interface BillRepository {
    Bill save(Bill bill);
    Optional<Bill> findById(long billId);
}