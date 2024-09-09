package com.jslhrd.exservlet.servlet.pds;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.exservlet.model.guest.GuestDAO;
import com.jslhrd.exservlet.model.pds.PdsDAO;
import com.jslhrd.exservlet.model.pds.PdsDTO;

/**
 * Servlet implementation class PdsViewServlet
 */
@WebServlet("/pds_view")
public class PdsViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PdsViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idx=Integer.parseInt(request.getParameter("idx"));
		PdsDAO dao=PdsDAO.getinstance();
		
		boolean bool=false;
		Cookie info=null;
		Cookie[] cookies=request.getCookies();
		for(int x=0;x<cookies.length;x++) {
			info=cookies[x];
			if(info.getName().equals("exServletPds"+idx)) {
				bool=true;
				break;
			}
		}
		String newValue=""+System.currentTimeMillis();
		if(!bool) {
		dao.pdsHits(idx);
		info=new Cookie("exServletPds"+idx, newValue);
		info.setMaxAge(60*60);
		response.addCookie(info);
		}
		PdsDTO dto=dao.PdsSelect(idx);
		dto.setContents(dto.getContents().replace("\n","<br>"));
		request.setAttribute("dto", dto);
		RequestDispatcher rd = 
				request.getRequestDispatcher("Pds/pds_view.jsp");
		
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
