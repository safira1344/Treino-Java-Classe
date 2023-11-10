import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Cachorro dog1 = new Cachorro("malu", 18, true, "Yorkshire");
        
        System.out.println(dog1);
        System.out.println(dog1.nome);
        System.out.println(dog1.vacinado);
        System.out.println(dog1.raca);
        System.out.println(dog1.getIdade());
        
        dog1.incrementarIdade();  //toda vez que for chamar um metodo ele precisa estar atrelado a um objeto
        System.out.println(dog1.getIdade());
    }
}