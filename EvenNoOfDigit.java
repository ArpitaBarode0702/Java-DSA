public class EvenNoOfDigit {
    public static void main(String[] args) {
        int[] arr={12,7891,12,3,45678};
        int[] arr2={12,7891,12,3,45678,45,3467};
        int ans=noofdigit(arr);
        System.out.println(ans);
        ans=noofdigit(arr2);
        System.out.println(ans);
    }
    static int noofdigit(int[] arr){
        int count=0;
        for (int num : arr) {
            String s=Integer.toString(num);
             if(even(num)){
            count++;
        }
            
        }
        return count;
       
    }
    static boolean even(int num){
        int c=0;
        while (num>0) {
            c++;
            num=num/10;
            
            
        }
        if(c%2==0){
            return true;
        }
        else{
            return false;
        }


    }
    //you can also solve by converting int to string
    static boolean even2(String num){
       
        if(num.length()%2==0){
            return true;
        }
        else{
            return false;
        }

    }
    
}
