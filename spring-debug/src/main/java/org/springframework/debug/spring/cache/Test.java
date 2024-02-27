package org.springframework.debug.spring.cache;

/**
 * @Author: zhoudong
 * @Description:
 * @Date: 2022/7/20 19:11
 * @Version:
 **/
public class Test {
	public static void main(String[] args) {
		//ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		//AService aService = applicationContext.getBean(AService.class);
		//System.out.println(aService.getbService());
		//BService bService = applicationContext.getBean(BService.class);
		//System.out.println(bService.getaService());

		// 创建 serviceA
		AService aService = new AService();
		// 创建serviceB
		BService bService = new BService();
		// 将serviceA注入到serviceB
		bService.setaService(aService);
		// 将serviceB注入serviceA
		aService.setbService(bService);
	}
}
