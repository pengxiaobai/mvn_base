package com.Test;

import com.entity.Student;

import java.util.*;

/**
 * @ProjectName: javaBase-demo
 * @Package: com.Test
 * @Description: Set Tet
 * @Author: Peng Xuehui
 * @CreateDate: 2017/11/26 20:10
 * @UpdateUser: Peng Xuehui
 * @UpdateDate: 2017/11/26 20:10
 * @UpdateRemark: The modified content
 * @Version: 1.0
 */
public class SetTest {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<Student>();
        Student student = new Student();
        student.setName("小王1");
        student.setId(1);
        set.add(student);
        student = new Student();
        student.setName("小王2");
        student.setId(2);
        set.add(student);
        student = new Student();
        student.setName("0");
        student.setId(0);
        set.add(student);

        //迭代器
        Iterator<Student> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("==========linkhashset===============");
        //LinkHashSet
        Set<Student> set1 = new LinkedHashSet<Student>();
        set1.add(null);
        Student student1 = new Student();
        student1.setName("小王1");
        student1.setId(1);
        set1.add(student1);
        student1 = new Student();
        student1.setName("小王2");
        student1.setId(2);
        set1.add(student1);
        student1 = new Student();
        student1.setName("0");
        student1.setId(0);
        set1.add(student1);

        Iterator<Student> iterator1 = set1.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        Set<Student> set2 = new TreeSet<Student>();
        Student student2 = new Student();
        student2.setId(0);
        student2.setName("小王0");
        set2.add(student2);
        student2 = new Student();
        student2.setId(1);
        student2.setName("小王1");
        set2.add(student2);
        student2 = new Student();
        student2.setId(2);
        student2.setName("小王-1");
        set2.add(student2);
        System.out.println("长度："+set2.size());
        System.out.println("==============TreeSet==============");
        iterator = set2.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
