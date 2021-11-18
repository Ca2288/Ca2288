package za.co.mecer.joke.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class ProcessRequest {
    public abstract void processTheRequest(HttpServletRequest request, HttpServletResponse response);
    
    protected void sendResponse(String ourPage, HttpServletResponse response){
        response.setContentType("text/html");
        try (PrintWriter pw = response.getWriter()) {
            pw.print(ourPage);
            pw.flush();
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
