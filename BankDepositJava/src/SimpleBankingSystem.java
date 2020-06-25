import java.util.Scanner;

public class SimpleBankingSystem {

		static double balance=0; 
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);

			int n ;
		do {
            		prn("Main Manu");
            		prn("1.Deposit");
            		prn("2.Withdraw");
            		prn("3.Balance");
            		prn("4.Exit");
            		prn("Your Choice :");
			
            		n = input.nextInt();

            		switch(n) {
                		case 1:
                    		    prn("Enter the amount: ");
                    		    int a = input.nextInt();
                                    deposit(a);
                    		    prn("\nYou successfully Deposit: " + a +"$\n");
                    	  	    break;
                		case 2:
                    		    prn("Enter the amount: ");
                    		    int b = input.nextInt();
                    		    withdraw(b);
                    		    prn("\nYou successfully Withdraw: " + b +"$\n");
                    		    break;
                		case 3:
                    		    prn("\n #### Your current Balance is: "+balance +" ####\n");
				    break;	
                 		case 4:
                    		    break;
                		default:
                    		    prn("\n ERROR! Try Again\n");
            		}
        	}while(n != 4 );
			


		}
		public static double deposit(double amount) {
			balance+=amount;
			return balance;
		}
		public static double withdraw(double amount) {
			balance-=amount;
			return balance;
		}
		public static void prn(Object anyObject) {
			System.out.println(anyObject);
		}

	}

