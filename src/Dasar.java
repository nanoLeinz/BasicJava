public class Dasar {
    public static void main(String[] args) {
        sayMyName("nano", "leinz");
        sayMyName("niko", "leinz");
        System.out.println(div(10,2));
    }

    static void sayMyName(String first, String last){
        System.out.println("I'm "+first+" "+last);
    }

    static Integer div(Integer val1,Integer val2){
        return val1 / val2;
    }

}
