package cn.apelx.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 主启动类
 *
 * @author apelx
 * @since 2020-10-14
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class UserMicroService9999 {
    public static void main(String[] args) {
        SpringApplication.run(UserMicroService9999.class, args);
    }
}
