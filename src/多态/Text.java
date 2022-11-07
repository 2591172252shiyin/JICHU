package 多态;
/*
运行测试类
 */
public  class Text {
    public static void main(String[] args) {
        Play p = new Play();

        Dog d = new Dog();
        p.use(d);

        Cat c =new Cat();
        p.use(c);
    }
}
