package org.spring.demo.bean.instantiation.other;
/**
* <b>Description:内部类测试</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> spring-demo
* <br><b>PackageName:</b> org.spring.demo.bean.instantiation.other
* <br><b>ClassName:</b> OutClass
* <br><b>Date:</b> 2017年12月23日 下午9:33:34
*/

public class OutClass {
	private InnerClasss innerClasss;
	private InnerClass1 innerClasss1;
	
	public void setInnerClasss(InnerClasss innerClasss) {
		this.innerClasss = innerClasss;
	}
	
	

	public void setInnerClasss1(InnerClass1 innerClasss1) {
		this.innerClasss1 = innerClasss1;
	}



	private static class InnerClasss{
		private int id;
		private String name;
		public void setId(int id) {
			this.id = id;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
			return "InnerClasss [id=" + id + ", name=" + name + "]";
		}
	}

	public class InnerClass1{
		public void say(){
			System.out.println("我是非静态的内部类");
		}
	}
	
	public void say(){
		System.out.println(innerClasss);
	}
	
	public void say1(){
		innerClasss1.say();
	}
}
