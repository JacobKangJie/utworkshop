import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * Created by jiekang on 2/2/15.
 */
public class AnsGeneratorTest {

    @Test
    public void Should_be_all_digital_by_generator(){
        AnsGenerator ag = new AnsGenerator();
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
        AnsGenerator ag = new AnsGenerator();
        int length = ag.generator().length();
        assertSame(length, 4);

    }

    @Test
    public void Should_be_4_different_digital(){
        AnsGenerator ag = new AnsGenerator();
        Set<Character> setResult = new HashSet<Character>();
        for (int i = 0; i < ag.generator().length(); i++) {
            setResult.add(ag.generator().charAt(i));
        }
        assertSame(setResult.size(),4);
    }
    
}
