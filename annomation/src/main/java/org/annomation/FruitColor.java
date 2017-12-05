package org.annomation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
* <b>Description:水果颜色注解</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> annomation
* <br><b>PackageName:</b> org.annomation
* <br><b>ClassName:</b>FruitColor.java
* <br><b>Date:</b> 2017年12月5日 下午2:30:13
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitColor {
	
	/**
	 * 颜色枚举
	 */
	public enum Color{BULE,RED,GREEN};
	
	/**
	 * 颜色属性
	 */
	Color fruitColor() default Color.GREEN;
}
