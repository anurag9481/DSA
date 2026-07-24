class Solution {
    public int removeDuplicates(int[] nums) {
        int off= 0;
        int unq = 1;
        int cm = 1;
        while(cm<nums.length){
            if(nums[cm]== nums[cm-1]){
                cm++;
                continue;
            }
            nums[off+1] = nums[cm];
            off++;
            unq++;
            cm++;


        }
        return unq;
    }
}