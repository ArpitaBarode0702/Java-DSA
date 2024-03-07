// You are given an array 'a' of 'n' integers.
// A majority element in the array ‘a’ is an element that appears more than 'n' / 2 times.
// Find the majority element of the array.
// It is guaranteed that the array 'a' always has a majority element.

import java.util.Arrays;

public class Majorityelem {
    public static void main(String[] args) {
        int[] v={2, 2, 1, 3, 1, 1, 3, 1, 1
        };
        System.out.println(majorityElement(v));
    }
    public static int majorityElement(int []v) {
        // Write your code here4
        Arrays.sort(v);
        int n=v.length;
        int count=1;
        int max=0;
        int elem=0;
        if(n==1){
            return v[0];
        }
        
        for(int i=0;i<v.length-1;i++){
            if(v[i]==v[i+1]){
                count++;
                max=Math.max(count, max);
                if(max>n/2 && max==count){
                elem=v[i];
                  
                }
            }
            else{
                count=1;
            }
        }
        return  elem;
    }
}
