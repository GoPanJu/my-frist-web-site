package com.ez.ezBears.message.model;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MessageDAO {
	int SendMessage(MessageSendVO messageSendVo);
	int ReceiveMessage(@Param("messageSendNo") int messageSendNo, @Param("messageReceiveVo") MessageReceiveVO messageReceveVo);
	List<Map<String, Object>> selectSendBox(int sendUserNo);
	List<Map<String, Object>> selectReceiveBox(int receiveUserNo);
	int receiveMessageDel(int delNo);
	int sendMessageDel(int delNo);
	List<Integer> dropMessageList();
	int delMessageReceive(int delNo);
	int delMessageSend(int delNo);
}
