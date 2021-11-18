package za.co.mecer.joke.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.co.mecer.joke.dataaccess.JokeDAO;
import za.co.mecer.joke.dataaccess.JokeDAOTextImpl;

public class TextProcess extends ProcessRequest{

    String theJoke;
    
    /**
     *
     * @param request
     * @param response
     */
    @Override
    public void processTheRequest(HttpServletRequest request, HttpServletResponse response) {
        JokeDAO j = JokeDAOTextImpl.getInstance("C:\\temp\\joke.txt");
        sendResponse(buildPage(j.getJokes(1).toString()), response);
    }
    private String buildPage(String val){
            StringBuilder sb = new StringBuilder();
        /* TODO output your page here. You may use following sample code. */
            sb.append("<!DOCTYPE html>");
            sb.append("<html>");
            sb.append("<head>");
            sb.append("<title>Servlet JokeController</title>");            
            sb.append("</head>");
            sb.append("<body>");
            sb.append("<h1>Servlet JokeController at ").append(val).append("</h1>");
            sb.append("</body>");
            sb.append("</html>");
            
            return sb.toString();
    
    }
}
