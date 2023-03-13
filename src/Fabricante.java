public abstract class Fabricante {
    private String marca;
    private String condicaoCarro;
    private String modelo; 
    private int ano;

    public Fabricante(String marca, String condicaoCarro, String modelo, int ano){
        this.marca = marca;
        this.condicaoCarro = condicaoCarro;
        this.modelo = modelo;
        this.ano = ano;
    }
    public String getmarca(){
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getCondicaoCarro() {
        return condicaoCarro;
    }
    public void setCondicaoCarro(String condicaoCarro) {
        this.condicaoCarro = condicaoCarro;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    
}
