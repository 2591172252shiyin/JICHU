package 内部类;

public class Text {

    public static void main(String[] args) {
        //调用内部类(public)修饰
        IN.small is = new IN().new small();
        is.show();

        System.out.println("------------------");

        //调用内部类（private）修饰
        IN i = new IN();
        i.nicai();
    }
}
