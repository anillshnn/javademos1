public class Main {

    public static void main(String[] args) {
	// write your code here
        double[] mylist = {1.1,1.2,1.3,1.4};
        double total=0;
        double max= mylist[0];
        for (double number:mylist){
            if(max<number){
                max = number;
            }
            total = total+ number;
            System.out.println(number);
        }
        System.out.println("Toplam sayı:"+ total);
        System.out.println("Sayiların en buyugu"+ max);
    }
}
