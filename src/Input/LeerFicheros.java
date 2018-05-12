package Input;

import Proceso.PeticionFormat;
import model.Config;
import model.Internacional;
import model.Peticion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import static Proceso.PeticionFormat.checkPetitions;

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
    //TODO leerPeticion tiene que devolver los resultados de las peticiones validas en un array   !! Done?
    public static List<Peticion> leerPeticion() throws IOException, ParseException {

        List<Peticion> petitionList = new ArrayList<>();

        FileReader file = new FileReader(PETICIONES);
        BufferedReader reader = new BufferedReader(file);

        String linea;

        while ((linea = reader.readLine()) != null ){
            //TODO Falta el metodo de procesamiento! (DIEGO)  !! Done?
            if ( checkPetitions(linea)){
                Peticion peticion = new Peticion();

                String[] parts = linea.split(" ");
                peticion.setActividad(parts[0]);
                peticion.setNombreSala(parts[1]);
                peticion.setFechaInicio(PeticionFormat.parseDate(parts[2]));  //TODO revisar Exeption !!
                peticion.setFechaFin(PeticionFormat.parseDate(parts[3]));
                peticion.setDias(PeticionFormat.getCharList(parts[4]));

                List<Integer> hours = PeticionFormat.getRangeTime(parts[5]);
                List<Integer> rango1 = new ArrayList<>();
                List<Integer> rango2 = new ArrayList<>();

                if (hours.size() <= 2){
                    rango1.add(hours.indexOf(0));
                    rango1.add(hours.indexOf(1));
                    peticion.setPeriodoUno(rango1);
                }else{
                    rango1.add(hours.indexOf(0));
                    rango1.add(hours.indexOf(1));
                    rango2.add(hours.indexOf(2));
                    rango2.add(hours.indexOf(3));
                    peticion.setPeriodoUno(rango1);
                    peticion.setPeriodoUno(rango2);
                }
                petitionList.add(peticion);
            }
        }
        reader.close();
        return petitionList;
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
