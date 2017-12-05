package org.annomation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
* <b>Description:水果供应者注解</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> annomation
* <br><b>PackageName:</b> org.annomation
* <br><b>ClassName:</b>FruitProvider.java
* <br><b>Date:</b> 2017年12月5日 下午2:36:55
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitProvider {

	/**
	 * 供应商编号
	 */
	public int id() default -1;
	
	/**
	 * 供应商名称
	 */
	public String name() default "";
	
	/**
	 * 供应商地址
	 */
	public String address() default "";
}
