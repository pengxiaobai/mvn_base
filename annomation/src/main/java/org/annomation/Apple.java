package org.annomation;

import org.annomation.FruitColor.Color;

/**
 * 
* <b>Description:注解使用</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> annomation
* <br><b>PackageName:</b> org.annomation
* <br><b>ClassName:</b>Apple.java
* <br><b>Date:</b> 2017年12月5日 下午2:39:32
 */
public class Apple {
	
	/**
	 * 水果名称
	 */
	@FruitName("Apple")
	private String appleName;
	
	/**
	 * 水果属性
	 */
	@FruitColor(fruitColor=Color.RED)
	public String appleColor;
	
	/**
	 * 水果提供商
	 */
	@FruitProvider(id=1,name="陕西红富士集团",address="陕西省西安市延安路89号红富士大厦")
	private String aapleProvide;

	public String getAppleName() {
		return appleName;
	}

	public void setAppleName(String appleName) {
		this.appleName = appleName;
	}

	public String getAppleColor() {
		return appleColor;
	}

	public void setAppleColor(String appleColor) {
		this.appleColor = appleColor;
	}

	public String getAapleProvide() {
		return aapleProvide;
	}

	public void setAapleProvide(String aapleProvide) {
		this.aapleProvide = aapleProvide;
	}
	
	
}
