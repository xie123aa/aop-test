package test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
/** 
* @Description: ����ע�� 
* @Param:  
* @returns:  
* @Author: georgexie 
* @Date: 2020/7/29 11:07
*/
@Configuration
@EnableAspectJAutoProxy
//ʹ������Ŀ�з���springboot��������
@ComponentScan
public class ConcertConfig {
    @Bean
    public Audience audience() {
        return new Audience();
    }
}