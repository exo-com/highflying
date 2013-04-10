package kr.co.stc.core.view;

import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.AbstractView;

/**
 * COPYRIGHT(C) 2012 STC<br/>
 * JSON 포맷으로 데이타를 리턴해주는 View
 * 
 * @FileName MessageJsonView.java
 * @CreateDate 2012.11.16
 * @author YOUNGMINJUN
 * @version 0.0.1
 */
@Component("jsonView")
public class MessageJsonView extends AbstractView {
	public MessageJsonView(){
		this.setContentType("application/json");
	}

	@Override
	protected void renderMergedOutputModel(Map<String, Object> model, HttpServletRequest request, HttpServletResponse response) throws Exception {
		String[] key = (String[]) model.keySet().toArray(new String[0]);
		response.setContentType("text/html;charset=UTF-8");
		response.setHeader("Cache-Control", "no-cache");
		JSONObject obj = new JSONObject();
		PrintWriter pw = null;
		try{
			pw = response.getWriter();
			for(int i = 0, length = key.length; i < length; i++){
				obj.put(key[i], model.get(key[i]));
			}
			
			pw.print(obj.toString());
			pw.flush();
			pw.close();
		}finally{
			if(null != pw){
				pw.close();
			}
		}

	}

}
