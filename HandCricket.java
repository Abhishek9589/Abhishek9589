package Games;
import java.util.*;
public class HandCricket {
    static Scanner sc=new Scanner (System.in);
    static int cpu,my_sum=0,cpu_sum=0;

    public static void main(String[] args) {
        System.out.println("Enter your number");
        int num=sc.nextInt();
        yourBatting(num);
    }
    static Random rn=new Random();
    public static void yourBatting(int num){
        cpu =rn.nextInt(6)+1;
        if(num==cpu){
            System.out.println("You're out!!Now CPU's turn");
            cpuBatting(-1);
        }
        else {
            my_sum+=num;
            System.out.println(cpu);
            num=sc.nextInt();
            yourBatting(num);
        }
    }
    public static void cpuBatting(int num){
        cpu=rn.nextInt(6)+1;
        if(num==cpu){
            System.out.println("CPU is out...");
            game();
        }
        else {
            cpu_sum+=cpu;
            System.out.println(cpu);
            num=sc.nextInt();
            cpuBatting(num);
        }
    }
    public static void game(){
        if(my_sum>cpu_sum)
            System.out.println("You won , your total score is =" +my_sum);
        else
            System.out.println("CPU won , cpu total score is ="+cpu_sum);
    }
}
