package com.lcy.lang;

import org.junit.Test;

/**
 * 
 * @author SeiKiMo
 * ①Short类主要的作用就是对基本类型short进行封装，提供了一些处理short类型的方法，
 * 	比如short到String类型的转换方法或String类型到short类型的转换方法，当然也包含与其他类型之间的转换方法。
 * ② short为两个字节
 * ③有两个私有字段：
 * 	private final short value;
 *  private static final long serialVersionUID = 7515723908773894738L;
 * ④有一个私有内部类：
 * 	private static class ShortCache
 *
 */
public class ShortDemo {
	@Test
	public void testStaticFields() {
		//类型：short
		System.out.println(Short.TYPE);
		//占用两个字节:2
		System.out.println(Short.BYTES);
		//位数：16
		System.out.println(Short.SIZE);
		//最大数：32767  ==  2^15-1
		System.out.println(Short.MAX_VALUE);
		//最小数：-32768 == -2^15
		System.out.println(Short.MIN_VALUE);
	}
	/*
	 * constructor methods
	 */
	@Test
	public void testConstructors() {
		//值范围：-32768~32767
		// 第一种：Short(short value)
		Short short1 = new Short((short)123);
		System.out.println(short1);
		// 第二种：Short(String s)  --> 内部调用parseShort()方法转换成short
		Short short2 = new Short("123");
		System.out.println(short2);
	}
	/*
	 * static methods 
	 */
	@Test
	public void testCompare() {
		short a = 125;
		short b = 123;
		short c = 125;
		// a>b --> 2
		System.out.println(Short.compare(a, b));
		// b<a --> -2
		System.out.println(Short.compare(b, a));
		// a==c --> 0
		System.out.println(Short.compare(a, c));
	}
	@Test
	public void testDecode() {
		//值范围：-32768~32767
		// 默认转换成十进制
		System.out.println(Short.decode("123"));
		// 八进制  --> 十进制
		System.out.println(Short.decode("0173"));
		// 十六进制 --> 十进制
		System.out.println(Short.decode("0x7B"));
		System.out.println(Short.decode("#7B"));
	}
	@Test
	public void testHashCode() {
		Short a = 123;
		System.out.println(a.hashCode());
	}
	@Test
	public void testtParseShort() {
		// 方法调用parseShort(paramString, 10) --> short
		System.out.println(Short.parseShort("-32768"));
		System.out.println(Short.parseShort("32767"));
	}
	@Test
	public void testParseShorts() {
		System.out.println(Short.parseShort("-10000000", 2));
		System.out.println(Short.parseShort("200", 8));
		System.out.println(Short.parseShort("80", 16));
	}
	@Test
	public void testReverseBytes() {
		// 0000 0000 0111 1111
		//    	  &	
		// 0000 0000 1111 1111
		//		
		// 0000 0000 0111 1111 >> 8 --> 0000 0000 0000 0000
		// 0000 0000 0111 1111 << 8 --> 0111 1111 0000 0000
		// 0000 0000 0000 0000 | 0111 1111 0000 0000  -->  0111 1111 0000 0000
		short s = Short.reverseBytes((short)127);
		System.out.println(s);
	}
	@Test
	public void testToString() {
		// short --> String
		System.out.println(Short.toString((short)128));
	}
	@Test
	public void testToUnsignedInt() {
		// short --> int
		System.out.println(Short.toUnsignedInt((short)128));
	}
	@Test
	public void testToUnsignedLong() {
		// short --> long
		System.out.println(Short.toUnsignedLong((short)128));
	}
	@Test
	public void testValueOf() {
		// valueOf()方法调用parseShort(paramString, 10)
	}
	/*
	 * instance methods
	 * 
	 */
	@Test
	public void testInstanceMethods() {
		//	byteValue(): short --> byte
		//	compareTo(Short anotherShort)
			Short short1 = new Short("123");
			Short short2 = new Short("125");
			System.out.println(short1.compareTo(short2));
		//	doubleValue(): short --> double
		//	equals(Object obj)
		//	floatValue(): short --> float
		//	hashCode()
		//	intValue(): short --> int
		//	longValue(): long --> long
		//	shortValue(): short --> short
		//	toString(): short --> String
	}

}
