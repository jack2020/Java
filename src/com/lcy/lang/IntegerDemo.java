package com.lcy.lang;

import org.junit.Test;

/**
 * 
 * @author SeiKiMo
 * ①Integer 是基本类型 int 的包装类，它提供了一些处理 int 数值的方法。
 */
public class IntegerDemo {
	/*
	 * 字段：
	 * 	int MIN_VALUE
	 * 	int MAX_VALUE
	 * 	Class<Integer> TYPE
	 * 	char[] digits
	 * 	char[] DigitTens
	 * 	char[] DigitOnes
	 * 	int[] sizeTable
	 * 	int SIZE = 32
	 * 	int BYTES = 4
	 *  long serialVersionUID
	 */
	@Test
	public void testConstructorMethods() {
		// new Integer(int paramInt);
		Integer integer = new Integer(123);
		// new Integer(String paramString);
		Integer integer2 = new Integer("123");
		System.out.println("integer："+integer.hashCode());
		System.out.println("integer2："+integer2.hashCode());
		System.out.println("Ingeger's ==："+(integer==integer2));
		System.out.println("Ingerger's equals："+integer.equals(integer2));
		int a = 128;
		int b = 128;
		System.out.println("int："+(a==b));
	}
	/*
	 * static methods
	 */
	@Test
	public void testBitCount() {
		// 127 --> 0111 1111
		System.out.println(Integer.bitCount(127));
		// 128 --> 1000 0000
		System.out.println(Integer.bitCount(128));
	}
	@Test
	public void testCompare() {
		// 124 < 125 --> -1
		System.out.println(Integer.compare(124, 125));
		// 124 = 124 --> 0
		System.out.println(Integer.compare(124, 124));
		// 125 > 124 --> 1
		System.out.println(Integer.compare(125, 124));
	}
	@Test
	public void testCompareUnsigned() {
		// 调用compare(paramInt1 + Integer.MIN_VALUE, paramInt2 + Integer.MIN_VALUE)
	}
	@Test
	public void testDecode() {
		// 八进制 --> Integer十进制
		Integer decode = Integer.decode("-0200");
		System.out.println(decode);
		// 十六进制 --> Integer十进制
		Integer decode2 = Integer.decode("0x80");
		System.out.println(decode2);
		// 十进制
		System.out.println(Integer.decode("128"));
	}
	@Test
	public void testDivideUnsigned() {
		// 除法 --> 无符号位
		int divideUnsigned = Integer.divideUnsigned(8, 2);
		System.out.println(divideUnsigned);
	}
	@Test
	public void testHighestOneBit() {
		// 1100 0000
		System.out.println(Integer.highestOneBit(192));
		// 0100 0000
		System.out.println(Integer.highestOneBit(127));
	}
	@Test
	public void testLowerOneBit() {
		// 1100 0000
		System.out.println(Integer.lowestOneBit(192));
		// 0000 0110
		System.out.println(Integer.lowestOneBit(6));
	}
	@Test
	public void testNumberOfLeadingZeros() {
		// 默认为32
		System.out.println(Integer.numberOfLeadingZeros(0));
		// 0001 0000
		// 0001 1011
		System.out.println(Integer.numberOfLeadingZeros(20));
	}
}
