package Input;

import model.Config;
import model.Peticion;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LeerFicheros {
    static Config configuracion = new Config();

    static final String CONFIG = "config.txt",
                        PETICIONES = "peticions.txt",
                        INTERNACIONAL_CAT = "internacional.CAT.txt";

    public static Config lecturaConfig() throws IOException {

        FileReader file = new FileReader(CONFIG);
        BufferedReader reader = new BufferedReader(file);

        String linea;
        ArrayList<String> conf = new ArrayList<>();

        while ((linea = reader.readLine()) != null ){
            conf.add(linea);
        }

        reader.close();

        if (conf.size() > 2){
            System.out.println("ESCRITURA INCORRECTA DEL ARCHIVO 'config.txt'");
            return null;
        } else {
            for (int i=0;i<conf.size();i++) {
                String[] result = conf.get(i).split(" ");
                if (i == 0) {
                    configuracion.setAnio(Integer.parseInt(result[0]));
                    configuracion.setMes(Integer.parseInt(result[1]));
                } else {
                    configuracion.setIdiomaEntrada(result[0]);
                    configuracion.setIdiomaSalida(result[1]);
                }
            }
            System.out.println(configuracion);
            return configuracion;
        }

    }

    public static Peticion leerPeticion() throws FileNotFoundException {

        FileReader file = new FileReader(PETICIONES);
        BufferedReader reader = new BufferedReader(file);

        String linea;

        return null;
    }
}
