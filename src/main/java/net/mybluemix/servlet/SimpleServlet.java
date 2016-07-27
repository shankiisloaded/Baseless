package net.mybluemix.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet("/SimpleServlet")
public class SimpleServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	  try {
        response.setContentType("application/json");
        res.setCharacterEncoding("UTF-8");

        PrintWriter out = res.getWriter();
        File pdfFolder =  new File(req.getSession().getServletContext().getRealPath("/packages/30355"));

        for (File pdf : pdfFolder.listFiles()) { // Line 27
            out.println(pdf.getName());
        }
    } catch (IOException e) {
        log.log(Level.SEVERE, e.getMessage());
    
    	
    	
  
    }

}
