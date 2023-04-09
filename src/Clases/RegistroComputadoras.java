package Clases;

public class RegistroComputadoras {
    
    private int numero;
    private String marca;
    private String modelo;
    private double costo;
    private int stock;

    public RegistroComputadoras() {
        this(0 ,"", "", 0.0, 0);
    }

    public RegistroComputadoras(int num, String marcas, String modelos, double costos, int stocks) {
        establecerNumero(num);
        establecerMarca(marcas);
        establecerModelo(modelos);
        establecerCosto(costos);
        establecerStock(stocks);
    }

    public void establecerNumero(int num) {
        numero = num;
    }

    public int obtenerNumero() {
        return numero;
    }

    public void establecerMarca(String marcas) {
        marca = marcas;
    }

    public String obtenerMarca() {
        return marca;
    }

    public void establecerModelo(String modelos) {
        modelo = modelos;
    }

    public String obtenerModelo() {
        return modelo;
    }

    public void establecerCosto(double costos) {
        costo = costos;
    }

    public double obtenerCosto() {
        return costo;
    }

    public void establecerStock(int stocks) {
        stock = stocks;
    }

    public int obtenerStock() {
        return stock;
    }

}
