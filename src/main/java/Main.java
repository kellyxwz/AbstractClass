import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Users> users = new ArrayList<>();
        Id gerador = new Id();

        System.out.println("quantos usuarios vc deseja adicionar: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0 ; i<n; i++){
        System.out.println("Digite o seu nome: ");
        String name = sc.nextLine();
        System.out.println("Digite o seu email: ");
        String email = sc.nextLine();

        int id = gerador.imprimirIdGerado();

        Users user =new Users(id,name,email);
            users.add(user);
        }

        System.out.println(users);
    }
}