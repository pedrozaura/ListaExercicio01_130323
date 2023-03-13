import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int idade = 10;
        String nome = "a";
        ArrayList<Pessoa> bebe = new ArrayList<>();
        ArrayList<Pessoa> crianca = new ArrayList<>();
        ArrayList<Pessoa> adolescente = new ArrayList<>();
        ArrayList<Pessoa> adulto = new ArrayList<>();
        ArrayList<Pessoa> idoso = new ArrayList<>();

        Pessoa p = new Pessoa(nome, idade);
        if (p.getIdade() < 3) {
            bebe.add(p);
        }
        if (p.getIdade() > 2 && p.getIdade() < 11) {
            crianca.add(p);
        }
        if (p.getIdade() > 9 && p.getIdade() < 21) {
            adolescente.add(p);
        }
        if (p.getIdade() > 20 && p.getIdade() < 66) {
            adulto.add(p);
        }
        if (p.getIdade() > 65) {
            idoso.add(p);
        }
        System.out.println(p);
    }
}
