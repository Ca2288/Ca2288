/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Student24
 */
public class CarolineServlet extends HttpServlet {

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException  {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CarolineServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CarolineServlet at " + request.getContextPath() + "</h1>");
            out.println("<h4>you sent field value"+request.getParameter("field")+"</h4>");
            out.println("</body>");
            out.println("</html>");
            
            Enumeration<String> headers =request.getHeaderNames();
            out.println("<h1>headers received</h1>");
            while(headers.hasMoreElements()){
               String head =headers.nextElement();
               out.print(head +"="+request.getHeader(head)+"</br>");
            }
            
            
            
            
        }
         
    }
}
   

    

