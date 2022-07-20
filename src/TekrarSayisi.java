import java.util.Arrays;

public class TekrarSayisi {
    public static void main(String[] args) {
        int[] dizi = {20, 45, 67, 23, 20, 20, 53, 23, 42, 53};
        int[] tkrr = new int[dizi.length];

        for (int i = 0; i < dizi.length; i++) {
            tkrr[i] = 1;
        }
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if ((i != j) && (dizi[i] == dizi[j])) {
                    tkrr[i]++;
                }
            }
        }
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if ((i != j) && (dizi[i] == dizi[j])) {
                    dizi[j] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(dizi));
        for (int i = 0; i < dizi.length; i++) {
            if (tkrr[i] > 1){
                if(dizi[i] != 0)
                    System.out.println(dizi[i] + " sayisi " + tkrr[i] + " defa tekrar edildi.");
            }
        }
    }
}