package com.smhrd.servlet1229;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex01Request")
public class Ex01Request extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// request(��û��ü) : ����ڰ� ��û�� ���� �� ������� ������ �����ϴ� ��ü
		// ���� : IP, ������ ����(����, ���, ���ڵ� ��� ���...), ����ڰ� �Է��� ������ ��..

		String ip = request.getRemoteAddr();
		
		System.out.println("������ IP : "+ ip);
		
		//  ip�� Ȯ���� �ٸ� ��¹��� �������� ����
		// ���� �Ǵ� ¦�� ���ӽ� : oo�� ȯ���մϴ�
		// ���� ���ӽ� : ����� ȯ���մϴ�
		// �̿� ���ӽ� : �մ� ȯ���մϴ�.
		// IPȮ���� ���ڿ� �� �޼ҵ� Ȱ���� ��
		
		if(ip.equals("59.0.124.155")) {
			System.out.println("�����δ� ȯ���մϴ�!");
		}
		else if (ip.equals("222.102.104.240")) {
			System.out.println("�ѱ��δ� ȯ���մϴ�!");
		}
		else if(ip.equals("59.0.124.191")) {
			System.out.println("�����´� ȯ���մϴ�!");
		}
		else if(ip.equals("59.0.236.207")) {
			System.out.println("����� ȯ���մϴ�!");
		}
		else {
			System.out.println("�մ� ȯ���մϴ�");
		}
		
	}

}