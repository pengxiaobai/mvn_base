package com.demo;

import org.exception.MyException;

/**
 * 
* <b>Description:反射实体类</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> java_base
* <br><b>PackageName:</b> com.pxh.reflex
* <br><b>ClassName:</b> ReflexFactory
* <br><b>Date:</b> 2017年11月30日 下午9:31:16
 */
public class ReflexFactory {
	
	/**
	 * 
	* <b>Description:根据对象返回类加载信息</b><br> 
	* @param t
	* @return
	* @throws Exception
	* @Note
	* <b>userName:Peng Xuehui</b><br>
	* <br><b>Date:</b> 2017年11月30日 下午9:31:43
	* <br><b>Version:</b> 1.0
	 */
	@SuppressWarnings("rawtypes")
	public static <T> Class loadClassByObject(T t)throws Exception{
		Class clz = null;
		//判断是否为空
		if(null != t){
			clz = t.getClass();
		}else{
			throw new MyException(-1, "参数为空");
		}
		return  clz;
	}
	
	/**
	 * 
	* <b>Description:根据带包路径类加载</b><br> 
	* @param bagRotu
	* @return
	* @throws Exception
	* @Note
	* <b>userName:Peng Xuehui</b><br>
	* <br><b>Date:</b> 2017年11月30日 下午9:32:15
	* <br><b>Version:</b> 1.0
	 */
	@SuppressWarnings("rawtypes")
	public static Class loadClassByRotu(String bagRotu)throws Exception{
		Class clz = null;
		if(null != bagRotu && !"".equals(bagRotu)){
			clz = Class.forName(bagRotu);
		}else{
			throw new MyException(-1, "参数为空");
		}
		return clz;
	}
	
}
