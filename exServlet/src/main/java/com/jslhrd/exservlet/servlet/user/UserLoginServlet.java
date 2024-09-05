package com.jslhrd.exservlet.servlet.user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jslhrd.exservlet.model.user.UserDAO;
import com.jslhrd.exservlet.util.UserSHA256;

/**
 * Servlet implementation class UserLoginServlet
 */
@WebServlet("/user_login")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("User/user_login.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserDAO dao=UserDAO.getInstance();
		
		String userid=request.getParameter("userid");
		String passwd=UserSHA256.getSHA256(request.getParameter("passwd"));
		int row=dao.userLogin(userid,passwd);
		if(row==1) {//로그인 성궁
			//UserDTO dto=dao.userSelect(userid);
			//세션생성
			HttpSession session= request.getSession();
			session.setAttribute("user", userid);
			session.setMaxInactiveInterval(1800);
		}
		request.setAttribute("row", row);
		RequestDispatcher rd = request.getRequestDispatcher("User/user_login_pro.jsp");
		rd.forward(request, response);
		
	}

}
