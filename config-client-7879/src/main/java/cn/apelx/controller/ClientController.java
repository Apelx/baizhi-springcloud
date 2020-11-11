package cn.apelx.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Client 控制器
 *
 * @author apelx
 * @since 2020-11-05
 */
@RestController
@RefreshScope
public class ClientController {

    @Value("${name}")
    private String name;

    @GetMapping(value = "/client/name")
    public String client() {
        return "配置中心获取到的name值：" + name;
    }
}
