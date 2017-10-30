class Example2 {
    public static void main (String[] args) {
        printStar(5);
    }

    public static void printStar(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <2*size; j++) {
                int k = 2.5*i < 2*size ? i : 0;
                if (j==(int)(2.5*k) || (int)(2.5*k) + j == (2*size-1)) {
                    System.out.print("|");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();            
        }
    }
}