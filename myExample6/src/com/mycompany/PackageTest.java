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
 * �����Ƽ���
 * 1. һ��Ҫ��֤����˽��
 * 2. һ��Ҫ�����ݳ�ʼ��
 * 3. ��Ҫ������ʹ�ù���Ļ�������
 * 4. �������е�����Ҫ����������������������
 * 5. ��ְ����������зֽ�
 * 6. �����ͷ�����Ӧ���ܹ��������ǵ�ְ��
 */