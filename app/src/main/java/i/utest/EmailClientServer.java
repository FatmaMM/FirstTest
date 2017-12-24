package i.utest;

/**
 * Created by Fatma on 16/12/2017.
 */

public interface EmailClientServer {
    String sendEmail(EmailClass email);

    String getEmailBody();

    String[] getAttachment();

    String getSender();


}
