package io.hzg.demo1.service;


import io.hzg.demo1.exception.ClientException;
import io.hzg.demo1.po.User;
import io.hzg.demo1.po.UserDetail;
import io.hzg.demo1.vo.Position;

public interface UserService {

    void create(User user, UserDetail userDetail);

    void delete(String openid);

    void savePosition(String openId, Position position);

    Position loadPosition(String openid);

    void checkIn(String openid) throws ClientException;

    void checkOut(String openid) throws ClientException;

    User getUserFromWechatMP(String openId) throws ClientException;
}
