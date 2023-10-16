package com.abin.mallchat.common.oauth2.mapper;


import com.abin.mallchat.common.oauth2.entity.UserInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.mapstruct.Mapper;

/**
 * @author 胡帅冰
 * @description 针对表【user_info】的数据库操作Mapper
 * @createDate 2023-10-14 20:35:51
 * @Entity generator.domain.UserInfo
 */
@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {

}
