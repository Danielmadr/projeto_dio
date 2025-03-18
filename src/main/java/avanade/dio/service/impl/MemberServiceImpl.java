package avanade.dio.service.impl;

import avanade.dio.domain.model.Member;
import avanade.dio.domain.repository.MemberRepository;
import avanade.dio.service.MemberService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public List<Member> listAll() {
        return memberRepository.findAll();
    }
}

