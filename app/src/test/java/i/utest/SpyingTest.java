package i.utest;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

/**
 * Created by Fatma on 16/12/2017.
 */

public class SpyingTest {
    @Test
    public void spyTest() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> spyArrayList = Mockito.spy(ArrayList.class);
        spyArrayList.add(1);
        spyArrayList.add(2);
        spyArrayList.add(3);
        spyArrayList.add(4);
        Assert.assertEquals(4, spyArrayList.size());
    }
}
