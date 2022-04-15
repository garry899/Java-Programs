public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = "+calculateInterest(10000,2));

        for(int i=2; i<9; i++){
            System.out.println("10,000 at "+i+"% interest = "+String.format("%.2f",calculateInterest(10000,i)));
        }
        System.out.println("******************");
        for(int i=8; i>1; i--){
            System.out.println("10,000 at "+i+"% interest = "+String.format("%.2f",calculateInterest(10000,i)));
        }

        int count = 0;
        for (int n=10; n<501;n++){
            if (isPrime(n)){
                count++;
                System.out.println(n+" is prime number");
                if (count==10){
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }
    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for (int i=2; i<=n/2; i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount*(interestRate/100));
    }
}
