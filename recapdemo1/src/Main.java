public class Main {

    public static void main(String[] args) {
	// write your code here
        int sayi1 = 25;
        int sayi2 = 30;
        int sayi3 = 3;
        int enBuyuk = sayi1;
        if(enBuyuk<sayi2){
            enBuyuk = sayi2;
        }
        if(enBuyuk<sayi3){
            enBuyuk = sayi3;
        }
        System.out.println("En buyuk sayi:"+enBuyuk);
    }
}
