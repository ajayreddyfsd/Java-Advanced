public class ArrayExamples {

    // Custom class for object array example
    static class Student {
        String name;
        int age;

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String toString() {
            return name + " (" + age + ")";
        }
    }

    public static void main(String[] args) {

        // 1D arrays (declaration and initialization)
        int[] nums1 = new int[5];                   // declaration + allocation // used when u wanna make an empty array!
        int nums2[] = {1, 2, 3, 4, 5};              // declaration + initialization // sed when u wanna make a non-empty array!
        int[] nums3 = new int[] {6, 7, 8, 9, 10};   // alternative way

        // Other data types
        double[] prices = {10.5, 20.3, 30.0};
        char[] letters = {'A', 'B', 'C'};
        String[] names = {"Alice", "Bob", "Charlie"};
        boolean[] flags = new boolean[] {true, false, true};

        // Object array
        Object[] mixed = {1, "hello", 3.14, true};

        // Custom object array
        Student[] students = {
            new Student("John", 20),
            new Student("Jane", 22)
        };

        // 2D arrays
        int[][] matrix1 = new int[2][3];            // empty 2D array
        int[][] matrix2 = {                        // initialization
            {1, 2, 3},
            {4, 5, 6}
        };

        // 3D array
        int[][][] cube = new int[2][2][2];
        cube[0][0][0] = 1;

        // Print values to show usage
        System.out.println("1D int array:");
        for (int n : nums2) System.out.print(n + " ");
        System.out.println();

        System.out.println("Double array:");
        for (double d : prices) System.out.print(d + " ");
        System.out.println();

        System.out.println("Char array:");
        for (char c : letters) System.out.print(c + " ");
        System.out.println();

        System.out.println("String array:");
        for (String s : names) System.out.print(s + " ");
        System.out.println();

        System.out.println("Boolean array:");
        for (boolean b : flags) System.out.print(b + " ");
        System.out.println();

        System.out.println("Object array:");
        for (Object o : mixed) System.out.print(o + " ");
        System.out.println();

        System.out.println("Custom object array:");
        for (Student s : students) System.out.println(s);

        System.out.println("2D array:");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("3D array value at [0][0][0]: " + cube[0][0][0]);
    }
}
