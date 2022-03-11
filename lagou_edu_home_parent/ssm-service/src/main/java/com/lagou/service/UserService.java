package com.lagou.service;

import com.github.pagehelper.PageInfo;
import com.lagou.domain.ResponseResult;
import com.lagou.domain.Role;
import com.lagou.domain.User;
import com.lagou.domain.UserVO;

import java.util.List;

public interface UserService {

    /*
       用户分页&多条件查询
    */
    public PageInfo findAllUserByPage(UserVO userVO);

    /*
       用户状态设置（修改用户状态）
    */
    public void updateUserStatus(int id, String status);

     /*
        用户登陆
     */

    public User login(User user) throws Exception;

    /*
       分配角色（回显）
    */
    public List<Role> findUserRelationRoleById(Integer id);


    /*
        用户关联角色
     */
    public void userContextRole(UserVO userVo);

    /*
       获取用户权限，进行菜单动态展示
    */
    public ResponseResult getUserPermissions(Integer userid);
}
