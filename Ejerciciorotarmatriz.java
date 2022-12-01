    /*int[][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
        int tamaño = matriz.length;
        int[][] auxmatriz = new int[tamaño][tamaño];
        for (int i=0;i<tamaño;i++) {
            for (int j=0;j<tamaño;j++) {
            auxmatriz[tamaño-1-j][i] = matriz[i][j];
            
            }
        }
        for (int x=0;x<tamaño;x++) {
            for (int y=0;y<tamaño;y++) {
            System.out.print(auxmatriz[x][y] + " ");
            }
            System.out.println();
*/
/*public class Ejerciciorotarmatriz{
    public static void main(String[] args) {
        
    
    int [][] num = new int [3][3];
        int [][] aux = new int [num.length][num.length]; 
        int [][] aux2 = new int [num.length][num.length];

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                num[i][j] = (int)(Math.random()*4);
                aux[i][j] = (int)(Math.random()*4);
            }
        }

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                System.out.printf("%5d",num [i][j]);
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                System.out.printf("%5d",aux [i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < aux.length; i++) {
            for (int j = 0; j < aux.length; j++) {
                for (int k = 0; k < aux.length; k++) {
                    aux2 [i][j] += num[i][k] * aux[k][j];
                }
            }
        }

        System.out.println();
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                System.out.printf("%5d",aux2 [i][j]);
            }
            System.out.println();
        }
    }
}*/

