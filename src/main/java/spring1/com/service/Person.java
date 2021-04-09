package spring1.com.service;

import spring1.com.tools.Axe;

public class Person {
    private Axe axe;

    public Person() {
//        System.out.println("person...");
    }

    public void init() {
        System.out.println("初始化");
    }

    public void destroy() {
        System.out.println("销毁");
    }

    public Person(Axe axe) {
        this.axe = axe;
    }

    public void setAxe(Axe axe) {
        this.axe = axe;
    }

    public void useAxe() {
        if (axe == null) {
            System.out.println("斧头不存在！");
            return;
        }
        axe.chop();
    }
}
