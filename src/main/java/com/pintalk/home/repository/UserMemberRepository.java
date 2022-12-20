package com.pintalk.home.repository;

import com.pintalk.home.model.UserMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMemberRepository extends JpaRepository<UserMember, Long> {

    UserMember findByName(String username);

}
