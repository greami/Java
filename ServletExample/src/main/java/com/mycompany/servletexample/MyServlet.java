/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.servletexample;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author AMITH GRECA
 */
@WebServlet(name = "MyServlet", urlPatterns = {"/myservlet"})
public class MyServlet extends HttpServlet {

    
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //Set content type in text plain, text not formatted
        response.setContentType("text/plain");
        
        //this a simple hello word message that means that your servlet had been done
        response.getWriter().write("If you read this, you servlet is started !\n\n");
        
        response.getWriter().write("Welcome this is MyServlet !\n");

        
        /*If  exist, we show a parameter that have been passed in the end of thelink
        else show a little message
        for example: http://localhost:8080/ServletExample/MyServlet?hello 
        your query is "hello"
        Rememeber your host could be different!
        */
        
        //simpe check if the query exist
        if(request.getQueryString()!= null){
            response.getWriter().write("Your query in the end of the url is: " +request.getQueryString());

        } else {
            response.getWriter().write("you didn't pass any query in the url");
        }
        
        
    }
    
    
    
    

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
       // processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "This is MyServlet info enjoy it!";
    }// </editor-fold>

}
