# vggtyg
import java.util.Scanner;
public class Reverse {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
    System.out.println("enter the integer :");
    int num=in.nextInt();
    int mod;
    int sum=0;
    while(num!=0){
    	mod=num%10;
    	sum=sum*10+mod;
    	num=num/10;
    }
    System.out.println(sum);
    }
    }
