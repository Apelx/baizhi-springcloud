package cn.apelx.user.controller;

import cn.apelx.user.feignclient.ProductHystrixClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 用户 Hystrix 控制器
 *
 * @author apelx
 * @since 2020-10-27
 */
@RestController
@Slf4j
public class UserHystrixController {

    @Autowired
    private ProductHystrixClient productHystrixClient;

    /**
     * 用户 根据ID获取商品信息
     *
     * @param id 商品id
     * @return 商品信息
     */
    @GetMapping("/user/getProductById")
    public Map<String, Object> findProductById(Integer id) {
        return productHystrixClient.getById(id);
    }
}
