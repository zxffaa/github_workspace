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
import com.jslhrd.exservlet.model.user.UserDTO;
import com.jslhrd.exservlet.util.UserSHA256;

/**
 * Servlet implementation class UserLoginServlet
 */
//로그인
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
		//세션 유무 판단
		HttpSession session = request.getSession();
		
		if(session.getAttribute("user") != null) {//세션이 있을 경우
			response.sendRedirect("/index");
		}else {//없는을 경우
			RequestDispatcher rd = 
					request.getRequestDispatcher("User/user_login.jsp");
			rd.forward(request, response);			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserDAO dao = UserDAO.getInstance();
		
		String userid = request.getParameter("userid");
		String passwd = UserSHA256.getSHA256(request.getParameter("passwd"));
		
		int row = dao.userLogin(userid, passwd);
		if(row==1) {//로그인 성공시(session 객체 생성)
			UserDTO dto = dao.userSelect(userid);//회원정보검색
			HttpSession session = request.getSession();//세션객체생성
			session.setAttribute("user", dto);
			//session.setAttribute("user", dto);
			session.setMaxInactiveInterval(1800);//세션유지시간(30분)
		}
		
		request.setAttribute("row", row);
		
/*		
		RequestDispatcher rd = 
				request.getRequestDispatcher("User/user_login_pro.jsp");
*/				
		RequestDispatcher rd = 
				request.getRequestDispatcher("User/user_login_ok.jsp");
		rd.forward(request, response);
		
		
	}

}
