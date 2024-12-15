package structural.adapter.q2;

public interface TravelInsuranceAdapter {

    void add(String reference, Double amount);

    ClaimStatus get(String reference);
}