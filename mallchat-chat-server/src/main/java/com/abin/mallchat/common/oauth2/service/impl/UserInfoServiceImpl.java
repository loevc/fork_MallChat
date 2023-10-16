package com.abin.mallchat.common.oauth2.service.impl;

import com.abin.mallchat.common.oauth2.entity.UserInfo;
import com.abin.mallchat.common.oauth2.mapper.UserInfoMapper;
import com.abin.mallchat.common.oauth2.service.UserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
* @author 胡帅冰
* @description 针对表【user_info】的数据库操作Service实现
* @createDate 2023-10-14 20:35:51
*/
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo>
    implements UserInfoService {

}




