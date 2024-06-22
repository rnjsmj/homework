package com.kh.homework.member.model.repository;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.kh.homework.member.model.vo.Member;

@Repository
public class MemberRepository {

	public Member findMember(SqlSessionTemplate sqlSession, String userId) {
		return sqlSession.selectOne("memberMapper.findMember", userId);
	}
}
