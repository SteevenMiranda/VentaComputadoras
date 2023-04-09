package ClaseComputadora;

import java.util.ArrayList;

public class Botones {

    ArrayList<Computadora> lista = new ArrayList<Computadora>();

    public ArrayList<Computadora> getLista() {
        return lista;
    }

    public void Agregar(Computadora c) {
        lista.add(c);
    }

    public Computadora BuscarxId(String id) {
        Computadora a = new Computadora();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId().equals(id)) {
                return lista.get(i);
            }
        }
        return a;
    }

    public void ActualizarxId(Computadora c) {
        for (int i = 0; i < lista.size(); i++) {

            if (lista.get(i).getId().equals(c.getId())) {
                lista.get(i).setMarca(c.getMarca());
                lista.get(i).setModelo(c.getModelo());
                lista.get(i).setCosto(c.getCosto());
                lista.get(i).setCategoria(c.getCategoria());
                lista.get(i).setTipo(c.getTipo());
                lista.get(i).setCantidad(c.getCantidad());
                lista.get(i).setTipopago(c.getTipopago());
                lista.get(i).setCaracteristicas(c.getCaracteristicas());
            }

        }
    }

    public void EliminarxId(String id) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId().equals(id)) {
                lista.remove(i);
            }
        }
    }

}
