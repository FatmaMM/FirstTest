package i.utest;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * Created by Fatma on 15/12/2017.
 */

public class EmailTest {
//    @Test
//    public void testSendingEmailReturnEmailBody() {
//        Email emailInterface = Mockito.mock(Email.class);
//        Mockito.when(emailInterface.getEmailBody()).thenReturn("i have a good day");
//        String body = emailInterface.getEmailBody();
//        Assert.assertEquals("i have a good day", body);
//        EmailClient emailClient = new EmailClient();
//        String emailSendBackFromServier = emailClient.sendEmail(emailInterface);
//        String emailSendBackFromServier = emailClient.sendEmail(Mockito.isA(Email.class));
//
//        Assert.assertEquals("i have a good day", emailSendBackFromServier);
//
//        EmailClientInterface clientInterface = Mockito.mock(EmailClientInterface.class);
//        Mockito.when(clientInterface.sendEmail(Mockito.isA(Email.class))).thenReturn("i have a good day");
//        String emailSendBackFromServier = emailClient.sendEmail(Mockito.isA(Email.class));
//        Assert.assertEquals("on new email", emailSendBackFromServier);
//
//    }

//    @Test
//    public void testIfSendingEmailBodyAndEmailSenderInfo() {
//        EmailClient emailClient = new EmailClient();
//        Email email = Mockito.mock(Email.class);
//        Mockito.when(email.getEmailBody()).thenReturn("I had wonderful time");
//        emailClient.sendEmail(email);
//        //verification that the email.getAttachment() method called twice
//        Mockito.verify(email, Mockito.times(2)).getAttachment();
//        //verification that the email.getAttachment() method called al least once
//        Mockito.verify(email, Mockito.atLeast(1)).getAttachment();
//        //verification that the email.getAttachment() method never called there it returned error
//        Mockito.verify(email, Mockito.never()).getAttachment();
//        //verification that the email.getAttachment() method called at most three times not more than that
//        Mockito.verify(email, Mockito.atMost(3)).getAttachment();
//    }


//    @Rule
//    public MockitoRule mockitoRule = MockitoJUnit.rule();
//    @Mock
//    EmailClientInterface emailClientInterface;
//
//    @Test
//    public final void doSo() {
//        InOrder inOrder = Mockito.inOrder(emailClientInterface);
//        emailClientInterface.login();
//        emailClientInterface.logout();
//        //make sure that the client login before logout
//        inOrder.verify(emailClientInterface).login();
//        inOrder.verify(emailClientInterface).logout();
//    }

//    @Rule
//    public MockitoRule mockitoRule = MockitoJUnit.rule();
//    @Captor
//    public ArgumentCaptor<EmailClass> captor;
//    @Mock
//    EmailClientServer emailClientServer;
//
//    @Test
//    public void shouldContainListItem() {
//        EmailClass emailClass = new EmailClass(emailClientServer, "i have god day,", "Boss");
//        Mockito.verify(emailClientServer).sendEmail(captor.capture());
//    }


    @Test
    public void testIntentShouldBeCreated() {
        Context context = Mockito.mock(Context.class);
        Intent intent = MainActivity.createIntent(context, "text");
        Assert.assertNotNull(intent);
        Bundle bundle = intent.getExtras();
        Assert.assertEquals("text", bundle.getString("user"));
    }
}
