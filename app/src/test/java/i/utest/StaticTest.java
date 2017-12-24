package i.utest;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * Created by Fatma on 16/12/2017.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({Server.class})
public class StaticTest {
    @Mock
    Server server;

    @Test
    public void testStaticMethod() {
        EasyServer easyServer = new EasyServer();
        PowerMockito.mockStatic(Server.class);
        PowerMockito.when(Server.sendToServer()).thenReturn(true);
        boolean b = easyServer.sendToServer(server);
        Assert.assertEquals(true, b);
    }
}
