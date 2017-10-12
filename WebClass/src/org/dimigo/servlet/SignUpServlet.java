package org.dimigo.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignUpServlet
 */
@WebServlet("/signup")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// signup.jsp 포워딩
		RequestDispatcher rd = request.getRequestDispatcher("/jsp/signup.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String name = request.getParameter("name");
		String nickname = request.getParameter("nickname");
		
		System.out.printf("id : %s pwd : %s name : %s nickname : %s", id, pwd, name, nickname);
		response.setContentType("text/html;charset=utf-8");
		
		
		boolean result = false;
		if(result) {
			RequestDispatcher rd = request.getRequestDispatcher("/jsp/login.jsp");
			rd.forward(request, response);
		} else {
			request.setAttribute("msg", "error");
			request.setAttribute("w_id", "\"" +id+ "\"");
			request.setAttribute("w_pwd", "\"" +pwd+ "\"");
			request.setAttribute("w_name", "\"" +name+ "\"");
			request.setAttribute("w_nickname", "\"" +nickname+ "\"");
			RequestDispatcher rd = request.getRequestDispatcher("/jsp/signup.jsp");
			rd.forward(request, response);
			
			
		}
	}

}
