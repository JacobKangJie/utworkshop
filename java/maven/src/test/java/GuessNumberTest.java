import com.sun.imageio.plugins.common.BogusColorSpace;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by jiekang on 1/31/15.
 */
public class GuessNumberTest {


    @Test
    public void should_return_0A0B_when_getTips_gives_input_5678_and_answer_is_1234(){
        GuessNumber gn = new GuessNumber();
        String result  = gn.getTips("1234","5678");
        assertThat(result).isEqualTo("0A0B");
    }

    @Test
    public void should_return_4A0B_when_getTips_given_input_is_1234_and_answer_is_1234(){
        GuessNumber gn = new GuessNumber();
        String result = gn.getTips("1234","1234");
        assertThat(result).isEqualTo("4A0B");
    }

    @Test
    public void should_return_0A4B_when_getTips_given_input_is_1234_and_answer_is_4321(){
        GuessNumber gn = new GuessNumber();
        String result = gn.getTips("1234","4321");
        assertThat(result).isEqualTo("0A4B");
    }

    @Test
    public void should_return_1A1B_when_getTips_given_input_is_1526_and_answer_is_1234(){
        GuessNumber gn = new GuessNumber();
        String result = gn.getTips("1526","1234");
        assertThat(result).isEqualTo("1A1B");
    }
}
