package com.lcy.lang;

import org.junit.Test;

/**
 * 
 * @author SeiKiMo
 * ①大多数时候可以替换StringBuffer（字符串变量）
 * ②线程非安全的，但比StringBuffer的速度快，效率高。
 * ③StringBuilder在本质上和 StringBuffer没有太大区别，但是由于 StringBuilder 去掉了 StringBuffer 拥有的线程安全部分，因此有效减少了开销。
 * 	因此，StringBuilder 是大部分情况下字符串拼接操作的首选
 *
 */
public class StringBuilderDemo {
	@Test
	public void testStringBuilder() {
		StringBuilder builder = new StringBuilder("Hello World!");
		System.out.println(builder+":"+builder.hashCode());
		builder.append(" --> Java");
		System.out.println(builder.toString()+":"+builder.hashCode());
	}
}
