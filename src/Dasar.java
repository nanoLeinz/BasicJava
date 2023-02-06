import java.util.ArrayList;
import java.util.List;

public class Dasar {
    public static void main(String[] args) {
        sayMyName("nano", "leinz");
        sayMyName("niko", "leinz");
        System.out.println(div(10, 2));
        average("nano", 80, 30, 90, 90, 10, 10, 1000);
        faktorial(6);
        System.out.println(faktorialRecursive(0));
    }

    static void sayMyName(String first, String last) {
        System.out.println("I'm " + first + " " + last);
    }

    static Integer div(Integer val1, Integer val2) {
        return val1 / val2;
    }

    static void average(String name, Integer... nilai) {
        Integer total = 0;
        for (Integer val : nilai
        ) {
            total += val;
        }
        total /= nilai.length;
        System.out.println(total >= 70 ?
                "Selamat " + name + ", anda lulus dengan nilai : " + total :
                "Sayang sekali " + name + ", anda tidak lulus karena nilai anda : " + total);
    }

    static void faktorial(Integer n) {
        List<String> hasil = new ArrayList<String>();
        Integer result = 1;
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                hasil.add("Faktorial dari " + i + " : " + String.valueOf(i));
                continue;
            }
            result *= i;
            hasil.add("Faktorial dari " + i + " : " + String.valueOf(result));
        }
        System.out.println(hasil);
    }

    /**
     * Method Recursive untuk Faktorial
     * @param n angka yang akan dihitung
     * @return hasil faktorial dari angka
     */
    static Integer faktorialRecursive(Integer n){
        if (n == 0) return 0;
        if (n == 1) return 1;
        return n * faktorialRecursive(n - 1);
    }

}
