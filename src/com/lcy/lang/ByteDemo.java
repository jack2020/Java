package com.lcy.lang;

import org.junit.Test;
/**
 * 
 * @author SeiKiMo
 * ①Byte类主要的作用就是对基本类型byte进行封装，提供了一些处理byte类型的方法，
 *  比如byte到String类型的转换方法或String类型到byte类型的转换方法，当然也包含与其他类型之间的转换方法。
 * ②MIN_VALUE静态变量表示byte能取的最小值，值为-128
 * ③MAX_VALUE表示byte的最大值为127
 * ④SIZE用来表示于二进制补码形式的byte值的比特数，值为8
 * ⑤BYTES用来表示于二进制补码形式的byte值的字节数，值为1
 * ⑥TYPE的toString的值是byte
 * ⑦有两个私有字段：
 * 	private final byte value;
 *  private static final long serialVersionUID = -7183698231559129828L;
 * ⑧有一个私有内部类：
 * 	private static class ByteCache
 * 
 */
public class ByteDemo {
	@Test
	public void testStaticField() {
		//静态变量表示byte能取的最小值，值为-128，被final修饰说明不可变
		System.out.println(Byte.MIN_VALUE);
		//表示byte的最大值为127
		System.out.println(Byte.MAX_VALUE);
		//用来表示于二进制补码形式的byte值的字节数，值为1
		System.out.println(Byte.BYTES);
		//用来表示于二进制补码形式的byte值的比特数，值为8
		System.out.println(Byte.SIZE);
		//用来表示类型
		System.out.println(Byte.TYPE);
	}
	@Test
	public void testStaticCompare() {
		// 比较
		byte a = 127;
		byte b = 126;
		byte c = 127;
		// a>b --> 1
		System.out.println(Byte.compare(a,b));
		// b<a --> -1
		System.out.println(Byte.compare(b, a));
		// a==c --> 0
		System.out.println(Byte.compare(a, c));
	}
	@Test
	public void testStaticDecode() {
		//十六进制 --> 十进制
		Byte decode = Byte.decode("0X7F");
		System.out.println(decode);
		//八进制 --> 十进制
		Byte decode2 = Byte.decode("0177");
		System.out.println(decode2);
		//十进制 --> 十进制
		Byte decode4 = Byte.decode("-127");
		System.out.println(decode4);
	}
	@Test
	public void testStaticHashCode() {
		//HashCode values between -128 and 127
		byte a = 127;
		byte b = -128;
		System.out.println(Byte.hashCode(a));
		System.out.println(b);
	}
	@Test
	public void testStaticParseByte() {
		byte b = Byte.parseByte("-128");
		byte c = Byte.parseByte("127");
		System.out.println("range: "+b+" ~ "+c);
	}
	@Test
	public void testStaticParseBytes() {
		//某进制字符串数转换成十进制byte数值,不管任何进制，转换成的十进制值在-128~127
		//十进制
		byte b = Byte.parseByte("127", 10);
		System.out.println(b);
		//二进制
		byte c = Byte.parseByte("1111111", 2);
		System.out.println(c);
		//八进制
		byte d = Byte.parseByte("177", 8);
		System.out.println(d);
		//十六进制
		byte e = Byte.parseByte("7F", 16);
		System.out.println(e);
	}
	@Test
	public void testStaticToString() {
		// byte --> String
		byte a = 127;
		System.out.println(Byte.toString(a));
	}
	@Test
	public void testStaticToUnsignedInt() {
		// byte --> int
		int unsignedInt = Byte.toUnsignedInt((byte)127);
		System.out.println(unsignedInt);
	}
	@Test
	public void testStaticToUnsignedLong() {
		// byte --> long
		long unsignedLong = Byte.toUnsignedLong((byte)127);
		System.out.println(unsignedLong);
	}
	@Test
	public void testStaticValueOf() {
		// byte --> Byte instance
		byte a = 127;
		Byte byte1 = Byte.valueOf(a);
		System.out.println(byte1.hashCode());
	}
	@Test
	public void testStaticValueOfs() {
		// 十进制字符串数值 --> Byte instance
		Byte byte1 = Byte.valueOf("127");
		System.out.println(byte1.hashCode());
		// 十六进制字符串数值 --> Byte instance
		Byte byte2 = Byte.valueOf("7F", 16);
		System.out.println(byte2.hashCode());
	}
	/*
	 * instance methods:
	 * 	byteValue()  默认byte
	 * 	compareTo(Byte anotherByte)  Byte instance --> int
	 * 	doubleValue() byte --> double
	 * 	equals(Object obj) 如果是Byte --> byte;否则 --> false
	 * 	floatValue() byte --> float
	 * 	hashCode() byte --> int
	 *	intValue() byte --> int
	 * 	longValue() byte --> long
	 * 	shortValue() byte --> short 自转默认转换成int,需要用(short)声明 
	 * 	toString() byte --> String
	 * 
	 */
}
