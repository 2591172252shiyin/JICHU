package 接口;

public class Text {
    public static void main(String[] args) {
           Jumping j = new Cat();
           j.jump();

        Animal a = new Cat();
        a.setAge(10);
        a.setName("小余");
        System.out.println(a.getName()+"--"+a.getAge());
        a.eat();
    }
}
