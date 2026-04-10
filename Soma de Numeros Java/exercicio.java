import javax.xml.transform.Source;
import java.sql.SQLOutput;

public static void main (String[] args){
    String produtc1 = "Computer";
    String product2 = "Office Desk";

    int age = 30;
    int code = 5290;
    char gender = 'F';

    double price1 = 2100.00;
    double price2 = 650.50;
    double maesure = 53.234567;

    System.out.printf("Products:%n %s, which price is %.2f%n", produtc1, price1 );
    System.out.printf("%s, which price is %.2f%n", product2, price2 );

    System.out.printf("Record: %d years old, code %d and gender %s%n", age, code, gender);
    System.out.printf("%.8f%n", maesure );
    System.out.printf("%.3f%n", maesure );


        
    }
    
    
    
    
    
