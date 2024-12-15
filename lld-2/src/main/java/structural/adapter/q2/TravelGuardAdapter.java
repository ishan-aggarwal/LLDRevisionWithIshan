package structural.adapter.q2;

import structural.adapter.q2.external.TravelGuardApi;

public class TravelGuardAdapter implements TravelInsuranceAdapter {

    private TravelGuardApi travelGuardApi = new TravelGuardApi();

    @Override
    public void add(String reference, Double amount) {
        travelGuardApi.submitClaim(reference, amount);
    }

    @Override
    public ClaimStatus get(String reference) {
        String status = travelGuardApi.getClaimStatus(reference);
        if (status.equals("APPROVED")) {
            return ClaimStatus.APPROVED;
        }
        return ClaimStatus.PENDING;
    }
}