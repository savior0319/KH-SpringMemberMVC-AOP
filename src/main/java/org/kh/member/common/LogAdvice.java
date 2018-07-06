package org.kh.member.common;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAdvice {

	private String timeNow;

	public LogAdvice() {

	}

	public void printLog() {
		timeNow = time();
		System.out.println(timeNow + " [공통로그 - LogAdvice] : 비즈니스 로직 수행 전 로그");
	}

	public void printTransactionLog() {
		timeNow = time();
		System.out.println(timeNow + " [트랜잭션 로그 - LogAdvice] : 트랜잭션 처리 로그");
	}

	public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable {
		timeNow = time();
		System.out.println(timeNow + " [BEFORE] : 비즈니스 메소드 수행 전 로그");
		Object returnObj = pjp.proceed();
		System.out.println(timeNow + " [AFTER] : 비즈니스 메소드 수행 후 로그");
		return returnObj;
	}

	public String time() {
		long time = System.currentTimeMillis();
		SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
		timeNow = dayTime.format(new Date(time));
		return timeNow;
	}
}
