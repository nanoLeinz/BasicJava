public class Dasar {
    public static void main(String[] args) {
        sayMyName("nano", "leinz");
        sayMyName("niko", "leinz");
        System.out.println(div(10, 2));
        average("nano",80,30,90,90,10,10,1000);
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



}
