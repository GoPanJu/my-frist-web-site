package com.ez.ezBears.board.model;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.ez.ezBears.common.MyBoardSearchVo;
import com.ez.ezBears.common.SearchVO;

@Mapper
public interface BoardDAO {
	List<Map<String, Object>> selectAllBoard(MyBoardSearchVo searchVo);
    int selectTotalCount(SearchVO serarchVo);
    int insertBoard(BoardVO boardVo);
    int randomNum(int randomNo);
    List<Map<String, Object>> boardAll();
    int checkExistingRandomId(String randomId);
    int insertFileBoard(BoardFileVO boardFileVo);
    int updateDowncount(int boardFileNo);
    List<Map<String, Object>> nextPage(int boardNo);
    Map<String, Object> selectDetail(int boardNo);
    int updateViewsCount(int boardNo);
    List<Map<String, Object>> selectBoardList(int boardNo);
    List<Map<String, Object>> selectBoardFile(int boardNo);
    void deleteBoardFile(int boardNo);
	int deleteBoard(int boardNo);
	List<Map<String, Object>> selectboardFileByNo(int boardNo);
	int updateboard(BoardVO boardVo);
	
	int updateSortNo(BoardVO boardVo);
	int insertReply(BoardVO boardVo);
	
	List<Map<String, Object>> selectReply(MyBoardSearchVo searchVo);
	int selectGroupNo();
	int selectReplyTotalCount(int groupNo);
	
	List<Map<String, Object>> boardWriteAll();
	int checkExistingWriteId(String randomWrite);
	
	BoardVO selectReplyBoardNo(int boardNo);
	int updeteReply(BoardVO boardVo);
	
	int deleteReply(int boardNo);
	int insertBoardReReply(BoardVO boardVo);
}
