package sertest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by tenghuanhe on 2015/10/21.
 */
public class SerTest {

    public static void main(String[] args) {
        Box myBox = new Box();
        myBox.setHeight(10);
        myBox.setWidth(20);

        try {
            FileOutputStream fs = new FileOutputStream("foo.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(myBox);
            os.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

// 当对象被序列化的时候，该对象引用的实例变量也会被序列化，所有被引用的对象也会被序列化，而且这些操作都是自动进行的
// 父类如果是可序列化的，那么子类一定也是可序列化的
// 父类如果是不可序列化的，子类可以是可序列化的，在这种情况下当子类被还原的时候，父类的构造函数会跟创建新的对象一样执行。