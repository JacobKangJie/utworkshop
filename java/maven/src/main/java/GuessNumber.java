import java.util.HashSet;
import java.util.Set;

/**
 * Created by jiekang on 1/31/15.
 */
public class GuessNumber {
    public String getTips(String gus, String ans) {
        int acount = 0;
        int bcount = 0;
        for (int i = 0; i < ans.length(); i++) {
            if (gus.charAt(i) == ans.charAt(i)){
                acount += 1;
            }
        }
        for (int i = 0; i < ans.length(); i++) {
            if (ans.contains(String.valueOf(gus.charAt(i)))){
                bcount += 1;
            }
        }
        return acount+"A"+(bcount-acount)+"B";
    }
}
