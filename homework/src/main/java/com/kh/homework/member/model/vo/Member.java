package com.kh.homework.member.model.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Member {
	private String userId;
	private String userPwd;
	private String userName;
	private String email;
	private String phone;
	private String postcode;
	private String address1;
	private String address2;
	private String enrollDate;
	private String status;
}
