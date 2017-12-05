package org.annomation;

import junit.framework.TestCase;

/**
 * 
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> annomation
* <br><b>PackageName:</b> org.annomation
* <br><b>ClassName:</b>FruitInfoUtilTest.java
* <br><b>Date:</b> 2017年12月5日 下午3:09:16
 */
public class FruitInfoUtilTest extends TestCase {

	/**
	 * Test method for {@link org.annomation.FruitInfoUtil#getFruitInfo(java.lang.Class)}.
	 */
	public void testGetFruitInfo() {
		FruitInfoUtil.getFruitInfo(Apple.class);
	}

}
