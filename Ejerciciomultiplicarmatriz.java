import javax.swing.plaf.basic.BasicBorders.MarginBorder;

public class Ejerciciomultiplicarmatriz{
    public static void main(String[] args) {
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] c = new int[3][3];

        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                a[i][j]=(int)(Math.random()*51);
                b[i][j]=(int)(Math.random()*51);
            }
            

        }
    }
}