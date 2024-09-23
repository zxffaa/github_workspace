package com.jslhrd.exservletjstl.servlet.user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.exservletjstl.model.user.UserDAO;
import com.jslhrd.exservletjstl.model.user.UserDTO;
import com.jslhrd.exservletjstl.util.UserSHA256;

/**
 * Servlet implementation class UserJoinServlet
 */
//회원가입
@WebServlet("/user_insert")
public class UserInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher rd =
				request.getRequestDispatcher("User/user_insert.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserDAO dao = UserDAO.getInstance();
		UserDTO dto = new UserDTO();
				
		request.setCharacterEncoding("utf-8");
		
		dto.setName(request.getParameter("name"));
		dto.setUserid(request.getParameter("userid"));
		dto.setPasswd(UserSHA256.getSHA256(request.getParameter("passwd")));
		dto.setTel(request.getParameter("tel"));
		
		int row = dao.userWrite(dto);
		
		request.setAttribute("row", row);

		RequestDispatcher rd =
				request.getRequestDispatcher("User/user_insert_pro.jsp");
		rd.forward(request, response);
		
		
	}

}
