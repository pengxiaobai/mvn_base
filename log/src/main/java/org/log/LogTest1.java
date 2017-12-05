package org.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
* <b>Description:</b><br> 
* <b>@userName:Peng Xuehui<b><br>
* @version 1.0
* @Note
* <b>ProjectName:</b> java_base
* <br><b>PackageName:</b> com.pxh.log
* <br><b>ClassName:</b> LogTest1
* <br><b>Date:</b> 2017年12月2日 下午3:42:51
*/

public class LogTest1 {

	public static void main(String[] args) {

		Logger logger = LogManager.getLogger(LogTest1.class);
		logger.trace("Entering application");
		Bar bar = new Bar();
		if(!bar.doIt()){
			logger.error("Didn't do it");
		}
		logger.trace("Exting application");
		
	}

}
