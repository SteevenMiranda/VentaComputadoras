package Clases;

import ConexionBD.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CrudComputadoras {
    private Computadora dtoComputadora;

    public Computadora getDtoComputadora() {
        return dtoComputadora;
    }

    public void setDtoComputadora(Computadora dtoComputadora) {
        this.dtoComputadora = dtoComputadora;
    }

    public String guardarNuevo(Computadora dtoComputadora) {
        this.setDtoComputadora(dtoComputadora);
        String mensaje = "";
        try {
            Conexion cn = new Conexion();
            String sentencia = "Insert into registro (Nombre, Apellido, Cedula, Marca, Modelo, Costo, Categoria, Tipo) values(?,?,?,?,?,?,?,?)";
            cn.Conectar();
            PreparedStatement pst = cn.getCon().prepareStatement(sentencia);
            pst.setString(1, this.dtoComputadora.getNombre());
            pst.setString(2, this.dtoComputadora.getApellido());
            pst.setInt(3, this.dtoComputadora.getCedula());
            pst.setString(4, this.dtoComputadora.getMarca());
            pst.setString(5, this.dtoComputadora.getModelo());
            pst.setDouble(6, this.dtoComputadora.getCosto());
            pst.setString(7, this.dtoComputadora.getCategoria());
            pst.setString(8, this.dtoComputadora.getTipo());
            pst.execute();
            mensaje = "registro guardado...";
        } catch (Exception ex) {
            mensaje = "Error" + ex.getMessage();
        }
        return mensaje;
    }

    public ArrayList<Computadora> getLista() {
        ArrayList<Computadora> listado = new ArrayList<Computadora>();
        try{
            Conexion cn = new Conexion();
            String sentencia = "Select * from registro";
            cn.Conectar();
            PreparedStatement pst = cn.getCon().prepareStatement(sentencia);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Computadora dto = new Computadora(rs.getString("Nombre"), 
                        rs.getString("Apellido"), rs.getInt("Cedula"), 
                        rs.getString("Marca"), rs.getString("Modelo"), 
                        rs.getDouble("Costo"), rs.getString("Categoria"), 
                        rs.getString("Tipo"));
                listado.add(dto);
            }
            cn.Desconectar();
        }catch(Exception ex){
            System.out.println("No se pudo consultar...");
        }
        return listado;
    }

    public Computadora Buscarxcedula(int cedula) {
        Computadora dto = new Computadora();

        try {
            Conexion cn = new Conexion();
            String sentencia = "Select * from registro where cedula = ?";
            cn.Conectar();
            PreparedStatement pst = cn.getCon().prepareStatement(sentencia);
            pst.setInt(1, cedula);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                dto.setNombre(rs.getString("Nombre"));
                dto.setApellido(rs.getString("Apellido"));
                dto.setCedula(rs.getInt("Cedula"));
                dto.setMarca(rs.getString("Marca"));
                dto.setModelo(rs.getString("Modelo"));
                dto.setCosto(rs.getDouble("Costo"));
                dto.setCategoria(rs.getString("Categoria"));
                dto.setTipo(rs.getString("Tipo"));
            }
            cn.Desconectar();
            
        } catch (Exception ex) {
            System.out.println("No se pudo consultar...");
        }
        return dto;
    }
    
    public String Actualizar(Computadora dtoComputadora) {
        this.setDtoComputadora(dtoComputadora);
        String mensaje = "";

        try {
            Conexion cn = new Conexion();
            String sentencia = "Update registro set Nombre = ?, Apellido = ?, Marca = ?, Modelo = ?, Costo = ?, Categoria = ?, Tipo = ? where cedula = ?";
            cn.Conectar();
            PreparedStatement pst = cn.getCon().prepareStatement(sentencia);

            pst.setString(1, this.dtoComputadora.getNombre());
            pst.setString(2, this.dtoComputadora.getApellido());
            pst.setString(3, this.dtoComputadora.getMarca());
            pst.setString(4, this.dtoComputadora.getModelo());
            pst.setDouble(5, this.dtoComputadora.getCosto());
            pst.setString(6, this.dtoComputadora.getCategoria());
            pst.setString(7, this.dtoComputadora.getTipo());
            pst.setInt(8, this.dtoComputadora.getCedula());

            pst.execute();
            mensaje = "registro actualizado...";
            cn.Desconectar();

        } catch (Exception ex) {
            mensaje = "Error" + ex.getMessage();
        }
        return mensaje;
    }
    
    public String Eliminarxcedula(int cedula) {
        String mensaje;

        try {
            Conexion cn = new Conexion();
            String sentencia = "Delete from registro where cedula = ?";
            cn.Conectar();
            PreparedStatement pst = cn.getCon().prepareStatement(sentencia);
            pst.setInt(1, cedula);
            pst.execute();
            cn.Desconectar();
            mensaje = "Registro eliminado...";

        } catch (Exception ex) {
            mensaje = "No se pudo eliminar...";
        }
        return mensaje;
    }
}
