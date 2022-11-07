package 接口;

public class Dog extends Animal implements Jumping{
    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }

    @Override
    public void jump() {
        System.out.println("狗会跳");
    }
}
