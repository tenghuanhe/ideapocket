package statictest;

/**
 * Created by tenghuanhe on 2015/10/21.
 */
public class StaticTests extends StaticSuper {
    static int rand;

    static {
        rand = (int) (Math.random() * 6);
        System.out.println("static block " + rand);
    }

    StaticTests() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        System.out.println("in main");
        StaticTests st = new StaticTests();
    }
}

// 加载一个类的时候
// 首先是父类静态加载去
// 子类静态加载区
// 父类构造器
// 子类构造器

// 这也符合了一个原则，先有类然后才能够有对象
// 静态变量属于类，在类加载的时候就会对这些变量进行初始化
// 而构造函数则是用于产生对象的，是和具体的对象关联在一起的

// 构造函数不可以被标记为静态的
