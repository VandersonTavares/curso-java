package manipulandofiles;

import java.io.File;
import java.util.Scanner;

public class ManipulandoFiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter folder path: ");
        String strPath  = sc.nextLine();
        
        File path = new File(strPath);
                                        //copia as pastas do endereço path
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS: ");
        for(File folder : folders){
            System.out.println(folder);
        }
                                      //copia arquivos do edereço path
        File[] files = path.listFiles(File :: isFile);
        System.out.println("FILES: ");
        for(File file : files){
            System.out.println(file);
        }
        
        //cria uma subpasta subdir a partir da pasta do endereço path;
        boolean success = new File(strPath + "\\subdir").mkdir();
        
        sc.close();
    }
    
}
