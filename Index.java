import java.util.Scanner;

public class Index {
public static void main(String[] args) {

	Scanner in=new Scanner(System.in);
	System.out.println("enter the integer : ");
	int count=0;
    int c=in.nextInt();
	int []x=new int[c];
  for(int i=0;i<c;i++){
    	 x[i]=in.nextInt();
    	}
 for(int i=0;i<x.length;i++){
	  for(int j=i+1;j<x.length;j++){
		  if(x[i]<=x[j]){
			 if(i==x[i]){
				 System.out.println(x[i]);
			 }
			 
		  }
	  }
  }
	}
}
	
