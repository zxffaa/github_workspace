package com.jslhrd.exshop.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.exshop.service.Action;
import com.jslhrd.exshop.service.MemberInsertAction;
import com.jslhrd.exshop.service.MemberInsertProAction;
import com.jslhrd.exshop.service.MemberListAction;

/**
 * Servlet implementation class ShopController
 */
@WebServlet("/Shop")
public class ShopController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShopController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String cmd=request.getParameter("cmd");
		//System.out.print(cmd);
		
		Action action=null;
		if(cmd.equals("mInsert")){//등록폼
			action = new MemberInsertAction();
		}
		else if(cmd.equals("mInsertPro")) {//등록처리
			action = new MemberInsertProAction();
		}else if(cmd.equals("mList")) {
			action = new MemberListAction();
		}
		action.process(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doGet(request,response);
	}

}
