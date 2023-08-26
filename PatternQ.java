public class PatternQ {
    public static void main(String[] args) {
        int n=5;
        System.out.println(pttern3(n));


    }
    static void pttern3(int n){
        for (int row=1;row<=n;row++){
            for (int col=1;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
