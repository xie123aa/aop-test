package test;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @Author: georgexie
 * @description: TODO
 * @Date: 2020/7/29 10:46
 * @Version 1.0
 */
//@Aspect注解表明Audience类是一个切面。
@Aspect
public class Audience {
    /**
     * 表演之前,观众就座
     * 这里的重点代码是@Before("execution(* chapter04.concert.Performance.perform(..))")，它定义了1个前置通知，其中execution(* chapter04.concert.Performance.perform(..))被称为AspectJ切点表达式，每一部分的讲解如下：
     * 	*
     * @Before：该注解用来定义前置通知，通知方法会在目标方法调用之前执行
     * 	*
     * execution：在方法执行时触发
     * 	*
     * "*"：表明我们不关心方法返回值的类型，即可以是任意类型
     * 	*
     * test.Performance.perform：使用全限定类名和方法名指定要添加前置通知的方法
     * 	*
     * (..)：方法的参数列表使用(..)，表明我们不关心方法的入参是什么，即可以是任意类型
     */
    @Before("execution(* test.Performance.perform(..))")
    public void takeSeats() {
        System.out.println("Taking seats");
    }

    /**
     * 表演之前,将手机调至静音
     */
    @Before("execution(* test.Performance.perform(..))")
    public void silenceCellPhones() {
        System.out.println("Silencing cell phones");
    }


    /**
     * 表演之后,鼓掌
     */
    @AfterReturning("execution(* test.Performance.perform(..))")
    public void applause() {
        System.out.println("CLAP CLAP CLAP!!!");
    }


    /**
     * 表演失败之后,观众要求退款
     */
    @AfterThrowing("execution(* test.Performance.perform(..))")
    public void demandRefund() {
        System.out.println("Demanding a refund");
    }
}
