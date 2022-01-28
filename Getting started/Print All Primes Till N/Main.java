import java.util.*;

public class Main{
    public static void main(String[] args) {
        //input
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        
        for(int i=low;i<=high;i++){
            int factor =0;
            for(int j = 2;j*j<=i;j++){
                if(i%j==0){
                    factor++;
                    break;
                }
            }
            if(factor==0){
                System.out.println(i);
            }
        }
    }
}