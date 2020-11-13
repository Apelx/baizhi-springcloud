package cn.apelx.controller;

import cn.apelx.feign.NacosProjectFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Sentinel整合feign服务降级
 *
 * @author apelx
 * @since 2020-11-13
 */
@RestController
public class SentinelFeignController {

    @Autowired
    private NacosProjectFeignClient nacosProjectFeignClient;

    /**
     * Sentinel整合feign调用
     *
     * @return message
     */
    @GetMapping(value = "/sentinel/feign")
    public String sentinelFeign() {
        return nacosProjectFeignClient.find();
    }
}
