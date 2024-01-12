public class CellingOfLetter {
    public static void main(String[] args) {
        char[] letter={'c','f','j'};
        // int target=20;
        char ans= (char) lettercelling(letter, 'a');
        System.out.println(ans);

    }
    static int lettercelling(char[] letter, char target){
        int start=0;
        int end=letter.length-1;
        while(start<=end){
            // int mid=(start+end)/2;// might be possible that start+end/2 exceds the range of integer
            //better way to find mid
            int mid=start+(end-start)/2;
            if(target<letter[mid]){
                end=mid-1;
            }
            else {
                start=mid+1;
            }

        }
        return letter[start%letter.length];
    }
}



