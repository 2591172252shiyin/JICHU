package 多态;

import groovy.transform.ASTTest;

/*
操作类
 */
public class Play {
    //必须传参 无参会报错
    public void use(Animal a){
        a.eat();
    }
}
