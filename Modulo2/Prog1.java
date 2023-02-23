import java.util.Scanner;

//Fazendo um programa para inserir os dados de uma variavel via teclado*/

public class Prog1 {
public static void main(String [] args){
  byte x;
  Scanner efraim =new Scanner (System.in);

  System.out.print("Digite um numero: ");
  x = efraim.nextByte();
  System.out.print("O numero digitado foi " +x);
  efraim.close();
}
}