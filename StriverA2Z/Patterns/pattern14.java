public class pattern14 {
    // A
    // AB
    // ABC
    // ABCD
    // ABCDE
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (char j = 'A'; j <= 'A' + i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
