package org.springframework.tx.xml;

import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.tx.xml.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TxTest {
    public static void main(String[] args) {
		//System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"/Users/yaoyizhang/Desktop");
        ApplicationContext context = new ClassPathXmlApplicationContext("tx.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.checkout("zhangsan",1);
    }
}
