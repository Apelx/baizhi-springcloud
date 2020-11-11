package cn.apelx.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 主启动类
 *
 * @author apelx
 * @since 2020-10-10
 */
@EnableEurekaClient
@SpringBootApplication
public class EurekaClient8888 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClient8888.class, args);
    }

}
