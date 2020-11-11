package cn.apelx.user.feignclient;

import cn.apelx.user.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 商品服务OpenFeign客户端
 *
 * @author apelx
 * @since 2020-10-16
 */
@FeignClient("product-micro-service")
public interface ProductClient {
    /**
     * 获取商品信息
     *
     * @return String
     */
    @GetMapping(value = "/product/getInfo")
    String getProdInfo();

    /**
     * 获取所有商品
     *
     * @return Map
     */
    @GetMapping(value = "/product/findAll")
    Map<String, Object> findAll();

    /**
     * 获取单个商品
     *
     * @param productId 商品ID
     * @return map
     */
    @GetMapping(value = "/product/getOne")
    Map<String, Object> getOne(@RequestParam("productId") String productId);

    /**
     * 获取单个商品
     *
     * @param productId 商品ID
     * @return map
     */
    @GetMapping(value = "/product/getOneForPath/{productId}")
    Map<String, Object> getOneForPath(@PathVariable("productId") String productId);

    /**
     * 保存商品
     *
     * @param product 商品
     * @return map
     */
    @PostMapping(value = "/product/save")
    Map<String, Object> save(@RequestBody Product product);
}
