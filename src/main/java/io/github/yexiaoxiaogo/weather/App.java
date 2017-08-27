package io.github.yexiaoxiaogo.weather;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.github.kevinsawicki.http.HttpRequest;

/**
 * 启动类
 *
 */
@SpringBootApplication
@MapperScan("io.github.yexiaoxiaogo.weather.dao")
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}
