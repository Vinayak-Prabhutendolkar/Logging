package com.vins.logging.onstartup;

import org.apache.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Onstartup implements CommandLineRunner {

	private static final Logger LOGGER = Logger.getLogger(Onstartup.class);

	@Override
	public void run(String... args) throws Exception {

		LOGGER.info("Entered into Onstartup process: INFO");
		LOGGER.error("Entered into Onstartup process: ERROR");
		LOGGER.debug("Entered into Onstartup process: {}");
		LOGGER.trace("Entered into Onstartup process: TRACE");
		LOGGER.warn("Entered into Onstartup process: WARN");
		LOGGER.fatal("Entered into Onstartup process: FATAL");

	}

}
