package com.lcy.lang;

import org.junit.Test;

/**
 * 
 * @author SeiKiMo
 * ①Boolean类主要作用就是对基本类型boolean进行封装，提供了一些处理boolean类型的方法，比如String类型和boolean类型的转换。
 * ②Boolean 其实是被当做 int值处理的，true表示 1，false表示 0。
 */
public class BooleanDemo {
	/*
	 * static fields:
	 */
	@Test
	public void Fields() {
		// TYPE
		Class<Boolean> type = Boolean.TYPE;
		System.out.println(type);
		//FALSE
		Boolean false1 = Boolean.FALSE;
		System.out.println(false1);
		//TRUE
		Boolean true1 = Boolean.TRUE;
		System.out.println(true1);
	}
	
	/*
	 *  Constructors:
	 */
	@Test
	public void constructors() {
		//传入boolean类型
		Boolean boolean1 = new Boolean(false);
		System.out.println(boolean1.hashCode());
		//传入String类型
		Boolean boolean2 = new Boolean("true");
		System.out.println(boolean2.hashCode());
	}
	/*
	 * static methods
	 */
	@Test
	//比较两个boolean的变量值
	public void compare() {
		// true,false --> 1
		System.out.println(Boolean.compare(true, false));
		// false,true --> -1
		System.out.println(Boolean.compare(false, true));
		// false,false --> 0
		System.out.println(Boolean.compare(false, false));
		// true,ture --> 0
		System.out.println(Boolean.compare(true, true));
	}
	@Test
	public void valueOf() {
		//传入boolean类型
		System.out.println(Boolean.valueOf(true));
		//传入String类型，对于String类型会进行toBoolean解析，即当传入的字符串忽略大小写等于”true”时判断为true，否则为false。
		System.out.println(Boolean.valueOf("false"));
	}
	@Test
	public void testtoString() {
		//如果指定的布尔值为true，则字符串“true”将被返回，否则字符串“false”将被返回。
		System.out.println(Boolean.toString(true));
		System.out.println(Boolean.toString(false));
	}
	@Test
	public void testhashCode() {
		// true --> 1231
		System.out.println(Boolean.hashCode(true));
		// false --> 1237
		System.out.println(Boolean.hashCode(false));
	}
	@Test
	public void testequals() {
		//先判断是不是从Boolean实例化出来的，然后再继续比较是不是相等。
		Boolean boolean1 = new Boolean(true);
		Boolean boolean2 = new Boolean(true);
		System.out.println(boolean1==boolean2);
		System.out.println(boolean1.equals(boolean2));
		boolean flag1 = true;
		boolean flag2 = true;
		System.out.println(flag1==flag2);
	}
	@Test
	public void getBoolean() {
		//获取一个系统属性的boolean值，当系统属性的值equal(“true”)时，返回true，否则返回false，并且返回值是boolean型
		String str = "true";
		System.out.println(Boolean.getBoolean("true"));
		System.out.println(Boolean.getBoolean(str));
	}
	
}
