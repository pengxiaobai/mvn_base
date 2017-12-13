package com.Test;

import com.entity.Student;
import com.entity.Student1;

import java.util.*;

/**
 * @ProjectName: javaBase-demo
 * @Package: com.Test
 * @Description: Map test
 * @Author: Peng Xuehui
 * @CreateDate: 2017/11/26 21:47
 * @UpdateUser: Peng Xuehui
 * @UpdateDate: 2017/11/26 21:47
 * @UpdateRemark: The modified content
 * @Version: 1.0
 */
public class MapTest {

    public static void main(String[] args) {
        Map<Integer,Student1> map1 = new HashMap<Integer,Student1>();

        Student1 student = new Student1();
        student.setId(1);
        student.setName("小米");
        map1.put(1,student);
        map1.put(2,null);
        map1.put(3,student);
        map1.put(null,null);
        student = new Student1();
        student.setName("小王2");
        student.setId(2);
        map1.put(-1,student);
        student = new Student1();
        student.setId(3);
        student.setName("小王3");
        map1.put(2,student);
        //遍历
        Iterator<Integer> iterator = map1.keySet().iterator();
        Integer key = 0;
        while (iterator.hasNext()){
            key = iterator.next();
            System.out.println("键:"+key+"===="+map1.get(key));
        }


        System.out.println("=======TreeMap===============");
        Map<Integer,Student1> map2 = new TreeMap<Integer, Student1>();
        Student1 student2 = new Student1();
        student2.setId(1);
        student2.setName("小王");
        map2.put(1,student2);
        map2.put(2,null);
        map2.put(3,null);
        student2 = new Student1();
        student2.setId(0);
        student2.setName("小王");
        map2.put(-1,student2);
        Iterator<Integer> iterator1 = map2.keySet().iterator();
        while(iterator1.hasNext()){
            key = iterator1.next();
            System.out.println("键:"+key+"===="+map2.get(key));
        }

        System.out.println("=========LinkedHashMap==========");
        Map<Integer,Student1> map3 = new LinkedHashMap<Integer, Student1>();
        Student1 student3 = new Student1();
        student3.setId(1);
        student3.setName("小王");

        map3.put(0,null);
        map3.put(1,student3);
        student3 = new Student1();
        student3.setId(2);
        student3.setName("小王2");
        map3.put(-2,student3);

        iterator = map3.keySet().iterator();
        while(iterator.hasNext()){
            key = iterator.next();
            System.out.println("键:"+key+"===="+map3.get(key));
        }



    }
}
