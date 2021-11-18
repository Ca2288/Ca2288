package za.co.mecer.joke.controller;

import za.co.mecer.joke.service.ProcessRequest;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.co.mecer.joke.service.TextProcess;

@WebServlet(urlPatterns = {"/joke"})
public class JokeController extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String process = request.getParameter("pro");
        
        if (process != null) {
            System.out.println("Controller has received a request");
            ProcessRequest pr = RequestActionFactory.createProcess(process);
            if (pr != null) {
                pr.processTheRequest(request, response);
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
    }

}

abstract class RequestActionFactory{
    public static ProcessRequest createProcess(String theAction){
        switch (theAction){
            case "txt":
                return new TextProcess();
            case "jsn":
//                return new JsontProcess();
            default:
                return null;
        }
    }
}
