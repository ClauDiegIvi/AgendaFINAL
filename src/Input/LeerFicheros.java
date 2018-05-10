package Input;

import model.Config;
import model.Internacional;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LeerFicheros {

    static Config configuracion = new Config();
    static Internacional inter = new Internacional();

    static final String CONFIG = "config.txt",
                        PETICIONES = "peticions.txt";

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
            //TODO FALTA LA EXCEPCION EN CASO DE ARCHIVO CONF MAL ESCRITO
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
            return configuracion;
        }

    }
    //TODO leerPeticion tiene que devolver los resultados de las peticiones validas en un array
    public static void leerPeticion() throws IOException {

        FileReader file = new FileReader(PETICIONES);
        BufferedReader reader = new BufferedReader(file);

        String linea;

        /*
        Aquí se necesita el metodo que procesará cada linea de texto del archivo peticiones.txt
        EJEMPLO DE LO QUE SE PASA:

        ReunioJava Sala1 07/10/2017 08/11/2017 LMCJVSG 08-10_19-21

        ReunioJava -> És el nom de l’activitat (sense espais interns)
        Sala1 -> És el nom de la sala que es vol reservar (també sense espais interns)
        07/10/2017 -> Data inicial del període de reserva
        08/11/2017 -> Data final del període de reserva
        LMCJVSG -> Màscara de dies a reservar durant el període
        08-10_19-21. Màscara de hores a reservar durant el període
        */
        while ((linea = reader.readLine()) != null ){
            //TODO Falta el metodo de procesamiento! (DIEGO)
            System.out.println(linea);
        }

        reader.close();
    }

    public static Internacional leerInternacional(Config config) throws IOException {
        String INTERNACIONAL_FILE = "internacional." + config.getIdiomaSalida();

        FileReader file = new FileReader(INTERNACIONAL_FILE);
        BufferedReader reader = new BufferedReader(file);

        String linea;
        ArrayList<String> internacional = new ArrayList<>();

        while ((linea = reader.readLine()) != null ){
            internacional.add(linea);
        }

        reader.close();

        for (int i=0;i<internacional.size();i++) {
            String[] result = internacional.get(i).split(";");

            switch (result[0]) {
                case "001":
                    inter.setAgenda(result[1]);
                    break;
                case "002":
                    inter.setDias(result[1].split(","));
                    break;
                case "003":
                    String[] letrasIni = new String[result[1].length()];
                    for (int y = 0; y < result[1].length(); y++) {
                        if (!String.valueOf(result[1].charAt(y)).equals(" ")){
                            letrasIni[y] = String.valueOf(result[1].charAt(y));
                        }
                    }
                    inter.setLetrasInicialDias(letrasIni);
                    break;
                case "004":
                    inter.setMeses(result[1].split(","));
                    break;
                case "005":
                    inter.setAnios(result[1].split(","));
                    break;
                case "006":
                    inter.setHecho(result[1]);
                    break;
                case "007":
                    inter.setClosed(result[1]);
                    break;
                case "008":
                    inter.setErr(result[1]);
                    break;
            }
        }
        return inter;
    }
}
