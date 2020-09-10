package com.baobao.service;
import com.baobao.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author mybatis generate
 * @since 2020-09-09
 */
public interface UserService extends IService<User> {


    String login(String username, String password);
}
