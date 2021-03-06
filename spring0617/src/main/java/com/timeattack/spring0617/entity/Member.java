package com.timeattack.spring0617.entity;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.timeattack.spring0617.dto.RequestUpdateMemberDTO;
import lombok.*;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member extends Timestamped{
    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idx;

    @Column(nullable = false)
    private String myServiceEmail;

    @Column(nullable = false)
    private String myServiceName;

    @Column(nullable = false)
    private int myServiceAge;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Gender myServiceGender;

    @Builder
    public Member(String email, String name, int age, Gender gender) {
        this.myServiceEmail = email;
        this.myServiceName = name;
        this.myServiceAge = age;
        this.myServiceGender = gender;
    }

    public void updateProfile(RequestUpdateMemberDTO requestUpdateMemberDTO) {
        this.myServiceName = requestUpdateMemberDTO.getName();
        this.myServiceAge = requestUpdateMemberDTO.getAge();
        this.myServiceGender =requestUpdateMemberDTO.getGender() == 0 ? Gender.M : Gender.F;
    }
}