package io.hzg.demo1.controller;


import io.hzg.demo1.exception.ClientException;
import io.hzg.demo1.po.User;
import io.hzg.demo1.service.UserService;
import io.hzg.demo1.service.WechatMPService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/temp")
public class TempController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private WechatMPService wechatMPService;

    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public String test() throws ClientException {
//        String accessToken = wechatMPService.getAccessToken();
        User user = userService.getUserFromWechatMP("oUwXe58JsPM6MBFsI3YvnbFIpg-8");
        return "temptest";
    }
}
