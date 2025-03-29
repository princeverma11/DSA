class Solution {
    public void sortColors(int[] nums) {
        int l=0;
        int r = nums.length-1;
        int i = 0;
        while(i<=r)
        {
            if(nums[i]==2)
            {
                nums[i] = nums[r];
                nums[r] = 2;
                r--;
            }
            else if(nums[i] == 0)
            {
                nums[i] = nums[l];
                nums[l] = 0;
                l++;
                i++;
            }
            else // nums[i] == 1
            {
                i++;
            }
        }
        
    }
}