package test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: georgexie
 * @description: TODO
 * @Date: 2020/7/29 11:05
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConcertConfig.class);

        Performance performance = context.getBean(Performance.class);
        performance.perform();
        context.close();
    }
}

