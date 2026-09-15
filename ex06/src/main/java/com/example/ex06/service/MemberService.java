package com.example.ex06.service;

import com.example.ex06.entity.Member;
import com.example.ex06.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    @GetMapping
    public List<Member> getMembers(){
        return memberRepository.findAll();
    }

    public Member getMember(Long id){
        Optional<Member> optionalMember = memberRepository.findById(id);
        return optionalMember.get();
//        return memberRepo.orElsesitory.findById(id)(null);
    }
}
