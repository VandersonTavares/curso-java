package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Datas {
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/mm/yyyy"); //***instanciando o formato sem hora
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss"); //***instanciando o formato com hora
        Date x1 = new Date();//imprime a hora atual
        
        
        Date y1 = sdf1.parse("25/06/2018");//***recebe um dado em string respeitando a regra acima, e retornando a data
        Date y2 = sdf2.parse("25/06/2018 14:35:25");
        
        System.out.println(sdf1.format(y1)); 
        System.out.println(sdf2.format(y2));
        System.out.println(sdf2.format(x1));
    }
    
}
