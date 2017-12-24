package i.utest;

/**
 * Created by Fatma on 15/12/2017.
 */

public class EmailClient implements EmailClientInterface {


    @Override
    public String sendEmail(Email email) {
        String body;
        try {
            body = email.getEmailBody();
            email.getAttachment();
            email.getAttachment();

        } catch (NullPointerException e) {
            body = "no new email";
        }
        return body;
    }

    @Override
    public String sendEmail(EmailClientServer email) {
        return null;
    }

    public void login() {
    }

    public void logout() {
    }
}
