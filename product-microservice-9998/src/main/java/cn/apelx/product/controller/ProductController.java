package cn.apelx.product.controller;

import cn.apelx.product.entity.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * 商品Controller
 *
 * @author apelx
 * @since 2020-10-14
 */
@RestController
@Slf4j
public class ProductController {

    @Value("${server.port}")
    private int port;

    /**
     * 获取商品信息
     *
     * @return String
     */
    @GetMapping(value = "/product/getInfo")
    public String getProdInfo() {
        log.info("获取商品信息~~");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "获取商品信息~~" + port;
    }

    /**
     * 获取所有商品
     *
     * @return Map
     */
    @GetMapping(value = "/product/findAll")
    public Map<String, Object> findAll() {
        log.info("获取所有商品");
        Map<String, Object> response = new HashMap<>(16);
        response.put("status", true);
        response.put("msg", "获取所有商品~~" + port);
        return response;
    }

    /**
     * 获取单个商品
     *
     * @param productId 商品ID
     * @return map
     */
    @GetMapping(value = "/product/getOne")
    public Map<String, Object> getOne(@RequestParam("productId") String productId) {
        Map<String, Object> response = new HashMap<>(16);
        response.put("status", true);
        response.put("msg", "获取单个商品成功~~" + port);
        response.put("productId", productId);
        return response;
    }

    /**
     * 获取单个商品
     *
     * @param productId 商品ID
     * @return map
     */
    @GetMapping(value = "/product/getOneForPath/{productId}")
    public Map<String, Object> getOneForPath(@PathVariable("productId") String productId) {
        Map<String, Object> response = new HashMap<>(16);
        response.put("status", true);
        response.put("msg", "获取单个商品成功 ForPath~~" + port);
        response.put("productId", productId);
        return response;
    }

    @PostMapping(value = "/product/save")
    public Map<String, Object> save(@RequestBody Product product) {
        Map<String, Object> response = new HashMap<>(16);
        response.put("status", true);
        response.put("msg", "新增商品成功~~" + port);
        response.put("product", product);
        return response;
    }
}
