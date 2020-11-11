package cn.apelx.consul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 主启动类
 *
 * @author apelx
 * @since 2020-10-11
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulClient8889 {

    public static void main(String[] args) {
        SpringApplication.run(ConsulClient8889.class, args);
    }

}
