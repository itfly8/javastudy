package com.itfly8.slf4jtest;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jTest {
	final static Logger LOGGER = LoggerFactory.getLogger(Slf4jTest.class);

	@Test
	public void initTest() {
		LOGGER.error("slf4j日志打印");
	}

	public static void main(String[] args) {
		LOGGER.error("slf4j日志打印");
	}
}