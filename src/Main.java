/*
 *@Author Emircan Aktaş - 28.Dec.2022
 */
public class Main {
    public static void main(String[] args) {
        System.out.print("Prime Numbers : ");
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {

                System.out.print(i + ",");
            }

        }
        System.out.print("Stop.");
    }
}