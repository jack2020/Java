package com.lcy.lang;
/**
 * 
 * @author SeiKiMo
 * ①Java的Long类主要的作用就是对基本类型long进行封装，
 * 	提供了一些处理long类型的方法，比如long到String类型的转换方法或String类型到long类型的转换方法，当然也包含与其他类型之间的转换方法。除此之外还有一些位相关的操作。
 *
 */
public class LongDemo {
	/*
	 * 字段：
	 * 	MIN_VALUE静态变量表示long能取的最小值，为-2的63次方，被final修饰说明不可变。
	 *	类似的还有MAX_VALUE，表示long最大值为2的63次方减1。
	 *	SIZE用来表示二进制补码形式的long值的比特数，值为64，静态变量且不可变。
	 *	BYTES用来表示二进制补码形式的long值的字节数，值为SIZE除于Byte.SIZE，结果为8。
	 *	TYPE的toString的值是long。 
	 *	Class的getPrimitiveClass是一个native方法，在Class.c中有个Java_java_lang_Class_getPrimitiveClass方法与之对应，所以JVM层面会通过JVM_FindPrimitiveClass函数根据”long”字符串获得jclass，最终到Java层则为Class<Long>。
	 */
}
