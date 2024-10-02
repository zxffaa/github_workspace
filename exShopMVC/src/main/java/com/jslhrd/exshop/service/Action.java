package com.jslhrd.exshop.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public interface Action {
	public void process(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException;
}
