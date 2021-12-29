package com.smhrd.servlet1229;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex02Response")
public class Ex02Response extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// response(���䰴ü): ����ڿ��� ��û����� ������ �� ����ϴ� ��ü
		// ���䵥���� : HTML�� ���� ����, �ؽ�Ʈ, �̹���, ���� ���� ��...
		// �������̵�(redirect)

		// ���䵥������ ������ �����ϴ� �޼ҵ�
		// MIME Type : ������ ���� ����
		// ���ڵ� : ��ǻ�Ͱ� �ؼ��� �� �ֵ��� �������� ������ ����(EUC-KR, UTF-8)
		response.setContentType("text/html; charset=utf-8");

		// ����ڿ��� �����͸� �����ϱ� ���� ��ü����
		PrintWriter out = response.getWriter();
		
		// �������� ���� �� - > ������ ��! -> ������ �ڵ����� �ε�Ϸ�
		// -> �������� �̵��ؼ� F5(���ΰ�ħ) �ѹ� �ϸ� ���������� �ݿ���.
		
		// Servers -> Tomcat ������ Ŭ�� -> ReStart��� Ȱ��
		// -> �������� �̵��ؼ� F5(���ΰ�ħ) �ѹ� �ϸ� ���������� �ݿ���.
		out.print("<html>");
		out.print("<head><title>response��ü</title></head>");
		out.print("<body>");
		out.print("<h1>Hello �� ��</h1>");
		out.print("</body>");
		out.print("</html>");

	}

}
