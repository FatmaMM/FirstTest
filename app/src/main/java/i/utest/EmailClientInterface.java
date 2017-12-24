package i.utest;

/**
 * Created by Fatma on 15/12/2017.
 */

public interface EmailClientInterface {
    String sendEmail(Email email);

    String sendEmail(EmailClientServer email);

//    public void login();

    // public void logout();
}
