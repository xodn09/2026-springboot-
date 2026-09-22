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

    @PostMapping
    public Member save(@RequestBody Member member){
        return memberService.save(member);
    }

    @PutMapping("/{id}")
    public Member update(
            @PathVariable Long id,
            @RequestBody Member member) throws Exception {
        return memberService.update(id, member);
    }

    @DeleteMapping("/{id}")
    public boolean deleteMember(@PathVariable Long id) throws Exception {
        boolean result = memberService.deleteMember(id);
        return false;
    }
}
