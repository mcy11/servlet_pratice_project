package dao;

import model.UserRel;

/**
 * @author mcy
 * @date 2019/7/11
 */
public interface UserRelDao {

    /**
     * 插入用户负责人关系
     * @param userRel
     */
    int insert(UserRel userRel);
}
