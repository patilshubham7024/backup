package org.maven.apache.Log4j;
import org.apache.log4j.Logger;

public class Log4jTest {
	static final Logger LOGGER = Logger.getLogger("");
	public static void main(String[] args) {
		LOGGER.info("Info");
	}
}