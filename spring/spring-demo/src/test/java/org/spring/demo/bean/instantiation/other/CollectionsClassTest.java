package org.spring.demo.bean.instantiation.other;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> spring-demo
* <br><b>PackageName:</b> org.spring.demo.bean.instantiation.other
* <br><b>ClassName:</b> CollectionsClassTest
* <br><b>Date:</b> 2017年12月24日 下午5:51:34
*/

public class CollectionsClassTest {
	private static String resourcePath = "istantiation/other/collections.xml";
	private static ApplicationContext applicationContext; 
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		applicationContext = 
				new ClassPathXmlApplicationContext(resourcePath);
	}

	
	/**
	 * 
	* <b>Description:list 集合测试</b><br> 
	* @Note
	* <b>userName:Peng Xuehui</b><br>
	* <br><b>Date:</b> 2017年12月24日 下午6:07:33
	* <br><b>Version:</b> 1.0
	 */
	@Test
	public void listTest() {
		CollectionsClass collectionsClass = applicationContext.getBean("collectionsList",CollectionsClass.class);
		List list = collectionsClass.getList();
		for(int i=0; i < list.size(); i++){
			System.out.println(list.get(i));
		}
	}
	
	/**
	 * 
	* <b>Description:set集合测试</b><br> 
	* @Note
	* <b>userName:Peng Xuehui</b><br>
	* <br><b>Date:</b> 2017年12月24日 下午6:42:10
	* <br><b>Version:</b> 1.0
	 */
	@Test
	public void setTest(){
		CollectionsClass collectionsClass = 
				applicationContext.getBean("collectionsSet",CollectionsClass.class);
		Set set = collectionsClass.getSet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
	
	
	/**
	 * 
	* <b>Description:map集合测试</b><br> 
	* @Note
	* <b>userName:Peng Xuehui</b><br>
	* <br><b>Date:</b> 2017年12月24日 下午6:48:44
	* <br><b>Version:</b> 1.0
	 */
	@Test
	public void mapTest(){
		CollectionsClass collectionsClass = 
				applicationContext.getBean("collectionsMap",CollectionsClass.class);
		Map map = collectionsClass.getMap();
		System.out.println(map.get("map1"));
		System.out.println(map.get("map2"));
	}
	
	
	/**
	 * 
	* <b>Description:properties测试</b><br> 
	* @Note
	* <b>userName:Peng Xuehui</b><br>
	* <br><b>Date:</b> 2017年12月24日 下午6:50:33
	* <br><b>Version:</b> 1.0
	 */
	@Test
	public void propertiesTest(){
		CollectionsClass collectionsClass =
				applicationContext.getBean("properties",CollectionsClass.class);
		
		Properties properties = collectionsClass.getProperties();
		System.out.println(properties.get("props1"));
		System.out.println(properties.get("props2"));
		System.out.println(properties.get("props3"));
	}
	
	/**
	 * 
	* <b>Description:集合合并测试</b><br> 
	* @Note
	* <b>userName:Peng Xuehui</b><br>
	* <br><b>Date:</b> 2017年12月24日 下午7:27:54
	* <br><b>Version:</b> 1.0
	 */
	@Test
	public void collectionMergingTest(){
		CollectionsClass collectionsClass
			= applicationContext.getBean("child",CollectionsClass.class);
		Properties properties = collectionsClass.getProperties();
		System.out.println(properties.get("props1"));
		System.out.println(properties.get("props2"));
		System.out.println(properties.get("props3"));
		System.out.println(properties.get("props4"));
	}
	
}
