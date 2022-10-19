public class CarLoan {
    public static void main(String[] args) {
        int carLoan = 10000;
        int loanlength = 3;
        int  interestRate = 5;
        int downPayment = 2000;

        if (carLoan <= 0 || interestRate <= 0){
            System.out.println("Error! You must take out a valid car loan");
        }else if (downPayment >= carLoan){
            System.out.println("The car can be paid in full");
        }else {
            int remainingBalance = carLoan - downPayment;
            int months = loanlength  * 12;
            int MonthlyBalance = remainingBalance / months;
            int interest = MonthlyBalance *interestRate / 100;
            int monthlyPayment = MonthlyBalance + interest;
            System.out.println("Your monthly Payment is " + monthlyPayment);
        }
    }
}