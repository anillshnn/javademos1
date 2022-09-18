public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] sayilar = new int[]{1,2,5,7,9};
        int aranacak = 6;
        boolean varMı = false;

        for(int sayi:sayilar){
            if(sayi == aranacak){
                varMı= true;
                break;
            }
        }
        if(varMı){
            System.out.println("Sayi vardır");
        }else{
            System.out.println("Sayi yoktur");
        }
    }
}
