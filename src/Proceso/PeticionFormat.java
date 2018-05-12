package Proceso;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by NACHZEHER on 10/05/2018.
 */
public class PeticionFormat {

    final static String DATE_FORMAT = "dd/MM/yyyy";

    public static boolean checkPetitions(String line ){

        String[] parts = line.split(" ");

        if (parts.length != 5){
            return false;
        }else{
            if((checkTime(parts[2]) && (checkTime(parts[3])))){
                if(checkTimeRange(parts[5])){
                    return true;
                }else{
                    return false;
                }

            }else{
                return false;
            }
        }
    }

    public static boolean checkTime(String initDate){
        try {
            DateFormat df = new SimpleDateFormat(DATE_FORMAT);
            df.setLenient(false);
            df.parse(initDate);
            return true;
        } catch (ParseException e) {
            return false;
        }

    }

    public static boolean checkTimeRange(String time){

        String[] timeParts = time.split("_");

        for (int i = 0; i <timeParts.length; i++){
             String[] hours = timeParts[i].split("-");
             if ((Integer.parseInt(hours[0]) >= (Integer.parseInt(hours[1])))){
                return false;
            }else{
                return true;
            }
        }
        return false;
    }

    public static Date parseDate(String string) throws ParseException {

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date date = df.parse(string);
        return date;
    }

    public static List<Character> getCharList(String string){

        List<Character> charList = new ArrayList<>();
        for (char ch: string.toCharArray()){
            charList.add(ch);
        }
        return charList;
    }

    public static List<Integer> getRangeTime(String string){

        List<Integer> horas = new ArrayList<>();
        String[] parts = string.split("_");

        for (int i = 0; i < parts.length; i++) {
            String[] parts2 = parts[i].split("-");
            for(int y = 0; y < parts2.length;y++){
                horas.add(Integer.parseInt(parts2[i]));
            }
      }
      return horas;
    }

}

