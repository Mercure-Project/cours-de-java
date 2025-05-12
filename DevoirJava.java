import java.util.Scanner;

class DevoirJava {
    public static void main (String arg []) {
        // DevoirJava.calculDistance();
        // DevoirJava.jeu();
        // DevoirJava.trianglePascal(10);
        DevoirJava.afficherTableMultiplication();
    }
    public static void calculDistance () {
        Scanner src = new Scanner(System.in);
        float Xa, Ya, Xb, Yb;
        double distance;
        System.out.println("Saisir les coordonés de A");
        Xa = src.nextFloat();
        Ya = src.nextFloat();
        System.out.println("Saisir les coordonés de B");
        Xb = src.nextFloat();
        Yb = src.nextFloat();
        distance = Math.sqrt(Math.pow((Xb - Xa), 2) + Math.pow((Yb - Ya), 2));
        System.out.println(distance);
    }
    public static void jeu () {
        Scanner src = new Scanner(System.in);
        int saisiUtilisateur = 0;
        int aleatoire = (int) (Math.random() * 6) + 1;
       
        while (saisiUtilisateur != aleatoire) {
             System.out.println("Saisi un nombre");
                saisiUtilisateur = src.nextInt();
            if (saisiUtilisateur > aleatoire) {
                System.out.println("saisi plus grande");
            } else if (saisiUtilisateur < aleatoire) {
                System.out.println("saisi plus pétite");
            } else {
                System.out.println("Bravo, vous avez gagner" + aleatoire );
            }
        }

    }
    public static void trianglePascal (int n) {
        int[][] triangle = new int[n][n];


        for (int i = 0; i < n; i++) {
            triangle[i][0] = 1; 

            for (int j = 1; j <= i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }


        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n - i - 1; k++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + "   ");
            }
            System.out.println();
        }
    }
    public static void afficherTableMultiplication() {
        int[][] table = new int[10][10]; 

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                table[i][j] = (i + 1) * (j + 1); 
            }
        }

        System.out.println("Table de multiplication des 10 premiers entiers :");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%4d", table[i][j]);
            }
            System.out.println();
        }
    }
}