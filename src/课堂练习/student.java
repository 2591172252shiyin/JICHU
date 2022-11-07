package 课堂练习;

import java.util.Arrays;
import java.util.Scanner;

public class student {
    private String name;
    private String vx;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length()<=3){
            this.name = name;
        }else{
            this.name ="结婚的";
        }

    }

    public String getVx() {
        return vx;
    }

    public void setVx(String vx) {
        if (vx.length()<=8){
            this.vx = vx;
        }else{
            this.vx="hsajdh";
        }

    }
}
