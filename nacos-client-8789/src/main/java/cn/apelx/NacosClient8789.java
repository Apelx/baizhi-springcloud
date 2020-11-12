package cn.apelx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 主启动类
 *
 * @author apelx
 * @since 2020-11-12
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosClient8789 {
    public static void main(String[] args) {
        SpringApplication.run(NacosClient8789.class, args);
    }
}
