package com.nex1.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nex1.app.entity.Board;
import com.nex1.app.entity.Product;
import com.nex1.app.entity.Qna;
import com.nex1.app.repository.BoardRepository;
import com.nex1.app.repository.ProductRepository;
import com.nex1.app.repository.QnaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MainService {
	private final ProductRepository productRepository;
	private final BoardRepository boardRepository;
	private final QnaRepository qnaRepository;
	
	public List<Product> getLatestProducts() {
		return productRepository.findTop3ByOrderByResdateDesc();
	}
	
	public List<Board> getLatestBoards() {
		return boardRepository.findTop3ByOrderByResdateDesc();
	}
	
	public List<Qna> getLatestQnas() {
		return qnaRepository.findTop3ByLevelOrderByResdateDesc(1);
	}
	
}
