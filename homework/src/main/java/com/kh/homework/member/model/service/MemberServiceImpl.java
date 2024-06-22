package com.kh.homework.member.model.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import com.kh.homework.member.model.repository.MemberRepository;
import com.kh.homework.member.model.vo.Member;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberServcie {

	private final MemberRepository memberRepository;
	private final SqlSessionTemplate sqlSession;
	
	@Override
	public Member findMember(String userId) {
		return memberRepository.findMember(sqlSession, userId);
	}

}
