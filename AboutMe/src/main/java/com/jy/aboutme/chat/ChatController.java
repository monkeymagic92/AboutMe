package com.jy.aboutme.chat;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jy.aboutme.chat.model.ChatPARAM;
import com.jy.aboutme.chat.model.ChatVO;

@Controller
@RequestMapping("/chat")
public class ChatController {

	@Autowired
	private ChatService service;
	

	@RequestMapping(value="/insChat", method=RequestMethod.POST)
	public @ResponseBody String cmtReg(@RequestBody ChatPARAM param) {
		
		int result = service.insChat(param);
		return String.valueOf(result); 
	}
	
	
	// 댓글 뿌리기
	@RequestMapping(value="/selChat", method=RequestMethod.GET)
	private @ResponseBody List<ChatVO> selCmt(Model model, ChatPARAM param){
		
		return service.selChat();
	}
	
}
