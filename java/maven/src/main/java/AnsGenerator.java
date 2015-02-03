import java.util.*;

/**
 * Created by jiekang on 2/2/15.
 */
public class AnsGenerator {

    private Random rd;
    private static Set<String> historyRecord;

    AnsGenerator(Random random){
        this.rd = new Random();
        this.historyRecord = new HashSet<String>();

    }



    public String generator() {
        StringBuffer ans = new StringBuffer();
        while (ans.length()<4) {

            String temp =String.valueOf(rd.nextInt(10));
            if(ans.indexOf(temp) < 0){
                ans = ans.append(temp);
            }
        }

        while(!historyRecord.contains(ans)){
        }

        return ans.toString();
    }

}
