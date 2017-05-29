package com.alibaba.dubbo.demo.provider;

import java.net.URLDecoder;

public class MainClass {

	public static void main(String[] args) throws Exception {

		String de = URLDecoder.decode("dubbo%3A%2F%2F192.168.11.206%3A21881%2Fcom.alibaba.dubbo.demo.DemoService%3Fanyhost%3Dtrue%26application%3Dhello%26dubbo%3D2.0.0%26generic%3Dfalse%26group%3Ddemo%26interface%3Dcom.alibaba.dubbo.demo.DemoService%26methods%3DsayWorld%2CsayHello%26pid%3D1575%26revision%3D1.0.0%26side%3Dprovider%26threads%3D10%26timestamp%3D1495535465217%26version%3D1.0.0", "UTF-8");

		de = URLDecoder.decode("consumer%3A%2F%2F192.168.11.206%2Fcom.alibaba.dubbo.demo.DemoService%3Fapplication%3Dyyy%26category%3Dconsumers%26check%3Dfalse%26dubbo%3D2.0.0%26group%3Ddemo%26interface%3Dcom.alibaba.dubbo.demo.DemoService%26methods%3DsayWorld%2CsayHello%26pid%3D1655%26revision%3D1.0.0%26side%3Dconsumer%26timestamp%3D1495540163462%26version%3D1.0.0", "UTF-8");

		de = URLDecoder.decode("override%3A%2F%2F192.168.11.206%3A21881%2Fcom.alibaba.dubbo.demo.DemoService%3Fcategory%3Dconfigurators%26dynamic%3Dfalse%26enabled%3Dtrue%26group%3Ddemo%26version%3D1.0.0%26weight%3D400", "UTF-8");

		de = URLDecoder.decode("route%3A%2F%2F0.0.0.0%2Fcom.alibaba.dubbo.demo.DemoService%3Fcategory%3Drouters%26dynamic%3Dfalse%26enabled%3Dfalse%26force%3Dfalse%26group%3Ddemo%26name%3Dsample%26priority%3D100%26router%3Dcondition%26rule%3Dconsumer.host%2B%253D%2B192.168.11.206%2B%2526%2Bmethod%2B%253D%2BsayHello%2B%253D%253E%2Bprovider.host%2B%2521%253D%2B127.0.0.1%26runtime%3Dfalse%26version%3D1.0.0", "UTF-8");
		de = URLDecoder.decode("consumer.host+%3D+192.168.11.206+%26+method+%3D+sayHello+%3D%3E+provider.host+%21%3D+127.0.0.1", "UTF-8");

		de = URLDecoder.decode("route%3A%2F%2F0.0.0.0%2Fcom.alibaba.dubbo.demo.DemoService%3Fcategory%3Drouters%26dynamic%3Dfalse%26enabled%3Dfalse%26force%3Dfalse%26group%3Ddemo%26name%3Dhello%26priority%3D0%26router%3Dcondition%26rule%3Dconsumer.host%2B%253D%2B192.168.11.206%2B%2526%2Bconsumer.host%2B%2521%253D%2B127.0.0.1%2B%2526%2Bmethod%2B%253D%2BsayWorld%2B%253D%253E%2Bprovider.host%2B%253D%2B192.168.11.206%2B%2526%2Bprovider.protocol%2B%253D%2Bdubbo%26runtime%3Dfalse%26version%3D1.0.0", "UTF-8");
		de = URLDecoder.decode("consumer.host+%3D+192.168.11.206+%26+consumer.host+%21%3D+127.0.0.1+%26+method+%3D+sayWorld+%3D%3E+provider.host+%3D+192.168.11.206+%26+provider.protocol+%3D+dubbo", "UTF-8");
		System.out.println(de);
	}
}
