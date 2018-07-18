package com.iluwatar.singleton.ignore;

/**
 * @description:
 * @author: MoXingwang 2018-07-18 14:45
 **/
public class StaticClassTest {
    static {
        System.out.println("outer static block");
    }

    public static void main(String[] args) {
        System.out.println("outer");

        //验证内部类的加载顺序和机制
        StaticClassTest.Inner.getInner();
    }

    public static final class Inner {
        public static Inner getInner() {
            System.out.println("init a inner");
            return new Inner();
        }

        static {
            System.out.println("inner static block");
        }
    }

}
