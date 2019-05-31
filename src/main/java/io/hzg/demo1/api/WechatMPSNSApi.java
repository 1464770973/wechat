package io.hzg.demo1.api;

import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "wechatmpsns", url = "https://api.weixin.qq.com/sns")
public interface WechatMPSNSApi {

    @GetMapping("/oauth2/access_token")
    String getUserAccessToken(@RequestParam("appid") String appid,
                              @RequestParam("secret") String secret,
                              @RequestParam("code") String code,
                              @RequestParam("grant_type") String grant_type);
}
