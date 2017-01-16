package db.tool.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ModelFactoryUtil {

	private static final Logger logger = LoggerFactory.getLogger(ModelFactoryUtil.class);
	
	public int insertNumber(int number){
		
		logger.info("batchInsert : [{}] ", number);
		
		return number;
	}
}
