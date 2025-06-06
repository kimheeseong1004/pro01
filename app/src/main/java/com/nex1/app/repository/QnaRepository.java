package com.nex1.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nex1.app.entity.Qna;

public interface QnaRepository extends JpaRepository<Qna, Long>{
	List<Qna> findByLevel(int level);
	List<Qna> findByParno(Long parno);
	List<Qna> findAllByOrderByParnoDescNoAsc();
	List<Qna> deleteByParno(Long parno);
	List<Qna> findTop3ByLevelOrderByResdateDesc(int level); 
}
