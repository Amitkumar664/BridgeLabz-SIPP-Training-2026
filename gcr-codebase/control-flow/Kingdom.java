import java.util.*;
public class Kingdom {
    public static double calculateTax(double income){
        if(income<=10000){
            return income*0.05;
        }else if (income<=50000){
            return income*0.15; 
        }else {
            return income*0.30;
        }
    }
     public static String getTaxBracket(double income) {
        if (income < 10000) {
            return "5% Tax Bracket";
        } else if (income <= 50000) {
            return "15% Tax Bracket";
        } else {
            return "30% Tax Bracket";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // double income = sc.nextDouble();

        double incomes[]=new double[10];
        double total=0;

        for(int i=0;i<10;i++){
            System.out.println("Enter income of citiz "+i+1+" :");
            incomes[i]=sc.nextDouble();
            String bracket = getTaxBracket(incomes[i]);
            double tax = calculateTax(incomes[i]);

            System.out.println("Tax Bracket: " + bracket);
            System.out.println("Tax Amount: " + tax);
            System.out.println();
            total+=tax;





        }
           System.out.println("Total Tax Collected = " + total);

        sc.close();


        
    }
    
}
