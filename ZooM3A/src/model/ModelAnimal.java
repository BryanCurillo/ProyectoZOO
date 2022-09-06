/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

/**
 *
 * @author ALEJO
 */
public class ModelAnimal extends Animales {

    public ModelAnimal() {
    }

    public ModelAnimal(int idanimal, String nombreanimal, String genero, String especie, int iddieta, int idhabitad, int idcuidador, String dieta, int edad, Image foto, FileInputStream imageFile, int tamano) {
        super(idanimal, nombreanimal, genero, especie, iddieta, idhabitad, idcuidador, dieta, edad, foto, imageFile, tamano);
    }

    public ModelAnimal(int idanimal, String nombreanimal, String genero, String especie, int iddieta, int idhabitad, int idcuidador, String dieta, int edad, Image foto, FileInputStream imageFile, int tamano, int idalimento, double precio, String nombre, int idgerente, int idproveedor) {
        super(idanimal, nombreanimal, genero, especie, iddieta, idhabitad, idcuidador, dieta, edad, foto, imageFile, tamano, idalimento, precio, nombre, idgerente, idproveedor);
    }

    modelPGconexion mpgc = new modelPGconexion();

    public boolean setFotoAnimal() {
        String sql;
        sql = "INSERT INTO animal(ani_nombre, ani_genero, ani_especie, ani_edad, ani_foto, ani_iddieta, ani_idhabitad, ani_idcuidador)";
        sql += "VALUES(?,?,?,?,?,?,?,?)";
        try {

            PreparedStatement ps = mpgc.con.prepareStatement(sql);
            ps.setString(2, getNombreanimal());
            ps.setString(3, getGenero());
            ps.setString(4, getEspecie());
            ps.setInt(5, getEdad());
            ps.setBinaryStream(6, getImageFile(), getTamano());
            ps.setInt(7, getIddieta());
            ps.setInt(8, getIdhabitad());
            ps.setInt(9, getIdcuidador());

            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(modelEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    private Image getImagen(byte[] bytes) throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        Iterator it = ImageIO.getImageReadersByFormatName("jpeg");
        ImageReader imageReader = (ImageReader) it.next();
        Object source = bais;
        ImageInputStream fis = ImageIO.createImageInputStream(source);
        imageReader.setInput(fis, true);
        ImageReadParam param = imageReader.getDefaultReadParam();
        param.setSourceSubsampling(1, 1, 0, 0);
        return imageReader.read(0, param);
    }

    public List<Animales> getAnimalRellenar(int idanimal) {
        List<Animales> listaAnimales = new ArrayList<>();

        String sql = "select * from animal where ani_id ='" + idanimal + "'";
        ResultSet rs = mpgc.consulta(sql);
        byte[] bytea;
        try {
            while (rs.next()) {
                Animales animal = new Animales();
                animal.setIdanimal(rs.getInt(1));
                animal.setNombreanimal(rs.getString(2));
                animal.setGenero(rs.getString(3));
                animal.setEspecie(rs.getString(4));
                animal.setEdad(rs.getInt(5));

                bytea = rs.getBytes(6);
                if (bytea != null) {
                    animal.setFoto(getImagen(bytea));
                }

                animal.setIddieta(rs.getInt(7));
                animal.setIdhabitad(rs.getInt(8));
                animal.setIdcuidador(9);
                listaAnimales.add(animal);
            }
        } catch (IOException | SQLException e) {
            Logger.getLogger(modelPGconexion.class.getName()).log(Level.SEVERE, null, e);
        }

        try {
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(modelEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listaAnimales;
    }

    public boolean deleteAnimal(int codigoanimal) {

        String sql = "delete from from animal where = " + codigoanimal + ";";
        return mpgc.accion(sql);//EJECUTAMOS EN DELETE
    }

}
