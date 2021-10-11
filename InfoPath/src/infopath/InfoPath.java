package infopath;

import java.io.File;
import java.util.Scanner;

public class InfoPath {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);
        
                                        
        System.out.println("getName: "+path.getName());//pega o nome do arquivo do endereço path
        System.out.println("getParent: "+path.getParent()); //pega somente o caminho do edenreço path
        System.out.println("getPath: "+path.getPath());//pega o caminho completo do endereço path
        
        
        
        
        sc.close();
    }

}
