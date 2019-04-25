package com.lcy.lang;

import org.junit.Test;

/**
 * 
 * @author SeiKiMo
 * ①StringBuffer（字符串变量）
 * ②一个类似于 String的字符串缓冲区，对它的修改的不会像String那样重新创建对象。
 * ③线程安全的，建议多线程使用
 * ④使用append()方法修改Stringbuffer的值，使用toString()方法转换为字符串。
 * ⑤默认容量为 16 个字符，但如果超出，会使用 Arrays.copyOf() 成倍扩容 16，32，64, 128...，当然这样会影响性能，因此可以在创建对象时按照需要自定义其容量。
 *
 */
public class StringBufferDemo {
	@Test
	public void TestStringBuffer() {
		StringBuffer buffer = new StringBuffer("Hello");
		System.out.println(buffer+":"+buffer.hashCode());
		buffer.append(" World!");
		System.out.println(buffer.toString()+":"+buffer.hashCode());
	}
}
