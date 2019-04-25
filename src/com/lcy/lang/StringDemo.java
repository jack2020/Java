package com.lcy.lang;

import org.junit.Test;

/**
 * @author SeiKiMo
 * ①String：为final类型不允许被继承。（字符串常量）
 * ②在Java中，被 final类型修饰的类不允许被其他类继承，被 final 修饰的变量赋值后不允许被修改。
 * ③String实现：Serializable、 Comparable<String>、 CharSequence接口。
 * ④String字符串是常量，其值在实例创建后就不能被修改，但字符串缓冲区支持可变的字符串，因为缓冲区里面的不可变字符串对象们可以被共享；
 * 	平时通过赋值以为改变其内容，其实并不是对其内容的修改，而是重新指向了新的字符串。
 * ⑤Java 的序列化机制是通过在运行时判断类的 serialVersionUID 来验证版本一致性的；
 * 	在进行反序列化时，JVM 会把传来的字节流中的 serialVersionUID 与本地相应实体（类）的 serialVersionUID 进行比较；
 * 	如果相同就认为是一致的，可以进行反序列化，否则就会出现序列化版本不一致的异常。
 * ⑥String内部本质就是操作字符数组 value[]
 */
public class StringDemo {
	@Test
	public void testString() {
		String str = "abc";
		System.out.println(str+":"+str.hashCode());
		str="def";
		System.out.println(str+":"+str.hashCode());
	}
	@Test
	//不推荐这样做，会产生了不必要的对象
	public void testNewString() {
		String str = new String("abc");
		System.out.println(str+":"+str.hashCode());
		str="def";
		System.out.println(str+":"+str.hashCode());
	}
	@Test
	public void testThre() {
		String str = "abc";
		String str2 = "def";
		System.out.println(str+":"+str.hashCode());
		System.out.println(str2+":"+str2.hashCode());
		str2 = str;
		System.out.println(str2+":"+str2.hashCode());
	}
}
