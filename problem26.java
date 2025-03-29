public class problem26 {
    public int removeDuplicates(int[] nums) {
        int left = 1;
        
        for (int right = 1; right < nums.length; right++) {
            if (nums[right] != nums[right - 1]) {
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }
    public int removeDuplicates2(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(i<nums.length-1 && nums[i]==nums[i+1]){
                continue;
            }else{
               nums[k]=nums[i];
               k++;
            }
        }
        return k;
    }
}
