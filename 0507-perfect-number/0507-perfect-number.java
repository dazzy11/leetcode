class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num < 5)
            return false;
        int sum =1;

        for(int i=2; i < ((int) Math.sqrt(num))+1; i++) {
            System.out.println(i);
            if(num%i ==0) {
                sum += i  +  num/i;
            }
        }

        return num==sum;
    }
}