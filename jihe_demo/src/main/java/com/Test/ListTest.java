package com.Test;

import com.entity.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @ProjectName: javaBase-demo
 * @Package: com.Test
 * @Description: List test
 * @Author: Peng Xuehui
 * @CreateDate: 2017/11/26 19:55
 * @UpdateUser: Peng Xuehui
 * @UpdateDate: 2017/11/26 19:55
 * @UpdateRemark: Te modified contenth
 * @Version: 1.0
 */
public class ListTest {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();
        Student stu = new Student();
        stu.setId(1);
        stu.setName("小米");
//        System.out.println(stu.toString());
        stu.setId(2);
        stu.setName("小王");
//        System.out.println(stu.toString());
        studentList.add(stu);
        stu = new Student();
        stu.setId(3);
        stu.setName("小王1");
        studentList.add(stu);

        //迭代器
        Iterator<Student> iterator = studentList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
