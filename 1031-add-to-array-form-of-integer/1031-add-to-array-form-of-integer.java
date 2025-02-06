class Solution {
    public List<Integer> addToArrayForm(int[] nums, int k) {
        int i=nums.length-1;
        ArrayList<Integer> ar=new ArrayList<>();
        int carry=0;
        while(i>=0||k>0||carry!=0){
            if(i>=0){
                ar.add(0,(carry+k%10+nums[i])%10);
                carry=(carry+k%10+nums[i])/10;
                i--;
                k=k/10;
            }
            else{
                ar.add(0,(carry+k%10)%10);
                carry=(carry+k%10)/10;
                k=k/10;
            }
        }
        return ar;
    }
}