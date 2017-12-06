package com.mb.mp;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.InflaterInputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.exception.MyException;

/**
 * 
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> mybatis
* <br><b>PackageName:</b> org.mybatis.first
* <br><b>ClassName:</b>SqlSessionFactory.java
* <br><b>Date:</b> 2017年12月5日 下午4:11:05
 */
public class SqlSessionFactoryDemo {
	private static  SqlSessionFactory factory = null;
	
	/**
	 * 创建sqlSessionFactory
	* <b>Description:</b><br> 
	* @param resource
	* @return
	* @throws Exception
	* @Exception 
	* @Note
	* <b>userName:Peng Xuehui</b><br>
	* <br><b>Date:</b> 2017年12月5日 下午4:41:24
	* <br><b>Version:</b> 1.0
	 */
	public static  SqlSessionFactory createSqlSessionFactory(String resource) throws Exception{
		try {
			if(null == factory){
				if(null != resource && !"".equals(resource)){
					InputStream inputStream = Resources.getResourceAsStream(resource);
					factory = new SqlSessionFactoryBuilder().build(inputStream);
				}else{
					throw new MyException(-1, "参数为空");
				}
			}else{
				System.out.println("已经存在不需要创建");
			}
		} catch (IOException e) {
			throw new MyException(-2,e.getMessage());
		}
		return  factory;
		
	}

}
