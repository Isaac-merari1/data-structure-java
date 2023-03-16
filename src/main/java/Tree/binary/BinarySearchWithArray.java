package Tree.binary;

import java.lang.reflect.Array;
import java.util.*;

public class BinarySearchWithArray {
    public static void main(String[] args) {

        List<Integer> searchList1 = new ArrayList<>(List.of(8, 1, 12, 0, 4));
//        search.stream().sorted().forEach(System.out::println);
    }


    public int arraySearch(List<Integer> searchList, int value) {

        Collections.sort(searchList);
        System.out.println(searchList);

        /**
         set left and right index of the array or list
         where left = start index
         and right = end index
         **/
        int left = 0;
        int right = searchList.size();

        while (left < right) {
            // calculate mid value
            int mid = left + (right - left) / 2;
            int middleValue = searchList.get(mid);
            if (middleValue == value) {
                return 1;
            }
//           look at the right side
            if (value < middleValue) {
                right = mid - 1;
            }
            // look at the right side
            if(value > middleValue) {
                left = mid + 1;
            }
        }
        return -1;
    }

    public int missingNumber(int [] nums ){
        boolean isRange = false;
        int results = 0;
        Arrays.sort(nums);
        int numLength = nums.length;
        for(int i =0; i<numLength; i++){
            if(i != nums[i]){
                results = i;
                isRange = true;
                break;
            }
        }
        if(isRange){
            return results;
        }
        return nums[nums.length -1] +1;
    }
}
