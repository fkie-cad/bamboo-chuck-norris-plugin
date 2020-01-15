package ut.de.fraunhofer.fkie.caad.bamboo.chucknorris;

import de.fraunhofer.fkie.caad.bamboo.chucknorris.chucknorris.JokesContextProvider;
import org.junit.Test;

import java.util.HashMap;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

public class JokesContextProviderUnitTest {

    @Test
    public void testRandomJokesAppear(){
        JokesContextProvider myJokesContextProvider = new JokesContextProvider(null);

        assertThat(myJokesContextProvider.getContextMap(new HashMap<>()).get("joke"), instanceOf(String.class));
        assertThat(myJokesContextProvider.getContextMap(null).get("joke"), instanceOf(String.class));
    }
}
