package com.nex1.app.entity;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.CrossOrigin;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder

public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long no;
	
	@Column(nullable = false, length = 100)
	private String cate;
	
	@Column(nullable = false, length = 200)
	private String pname;
	
	@Column(columnDefinition = "TEXT")
	private String comment;
	
	
	@Builder.Default
	private int price1 = 1000;
	
	@Builder.Default
	private int price2 = 1300;
	
	@Builder.Default	
	private int amount=1;
	
	@Builder.Default
	private String img1="/imges/noimg1.jpg";
	
	@Builder.Default
	private String img2="/imges/noimg2.jpg";
	
	@Builder.Default
	private LocalDateTime resdate = LocalDateTime.now();
	
}
