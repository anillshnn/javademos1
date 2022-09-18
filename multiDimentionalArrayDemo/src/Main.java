public class Main {

    public static void main(String[] args) {
	// write your code here
        String[][] sehirler = new String[3][3];

        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Edirne";
        sehirler[0][1] = "Kırklareli";
        sehirler[1][0] = "İzmir";
        sehirler[1][1] = "Denizli";
        sehirler[1][2] = "Muğla";
        sehirler[2][0] = "Ankara";
        sehirler[2][1] = "Konya";
        sehirler[2][2] = "Kayseri";

        for(int i=0; i<=2; i++){
            System.out.println("-----------------------");
            for(int j=0; j<=2; j++){
                System.out.println(sehirler[i][j]);
            }
        }

    }
}
