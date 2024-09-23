package com.jslhrd.exservletjstl.servlet.pds;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.exservletjstl.model.pds.PdsDAO;
import com.jslhrd.exservletjstl.model.pds.PdsDTO;
import com.jslhrd.exservletjstl.util.PageIndex;

/**
 * Servlet implementation class PdsListServlet
 */
@WebServlet("/pds_list.do")
public class PdsListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PdsListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PdsDAO pDao = PdsDAO.getInstance();
		String url = "pds_list";
		String search = "", key = "", addtag="";
		
		int totcount = 0;  
		//검색 조건이 포함될경우
		if(request.getParameter("key") != null && !request.getParameter("key").equals("")) {
			search = request.getParameter("search");
			key = request.getParameter("key");
			totcount = pDao.pdsCount(search, key);   // 총 글수 추출
		}else {
			totcount = pDao.pdsCount();   // 총 글수 추출
		}

		//페이지수 계산
		int nowpage = 1;//현재페이지
		int maxlist = 10;//페이지당 글수
		int totpage = 1;//총페이지수
		
		if(totcount % 10 == 0)
			totpage = totcount / maxlist;
		else
			totpage = totcount / maxlist + 1;
		
		if(totpage == 0)
			totpage = 1;
		
		if(request.getParameter("page") != null) {
			nowpage = Integer.parseInt(request.getParameter("page"));
		}
		//현재페이지가 총페이지보다 클때 마지막페이지로 대체
		if(nowpage > totpage)
			nowpage= totpage;
		
		int startpage = (nowpage -1) * maxlist+1;//페이지 시작번호
		int endpage = nowpage * maxlist;
		int listcount = totcount - ((nowpage-1) * maxlist);//일련번호 출력용
		
		
		List<PdsDTO> pdsList = null;
		if(key.equals("")) {
			//pdsList = pDao.pdsList();
			pdsList = pDao.pdsList(startpage, endpage);
		}else {
			//pdsList = pDao.pdsList(search, key);
			pdsList = pDao.pdsList(search, key, startpage,endpage);
		}
		//페이지 인덱스
		String pageSkip="";
		if(key.equals("")) {
			pageSkip=PageIndex.pageList(nowpage, totpage, url, addtag);
		}else {
			pageSkip=PageIndex.pageListHan(nowpage, totpage, url,search,key);
		}

		request.setAttribute("totcount", totcount);
		request.setAttribute("list", pdsList);
		request.setAttribute("search", search);
		request.setAttribute("key", key);
		request.setAttribute("listcount", listcount);
		request.setAttribute("totpage", totpage);
		request.setAttribute("page", nowpage);
		request.setAttribute("pageSkip", pageSkip);
		
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher("Pds/pds_list.jsp");
		dispatcher.forward(request, response);
	

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}
