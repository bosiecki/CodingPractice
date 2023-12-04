class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        
    //recursively merge the two sorted arrays

    //create a new array to hold the result
    int[] result = new int[m+n];
    //create two variables to hold the index of the two arrays
    int i = 0;
    int j = 0;
    //create a variable to hold the index of the result array
    int k = 0;
    //while the index of the first array is less than the length of the first array
    //and the index of the second array is less than the length of the second array
    while(i < m && j < n) {
        //if the element at the index of the first array is less than the element at the index of the second array
        if(nums1[i] < nums2[j]) {
            //add the element at the index of the first array to the result array
            result[k] = nums1[i];
            //increment the index of the first array
            i++;
        //else
        } else {
            //add the element at the index of the second array to the result array
            result[k] = nums2[j];
            //increment the index of the second array
            j++;
        }
        //increment the index of the result array
        k++;
    }
    //while the index of the first array is less than the length of the first array
    while(i < m) {
        //add the element at the index of the first array to the result array
        result[k] = nums1[i];
        //increment the index of the first array
        i++;
        //increment the index of the result array
        k++;
    }
    //while the index of the second array is less than the length of the second array
    while(j < n) {
        //add the element at the index of the second array to the result array
        result[k] = nums2[j];
        //increment the index of the second array
        j++;
        //increment the index of the result array
        k++;
    }
    //copy the result array to the first array
    System.arraycopy(result, 0, nums1, 0, m+n);
    }


}

