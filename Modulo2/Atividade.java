import java.util.Scanner;
// Programa para inserir dados de variavel local via teclado*
public class Atividade {
  public static void main(String[]args){
      char e;
      short efraim;
      int day;
      double idade;
      long ano;
      byte x;
      float z;
      
      
      Scanner busca =new Scanner(System.in);
      Scanner aplique =new Scanner (System.in);
      Scanner reserva =new Scanner(System.in);
      Scanner valor =new Scanner(System.in);
      Scanner year =new Scanner(System.in);
      Scanner letra =new Scanner(System.in);
      Scanner inserir =new Scanner(System.in);


      System.out.println("digite a letra do nome de Efraim:");
      System.out.println("digite o numero de Efraim:");
      System.out.println("digite o numero de days:");
      System.out.println("digite a idade Efraim:");
      System.out.println("digite o Ano:");
      System.out.println("digite o numero de letra:");
      System.out.println("digite o numero para inserir:");
          e =busca.nextLine().charAt(0);
          efraim =aplique.nextShort();
          day =reserva.nextInt();
          idade =valor.nextDouble();
          ano =year.nextLong();
          x =letra.nextByte();
          z =inserir.nextFloat();
      System.out.println("A letra do nome de Efraim é:"  +e);
      System.out.println("O numero de Efraim é:"  +efraim);
      System.out.println("O numero de Days é:"  +day);
      System.out.println("A idade é:"  +idade);
      System.out.println("O ano é:"  +ano);
      System.out.println("O ano é:"  +x);
      System.out.println("O numero inserido foi:" +z);
          busca.close();
          aplique.close();
          reserva.close();
          valor.close();
          year.close();
          inserir.close();
  }   

}