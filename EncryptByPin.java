//Reg. No:-1941012173
//Class :-CSE 'S'
import java.util.*;
public class EncryptByPin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=0,i,j;
	    String q="",pin="",msg="";
	    //Taking Input num,num1,num2,num3,num4
		System.out.println("Enter the Number of Digits in the PIN");
		int n=sc.nextInt();
	    System.out.println("Enter PIN 1");
	   int num1=sc.nextInt();
	   System.out.println("Enter PIN 2");
	    int num2=sc.nextInt();
	   System.out.println("Enter PIN 3");
	   int num3=sc.nextInt();
	   System.out.println("Enter PIN 4");
	   int num4=sc.nextInt();
	   if(Integer.toString(num1).length()!=Integer.toString(num2).length()|| Integer.toString(num2).length()!=Integer.toString(num3).length()||Integer.toString(num3).length()!=Integer.toString(num4).length()) {
		   System.out.println("Wrong PIN Input"); 
	    }
	   else
		   System.out.println("PIN GENERATION INITIATED!!");
	   //PIN Generation
	   int least1=0,num = 0;
	  for(i=1,j=0;i<=n || j<n;i++,j++) {
	  int dg1=num1%10;
	  num1/=10;
	  int dg2=num2%10;
	  num2/=10;
	  int dg3=num3%10;
	  num3/=10;
	  int dg4=num4%10;
	  num4/=10;
	  least1=Math.min(dg1, Math.min(dg2,Math.min(dg3, dg4)));
	  num = least1 * (int)Math.pow(10, j)+ num;
	    } 
	  //Encryption of Message
	  Scanner mn=new Scanner(System.in);
	  System.out.println("PIN Generated="+num);
	  pin=String.valueOf(num);
	  System.out.println("Type the Message You Want to Encrypt ");
	  msg=mn.nextLine();
	  msg=msg.replaceAll(" ","");
	  msg=msg.toLowerCase();
	  int lmsg=msg.length();
	  int lpin=pin.length();
	  for(int a=0;a<lmsg;a+=lpin) {
		  for( k=0;k<lpin;k++) {
			  if(a+k<lmsg) {
			char w=((char)(msg.charAt(a+k)+(int)pin.charAt(k)-48));
				if(w>122)
					w=(char)((int)w-26);
				q=q+w;
			  }
		  }
	  }
	  System.out.println("Encrypted Message = "+q.toUpperCase());
	  }
	
	}


