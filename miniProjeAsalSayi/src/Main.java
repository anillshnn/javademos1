public class Main {

    public static void main(String[] args) {
	// write your code here
        int number = 3;
        boolean isPrime = true;


        if(number == 1){
            System.out.println("Sayi asaldir");
            return;
        }
        if(number<1){
            System.out.println("Gecersiz sayi girdiniz");
        }
        for(int i=2; i<number; i++){
            if(number % i == 0){
                isPrime = false;
            }
        }
        if(isPrime){
            System.out.println("Sayi asaldir");

        }
        else{
            System.out.println("Sayi asal degildir.");
        }


    }
}
