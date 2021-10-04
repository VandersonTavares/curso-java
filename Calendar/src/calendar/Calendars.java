package calendar;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Calendar;

public class Calendars {
    public static void main(String[] args) {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));//Z = UTC
        
        System.out.println(sdf.format(d));
        
        //Como adicionar 4 horas nessa data
        
        Calendar cal = Calendar.getInstance();
        cal.setTime(d); //está com a data setada
        
        cal.add(Calendar.HOUR_OF_DAY, 4);//adicionado 4 horas
        
        d = cal.getTime();
        System.out.println(sdf.format(d));
        
        //------------------------------
        //pegar uma unidade de tempo
        
        int minutes = cal.get(Calendar.MINUTE);//retorna os minutos da hora setada
        int month = 1+ cal.get(Calendar.MONTH); //os meses começam Janeiro com valor 0, então precisa adicionar o 1 na soma pra retornar certo
        
        System.out.println(minutes);
        System.out.println(month); //iria retornar 5 caso nao tivesse colocado +1 na declaração acima;
        
        
    }
    
}
