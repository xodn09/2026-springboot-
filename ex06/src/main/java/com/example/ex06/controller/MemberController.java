package com.example.ex06.controller;


import com.example.ex06.entity.Member;
import com.example.ex06.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("members")
@RequiredArgsConstructor
@CrossOrigin //Cors 에러 해결임
public class MemberController {

    private final MemberService memberService;

    @GetMapping
    public List<Member> findAll(){
        return memberService.getMembers();
    }

    @GetMapping("/{id}")
    public Member findById(@PathVariable Long id){
        return memberService.getMember(id);
    }
}
