package com.highflying.project.dao.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.highflying.dto.MessageDto;
import com.highflying.project.common.HighflyJdbcDaoSupport;
import com.highflying.project.dao.IMessageDao;



@Repository("messageDao")
public class MessageDao extends HighflyJdbcDaoSupport implements IMessageDao {
	private MessageDto msgDto;
	
	@Override
	public void setMessageDto(MessageDto msgDto) {
		this.msgDto = msgDto;
	}

	@Override
	public MessageDto getMessageDto() {
		return msgDto;
	}

	@Override
	public Integer getNewMsgCount(int receiver_idx) {
		Integer result = null;
		
		try {
			result = (Integer)sqlMapClient.queryForObject("messageSQL.getNewMsgCount", receiver_idx);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return result;
	}

	@Override
	public List<MessageDto> receiveList(int receiver_idx, int startno, int endno) {
		List<MessageDto> result = null;
		HashMap<String, Object> param = new HashMap<String, Object>();
		
		param.put("idx", receiver_idx);
		param.put("startno", startno);
		param.put("endno", endno);
		
		try {
			result = (List<MessageDto>)sqlMapClient.queryForList("messageSQL.receiveList", param);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return result;
	}

	@Override
	public List<MessageDto> sendList(int sender_idx, int startno, int endno) {
		List<MessageDto> result = null;
		HashMap<String, Object> param = new HashMap<String, Object>();
		
		param.put("idx", sender_idx);
		param.put("startno", startno);
		param.put("endno", endno);
		
		try {
			result = (List<MessageDto>)sqlMapClient.queryForList("messageSQL.sendList", param);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return result;
	}

	@Override
	public MessageDto sendMsgDetail(int idx, int sender_idx) {
		MessageDto result = null;
		HashMap<String, Object> param = new HashMap<String, Object>();
		
		param.put("idx", idx);
		param.put("sender_idx", sender_idx);
		
		try {
			result = (MessageDto)sqlMapClient.queryForObject("messageSQL.sendMsgDetail", param);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return result;
	}

	@Override
	public MessageDto receiveMsgDetail(int idx, int receiver_idx) {
		MessageDto result = null;
		HashMap<String, Object> param = new HashMap<String, Object>();
		
		param.put("idx", idx);
		param.put("receiver_idx", receiver_idx);		
		
		try {
			result = (MessageDto)sqlMapClient.queryForObject("messageSQL.receiveMsgDetail", param);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return result;
	}

	@Override
	public List<String> getMemberEmail(List<Integer> member_idxs) {
		List<String> result = null;
		
		try {
			result = (List<String>)sqlMapClient.queryForList("messageSQL.getMemberEmail", member_idxs);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return result;
	}

	@Override
	public Integer getMemberIdx(String email) {
		Integer result = null;
		
		try {
			result = (Integer)sqlMapClient.queryForObject("messageSQL.getMemberIdx", email);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return result;
	}

	@Override
	public int sendMessage(List<MessageDto> receiverz) {
		int ret = 1;
		
		try {
			sqlMapClient.startTransaction();
			
			for(MessageDto receiver : receiverz) {
				System.err.println(receiver.getReceiver_email()+","+receiver.getReceiver_idx());
				msgDto.setReceiver_email(receiver.getReceiver_email());
				msgDto.setReceiver_idx(receiver.getReceiver_idx());
				msgDto.setReceiver_nickname(receiver.getReceiver_nickname());
				
				sqlMapClient.insert("messageSQL.sendMessage", msgDto);
			}
			
			sqlMapClient.commitTransaction();
		} catch(Exception ex) {
			ex.printStackTrace();
			ret = 0;
		} finally {
			try {
				sqlMapClient.endTransaction();
			} catch(Exception ex) {
				ex.printStackTrace();
			}
		}
		
		return ret;
	}

	@Override
	public int deleteFromSender(List<Integer> idxs, int sender_idx) {
		int ret = 0;
		HashMap<String, Object> param = new HashMap<String, Object>();
		
		param.put("idxs", idxs);
		param.put("sender_idx", sender_idx);
		
		try {
			ret = sqlMapClient.update("messageSQL.deleteFromSender", param);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return ret;
	}

	@Override
	public int deleteFromReceiver(List<Integer> idxs, int receiver_idx) {
		int ret = 0;
		HashMap<String, Object> param = new HashMap<String, Object>();
		
		param.put("idxs", idxs);
		param.put("receiver_idx", receiver_idx);
		
		try {
			ret = sqlMapClient.update("messageSQL.deleteFromReceiver", param);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return ret;
	}

	@Override
	public List<MessageDto> getMemberInfo(List<String> emails) {
		List<MessageDto> result = null;
		
		try {
			result = (List<MessageDto>)sqlMapClient.queryForList("messageSQL.getMemberInfo", emails);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return result;
	}

	@Override
	public int messageRead(int idx, int receiver_idx) {
		int ret = 0;
		HashMap<String, Object> param = new HashMap<String, Object>();
		
		param.put("idx", idx);
		param.put("receiver_idx", receiver_idx);
		
		try {
			ret = sqlMapClient.update("messageSQL.messageRead", param);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return ret;
	}

	@Override
	public Integer getTotalReceiveCount(int receiver_idx) {
		Integer result = null;
		
		try {
			result = (Integer)sqlMapClient.queryForObject("messageSQL.getTotalReceiveCount", receiver_idx);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return result;
	}

	@Override
	public Integer getTotalSendCount(int sender_idx) {
		Integer result = null;
		
		try {
			result = (Integer)sqlMapClient.queryForObject("messageSQL.getTotalSendCount", sender_idx);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return result;
	}

	@Override
	public List<String> confirmMemberEmail(List<String> member_idxs) {
		List<String> result = null;
		
		try {
			result = (List<String>)sqlMapClient.queryForList("messageSQL.confirmMemberEmail", member_idxs);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return result;
	}

}
