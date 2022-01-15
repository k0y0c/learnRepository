package cn.itcast.day11.demo06;

public class Weapon {
    private String name;    //武器名字
    private int code;    //武器代号

    public Weapon() {
    }

    public Weapon(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
