package test;

/**
 * Created by Administrator on 2015/10/23.
 */
public class TestObj {
    public static void main(String[] args) {
        Object o = new Object() {
            @Override
            public boolean equals(Object obj) {
                return true;
            }
        };


        MyName name1 = new MyName("Tenghuanhe");
        MyName name2 = new MyName("Tenghuanhe");
        MyName name3 = new MyName("ShufangHong") {
            @Override
            public boolean equals(MyName mn) {
                return true;
            }
        };

        System.out.println(name1.equals(name2));
        System.out.println(name3.equals(name1));


    }
}

class MyName {
    private String name;

    public MyName(String name) {
        this.name = name;
    }

    public boolean equals(MyName mn) {
        return this.name.equals(mn.getName());
    }

    public String getName() {
        return this.name;
    }

}
