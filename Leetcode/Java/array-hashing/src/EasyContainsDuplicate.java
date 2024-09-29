import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class EasyContainsDuplicate {
   public static void main(String[] args) {
       System.out.println(containsDuplicate(new int[]{1,2,3}));
   }

   public static boolean containsDuplicate(int[] nums) {
       Set<Integer> setNums = new HashSet<>();
       for (int num: nums) {
           if (setNums.contains(num)) {
               return true;
           }
           setNums.add(num);
       }
       return false;
   }
}