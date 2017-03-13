package soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by 343617 on 2017/3/13.
 * 此类的作用是提供扫描，用作测试，无需配置xml文件即可
 * @ComponentScan   注解表示让spring扫描此包下的类，将Component注解的类纳入管理
 * @Configuration   让测试类可以扫描到
 */

@ComponentScan
@Configuration
public class MyConfig {
}
