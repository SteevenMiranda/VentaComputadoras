package Clases;

public class Computadora {
    private String nombre;
    private String apellido;
    private int cedula;
    private String marca;
    private String modelo;
    private double costo;
    private String categoria;
    private String tipo;
    

    public Computadora() {
        this("" ,"", 0, "", "",0.00,"","");
    }

    public Computadora(String nombre, String apellido, int cedula, String marca, String modelo, double costo, String categoria, String tipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.marca = marca;
        this.modelo = modelo;
        this.costo = costo;
        this.categoria = categoria;
        this.tipo = tipo;
    }

    public Computadora(String id, String marca, String modelo, double costo, int categoria, String tipo, String cantidad, int[] tipopago, String caracteristicas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
