package cn.apelx.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 主启动类
 *
 * @author apelx
 * @since 2020-10-10
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer8762 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer8762.class, args);
    }
}
