package com.text.lianxi.青青积分;

public class Menber {
    private String name;//姓名
    private int id; //编号
    private String pass ;//账号
    private int score; //积分
    private  String data; //日期


    public Menber() {
    }

    @Override
    public String toString() {
        return "Menber{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", pass='" + pass + '\'' +
                ", score=" + score +
                ", data='" + data + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Menber(String name, int id, String pass, int score, String data) {
        this.name = name;
        this.id = id;
        this.pass = pass;
        this.score = score;
        this.data = data;
    }

    public Menber(String name, int id, String pass, int score) {
        this.name = name;
        this.id = id;
        this.pass = pass;
        this.score = score;
    }
}
