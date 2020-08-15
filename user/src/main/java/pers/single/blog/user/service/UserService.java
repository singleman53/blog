package pers.single.blog.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pers.single.blog.common.dto.CommonResult;
import pers.single.blog.common.dto.User;
import pers.single.blog.user.dao.UserDao;
import sun.security.provider.MD5;


@Service
@Transactional
public class UserService {
    private MD5 md5;
    private UserDao userDao;


    @Autowired // 推荐使用setter注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

//    @Autowired
    public void setMd5(MD5 md5) {
        this.md5 = md5;
    }

    public CommonResult register(User user) {

        User save = userDao.save(user);
        return new CommonResult();
    }

}
