package cn.wcj.demo.ServiceImp;

import cn.wcj.demo.DO.User;
import cn.wcj.demo.mapper.UserMapper;
import cn.wcj.demo.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 */

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
