package ut.de.fraunhofer.fkie.caad.bamboo.chucknorris;

import org.junit.Test;
import de.fraunhofer.fkie.caad.bamboo.chucknorris.api.MyPluginComponent;
import de.fraunhofer.fkie.caad.bamboo.chucknorris.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}