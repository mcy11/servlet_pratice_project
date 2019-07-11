package service.impl;

import dao.UserRelDao;
import model.UserRel;
import model.impl.UserRelDaoImpl;
import service.UserRelService;

/**
 * @author mcy
 * @date 2019/7/11
 */
public class UserRelServiceImpl implements UserRelService {

    private UserRelDao userRelDao = new UserRelDaoImpl();

    @Override
    public int addUserRel(UserRel userRel) {
        return userRelDao.insert(userRel);
    }
}
