import java.util.ArrayList;
import java.util.List;

/**
 * Created by ADMINIBM on 7/11/2016.
 */
public class SummaryRanges {
    public SummaryRanges() {
    }

    public List<String> summary(int[] nums){
        List<String> ranges = new ArrayList<String>();
        if (nums.length == 0) return ranges;
        int first_integer = nums[0];
        int second_integer = nums[0];
        for (int i=1; i < nums.length; i++ ) {
            int current_integer = nums[i];
            if(current_integer == second_integer + 1 ){
                second_integer ++;
            }else {
                ranges.add(getRangeStr(first_integer, second_integer));
                first_integer = current_integer;
                second_integer = current_integer;
            }
        }
        ranges.add(getRangeStr(first_integer,second_integer));
        return ranges;
    }

    private String getRangeStr (int first, int second){
        if (first == second){
            return "" + first;
        }else if (first < second){
            return "" + first + "->" + second;
        }else {
            System.err.println("error in convert to range: the first element is larger than the second one.");
        }
        return null;
    }

    public static void main(String args[]){
        SummaryRanges sr = new SummaryRanges();
        int[] input = {1,2,5,6,7,9,10,11,24};
        List<String> result = sr.summary(input);
    }
}
