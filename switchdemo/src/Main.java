public class Main {

    public static void main(String[] args) {
	// write your code here

        char grade ='A';

        switch (grade){
            case 'A':
                System.out.println("Mükemmel: Gectiniz");
                break;
            case 'B':
                System.out.println("Cok güzel: Gectiniz");
                break;
            case 'C':
                System.out.println("İyi: Gectiniz");
                break;
            case 'D':
                System.out.println("Fena Degil: Gectiniz");
                break;
            case 'F':
                System.out.println("Maalesef: Kaldınız");
                break;
            default:
                System.out.println("Gecersiz not girdiniz");

        }
    }
}
