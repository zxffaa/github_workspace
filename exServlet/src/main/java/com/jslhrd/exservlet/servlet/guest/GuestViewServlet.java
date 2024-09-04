package com.jslhrd.exservlet.servlet.guest;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.exservlet.model.guest.GuestDAO;
import com.jslhrd.exservlet.model.guest.GuestDTO;

/**
 * Servlet implementation class GuestViewServlet
 */
@WebServlet("/guest_view")
public class GuestViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GuestViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int idx = Integer.parseInt(request.getParameter("idx"));
		
		GuestDAO dao = GuestDAO.getInstance();
		
		//쿠키 확인
		boolean bool = false;
		Cookie info = null;
		Cookie[] cookies = request.getCookies();//클라이언트에 있는 모든 쿠기 수집
		for(int x=0; x<cookies.length;x++) {
			info = cookies[x];
			if(info.getName().equals("exServletGuest"+idx)) {
				bool = true;
				break;
			}
		}
		
		String newValue=""+System.currentTimeMillis();//쿠기값 생성
		if(!bool) {//쿠키가 존재하지 않을 경우
			dao.guestHits(idx);//조회수 증가
			//쿠키생성
			info = new Cookie("exServletGuest"+idx, newValue);
			info.setMaxAge(60*60);//쿠키유효시간(한시간)
			response.addCookie(info);//쿠키전송
		}
		
		GuestDTO dto = dao.guestSelect(idx);
		dto.setContents(dto.getContents().replace("\n", "<br>"));
		
		request.setAttribute("dto", dto);
		
		RequestDispatcher rd = 
				request.getRequestDispatcher("Guest/guest_view.jsp");
		
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
