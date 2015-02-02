import java.util.HashSet;
import java.util.Set;

/**
 * Created by jiekang on 1/31/15.
 */
public class GuessNumber {
    public String getTips(String gus, String ans) {
        int bcount = 0;
        if (gus.equals(ans)){
            return "4A0B";
        }
        for (int i = 0; i < ans.length(); i++) {
            if (ans.contains(String.valueOf(gus.charAt(i)))){
                bcount += 1;
            }
        }
        return "0A"+bcount+"B";
    }
}
