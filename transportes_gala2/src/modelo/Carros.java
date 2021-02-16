package modelo;

public class Carros {
    int idcarro;
    int numpuertas, cilindraje, puestos,idchofer; 
    String placa,marca,version,modelo,color,tipocombustible;
    float valor;
    
    public Carros(){
        
    }
    
    public Carros(int idcarro, int numpuertas, int cilindraje, int puestos, int idchofer, String placa, String version, String modelo, String color, String tipocombustible, float valor){
        
    }

    public int getIdcarro() {
        return idcarro;
    }

    public String getMarca() {
        return marca;
    }

    public int getNumpuertas() {
        return numpuertas;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public int getPuestos() {
        return puestos;
    }

    public int getIdchofer() {
        return idchofer;
    }

    public String getPlaca() {
        return placa;
    }

    public String getVersion() {
        return version;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public String getTipocombustible() {
        return tipocombustible;
    }

    public float getValor() {
        return valor;
    }

    public void setIdcarro(int idcarro) {
        this.idcarro = idcarro;
    }

    public void setNumpuertas(int numpuertas) {
        this.numpuertas = numpuertas;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }

    public void setIdchofer(int idchofer) {
        this.idchofer = idchofer;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTipocombustible(String tipocombustible) {
        this.tipocombustible = tipocombustible;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    
}
