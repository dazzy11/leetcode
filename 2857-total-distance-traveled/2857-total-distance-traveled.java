class Solution {
    public int distanceTraveled(int main, int add) {
        int distance=0;
        while(main>=5){
            main-=5;
            distance+=5*10;
            if(add>0){
                add--;
                main++;
            }
        }
        distance=distance+(main*10);
        return distance;
    }
}