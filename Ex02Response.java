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

		// response(응답객체): 사용자에게 요청결과를 보내줄 때 사용하는 객체
		// 응답데이터 : HTML과 같은 문서, 텍스트, 이미지, 파일 형태 등...
		// 페이지이동(redirect)

		// 응답데이터의 포맷을 설정하는 메소드
		// MIME Type : 데이터 포맷 설정
		// 인코딩 : 컴퓨터가 해석할 수 있도록 데이터의 형식을 지정(EUC-KR, UTF-8)
		response.setContentType("text/html; charset=utf-8");

		// 사용자에게 데이터를 전달하기 위한 객체생성
		PrintWriter out = response.getWriter();
		
		// 서블릿파일 수정 시 - > 저장할 것! -> 서버가 자동으로 로드완료
		// -> 브라우저로 이동해서 F5(새로고침) 한번 하면 수정사항이 반영됨.
		
		// Servers -> Tomcat 오른쪽 클릭 -> ReStart기능 활용
		// -> 브라우저로 이동해서 F5(새로고침) 한번 하면 수정사항이 반영됨.
		out.print("<html>");
		out.print("<head><title>response객체</title></head>");
		out.print("<body>");
		out.print("<h1>Hello 해 햬</h1>");
		out.print("</body>");
		out.print("</html>");

	}

}
