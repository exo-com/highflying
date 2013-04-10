package com.highflying.project.service;

import java.util.List;

import com.highflying.dto.MessageDto;


public interface IMessageService {
	void setMessageDto(MessageDto msgDto);
	MessageDto getMessageDto();
	
	Integer getNewMsgCount(int receiver_idx);
	Integer getTotalReceiveCount(int receiver_idx);
	Integer getTotalSendCount(int sender_idx);
	
	List<MessageDto> receiveList(int receiver_idx, int startno, int endno);
	List<MessageDto> sendList(int sender_idx, int startno, int endno);
	
	MessageDto sendMsgDetail(int idx, int sender_idx);
	MessageDto receiveMsgDetail(int idx, int receiver_idx);
	
	List<String> getMemberEmail(List<Integer> member_idxs);
	List<String> confirmMemberEmail(List<String> member_idxs);
	Integer getMemberIdx(String email);
	List<MessageDto> getMemberInfo(List<String> emails);
	
	int sendMessage(List<MessageDto> receiverz);
	int deleteFromSender(List<Integer> idxs, int sender_idx);
	int deleteFromReceiver(List<Integer> idxs, int receiver_idx);
	
	int messageRead(int idx, int receiver_idx);
	
	int sendMessageFromOtherController(MessageDto dto);
}
