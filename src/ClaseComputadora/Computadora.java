package ClaseComputadora;

public class Computadora {

    private String id;
    private String marca;
    private String modelo;
    private String costo;
    private int categoria;
    private String tipo;
    private String cantidad;
    private int[] tipopago = new int[5];
    private String caracteristicas;

    public Computadora() {
    }

    public Computadora(String id, String marca, String modelo, String costo,
            int categoria, String tipo, String cantidad,
            int[] tipopago, String caracteristicas) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.costo = costo;
        this.categoria = categoria;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.tipopago = tipopago;
        this.caracteristicas = caracteristicas;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public int[] getTipopago() {
        return tipopago;
    }

    public void setTipopago(int[] tipopago) {
        this.tipopago = tipopago;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

}
