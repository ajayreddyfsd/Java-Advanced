public class MultiDimensionalArrays {
    public static void main(String[] args) {

        // ===================== 2D Array =====================
        // Shape: 2 rows × 3 columns
        // Visually:
        // [
        //   [1, 2, 3],
        //   [4, 5, 6]
        // ]
        int[][] matrix2D = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // ===================== 3D Array =====================
        // Shape: 2 blocks × 2 rows × 3 columns
        // Visually:
        // [
        //   [  [1, 2, 3],
        //      [4, 5, 6]  ],
        //
        //   [  [7, 8, 9],
        //      [10,11,12] ]
        // ]
        int[][][] matrix3D = new int[2][2][3];
        int count = 1;
        for (int i = 0; i < matrix3D.length; i++) {
            for (int j = 0; j < matrix3D[i].length; j++) {
                for (int k = 0; k < matrix3D[i][j].length; k++) {
                    matrix3D[i][j][k] = count++;
                }
            }
        }

        // ===================== 4D Array =====================
        // Shape: 2 blocks × 2 sub-blocks × 2 rows × 2 columns
        // Visually:
        // [
        //   [  [ [1, 2],   [3, 4] ],
        //      [ [5, 6],   [7, 8] ]  ],
        //
        //   [  [ [9, 10],  [11,12] ],
        //      [ [13,14],  [15,16] ] ]
        // ]
        int[][][][] matrix4D = new int[2][2][2][2];
        count = 1;
        for (int i = 0; i < matrix4D.length; i++) {
            for (int j = 0; j < matrix4D[i].length; j++) {
                for (int k = 0; k < matrix4D[i][j].length; k++) {
                    for (int l = 0; l < matrix4D[i][j][k].length; l++) {
                        matrix4D[i][j][k][l] = count++;
                    }
                }
            }
        }

        // ========== PRINTING ==========

        // 2D
        System.out.println("2D Array:");
        for (int i = 0; i < matrix2D.length; i++) {
            for (int j = 0; j < matrix2D[i].length; j++) {
                System.out.print(matrix2D[i][j] + " ");
            }
            System.out.println();
        }

        // 3D
        System.out.println("\n3D Array:");
        for (int i = 0; i < matrix3D.length; i++) {
            System.out.println("Block " + i + ":");
            for (int j = 0; j < matrix3D[i].length; j++) {
                for (int k = 0; k < matrix3D[i][j].length; k++) {
                    System.out.print(matrix3D[i][j][k] + " ");
                }
                System.out.println();
            }
        }

        // 4D
        System.out.println("\n4D Array:");
        for (int i = 0; i < matrix4D.length; i++) {
            System.out.println("Block " + i + ":");
            for (int j = 0; j < matrix4D[i].length; j++) {
                System.out.println("  Sub-block " + j + ":");
                for (int k = 0; k < matrix4D[i][j].length; k++) {
                    for (int l = 0; l < matrix4D[i][j][k].length; l++) {
                        System.out.print(matrix4D[i][j][k][l] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
