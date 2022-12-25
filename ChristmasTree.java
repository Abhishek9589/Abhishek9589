package ChristmasTree;
import java.util.*;
public class Tree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter height of the tree ");
        int h=sc.nextInt();
        System.out.println("Enter width of the tree ");
        int w=sc.nextInt();
        int space=w*5;
        int x=1;
        for(int i=1;i<=h;i++){
            for(int j=x;j<=w;j++){
                for(int k=space;k>=j;k--){
                    System.out.print(" ");
                }
                for(int l=1;l<=j;l++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            x=x+2;
            w=w+2;
        }
        for(int i=1;i<=4;i++){
            for(int j=space-3;j>=1;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=4;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
