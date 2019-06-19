package com.common.support;

import java.text.ParseException;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.convert.converter.Converter;

public class StringToDateConverter implements Converter {

	private static Logger logger = LoggerFactory.getLogger("StringToDateConverter");
	private static final String parsePatterns[] = {"yyyy-MM-dd",
			"yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm", "yyyy-MM-dd HH",
			"yyyy/MM/dd", "yyyy/MM/dd HH:mm:ss", "yyyy/MM/dd HH:mm",
			"yyyy/MM/dd HH", "yyyy-MM-dd HH:mm:ss.SSS"};
	

	public Date convert(String str) throws ParseException
    {
		if(str == null || str.trim().equals(""))
            return null;
        return DateUtils.parseDate(str, parsePatterns);
    }
	
	@Override
	public  Object convert(Object obj) {
		Object object = null;
		try {
			 object =convert((String) obj);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return object;
	}

}