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

// ���������л���ʱ�򣬸ö������õ�ʵ������Ҳ�ᱻ���л������б����õĶ���Ҳ�ᱻ���л���������Щ���������Զ����е�
// ��������ǿ����л��ģ���ô����һ��Ҳ�ǿ����л���
// ��������ǲ������л��ģ���������ǿ����л��ģ�����������µ����౻��ԭ��ʱ�򣬸���Ĺ��캯����������µĶ���һ��ִ�С�