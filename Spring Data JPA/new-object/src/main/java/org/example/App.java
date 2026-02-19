package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        Student stu = context.getBean("bus", Student.class);
        System.out.println(stu);

        Cars car = context.getBean("car", Cars.class);
        System.out.println(car);

        TechIndustry tech = context.getBean("tech", TechIndustry.class);
        System.out.println(tech);

        Scopes s1 = context.getBean("singletonScope", Scopes.class);
        Scopes s2 = context.getBean("singletonScope", Scopes.class);

        s1.increment();
        s1.increment();

        System.out.println();
        System.out.println("Singleton S1: " + s1);
        System.out.println("Singleton S2: " + s2);

        s2.increment();

        System.out.println();
        System.out.println("After S2 increment");
        System.out.println("Singleton S1: " + s1);
        System.out.println("Singleton S2: " + s2);

        Scopes p1 = context.getBean("prototypeScope", Scopes.class);
        Scopes p2 = context.getBean("prototypeScope", Scopes.class);

        p1.increment();

        System.out.println();
        System.out.println("Prototype P1 : " + p1);
        System.out.println("Prototype P2 : " + p2);

        p2.increment();
        p2.increment();

        System.out.println();
        System.out.println("After P2 increment");
        System.out.println("Prototype P1 : " + p1);
        System.out.println("Prototype P2 : " + p2);

        // AutoWiring
        System.out.println();
        Wiring wiring = context.getBean("wiring", Wiring.class);
        wiring.showDetails();

        // Collections
        System.out.println();
        Collections collections = context.getBean("collections", Collections.class);
        collections.showCollections();

        // SetDirectory
        System.out.println();
        SetDirectory dir = context.getBean("setDirectory", SetDirectory.class);
        dir.showContents();

        // InnerBean
        System.out.println();
        BeanInner inner = context.getBean("innerBeanExample", BeanInner.class);
        System.out.println(inner);

        // Using Reference Attribute
        System.out.println();
        UsingAttribute ua = context.getBean("usingAttr", UsingAttribute.class);
        System.out.println(ua);

        ((ClassPathXmlApplicationContext) context).close();
    }
}
