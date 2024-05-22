class Solution {
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        do{
            slow=findsquare(slow);
            fast=findsquare(findsquare(fast));
        }while(slow!=fast);
        if(slow==1){
            return true;
        }
        return false;
        
    }
    public int findsquare(int s){
        int sqr=0;
        while(s>0){
            int rem=s%10;
            sqr+=rem*rem;
            s=s/10;
        }
        return sqr;
    }
}