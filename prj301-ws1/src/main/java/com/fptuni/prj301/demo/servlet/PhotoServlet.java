/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.fptuni.prj301.demo.servlet;

import com.fptuni.prj301.demo.photo.PhotoDAO;
import com.fptuni.prj301.demo.photo.PhotoDTO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DUNGHUYNH
 */
public class PhotoServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            // Page - Head
            String head1 = "<!DOCTYPE html>\n" +
            "<html lang=\"en\">\n" +
            "\n" +
            "<head>\n" +
            "    <meta charset=\"utf-8\">\n" +
            "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n" +
            "    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n" +
            "    <title>Home - Pintereso Bootstrap Template</title>\n" +
            "    <script type=\"text/javascript\"> (function() { var css = document.createElement('link'); css.href = 'https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css'; css.rel = 'stylesheet'; css.type = 'text/css'; document.getElementsByTagName('head')[0].appendChild(css); })(); </script>\n" +
            "    <link rel=\"stylesheet\" href=\"assets/css/app.css\">\n" +
            "    <link rel=\"stylesheet\" href=\"assets/css/theme.css\">\n" +
            "\n" +
            "</head>\n" +
            "\n" +
            "<body>\n" +
            "\n" +
            "    <nav class=\"navbar navbar-expand-lg navbar-light bg-white fixed-top\">\n" +
            "    <a class=\"navbar-brand font-weight-bolder mr-3\" href=\"index.html\"><img src=\"assets/img/logo.png\"></a>\n" +
            "    <button class=\"navbar-light navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarsDefault\" aria-controls=\"navbarsDefault\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n" +
            "    <span class=\"navbar-toggler-icon\"></span>\n" +
            "    </button>\n" +
            "    <div class=\"collapse navbar-collapse\" id=\"navbarsDefault\">\n" +
            "    	<ul class=\"navbar-nav mr-auto align-items-center\">\n";
            
            String searchform =
            "    		<form class=\"bd-search hidden-sm-down\">\n" +
            "    			<input type=\"text\" class=\"form-control bg-graylight border-0 font-weight-bold\" id=\"search-input\" placeholder=\"Search...\" autocomplete=\"off\">\n" +
            "    			<div class=\"dropdown-menu bd-search-results\" id=\"search-results\">\n" +
            "    			</div>\n" +
            "    		</form>\n";
            
            String head2 =
            "    	</ul>\n" +
            "    	<ul class=\"navbar-nav ml-auto align-items-center\">\n" +
            "    		<li class=\"nav-item\">\n" +
            "    		<a class=\"nav-link active\" href=\"index.html\">Home</a>\n" +
            "    		</li>\n" +
            "    		<li class=\"nav-item\">\n" +
            "    		<a class=\"nav-link\" href=\"post.html\">Post</a>\n" +
            "    		</li>\n" +
            "    		\n" +
            "    	</ul>\n" +
            "    </div>\n" +
            "    </nav>    \n" +
            "    <main role=\"main\">\n" +
            "        \n" +
            "    \n" +
            "    <section class=\"mt-4 mb-5\">\n" +
            "    <div class=\"container mb-4\">\n" +
            "    	<h1 class=\"font-weight-bold title\">Explore</h1>\n" +
            "    	<div class=\"row\">\n" +
            "    		<nav class=\"navbar navbar-expand-lg navbar-light bg-white pl-2 pr-2\">\n" +
            "    		<button class=\"navbar-light navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarsExplore\" aria-controls=\"navbarsDefault\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n" +
            "    		<span class=\"navbar-toggler-icon\"></span>\n" +
            "    		</button>\n";
            
            String categories =
            "    		<div class=\"collapse navbar-collapse\" id=\"navbarsExplore\">\n" +
            "    			<ul class=\"navbar-nav\">\n" +
            "    				<li class=\"nav-item\">\n" +
            "    				<a class=\"nav-link\" href=\"#\">Lifestyle</a>\n" +
            "    				</li>\n" +
            "    				<li class=\"nav-item\">\n" +
            "    				<a class=\"nav-link\" href=\"#\">Food</a>\n" +
            "    				</li>\n" +
            "    				<li class=\"nav-item\">\n" +
            "    				<a class=\"nav-link\" href=\"#\">Travel</a>\n" +
            "    				</li>\n";
            
            String head3 =
            "    			</ul>\n" +
            "    		</div>\n" +
            "    		</nav>\n" +
            "    	</div>\n" +
            "    </div>\n" +
            "    <div class=\"container-fluid\">\n" +
            "    	<div class=\"row\">\n" +
            "    		<div class=\"card-columns\">\n";
                    
            String photoItem =     
            "<div class=\"card card-pin\">\n" +
            "	<img class=\"card-img\" src=\"https://images.unsplash.com/photo-1489743342057-3448cc7c3bb9?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=6d284a2efbca5f89528546307f7e7b87&auto=format&fit=crop&w=500&q=60\" alt=\"Card image\">\n" +
            "   	<div class=\"overlay\">\n" +
            "           	<h2 class=\"card-title title\">Cool Title</h2>\n" +
            "                   	<div class=\"more\">\n" +
            "                           	<a href=\"post.html\">\n" +
            "                               	<i class=\"fa fa-arrow-circle-o-right\" aria-hidden=\"true\"></i> More </a>\n" +
            "    			</div>\n" +
            "    	</div>\n" +
            "</div>\n";
            
            
                    
            // Tail
            String tail =  "" +      
            "    		</div>\n" +
            "    	</div>\n" +
            "    </div>\n" +
            "    </section>\n" +
            "        \n" +
            "    </main>\n" +
            "\n" +
            "    <script src=\"assets/js/app.js\"></script>\n" +
            "    <script src=\"assets/js/theme.js\"></script>\n" +
            "    \n" +
            "    <footer class=\"footer pt-5 pb-5 text-center\">\n" +
            "        \n" +
            "    <div class=\"container\">\n" +
            "        \n" +
            "          <div class=\"socials-media\">\n" +
            "    \n" +
            "            <ul class=\"list-unstyled\">\n" +
            "              <li class=\"d-inline-block ml-1 mr-1\"><a href=\"#\" class=\"text-dark\"><i class=\"fa fa-facebook\"></i></a></li>\n" +
            "              <li class=\"d-inline-block ml-1 mr-1\"><a href=\"#\" class=\"text-dark\"><i class=\"fa fa-twitter\"></i></a></li>\n" +
            "              <li class=\"d-inline-block ml-1 mr-1\"><a href=\"#\" class=\"text-dark\"><i class=\"fa fa-instagram\"></i></a></li>\n" +
            "              <li class=\"d-inline-block ml-1 mr-1\"><a href=\"#\" class=\"text-dark\"><i class=\"fa fa-google-plus\"></i></a></li>\n" +
            "              <li class=\"d-inline-block ml-1 mr-1\"><a href=\"#\" class=\"text-dark\"><i class=\"fa fa-behance\"></i></a></li>\n" +
            "              <li class=\"d-inline-block ml-1 mr-1\"><a href=\"#\" class=\"text-dark\"><i class=\"fa fa-dribbble\"></i></a></li>\n" +
            "            </ul>\n" +
            "    \n" +
            "          </div>\n" +
            "        \n" +
            "            <!--\n" +
            "              All the links in the footer should remain intact.\n" +
            "              You may remove the links only if you donate:\n" +
            "              https://www.wowthemes.net/freebies-license/\n" +
            "            -->\n" +
            "          <p>©  <span class=\"credits font-weight-bold\">        \n" +
            "            <a target=\"_blank\" class=\"text-dark\" href=\"https://www.wowthemes.net/pintereso-free-html-bootstrap-template/\"><u>Pintereso Bootstrap HTML Template</u> by WowThemes.net.</a>\n" +
            "          </span>\n" +
            "          </p>\n" +
            "    \n" +
            "    \n" +
            "        </div>\n" +
            "        \n" +
            "    </footer>    \n" +
            "</body>\n" +
            "    \n" +
            "</html>\n" +
            "";
            
            //Student look at code here to find out which part in HTML they should modify code
            
            out.print(head1);
            out.print(searchform); //search form
            out.print(head2);
            out.print(categories); // menu category
            out.print(head3);
            
            
            
            for (int i = 0; i < 20; i++){
                out.print(htmlPhoto("Hinh 1", "https://images.unsplash.com/photo-1489743342057-3448cc7c3bb9?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=6d284a2efbca5f89528546307f7e7b87&auto=format&fit=crop&w=500&q=60"));
            }
            out.print(tail);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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
        processRequest(request, response);
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
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    
    public String htmlPhoto(String name, String imageLink){
        String photoItem =     
            "<div class=\"card card-pin\">\n" +
            "	<img class=\"card-img\" src=\"" + imageLink + "\">" +
            "   	<div class=\"overlay\">\n" +
            "           	<h2 class=\"card-title title\">"+name +"</h2>\n" +
            "                   	<div class=\"more\">\n" +
            "                           	<a href=#>\n" +
            "                               	<i class=\"fa fa-arrow-circle-o-right\" aria-hidden=\"true\"></i> More </a>\n" +
            "    			</div>\n" +
            "    	</div>\n" +
            "</div>\n";
        return photoItem;
    }
}
