import java.util.Scanner;
public class ExercicoCalculoSalario {
	
public static void main (String [] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int number;
		double hour, valueHour, salary;
		
		number = sc.nextInt(); //numero do funcionario
		hour = sc.nextDouble(); //horas trabalhadas
		valueHour = sc.nextDouble(); //valor da hora
		salary = valueHour * hour; //calculo do salario
		
		System.out.println("NUMBER: " + number); //Numero do funcionario
		System.out.printf ("SALARY: U$ %.2f", salary ); //salario recebido pelas horas trabalhadas
				
	

	
		sc.close();
}

}
