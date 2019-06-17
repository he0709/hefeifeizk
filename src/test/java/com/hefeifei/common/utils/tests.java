package com.hefeifei.common.utils;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;
import java.util.Random;
import java.util.stream.DoubleStream;

import org.junit.jupiter.api.Test;

import com.hefeifei.common.bean.Person;

/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: tests.java 
 * @Prject: hefeifei-common
 * @Package: com.hefeifei.common.utils 
 * @Description: TODO
 * @author: Lenovo   
 * @date: 2019年6月17日 上午8:58:49 
 * @version: V1.0   
 */
class tests {

	@Test
	void test() {
		System.out.println("返回min-max之间的随机整数:"+RandomUtil.subRandom(2, 8, 4));
		System.out.println("返回1个1-9,a-Z之间的随机字符:"+RandomUtil.randomCharacter());
		System.out.println("返回参数length个字符串:"+RandomUtil.randomString(4));
		System.out.println("判断源字符串是否有值，空引号(空白字符串)也算没值:"+StringUtil.hasLength(""));
		System.out.println("判断源字符串是否有值，空引号(空白字符串)和空格也算没值:"+StringUtil.hasText("321"));
		System.out.println("返回参数length个中文汉字字符串:"+StringUtil.randomChineseString(5));
		System.out.println("返回中文姓名:"+StringUtil.generateChineseName());
	}
	@Test
	void testPerson() {
		for (int i = 0; i < 10; i++) {
			Person p=new Person(StringUtil.generateChineseName(),RandomUtil.random(1,120),StringUtil.randomChineseString(140),new Date());
			System.out.println(p);
		}
	}

}
