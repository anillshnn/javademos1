public class Main {

    public static void main(String[] args) {
        // For

        for (int i = 2; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("For Dongu bitti");
        // While
        int i= 2;
        while (i<10){
            System.out.println(i);
            i++;
        }
        System.out.println("While Dongu bitti");

        //do while dongusunde while kosutu saglanmasa bile do içeriği bir kez yapılır.
        int j =1;
        do {
            System.out.println(j);
            j+=2;
        }while (j<10);
        System.out.println("Do-While dongusu bitti");
    }
}
