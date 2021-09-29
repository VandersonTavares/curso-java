package matriz;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Digite: ");
        int n = sc.nextInt();  //pode ser usado mat.lenght para a quantidade de linhas em vez de n;
        int[][]mat = new int[n][n]; //declaração de uma matriz bidimensional
                            //exemplo
        for (int i = 0; i < mat.length; i++) {
                               //mat[i].lenght = é o a mesma coisa da quantidade de colunas da matriz
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
            //obs
        System.out.println("Main diagonal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(mat[i][i] +" ");
        }
        System.out.println();
        
        int count =0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(mat[i][j] < 0){
                    count++;
                }
            }
        }
        System.out.println("Negative Numbers: "+count);

        
        
        sc.close();
    }
    
}
