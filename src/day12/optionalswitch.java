package day12;

import java.util.Scanner;

public class optionalswitch {

	public static void main(String[] args) {
		char response = 'a';
	   
	Scanner scan = new Scanner(System.in);
			System.out.println("Enter command:");
			response=scan.next ().charAt(0);
			 switch(response) {
			 case 'y':
				 System.out.println("Your request is being processed is printed");
			  break;
			 case 'n':
			  System.out.println("Thank you anyway for your consideration is printed");
			   break;
			 case 'h':
				  System.out.println("Sorry, no help is currently available is printed");
			    break;
			 default:
				 System.out.println("Invalid entry, please try again");
			 break;
			 }
		}

		}
			
	       
	       }
	}

}
