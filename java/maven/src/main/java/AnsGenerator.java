import java.util.*;

/**
 * Created by jiekang on 2/2/15.
 */
public class AnsGenerator {

    private Random random;
    private static Set<String> historyRecord;

    AnsGenerator(Random random){
        this.random = random;
        this.historyRecord = new HashSet<String>();
    }

    public String generator(){
        String result = generatorOneTime();

        while(historyRecord.contains(result))
        {
            result = generatorOneTime();
        }

        historyRecord.add(result);

        return result;

    }

    public String generatorOneTime() {

        StringBuffer stringBuffer = new StringBuffer();
        while (stringBuffer.length()<4) {

            String temp =String.valueOf(random.nextInt(10));
            if(stringBuffer.indexOf(temp) < 0){
                stringBuffer = stringBuffer.append(temp);
            }
        }

        return stringBuffer.toString();
    }

}
