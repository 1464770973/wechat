package io.hzg.demo1.service;

import com.alibaba.fastjson.JSONObject;

public interface WechatMPService {

    String getAccessToken();

    JSONObject getUserAccessToken(String code);

}
