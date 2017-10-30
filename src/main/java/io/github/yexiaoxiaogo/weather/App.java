package io.github.yexiaoxiaogo.weather;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.kevinsawicki.http.HttpRequest;

/**
 * 启动类
 *
 */
@SpringBootApplication
@MapperScan("io.github.yexiaoxiaogo.weather.dao")
public class App 
{
    public static void main( String[] args ) throws BeansException
    {
//    	 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/dubbo-demo-provider.xml"});
//         context.start();
         
        SpringApplication.run(App.class, args);
    }
}
