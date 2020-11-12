package cn.apelx.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SentinelController
 *
 * @author apelx
 * @since 2020/11/12
 */
@Slf4j
@RestController
public class SentinelController {

    @GetMapping(value = "/sentinel")
    public String sentinel(){
        log.info("进入测试方法");
        return "进入测试方法";
    }

    @GetMapping(value = "/sentinel/rel")
    public String sentinelRel(){
        return "进入sentinel关联方法";
    }
}
