package org.example;

import org.example.Ehei.gi4.tp.AppConfig;
import org.example.Ehei.gi4.tp.FacturationService;
import org.example.Ehei.gi4.tp.TvaESService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args)
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        //ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
        FacturationService fservice=context.getBean(FacturationService.class);

        //FacturationService fservice9=context.getBean(FacturationService.class);
        System.out.println("Le Montant Final :"+fservice.Montant(10000));


    }
}