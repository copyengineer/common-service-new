package com.xjb.impl.email;

import com.xjb.api.email.EmailService;
import org.springframework.stereotype.Service;

/**
 * @author 辛集斌
 * @date 2022/3/24
 */
@Service("EmailService")
public class EmailServiceImpl implements EmailService {

    @Override
    public String sendSampleEmail() {
        return "hello world";
    }
}
