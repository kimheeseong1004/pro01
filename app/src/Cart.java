package com.nex1.app.entity;

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
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cart {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cno;
	
    @Column(nullable = false, length = 50)
	private String id;
	
	private Long pno;
	
	@Builder.Default
	private int price = 1300;
	
	@Builder.Default
	private int amount = 1;	//상품 현재 잔존 수량
}
