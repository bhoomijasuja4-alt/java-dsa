import java.util.*;
public class searchelement {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int []nums= new int[size];
        for (int i= 0 ; i <size; i++ ){

        nums[i]= sc.nextInt();
        }

        int x = sc.nextInt();
        for(int i = 0; i <nums.length; i++){
            if (nums[i]==x){
                System.out.print(i);
            }
        }

    }
    
}
