package io.hzg.demo1.dto;

import javax.validation.constraints.NotBlank;

public class WechatMPClickEventReqMsg extends  WechatMPEventReqMsg{

    //    protected String EventKey;
    @NotBlank
    public String getEventKey() {
        return this.getString("EventKey");
    }
}
