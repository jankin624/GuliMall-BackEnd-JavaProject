package com.atguigu.gulimall.member;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.atguigu.gulimall.member.service.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallMemberApplicationTests {
    @Autowired
    private MemberService memberService;
    @Test
    void contextLoads() {
        MemberEntity member=new MemberEntity();
        member.setNickname("测试member模块");
        memberService.save(member);
    }

}
