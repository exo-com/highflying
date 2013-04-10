package com.highflying.project.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.highflying.dto.MessageDto;
import com.highflying.project.dao.IMessageDao;
import com.highflying.project.service.IMessageService;



@Service(value="messageService")
public class MessageService implements IMessageService {
	@Resource(name="messageDao")
	private IMessageDao messageDao;
	
	public void setMessageDto(MessageDto msgDto) {
		System.err.println("MessageDao setMessageDto");
		messageDao.setMessageDto(msgDto);
	}
	
	public MessageDto getMessageDto() {
		System.err.println("MessageDao getMessageDto");
		return messageDao.getMessageDto();
	}

	@Override
	public Integer getNewMsgCount(int receiver_idx) {
		System.err.println("MessageDao getNewMsgCount");
		return messageDao.getNewMsgCount(receiver_idx);
	}

	@Override
	public List<MessageDto> receiveList(int receiver_idx, int startno, int endno) {
		System.err.println("MessageDao receiveList");
		return messageDao.receiveList(receiver_idx, startno, endno);
	}

	@Override
	public List<MessageDto> sendList(int sender_idx, int startno, int endno) {
		System.err.println("MessageDao sendList");
		return messageDao.sendList(sender_idx, startno, endno);
	}

	@Override
	public MessageDto sendMsgDetail(int idx, int sender_idx) {
		System.err.println("MessageDao sendMsgDetail");
		return messageDao.sendMsgDetail(idx, sender_idx);
	}

	@Override
	public MessageDto receiveMsgDetail(int idx, int receiver_idx) {
		System.err.println("MessageDao sendMsgDetail");
		return messageDao.receiveMsgDetail(idx, receiver_idx);
	}

	@Override
	public List<String> getMemberEmail(List<Integer> member_idxs) {
		System.err.println("MessageDao getMemberEmail");
		return messageDao.getMemberEmail(member_idxs);
	}

	@Override
	public Integer getMemberIdx(String email) {
		System.err.println("MessageDao getMemberIdx");
		return messageDao.getMemberIdx(email);
	}

	@Override
	public int sendMessage(List<MessageDto> receiverz) {
		System.err.println("MessageDao sendMessage");
		return messageDao.sendMessage(receiverz);
	}

	@Override
	public int deleteFromSender(List<Integer> idxs, int sender_idx) {
		System.err.println("MessageDao deleteFromSender");
		return messageDao.deleteFromSender(idxs, sender_idx);
	}

	@Override
	public int deleteFromReceiver(List<Integer> idxs, int receiver_idx) {
		System.err.println("MessageDao deleteFromReceiver");
		return messageDao.deleteFromReceiver(idxs, receiver_idx);
	}

	@Override
	public List<MessageDto> getMemberInfo(List<String> emails) {
		System.err.println("MessageDao getMemberNickname");
		return messageDao.getMemberInfo(emails);
	}

	@Override
	public int messageRead(int idx, int receiver_idx) {
		System.err.println("MessageDao messageRead");
		return messageDao.messageRead(idx, receiver_idx);
	}

	@Override
	public Integer getTotalReceiveCount(int receiver_idx) {
		System.err.println("MessageDao getTotalReceiveCount");
		return messageDao.getTotalReceiveCount(receiver_idx);
	}

	@Override
	public Integer getTotalSendCount(int sender_idx) {
		System.err.println("MessageDao getTotalSendCount");
		return messageDao.getTotalSendCount(sender_idx);
	}

	@Override
	public List<String> confirmMemberEmail(List<String> member_idxs) {
		System.err.println("MessageDao confirmMemberEmail");
		return messageDao.confirmMemberEmail(member_idxs);
	}

	@Override
	public int sendMessageFromOtherController(MessageDto dto) {
		System.err.println("MessageDao sendMessageFromOtherController");
		
		List<Integer> memberlst = new ArrayList<Integer>();
		memberlst.add(dto.getSender_idx());
		
		List<String> memberemail = getMemberEmail(memberlst);
		
		if(memberemail == null || memberemail.size() <= 0) {
			return 0;
		}
		
		dto.setSender_email(memberemail.get(0));
		
		memberlst.clear();
		memberlst.add(dto.getReceiver_idx());
		
		memberemail = getMemberEmail(memberlst);
		
		if(memberemail == null || memberemail.size() <= 0) {
			return 0;
		}

		dto.setSender_del("o");
		setMessageDto(dto);
		return sendMessage(getMemberInfo(memberemail));
	}

}
