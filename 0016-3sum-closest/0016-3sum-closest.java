class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        int result=0;
        for (int i= 0; i <nums.length-2;i++){
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                int d = Math.abs(target-sum);
                if(diff>d){
                    diff=d;
                    result=sum;
                }
                if(sum==target){
                    return result;
                }
                if(sum<target){
                    j++;
                }
                else{k--;}
            }
        }return result;
    }
}