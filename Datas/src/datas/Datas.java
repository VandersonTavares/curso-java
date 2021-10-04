package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Datas {
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/mm/yyyy"); //***instanciando o formato sem hora
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss"); //***instanciando o formato com hora
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT")); //
        
        Date x1 = new Date();//imprime a hora atual
        Date x2 = new Date(System.currentTimeMillis());//
        
                        //5 horas da manha Janeiro 1970
                        //precisa passar o equivalente a 5 horas em milisegundos
        Date x3 = new Date(1000L * 60L * 60L * 5);
                        //1s * 60 * 60 * 5 = 5 horas
        
        
        Date y1 = sdf1.parse("25/06/2018");//***recebe um dado em string respeitando a regra acima, e retornando a data
        Date y2 = sdf2.parse("25/06/2018 14:35:25");
        Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z")); //formato ISO8601 - Z no final indica formato UTC
        

        
        
        System.out.println(sdf1.format(y1)); 
        System.out.println(sdf2.format(y2));
        System.out.println(y3);
        System.out.println(sdf2.format(x1));
    }
    
}
