package structural.adapter.q2.external;

public class AutoProtectApi {

    public void addClaim(Double amount) {
        ApiUtils.logAutoProtectClaimCall();
    }

    public AutoProtectStatus getStatus(String id) {
        ApiUtils.logAutoProtectStatusCall();
        return AutoProtectStatus.APPROVED;
    }
}