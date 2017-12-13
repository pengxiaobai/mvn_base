package com.entity;

import java.util.Comparator;

/**
 * @ProjectName: javaBase-demo
 * @Package: com.entity
 * @Description: Student entity
 * @Author: Peng Xuehui
 * @CreateDate: 2017/11/26 19:49
 * @UpdateUser: Peng XuehuiTT
 * @UpdateDate: 2017/11/26 19:49
 * @UpdateRemark: The modified content
 * @Version: 1.0
 */
public class Student implements Comparable<Student>,Comparator<Student> {
    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (id != student.id) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    /**
     *
     * @param s
     * @return
     */
    @Override
    public int compareTo(Student s) {
        return this.getName().compareTo(s.name);
    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getId()-o1.getId();
    }
}
