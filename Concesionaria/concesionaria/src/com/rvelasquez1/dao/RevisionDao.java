package com.rvelasquez1.dao;

import com.rvelasquez1.model.Cliente;
import com.rvelasquez1.model.Revision;
import com.rvelasquez1.util.ConectorBD;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RevisionDao {

    private Connection connection;
    public RevisionDao(){
        connection= ConectorBD.getConnection();

    }

    public void addRevision(Revision revision){
        try {


            PreparedStatement preparedStatement= connection.prepareStatement(
                    "INSERT INTO revisiones (codigo, aceite, filtro, frenos, matricula) VALUES (?, ?, ?, ?, ?)"

            );
            preparedStatement.setString(1,revision.getCodigo());
            preparedStatement.setString(2,revision.getAceite());
            preparedStatement.setString(3,revision.getFiltro());
            preparedStatement.setString(4,revision.getFrenos());
            preparedStatement.setString(5,revision.getMatricula());
            preparedStatement.executeUpdate();

            System.out.println(revision + " creada");

        } catch (SQLException e) {
            System.out.println("Error al crear revision: " + e.getMessage());
        }
    }

    public void updateRevision(Revision revision){
        try {


            PreparedStatement preparedStatement= connection.prepareStatement(
                    "UPDATE revisiones SET codigo=?, aceite=?, filtro=?, frenos=?, matricula=? WHERE codigo=?"

            );
            preparedStatement.setString(1,revision.getCodigo());
            preparedStatement.setString(2,revision.getAceite());
            preparedStatement.setString(3,revision.getFiltro());
            preparedStatement.setString(4,revision.getFrenos());
            preparedStatement.setString(5,revision.getMatricula());

            preparedStatement.setString(6,revision.getCodigo());
            preparedStatement.executeUpdate();

            System.out.println(revision + "editar");

        } catch (SQLException e) {
            System.out.println("Error al editar revision: " + e.getMessage());
        }

    }

    public void deleteRevision(String codigo){
        try {


            PreparedStatement preparedStatement= connection.prepareStatement(
                    "DELETE FROM revisiones WHERE codigo=?"

            );
            preparedStatement.setString(1,codigo);
            preparedStatement.executeUpdate();


            System.out.println(codigo + " fue eliminado");

        } catch (SQLException e) {
            System.out.println("Error al editar la reivsion: " + e.getMessage());
        }

    }

    public List<Revision> getALLRevisiones() {
        List<Revision> revisiones = new ArrayList<Revision>();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM revisiones");
            while (resultSet.next()) {
                Revision revision = new Revision();
                revision.setCodigo(resultSet.getString("codigo"));
                revision.setAceite(resultSet.getString("aceite"));
                revision.setFiltro(resultSet.getString("filtro"));
                revision.setFrenos(resultSet.getString("frenos"));
                revision.setMatricula(resultSet.getString("matricula"));

                revisiones.add(revision);


            }

        } catch (SQLException e) {
            System.out.println("Error al listar las revisiones : " + e.getMessage());
        }

        return revisiones;

    }
}
