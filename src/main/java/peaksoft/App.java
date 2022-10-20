package peaksoft;


import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args)  {
            ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
            HelloWorld bean1 = applicationContext.getBean("helloworld",HelloWorld.class);
            HelloWorld bean2 = applicationContext.getBean("helloworld",HelloWorld.class);
            Cat bean3 = applicationContext.getBean("Tom",Cat.class);
            Cat bean4 = applicationContext.getBean("Tom",Cat.class);

            System.out.println(bean1.getMessage());
            System.out.println(bean2.getMessage());
            System.out.println(bean3==bean4);





        }

    }

