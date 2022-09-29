class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        // allocate the array size after merge
        int index = m+n-1;
        // insert the highest value at the end by comparing the two array.
        while(i>=0 && j>=0){
            if(nums1[i]>=nums2[j]){
                nums1[index--] = nums1[i--];
            }else{
                nums1[index--] = nums2[j--];
            }
        }
        // check if any remaining element in the array
        while(i>=0){
            nums1[index--] = nums1[i--];
        }
        while(j>=0){
            nums1[index--] = nums2[j--];
        }
        
    }
}
