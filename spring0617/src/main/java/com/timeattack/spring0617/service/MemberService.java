package com.timeattack.spring0617.service;

import com.timeattack.spring0617.dto.RequestCreateMemberDTO;
import com.timeattack.spring0617.dto.RequestUpdateMemberDTO;
import com.timeattack.spring0617.dto.ResponseMemberDTO;

import java.util.List;

public interface MemberService {
    long saveMember(RequestCreateMemberDTO requestCreateMemberDTO);
    ResponseMemberDTO findMember(Long id);
    long removeMember(Long id);
    long modifyMember(Long id, RequestUpdateMemberDTO requestUpdateMemberDTO);
    List<ResponseMemberDTO> recommendMember(Long id);
}