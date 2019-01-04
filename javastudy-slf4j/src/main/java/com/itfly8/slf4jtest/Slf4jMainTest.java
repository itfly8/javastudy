package com.itfly8.slf4jtest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jMainTest {

	final static Logger LOGGER = LoggerFactory.getLogger(Slf4jMainTest.class);

	public static void main(String[] args) {
		LOGGER.info("logback + slf4j starting up ...");
		LOGGER.error("测试error");
	}
}