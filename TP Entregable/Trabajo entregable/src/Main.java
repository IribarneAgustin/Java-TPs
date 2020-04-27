import Empleados.Arquitecto;
import Empleados.Empleado;
import Empleados.MaestroMayorDeObra;
import Empleados.Obrero;
import Empresas.Empresa;
import Obras.Comercial;
import Obras.Domestica;
import Obras.Hotel;
import Obras.Comercio;
import Obras.Obra;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ///Ejercicio 2A
        Arquitecto arquitecto1 = new Arquitecto("Agustin","40138021","223545415",2000);
        Obrero obrero1 = new Obrero("Pepe grillo","30124547","2235411122",35);
        Obrero obrero2 = new Obrero("Miguel","20124547","2235411122",45);
        Obrero obrero3 = new Obrero("Tomas","40124547","465123",23);
        Obrero obrero4 = new Obrero("Ignacio Ungarelli","41123522","2235411122",22);
        MaestroMayorDeObra mmo1 = new MaestroMayorDeObra("Macarena","39222123","455652",24);
        MaestroMayorDeObra mmo2 = new MaestroMayorDeObra("Victoria","40202121","4115566",23);
        MaestroMayorDeObra mmo3 = new MaestroMayorDeObra("Gabriel","20000123","155468799",50);
        MaestroMayorDeObra mmo4 = new MaestroMayorDeObra("Liliana","20315333","155223344",50);

        arquitecto1.crearPlanos();
        obrero1.construir();
        mmo1.construir();


        ///Ejercicio 2B

        Empresa empresa1 = new Empresa("Ladrillo SA");
        empresa1.agregarEmpleados(arquitecto1);
        empresa1.agregarEmpleados(obrero1);
        empresa1.agregarEmpleados(obrero2);
        empresa1.agregarEmpleados(obrero3);
        empresa1.agregarEmpleados(obrero4);
        empresa1.agregarEmpleados(mmo1);
        empresa1.agregarEmpleados(mmo2);
        empresa1.agregarEmpleados(mmo3);
        empresa1.agregarEmpleados(mmo4);

        ///Ejercicio 2C
        Domestica obraDomestica= new Domestica("Hernandarias 252",30,30,100,5,empresa1.asignarPersonalEnObra(2,1));
        obraDomestica.verPrecioEstimado();

        Hotel obraHotel = new Hotel("Luro 2156",100,500,100,empresa1.asignarPersonalEnObra(4,2),"Hotel antartida",9);
        obraHotel.verPrecioEstimado();

        Comercio obraComercio = new Comercio("Alem 2020",30,90,150,"Casa de música","Ventas",empresa1.asignarPersonalEnObra(3,1));
        obraComercio.verPrecioEstimado();

        ///Ejercicio 2D
        empresa1.agregarObraAlista(obraDomestica);
        empresa1.agregarObraAlista(obraHotel);
        empresa1.agregarObraAlista(obraComercio);



        ///Ejercicio 2E
        obraComercio.verEmpleados();
        obraDomestica.verEmpleados();
        obraHotel.verEmpleados();

        //Ejercicio 2F

        empresa1.verObras();


    }


}

