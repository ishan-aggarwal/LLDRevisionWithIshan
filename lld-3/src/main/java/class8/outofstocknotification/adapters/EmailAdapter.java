package class8.outofstocknotification.adapters;

public interface EmailAdapter {

    public void sendEmail(String to, String subject, String body);
}
