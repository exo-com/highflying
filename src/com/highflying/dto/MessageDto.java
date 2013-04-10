package com.highflying.dto;

public class MessageDto {
	private int idx = -1;
	private int sender_idx = -1;
	private int receiver_idx = -1;
	private String sender_del = "x";
	private String receiver_del = "";
	private String title = "";
	private String context = "";
	private String senddate = "";
	private String receivedate = "";
	private String sender_email = "";
	private String receiver_email = "";
	private String sender_nickname = "";
	private String receiver_nickname = "";
	private int opposite_idx = -1;
	private int msgcount = 0;
	private int unreadcount = 0;
	private String msgbox = "";
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public int getSender_idx() {
		return sender_idx;
	}
	public void setSender_idx(int sender_idx) {
		this.sender_idx = sender_idx;
	}
	public int getReceiver_idx() {
		return receiver_idx;
	}
	public void setReceiver_idx(int receiver_idx) {
		this.receiver_idx = receiver_idx;
	}
	public String getSender_del() {
		return sender_del;
	}
	public void setSender_del(String sender_del) {
		this.sender_del = sender_del;
	}
	public String getReceiver_del() {
		return receiver_del;
	}
	public void setReceiver_del(String receiver_del) {
		this.receiver_del = receiver_del;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public String getSenddate() {
		return senddate;
	}
	public void setSenddate(String senddate) {
		this.senddate = senddate;
	}
	public String getReceivedate() {
		return receivedate;
	}
	public void setReceivedate(String receivedate) {
		this.receivedate = receivedate;
	}
	public String getSender_email() {
		return sender_email;
	}
	public void setSender_email(String sender_email) {
		this.sender_email = sender_email;
	}
	public String getReceiver_email() {
		return receiver_email;
	}
	public void setReceiver_email(String receiver_email) {
		this.receiver_email = receiver_email;
	}
	public String getSender_nickname() {
		return sender_nickname;
	}
	public void setSender_nickname(String sender_nickname) {
		this.sender_nickname = sender_nickname;
	}
	public String getReceiver_nickname() {
		return receiver_nickname;
	}
	public void setReceiver_nickname(String receiver_nickname) {
		this.receiver_nickname = receiver_nickname;
	}
	public int getOpposite_idx() {
		return opposite_idx;
	}
	public void setOpposite_idx(int opposite_idx) {
		this.opposite_idx = opposite_idx;
	}
	public int getMsgcount() {
		return msgcount;
	}
	public void setMsgcount(int msgcount) {
		this.msgcount = msgcount;
	}
	public int getUnreadcount() {
		return unreadcount;
	}
	public void setUnreadcount(int unreadcount) {
		this.unreadcount = unreadcount;
	}
	public String getMsgbox() {
		return msgbox;
	}
	public void setMsgbox(String msgbox) {
		this.msgbox = msgbox;
	}
	
}
