public class Main {

    public static void main(String[] args) {
	// write your code here
        int sayi = topla(1,3);
        System.out.println(sayi);
        int toplam1;
        toplam1 = topla2(1,3,5,4);
        System.out.println(toplam1);
        System.out.println(mesajVer());

    }
    public static int topla(int sayi1, int sayi2){
        return sayi1 + sayi2;
    }
    public static int topla2(int... sayilar){
        int toplam = 0;
        for(int sayi:sayilar){
            toplam = toplam + sayi;
        }
        return toplam;
    }
    public static String mesajVer(){
        return "Ankara";
    }
}
