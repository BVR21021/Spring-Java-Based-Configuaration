package com.venky;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx=new AnnotationConfigApplicationContext(ProductConfig.class);
        ProductBean ab=(ProductBean)ctx.getBean("pb");
      //  EmployeeBean ab1=(EmployeeBean)ctx.getBean("eb1");
       System.out.println(ab.toString());
       ab.CalculateTotal();
     ab.calculateDiscount();
      // System.out.println(ab1.toString());
    }
}
