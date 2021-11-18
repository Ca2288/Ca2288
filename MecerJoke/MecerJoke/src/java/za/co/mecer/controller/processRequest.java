/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.mecer.controller;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public abstract class processRequest {
  public abstract void  processTheRequest(HttpServletResponse response);
  protected void sendResponse(HttpServletResponse response) throws IOException{
      response.setContentType("text/html");
       PrintWritter pw =response.getWriter();
      try{
         
          pw.print(ourPage);
          pw.flush();
      }catch(IOException ex)
      System.out.print("Error"+ex.getMessage());
      
      
  }finally{
          if (pw !=null) {
             pw.close() ;
          }
      }
}
