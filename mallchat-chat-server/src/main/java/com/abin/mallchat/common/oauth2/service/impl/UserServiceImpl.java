package com.abin.mallchat.common.oauth2.service.impl;

import com.abin.mallchat.common.oauth2.constant.MessageConstant;
import com.abin.mallchat.common.oauth2.dto.SecurityUser;
import com.abin.mallchat.common.oauth2.entity.UserInfo;
import com.abin.mallchat.common.oauth2.mapper.UserInfoMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Component(value = "userInfoService")
public class UserServiceImpl implements UserDetailsService {

    @Autowired
    private UserInfoMapper userInfoMapper;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserInfo userInfo = userInfoMapper.selectOne(new QueryWrapper<UserInfo>().lambda().eq(UserInfo::getUsername, username));
        if (Objects.isNull(userInfo)) {
            throw new UsernameNotFoundException(MessageConstant.USERNAME_PASSWORD_ERROR);
        }
        SecurityUser securityUser = new SecurityUser();
        BeanUtils.copyProperties(userInfo, securityUser);
        securityUser.setEnable(!Objects.equals(0, userInfo.getIsDisable()));
        return securityUser;
    }
}