public class RemoveElement {

    class Solution {

        /*
        Given an integer array nums and an integer val, remove all occurrences of val in nums
        in-place. The order of the elements may be changed. Then return the number of elements in 
        nums which are not equal to val.
    
    
        Consider the number of elements in nums which are not equal to val be k, to get accepted, you 
        need to do the following things:
    
    
        Change the array nums such that the first k elements of nums contain the elements which are 
        not equal to val. The remaining elements of nums are not important as well as the size of 
        nums.
    
        Return k.
        */
        public int removeElement(int[] nums, int val) {
            //Initialize a counter k to 0
            int k = 0;
            /*
            Iterate over the array nums and if the current element is not equal to val, we copy
            the current element to nums[k] and increment k by 1.
            We repeat this process until we iterate over all the elements of nums.
            */
            for (int i = 0; i < nums.length; i++) {
                
                if (nums[i] != val)
                    
                    nums[k++] = nums[i];
            }
            //Return k
            return k;
        }
    }
}
