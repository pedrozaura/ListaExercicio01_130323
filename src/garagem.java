import java.util.ArrayList;

public class garagem {

    ArrayList<String> veiculos = new ArrayList<>();
    int Gvagas = 20;
 
    public void estacionar(String v) {
        if (veiculos.size() >= Gvagas) {

            System.out.println("A Garagem está Cheia, Não há vagas!");
        } else {
            veiculos.add(v);
        }
    }

    public void estacionamento() {
        for (int a = 0; a < veiculos.size(); a++) {
            System.out.println(veiculos.get(a));
        }
    }
   
}


    

    

    

    



    