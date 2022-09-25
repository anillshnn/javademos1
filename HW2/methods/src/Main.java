public class Main {

    public static void main(String[] args) {
	// write your code here
        sayiBulmaca();
    }
    public static void sayiBulmaca(){

        int[] sayilar = new int[]{1,2,5,7,9,0};
        int aranacak = 6;
        boolean varMi = false;

        for(int sayi:sayilar){
            if(sayi == aranacak){
                varMi = true;
                break;
            }
        }
        String mesaj ="";
        if (varMi){
            mesaj = "Sayi vardir:" + aranacak;
            mesajYazma(mesaj);
        }
        else {
            mesaj = "Sayi yoktur:" + aranacak;
            mesajYazma(mesaj);
        }
    }
    public static void mesajYazma(String mesaj){
        System.out.println(mesaj);
    }
}
