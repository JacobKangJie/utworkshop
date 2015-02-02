import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * Created by jiekang on 2/2/15.
 */
public class AnsGenerator {

    public String generator() {

        Random rd = new Random();
        StringBuffer ans = new StringBuffer();

        while (ans.length()<4) {

            String temp =String.valueOf(rd.nextInt(10));
            if(ans.indexOf(temp) < 0){
                ans = ans.append(String.valueOf(rd.nextInt(10)));
            }
        }

        return String.valueOf(ans);
    }

}
