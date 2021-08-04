package cn.edu.zzu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy //启动zuul网关
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class ,args);
    }
}
