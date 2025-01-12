package org.springframework.debug.spring.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @Author: zhoudong
 * @Description: TODO
 * @Date: 2024/4/1 11:32
 * @Version: 1.0.0
 **/
@Component
public class TestApplicationListener implements ApplicationListener {
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("接受到一个事件：" + event);
	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
		ctx.publishEvent(new ApplicationEvent("我手动发布了一个事件") {
			@Override
			public Object getSource() {
				return super.getSource();
			}
		});
		ctx.close();
	}
}

