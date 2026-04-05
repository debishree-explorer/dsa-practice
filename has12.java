package DsaAll;
import java.util.Scanner;
public class has12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n:");
		int n=sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("enter array elements:");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		boolean res=has12program(arr);
		System.out.println("the result:"+res);
		sc.close();
		
	}
	public static boolean has12program(int[] arr) {
		 int flag = 0;
		  for(int i=0; i<arr.length ;i++){
		    if(arr[i]==1) flag=1;
		    if(arr[i]==2 && flag==1){
		      return true;
		    }
		  }
		  return false;
	}
}
