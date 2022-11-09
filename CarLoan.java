import java.util.Scanner;
public class CarLoan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your car loan amount");
         int carLoan = input.nextInt();
        System.out.println("Please enter Months on the loan");
         int loanLength = input.nextInt();
        System.out.println("Please enter your Interest Rate");
         Double interestRate =input.nextDouble();
        System.out.println("Please enter your down payment");
         int downPayment = input.nextInt();
        if (carLoan <= 0 || interestRate <= 0){
            System.out.println("Error! You must take out a valid car loan");
        }else if (downPayment >= carLoan){
            System.out.println("The car can be paid in full");
        }else {
            int remainingBalance = carLoan - downPayment;
            System.out.println( "balance after down payment "+ remainingBalance);
            int months = loanLength  * 12;
            int MonthlyBalance = remainingBalance / months;
            double interest = MonthlyBalance *interestRate / 100;
            double monthlyPayment = MonthlyBalance + interest;
            System.out.println("Your monthly Payment is " + monthlyPayment);
        }
    }
}