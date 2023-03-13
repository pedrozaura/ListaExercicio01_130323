public class veiculo {
    String nome, modelo, placa, km;
    
    public veiculo(String nome, String modelo, String placa, String km) {
        this.nome = nome; 
        this.modelo = modelo;
        this.placa = placa;
        this.km = km;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getKm() {
        return km;
    }
    public void setKm(String km) {
        this.km = km;
    }            
}
