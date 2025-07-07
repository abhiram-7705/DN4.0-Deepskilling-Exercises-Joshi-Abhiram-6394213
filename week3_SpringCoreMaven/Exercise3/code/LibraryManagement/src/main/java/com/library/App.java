package com.library;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import com.library.service.LibraryService;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        LibraryService service=context.getBean("libraryService",LibraryService.class);
        service.logMethod();
    }
}
