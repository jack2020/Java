package com.lcy.lang;
/**
 * 
 * @author SeiKiMo
 * ①Float类主要的作用就是对基本类型float进行封装
 * 	提供了一些处理float类型的方法，比如float到String类型的转换方法或String类型到float类型的转换方法，当然也包含与其他类型之间的转换方法。
 */
public class FloatDemo {
	/*
	 * 字段：
	 * 	POSITIVE_INFINITY 用来表示正无穷大，按照IEEE 754浮点标准规定，任何有限正数除以0为正无穷大，正无穷的值为0x7f800000。
	 *	NEGATIVE_INFINITY 用来表示负无穷大，任何有限负数除以0为负无穷的，负无穷的值为0xff800000。
	 *	NaN 用来表示处理计算中出现的错误情况，比如0除以0或负数平方根。对于单精度浮点数，IEEE 标准规定 NaN 的指数域全为 1，且尾数域不等于零的浮点数。它并没有要求具体的尾数域，所以 NaN 实际上不非是一个，而是一族。Java这里定义的值为0x7fc00000。
	 *	MAX_VALUE 用来表示最大的浮点数值，它定义为0x1.fffffeP+127f，这里0x表示十六进制，1.fffffe表示十六进制的小数，P表示2，+表示几次方，这里就是2的127次方，最后的f是转成浮点型。所以最后最大值为3.4028235E38。
	 *	MIN_NORMAL 用来表示最小标准值，它定义为0x1.0p-126f，这里其实就是2的-126次方的了，值为1.17549435E-38f。
	 *	MIN_VALUE 用来表示浮点数最小值，它定义为0x0.000002P-126f，最后的值为1.4e-45f。
	 *	MAX_EXPONENT 用来表示指数的最大值，这里定为127，这个也是按照IEEE 754浮点标准的规定。
	 *	MIN_EXPONENT 用来表示指数的最小值，按照IEEE 754浮点标准的规定，它为-126。
	 *	SIZE 用来表示二进制float值的比特数，值为32，静态变量且不可变。
	 *	BYTES 用来表示二进制float值的字节数，值为SIZE除于Byte.SIZE，结果为4。
	 *	TYPE的toString的值是float。Class的getPrimitiveClass是一个native方法，在Class.c中有个Java_java_lang_Class_getPrimitiveClass方法与之对应，所以JVM层面会通过JVM_FindPrimitiveClass函数根据"float"字符串获得jclass，最终到Java层则为Class<Float>。
	 */
}
