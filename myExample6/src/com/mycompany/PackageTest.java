package com.mycompany;
/**
 * Created by tenghuanhe on 2015/10/16.
 */

import com.tenghuanhe.corejava.*;

import java.awt.*;

import static java.lang.System.*;

public class PackageTest {
    public static void main(String[] args) {
        Employee harry = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        harry.raiseSalary(5);

        out.println("name=" + harry.getName() + ",salary=" + harry.getSalary());

    }
}

/**
 * 类的设计技巧
 * 1. 一定要保证数据私有
 * 2. 一定要对数据初始化
 * 3. 不要在类中使用过多的基本类型
 * 4. 不是所有的域都需要独立的域访问器和域更改器
 * 5. 将职责过多的类进行分解
 * 6. 类名和方法名应该能够体现他们的职责
 */