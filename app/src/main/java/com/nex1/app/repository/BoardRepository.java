package com.nex1.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nex1.app.entity.Board;

public interface BoardRepository extends JpaRepository<Board, Long>{
	List<Board> findTop3ByOrderByResdateDesc();

}

