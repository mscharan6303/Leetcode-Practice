class Solution {
    public int sumOfSquares(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(n%(i+1)==0){
                list.add(nums[i]);
            }
        }
        int sum=0;
        for(int num:list){
            sum+=num*num;
        }
return sum;

    }
}