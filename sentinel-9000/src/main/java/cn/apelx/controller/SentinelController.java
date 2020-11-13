package cn.apelx.controller;

import cn.apelx.exception.ExceptionUtils;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public String sentinel() {
        log.info("进入测试方法");
        return "进入测试方法";
    }

    @GetMapping(value = "/sentinel/rel")
    public String sentinelRel() {
        return "进入sentinel关联方法";
    }

    @GetMapping(value = "/sentinel/hotKey")
    @SentinelResource(value = "/sentinel/hotKey", blockHandler = "blockHandlerForSentinelKey", blockHandlerClass = {ExceptionUtils.class},
    fallback = "fallbackHandlerForSentinelKey", fallbackClass = {ExceptionUtils.class})
    public String sentinelKey(@RequestParam(value = "key1", required = false) String key1,
                              @RequestParam(value = "key2", required = false) String key2) {
        int age = 10 /  0;
        return "进入sentinel热点key方法,key1: " + key1 + ", key2: " + key2;
    }


}
