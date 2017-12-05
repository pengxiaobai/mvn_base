package org.log;
/**
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> java_base
* <br><b>PackageName:</b> com.pxh.log
* <br><b>ClassName:</b> Bar
* <br><b>Date:</b> 2017年12月2日 下午8:07:19
*/

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Bar {
	private final Logger logger = LogManager.getLogger(Bar.class.getName());

    @SuppressWarnings("deprecation")
	public boolean doIt(){
		logger.entry();
		logger.error("Did it again!");
		return logger.exit(false);
	}
}
