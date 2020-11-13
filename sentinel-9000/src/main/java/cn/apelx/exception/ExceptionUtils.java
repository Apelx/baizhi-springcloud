package cn.apelx.exception;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;

/**
 * 异常处理工具类
 *
 * @author apelx
 * @since 2020-11-13
 */
@Slf4j
public class ExceptionUtils {

    public static String blockHandlerForSentinelKey(String p1, String p2, BlockException blockException) {
        return "--------- blockHandler 自定义抛出方法111 /(ㄒoㄒ)/~~";
    }

    public static String fallbackHandlerForSentinelKey(String p1, String p2, Throwable throwable){
        log.info("fallbackHandler with exception: {}", throwable.getMessage());
        return "--------- fallbackHandler 自定义抛出方法222 /(ㄒoㄒ)/~~";
    }

}
