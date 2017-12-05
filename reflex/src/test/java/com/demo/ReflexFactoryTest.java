package com.demo;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import org.junit.Test;


/**
 * 
* <b>Description:反射测试类</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> reflex
* <br><b>PackageName:</b> com.demo
* <br><b>ClassName:</b>ReflexFactoryTest.java
* <br><b>Date:</b> 2017年12月4日 下午5:48:30
 */
public class ReflexFactoryTest {
	
	@Test
	public void testLoadClassByObject() {
		/**
		 * 反射有三种加载方式
		 * 1.new Obeject().getClass()  使用对象方法
		 * 2.Class.forName() 使用类加载器
		 * 3.xx.class //类名后面直接加class  
		 */
		String bagRotu = "com.demo.Student";
		try {
			//===================加载类==========
			
			Class clz = ReflexFactory.loadClassByRotu(bagRotu);
			//==================构造器==========
			//公共构造器
			Constructor<Student>[] constructors =  clz.getConstructors(); //获取的所有公共构造器
			System.out.println("打印所有公共构造器");
			for(Constructor<Student> constructor:constructors){
				System.out.println(constructor);
			}
			//所有构造器（包括私有构造器）
			Constructor<Student>[] constructors2 = clz.getDeclaredConstructors(); //获取所有构造器
			System.out.println("打印所有构造器（包括私有）");
			for(Constructor<Student> constructor:constructors2){
				System.out.println(constructor);
			}
			//获取指定公共构造器
			System.out.println("打印获取指定的公共构造器");
			Constructor<Student> constructor = clz.getConstructor(int.class,String.class);
			System.out.println(constructor);
			System.out.println("获取指定的私有构造器");
			Constructor<Student> constructor2 = clz.getDeclaredConstructor(int.class);
			System.out.println(constructor2);
			
			
			
			//=================初始化对象============
			//调用公共构造函数初始
			System.out.println("调用公共构造函数初始化");
			Student student = constructor.newInstance(1,"2");
			System.out.println(student);
			//调用私有构造函数初始化   注意一定要设置 Accessible为true
			System.out.println("调用使用函数初始化");
			constructor2.setAccessible(true);
			Student student2 = constructor2.newInstance(new Object[]{1});
			System.out.println(student2);
			
			//===================操作类成员=========
			//获取所有公共类型的类成员
			System.out.println("获取所有公共类型的类成员");
			Field[] fields =  clz.getFields();
			for(Field field:fields){
				if(field.getType() == int.class){
					System.out.println("我是int   "+field.getName());
				}
				System.out.print(field.getType()+"---"+field.getName()+" ");
			}
			//获取所有类型成员
			System.out.println("获取所有类成员");
			Field[] fields2 = clz.getDeclaredFields();
			for(Field field:fields2){
				if(field.getType() == int.class){
					System.out.println("我是int   "+field.getName());
				}
				System.out.println(Modifier.toString(field.getModifiers())+"------"+field.getType()+"---"+field.getName()+" ");
			}
			//对类私有成员赋值
			System.out.println("对私有的成员赋值:");
			fields[0].set(student,1111);
			System.out.println(fields[0].get(student));
			//获取指定成员
			Field field = clz.getField("id2");
			System.out.println("我是指定的成员:"+field.getName());
			//=============操作方法===============
			//获取所有公共的方法
			System.out.println("获取所有公共方法");
			Method[] methods = clz.getMethods();
			for(Method method:methods){
				System.out.println(Modifier.toString(method.getModifiers())+"--"+method.getName());
			}
			//获取所有方法（包括私有）
			Method[] methods2 = clz.getDeclaredMethods();
			System.out.println("获取所有方法（包括私有）");
			for(Method method:methods2){
				System.out.println(Modifier.toString(method.getModifiers())+"--"+method.getName());
			}
			//获取指定的方法
			System.out.println("获取指定的方法:");
			Method method = clz.getMethod("test1");
			/**
			 * 如果方法有返回值 则得到的是返回值
			 * 如果没有执行结果为空  可以这样执行一遍  method.invoke(student);
			 */
			Object result = method.invoke(student);
			System.out.println(result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


//	@Test
//	public void testLoadClassByRotu() {
//		fail("Not yet implemented");
//	}

}
