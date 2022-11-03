import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int Numero;
        String Agencia;
        String NomeCliente;
        double Saldo;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Por favor, digite o numero!");
        Numero = Integer.parseInt(leitor.nextLine());

        System.out.println("Por favor, digite a Agencia!");
        Agencia = leitor.nextLine();

        System.out.println("Por favor, digite o nome do cliente!");
        NomeCliente = leitor.nextLine();

        System.out.println("Por favor, digite o saldo!");
        Saldo = Double.parseDouble((leitor.nextLine()));

        System.out.println("Olá "+NomeCliente+", obrigado por criar uma conta em nosso banco, sua agencia é " +Agencia+", conta "+Numero+ " e seu saldo R$"+Saldo+ " já está disponível para saque.");
    }
}
