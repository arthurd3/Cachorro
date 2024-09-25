import java.util.Scanner;


public class Main
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um Nome");
        String nome = scanner.nextLine();
        System.out.println("Uma Cor");
        String cor = scanner.nextLine();
        System.out.println("Digite a Idade");
        int idade = scanner.nextInt();
        
        Cachorro file = new Cachorro(cor , nome , idade);
    
        System.out.println("Nome: " + file.nome);
        System.out.println("Cor: " + file.cor);
        System.out.println("Idade: " + file.idade);
        
        
    }
        
}
