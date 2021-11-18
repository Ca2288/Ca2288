/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.mecer.controller;

import javax.servlet.http.HttpServletResponse;


public class TextProcess extends processRequest {
   public abstract void  processTheRequest(HttpServletResponse response);
    JokeDad j= JokeDAOTextImp1.getInstance("c:\\temp\\joke.txt");
    thejock=j.getJoke(1).toString();
    
}
private String buildPage(){
StringBuilder sb =new StringBuilder();
sb.append("<DOCTYPE html>");
            sb.append("<head>");
            sb.append("<title>Servlet JokeController</title");
            sb.append("</head>");
            sb.append("<body>");
           sb.append("<center><h1>One mug of delicious Mecer coffee please</h1></center>");
            sb.append("</body>");
           sb.append("</html>");
}