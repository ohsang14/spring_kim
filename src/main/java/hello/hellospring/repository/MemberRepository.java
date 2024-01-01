package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
        Optional<Member> findById(Long id); // Optional null값이 들어올떄 쓰는것
        Optional<Member> findByName(String name);
        List<Member> findAll();


}
