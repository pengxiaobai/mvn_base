/**
 *
 * @Time:2017年11月30日  下午2:06:10
 * @UserName:Peng Xh
 * @Todo:TODO
 */
package com.demo;

/**
 * 
* <b>Description:学生测试实体类</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> java_base
* <br><b>PackageName:</b> com.pxh.reflex
* <br><b>ClassName:</b> Student
* <br><b>Date:</b> 2017年11月30日 下午9:28:41
 */
public class Student {
	private int id; 
	private String name;
	
	public int id1;
	public String name1;
	
	public static int id2;
	public static String name2;
	
	@SuppressWarnings("unused")
	private static int id3;
	@SuppressWarnings("unused")
	private static String name3;
	
	/**
	 * 
	* <b>Description:Non parameters construct</b><br> 
	* @Note
	* <b>userName:Peng Xuehui</b><br>
	* <br><b>Date:</b> 2017年11月30日 下午9:29:50
	* <br><b>Version:</b> 1.0
	 */
	public Student() {}

	

	/**
	 * 
	* <b>Description:One parameters construct</b><br> 
	* @param id
	* @Note
	* <b>userName:Peng Xuehui</b><br>
	* <br><b>Date:</b> 2017年11月30日 下午9:30:16
	* <br><b>Version:</b> 1.0
	 */
	@SuppressWarnings("unused")
	private Student(int id) {
		super();
		this.id = id;
	}


	/**
	 * 
	* <b>Description:Tow parameters construction</b><br> 
	* @param id
	* @param name
	* @Note
	* <b>userName:Peng Xuehui</b><br>
	* <br><b>Date:</b> 2017年11月30日 下午9:30:30
	* <br><b>Version:</b> 1.0
	 */
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	
	public void test1(){
		System.out.println("public void test1 method");
	}
	
	@SuppressWarnings("unused")
	private void test2(){}
	
	@SuppressWarnings("unused")
	private static String test3(){
		return "private static String test3 method";
	}
	
	public static String test4(){
		return "public static String test4 method";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
}
