package com.jy.aboutme.board;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.jy.aboutme.Pagination;
import com.jy.aboutme.board.model.BoardDMI;
import com.jy.aboutme.board.model.BoardPARAM;

@Mapper
public interface BoardMapper {

	List<BoardPARAM> boardList(Pagination p);	// 전체글 리스트
	
	List<BoardPARAM> searchNm(BoardPARAM param);	// 작성자 검색
	
	List<BoardPARAM> searchTitle(BoardPARAM param); // 제목 검색
	
	int countSearchNm(BoardPARAM param);	// 작성자 검색 총 갯수
	
	int countSearchTitle(BoardPARAM param); // 제목 검색 총 갯수
	
	int totalBoardCount();	// 게시글 총 개수
	
	
	
	BoardPARAM boardDetail(BoardPARAM param); // 상세글 페이지
	
	BoardDMI selScr(BoardPARAM param);	// scr (비밀글인지 아닌지 확인용)
	
	int insReg(BoardPARAM param);	// 글 등록
	
	int updReg(BoardPARAM param);   // 글 수정
	
	BoardPARAM test(BoardPARAM param);	// 테스트용 board/detail 다되면 지우면됨
	
	int delBoard(BoardPARAM param);	// 게시글 삭제
	
	 
}
