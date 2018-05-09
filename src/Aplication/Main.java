package Aplication;

import Input.LeerFicheros;
import model.Config;
import model.Internacional;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        //Objeto con atributos del archivo config.txt
        Config conf = LeerFicheros.lecturaConfig();
        //Objeto con atributos del archivo internacional.X
        //X -> se refiere a lo definido como Idioma de salida en el Config
        Internacional internacional = LeerFicheros.leerInternacional(conf);

        LeerFicheros.leerPeticion();


    }
}
