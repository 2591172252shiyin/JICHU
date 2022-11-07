package 泛型;

public class Text01 {
    public static void main(String[] args) {
        Generic g = new Generic();
//        g.setT(20);
//        g.setT("还是感觉");
//        g.setT(true);
//        System.out.println(g.getT());
        g.show(30);
        g.show("是个大");
        g.show(true);

       GenericIMP<String> a = new aaa<String>();
       a.show("45");

    }
}
