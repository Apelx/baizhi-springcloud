package cn.apelx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 主启动类
 *
 * @author apelx
 * @since 2020/11/12
 */
@SpringBootApplication
@EnableFeignClients
public class Sentinel9000 {

    public static void main(String[] args) {
        SpringApplication.run(Sentinel9000.class, args);
    }
}
