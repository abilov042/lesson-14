import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5};

//        System.out.println(removeDuplicates(arr));
//
//        System.out.println("---------------------");
//
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i] + " ");
//        }

        System.out.println(search(arr, 5));
    }

    public static int removeDuplicates(int[] nums) {

        int n = nums.length;
        int j = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                n--;
            }
            else {
                nums[j++] = nums[i];
            }
        }
        return n;
    }

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }
            else if(nums[mid] > target){
                right = mid - 1;
            }
        }

        return -1;
    }

}