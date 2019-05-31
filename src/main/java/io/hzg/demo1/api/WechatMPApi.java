package io.hzg.demo1.api;

        import com.alibaba.fastjson.JSONObject;
        import org.springframework.cloud.openfeign.FeignClient;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "wechatmp", url = "https://api.weixin.qq.com/cgi-bin")
public interface WechatMPApi {

    @GetMapping("/token")
    JSONObject getAccessToken(@RequestParam("grant_type") String grant_type,
                              @RequestParam("appid") String appid,
                              @RequestParam("secret") String secret);

    @GetMapping("/user/info")
    JSONObject getUserInfo(@RequestParam("access_token") String access_token,
                           @RequestParam("openid") String openid,
                           @RequestParam("lang") String lang);

}
