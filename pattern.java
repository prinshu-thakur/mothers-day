class pattern {
    public static void main(String[] args) {
        for (int i = 10; i; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("@");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
