package programa;

import entities.Product;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Programa {

    public static void main(String[] args) {

        List<Product> lista = new ArrayList<>();
        //

        //defini o endereço
        String path = "C:\\temp\\source.txt";

        //criando o novo arquivo----------------------------------------
        File sourceFile = new File(path);
        String caminho = "C:\\temp\\out\\summary.txt"; //endereço do novo arquivo com o arquivo
        //String caminho = "C:\\temp\\out\\summary.csv";
        String sourceFolderPath = sourceFile.getParent();
        boolean success = new File(sourceFolderPath + "\\out").mkdir(); //criando a nova pasta out
        //---------------------------------------------------------------

        //li as linhas do arquivo e retornei uma linha em itensCsv
        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile))) {
            String itensCsv = br.readLine();
            //se a linha lida for a ultima ela retorna um null
            while (itensCsv != null) {
                String[] campos = itensCsv.split(",");//dividi a linha em partes definidas por virgula e armazenei cada uma em um vetor de string chamado campos
                String nome = campos[0];
                double precoUnitario = Double.parseDouble(campos[1]); //converti o string para double
                int quantidade = Integer.parseInt(campos[2]); //converti o string para int

                Product p = new Product(nome, precoUnitario, quantidade);
                lista.add(p); //adicionei o produto na lista

                itensCsv = br.readLine(); //defini a variavel itensCsv o proximo item do arquivo (a proxima Linha)
            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho))) {
                for (Product item : lista) {
                    bw.write(item.getNome()+","+item.total());
                    bw.newLine();
                }
                
                System.out.println("Criado!");

            } catch (IOException e) {
                //e.printStackTrace();
                System.out.println(e.getMessage());
            }
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }

}
