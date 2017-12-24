package i.utest;

/**
 * Created by Fatma on 16/12/2017.
 */

public class EmailClass implements EmailClientInterface {
    String body, sender;

    EmailClass(EmailClientServer emailClient, String body, String sender) {
        this.body = body;
        this.sender = sender;
        emailClient.sendEmail(this);
    }

    @Override
    public String sendEmail(Email email) {
        return null;
    }

    @Override
    public String sendEmail(EmailClientServer email) {
        email.getAttachment();
        email.getAttachment();
        email.getAttachment();
        email.getAttachment();
        email.getAttachment();
        return email.getEmailBody();
    }
}
