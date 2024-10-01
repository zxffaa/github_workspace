package com.jslhrd.exmvc.controller.board;

import com.jslhrd.exmvc.service.Action;
import com.jslhrd.exmvc.service.board.*;

public class BoardActionFactory {
	private static BoardActionFactory instance = new BoardActionFactory();
	private BoardActionFactory(){
		super();
	}
	public static BoardActionFactory getInstance() {
		return instance;
	}
	
	public Action getAction(String cmd) {
		Action action=null;
		System.out.print("BoardActionFactory:"+cmd);
		if(cmd.equals("board_list")) {
			action=new BoardListAction();
		}else if(cmd.equals("board_write")) {
			action=new BoardWriteAction();
		}else if(cmd.equals("board_write_pro")){
			action=new BoardWriteProAction();
		}else if(cmd.equals("board_view")){
			action=new BoardViewAction();
		}else if(cmd.equals("board_modify")) {
			action=new BoardModifyAction();
		}else if(cmd.equals("board_modify_pro")) {
			action=new BoardModifyProAction();
		}else if(cmd.equals("board_delete")) {
			action=new BoardDeleteAction();
		}else if(cmd.equals("board_delete_pro")) {
			action=new BoardDeleteProAction();
		}
		return action;
	}
}
