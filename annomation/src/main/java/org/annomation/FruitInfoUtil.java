package org.annomation;

import java.lang.reflect.Field;
import java.security.DigestException;

/**
 * 
* <b>Description:注解处理器</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> annomation
* <br><b>PackageName:</b> org.annomation
* <br><b>ClassName:</b>FruitInfoUtil.java
* <br><b>Date:</b> 2017年12月5日 下午2:45:38
 */
public class FruitInfoUtil {
	
	public  static void  getFruitInfo(Class<?> clz){
		String strFruitName = "水果名称:";
		String strFruitColor = "水果颜色:";
		String strFruitProvicer = "供应商信息:";
		
		//通过凡是获取属性
		Field[] fields = clz.getDeclaredFields();
		
		for(Field field:fields){
			if(field.isAnnotationPresent(FruitName.class)){
				FruitName fruitName = (FruitName)field.getAnnotation(FruitName.class);
				strFruitName += fruitName.value();
				System.out.println(strFruitName);
			}else if(field.isAnnotationPresent(FruitColor.class)){
				FruitColor fruitColor = (FruitColor)field.getAnnotation(FruitColor.class);
				strFruitColor += fruitColor.fruitColor().toString();
				System.out.println(strFruitColor);
			}else if(field.isAnnotationPresent(FruitProvider.class)){
				FruitProvider fruitProvider = (FruitProvider)field.getAnnotation(FruitProvider.class);
				strFruitProvicer += "供应编号:"+fruitProvider.id()+",供应商名称:"+fruitProvider.name()+",供应商地址:"+fruitProvider.address();
				System.err.println(strFruitProvicer);
			}
		}
	}
}
