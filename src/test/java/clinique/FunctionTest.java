package clinique;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;


public class FunctionTest {

    @Before
    public void setUp() {

    }

    @Test
    public void existsTest() {
        int result = clinique.Function.fileExist("file", "path");

        assertThat(result, equalTo(-1));
    }
}
