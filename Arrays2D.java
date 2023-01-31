public class Arrays2D {
    public static void main(String[] args) {
        
        int arr[][] = {
            {2, 6, 8},
            {3, 5, 7},
            {1, 4, 9}
        };

        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
