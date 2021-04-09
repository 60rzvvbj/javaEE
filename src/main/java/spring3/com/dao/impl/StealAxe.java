package spring3.com.dao.impl;

import spring3.com.dao.Axe;

public class StealAxe implements Axe {
    @Override
    public void chop() {
        System.out.println("用钢斧砍柴");
    }
}
