package 接口;

public class Cat extends Animal implements Jumping{

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void jump() {
        System.out.println("猫会跳");
    }
}
