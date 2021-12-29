package com.smhrd.servlet1229;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex03Request")
public class Ex03Request extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// ���䵥������ ������ �����ϴ� �޼ҵ�
		// MIME Type : ������ ���� ����
		// ���ڵ� : ��ǻ�Ͱ� �ؼ��� �� �ֵ��� �������� ������ ����(EUC-KR, UTF-8)
		response.setContentType("text/html; charset=utf-8");

		// ����ڿ��� �����͸� �����ϱ� ���� ��ü����
		PrintWriter out = response.getWriter();
		String ip = request.getRemoteAddr();
		
		out.print("<html>");
		out.print("<head><title>Request&Response �ǽ�</title></head>");
		if (ip.equals("59.0.124.155")) {
			out.println("<h1>�����δ� ȯ���մϴ�!</h1>");
		} else if (ip.equals("222.102.104.240")) {
			out.println("<h1>�ѱ��δ� ȯ���մϴ�!</h1>");
		} else if (ip.equals("59.0.124.191")) {
			out.println("<h1>�����´� ȯ���մϴ�!</h1>");
		} else if (ip.equals("59.0.236.207")) {
			out.println("<h1>����� ȯ���մϴ�!</h1>");
		} else {
			out.println("<h1>�� �Դ�?</h1>");
		}
	}

}
