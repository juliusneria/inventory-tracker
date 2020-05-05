package com.system.inventorytracker;

import com.system.inventorytracker.config.ApplicationProperties;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class InventoryTrackerSystemApplicationTests {

	final static Logger logger = Logger.getLogger(InventoryTrackerSystemApplicationTests.class);
	@Test
	void contextLoads() {
		ApplicationProperties properties = new ApplicationProperties();
		logger.debug(properties.toString());
	}

}
