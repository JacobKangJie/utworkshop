import org.junit.Test;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.fest.assertions.api.Fail.fail;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.reset;

/**
 * Created by jiekang on 2/2/15.
 */
public class AnsGeneratorTest {

    @Test
    public void Should_be_all_digital_by_generator(){
        AnsGenerator ag = new AnsGenerator(new Random());
        String result = ag.generator();
        for (int i = 0; i < result.length(); i++) {
            try {
               Integer.valueOf(result.charAt(i));
            } catch (Exception e) {
                fail("This is a non-digital");
            }
        }
    }

    @Test
    public void Should_be_4_digital_length_by_generator() {
        AnsGenerator ag = new AnsGenerator(new Random());
        int length = ag.generator().length();
        assertThat(length).isEqualTo(4);

    }

    @Test
    public void Should_be_4_different_digital(){
        AnsGenerator ag = new AnsGenerator(new Random());
        Set<Character> reSet = new HashSet<Character>();
        String result = ag.generator();
        for (int i = 0; i < result.length(); i++) {
            reSet.add(result.charAt(i));
        }
        assertThat(reSet.size()).isEqualTo(4);
    }

    @Test
    public void Should_not_be_in_3_previous_history(){

        Random random = mock(Random.class);
        AnsGenerator ag = new AnsGenerator(random);
        given(random.nextInt(10))
                .willReturn(1, 2, 3, 4)
                .willReturn(1, 2, 3, 4)
                .willReturn(2, 3, 1, 5);
        Set<String> reSet = new HashSet<String>();
        reSet.add(ag.generator());
        reSet.add(ag.generator());
        reSet.add(ag.generator());
        assertThat(reSet.size()).isEqualTo(3);

    }
}
