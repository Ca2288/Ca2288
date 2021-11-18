/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.mecer.controller;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Student24
 */
@WebServlet(urlPatterns = {"/JockController"})
public class JockController extends HttpServlet {

   
    @WebServlet(urlPatterns ={"/joke"})
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      String process =request.getParameter("pro");
      if(process !=null){
          System.out.println("Controller has recieved a request");
          processRequest pr = RequestActionFactory.createProcess(process);
          if (pr!=null) {
            pr.processTheRequest(request,response);
            
          }
      }
    }

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
abstract class RequestActionFactory{
    public static  processRequest createProcess(String theAction){
        switch(theAction){
          //  case "txt": return new TextProcess();
            case "jsn": return new JsonProcess();
            default: return null;
        }
    }
}
