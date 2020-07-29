package test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
/** 
* @Description: 开启注解 
* @Param:  
* @returns:  
* @Author: georgexie 
* @Date: 2020/7/29 11:07
*/
@Configuration
@EnableAspectJAutoProxy
//使用在项目中放在springboot启动类中
@ComponentScan
public class ConcertConfig {
    @Bean
    public Audience audience() {
        return new Audience();
    }
}