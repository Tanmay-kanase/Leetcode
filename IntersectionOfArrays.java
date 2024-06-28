import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        // Add elements of nums1 to set1
        for (int num : nums1) {
            set1.add(num);
        }
        
        // Add elements of nums2 to set2
        Set<Integer> intersect = new HashSet<>();
        for (int num : nums2) {
            if(set1.contains(num)){
               intersect.add(num);
            }
        }
       
        // Convert set to array
        int[] result = new int[intersect.size()];
        int i = 0;
        for (int num : intersect) {
            result[i++] = num;
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1,7,8,9,9};
        int[] nums2 = {2, 2,8,9,8,4,9};
        
        int[] intersectionArray = intersection(nums1, nums2);
        System.out.print("Intersection of arrays: ");
        for (int num : intersectionArray) {
            System.out.print(num + " ");
        }
        for (int i : nums1){
            System.out.print(i +" ");
        }
    }
}

