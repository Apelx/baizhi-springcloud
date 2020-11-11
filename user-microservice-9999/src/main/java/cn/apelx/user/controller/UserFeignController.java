package cn.apelx.user.controller;

import cn.apelx.user.entity.Product;
import cn.apelx.user.feignclient.ProductClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 用户Controller
 *
 * @author apelx
 * @since 2020-10-16
 */
@RestController
public class UserFeignController {

    @Autowired
    private ProductClient productClient;

    /**
     * 用户获取商品信息
     *
     * @return String
     */
    @GetMapping(value = "/user/showProductInfo1")
    public String showProductInfo() {
        return productClient.getProdInfo();
    }

    /**
     * 用户获取所有商品
     *
     * @return String
     */
    @GetMapping(value = "/user/findAllProduct1")
    public Map<String, Object> findAllProduct() {
        return productClient.findAll();
    }

    /**
     * 根据ID获取商品
     *
     * @param productId 商品ID
     * @return Map
     */
    @GetMapping(value = "/user/getOneProduct")
    public Map<String, Object> findOneProduct(@RequestParam("productId") String productId) {
        return productClient.getOne(productId);
    }

    /**
     * 根据ID获取商品
     *
     * @param productId 商品ID
     * @return Map
     */
    @GetMapping(value = "/user/getOneProductForPath/{productId}")
    public Map<String, Object> findOneProductForPath(@PathVariable("productId") String productId) {
        return productClient.getOneForPath(productId);
    }

    /**
     * 根据ID获取商品
     *
     * @param product 商品
     * @return Map
     */
    @GetMapping(value = "/user/saveProduct")
    public Map<String, Object> findOneProductForPath(Product product) {
        return productClient.save(product);
    }
}
