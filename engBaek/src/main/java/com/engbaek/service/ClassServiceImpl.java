package com.engbaek.service;

import java.util.List;

import com.engbaek.domain.ClassAttachVO;
import com.engbaek.domain.ClassVO;
import com.engbaek.domain.Criteria;

public class ClassServiceImpl implements ClassService{

	 //수업자료&공지  총 게시물 수 
	@Override
	public int getTotal(Criteria cri) {
		return 0;
	}
	//수업자료&공지 게시판 목록
	@Override
	public List<ClassVO> getList(Criteria cri) {
		return null;
	}
	 //수업자료&공지 게시물 등록 
	@Override	
	public void register(ClassVO class_) {
		
	}
	//수업자료&공지 게시물 상세 정보 
	@Override
	public ClassVO get(Long class_bno) {
		return null;
	}
	 //수업자료&공지 게시물 수정
	@Override
	public boolean modify(ClassVO class_) {
		return false;
	}
	//수업자료&공지 게시물 삭제
	@Override
	public boolean remove(Long class_bno) {
		return false;
	}
	//수업자료&공지 첨부파일 목록 
	@Override
	public List<ClassAttachVO> getAttachList(Long class_bno) {
		return null;
	}

}
