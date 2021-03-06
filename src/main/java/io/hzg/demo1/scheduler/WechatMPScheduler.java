package io.hzg.demo1.scheduler;


import io.hzg.demo1.component.WechatMPVariable;
import io.hzg.demo1.service.WechatMPService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class WechatMPScheduler {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private WechatMPService wechatMPService;

    @Autowired
    private WechatMPVariable wechatMPVariable;

    @Value("${wechatmp.refresh.accesstoken.enabled}")
    private boolean refreshAccessTokenEnabled;

    @Scheduled(cron = "${wechatmp.accesstoken.refreshcron}")
    public void refreshAccessToken(){
        if (refreshAccessTokenEnabled){
            logger.info("begin to refresh wechatmp access token");
            String accessToken = wechatMPService.getAccessToken();
            wechatMPVariable.setAccessToken(accessToken);
            logger.info("wechatmp access token has been refreshed: {}", accessToken);
        }
    }
}
