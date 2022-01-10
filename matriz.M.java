public class matriz {
    public static void main(String[] args) {
        int[][] matriz = {{1, 1}, {1, 1}};
        int total=1;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + "\t");
                total *= matriz[i][j] ;
            }
            System.out.println("\n");
        }

        System.out.print(total);
    }
}
