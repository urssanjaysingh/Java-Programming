/*Array help us to store multiple elements of same data type */

public class Arrays {
    public static void main(String[] args) {
        // character array - a
        char[] a = new char[5];
        a[0] = 'a';
        a[1] = 'b';
        a[2] = 'c';
        a[3] = 'd';
        a[4] = 'e';

        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }

        System.out.println();

        // integer array - b
        int[] b = new int[10];

        for (int i = 0; i < 5; i++) {
            b[i] = i;
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(b[i] + " ");
        }

        System.out.println();

        // Multi-Dimensional Array - c
        int[][] c = new int[3][3];
        int num = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = num;
                ++num;
            }
        }

        System.out.println();
        for(int i = 0; i < 3; i++){
            for(int j = 0; j<3; j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
