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
//@Aspectע�����Audience����һ�����档
@Aspect
public class Audience {
    /**
     * ����֮ǰ,���ھ���
     * ������ص������@Before("execution(* chapter04.concert.Performance.perform(..))")����������1��ǰ��֪ͨ������execution(* chapter04.concert.Performance.perform(..))����ΪAspectJ�е���ʽ��ÿһ���ֵĽ������£�
     * 	*
     * @Before����ע����������ǰ��֪ͨ��֪ͨ��������Ŀ�귽������֮ǰִ��
     * 	*
     * execution���ڷ���ִ��ʱ����
     * 	*
     * "*"���������ǲ����ķ�������ֵ�����ͣ�����������������
     * 	*
     * test.Performance.perform��ʹ��ȫ�޶������ͷ�����ָ��Ҫ���ǰ��֪ͨ�ķ���
     * 	*
     * (..)�������Ĳ����б�ʹ��(..)���������ǲ����ķ����������ʲô������������������
     */
    @Before("execution(* test.Performance.perform(..))")
    public void takeSeats() {
        System.out.println("Taking seats");
    }

    /**
     * ����֮ǰ,���ֻ���������
     */
    @Before("execution(* test.Performance.perform(..))")
    public void silenceCellPhones() {
        System.out.println("Silencing cell phones");
    }


    /**
     * ����֮��,����
     */
    @AfterReturning("execution(* test.Performance.perform(..))")
    public void applause() {
        System.out.println("CLAP CLAP CLAP!!!");
    }


    /**
     * ����ʧ��֮��,����Ҫ���˿�
     */
    @AfterThrowing("execution(* test.Performance.perform(..))")
    public void demandRefund() {
        System.out.println("Demanding a refund");
    }
}
