package com.rvelasquez1;

import com.rvelasquez1.dao.ClienteDao;
import com.rvelasquez1.dao.CocheDao;
import com.rvelasquez1.dao.RevisionDao;
import com.rvelasquez1.model.Cliente;
import com.rvelasquez1.model.Coche;
import com.rvelasquez1.model.Revision;
import com.rvelasquez1.util.ConectorBD;

import java.sql.Connection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Cliente cliente = new Cliente("1450", "Carlos Peres", "Cochabamba", "Av. Ayacucho s/n", 78569651 );
        //Cliente laura = new Cliente("1451", "Carlos Peres", "Cochabamba", "Av. Ayacucho s/n", 78569651 );
        //Cliente roberto = new Cliente("1452", "Roberto Peres", "Cochabamba", "Av. Junin s/n", 885214 );
        //Cliente lorena = new Cliente("1453", "Lorena Peres", "Cochabamba", "Av. Heroinas s/n", 448551 );
        //Cliente jose = new Cliente("1454", "Jose Peres", "Cochabamba", "Av. Circunvalacion s/n", 78569654 );
        //Cliente maria = new Cliente("1455", "Maria Peres", "Cochabamba", "Av. America s/n", 78567451 );
        //Cliente luis = new Cliente("1456-1B", "Luis Peres", "Cochabamba", "Av. Sucre s/n", 78569851 );
        //Cliente carmen = new Cliente("1457", "Carmen Peres", "Cochabamba", "Av. Bolivar s/n", 785674852 );
        //Coche autito = new Coche("YU678","Mitsubishi", "HU56", "ROJO", 275894095, "1454" );
        //Revision revision = new Revision("YUYUYU", "filtrado", "fino", "frenado", "YU678");

        //CRUD tabla clientes
        ClienteDao clienteDao = new ClienteDao();
        CocheDao cocheDao = new CocheDao();
        RevisionDao revisionDao = new RevisionDao();


        //CREATE
        //clienteDao.addCliente(laura);
        //clienteDao.addCliente(roberto);
        //clienteDao.addCliente(lorena);
        //clienteDao.addCliente(jose);
        //clienteDao.addCliente(maria);
        //clienteDao.addCliente(luis);
        //clienteDao.addCliente(carmen);
        //cocheDao.addCoche(autito);
        //revisionDao.addRevision(revision);

        //READ
        /*List<Cliente> clientes = clienteDao.getALLClientes();
        for (int i = 0; i< clientes.size(); i++) {
            Cliente cliente = clientes.get(i);

            System.out.println(cliente);
        }

        List<Coche> coches = cocheDao.getALLCoches();
        for (int i =0; i< coches.size(); i++){
            Coche coche = coches.get(i);

            System.out.println(coche);
        }


        List<Revision> revisiones = revisionDao.getALLRevisiones();
        for (int i =0; i< revisiones.size(); i++) {
            Revision revision1 = revisiones.get(i);

            System.out.println(revision1);
        }
        */

        //UPDATE

        /*
        Cliente cliente = new Cliente("1450", "Juan perez", "La Paz", "Av. Arocagua s/n", 22544405 );
        clienteDao.updateCliente(cliente);

        Coche coche = new Coche("YU678","Honda", "555", "Amarillo", 275095, "1453");
        cocheDao.updateCoche(coche);


        Revision revision = new Revision("YUYUYU", "NOFILTRA", "girasol", "NOFRENAN", "YU678");
        revisionDao.updateRevision(revision);
        */

        /*
        //DELETE
        clienteDao.deleteCliente("1450");
        clienteDao.deleteCliente("1456-1B");
        cocheDao.deleteCoche("YU678");
         */
        revisionDao.deleteRevision("YUYUYU");
    }

}
