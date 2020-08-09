package com.onshuu.www.board.mapper;

import java.util.List;


import com.onshuu.www.board.dto.BoardFileDto;
import org.apache.ibatis.annotations.Mapper;

import com.onshuu.www.board.dto.BoardDto;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BoardMapper {
    List<BoardDto> selectBoardList() throws Exception;

    void insertBoard(BoardDto board) throws Exception;

    BoardDto selectBoardDetail(int boardIdx) throws Exception;

    void updateHitCount(int boardIdx) throws Exception;

    void updateBoard(BoardDto board) throws Exception;

    void deleteBoard(int boardIdx) throws Exception;

    void insertBoardFileList(List<BoardFileDto> list) throws Exception;

    List<BoardFileDto> selectBoardFileList(int boardIdx) throws Exception;

    BoardFileDto selectBoardFileInformation(@Param("idx") int idx, @Param("boardIdx" )int boardIdx);

}