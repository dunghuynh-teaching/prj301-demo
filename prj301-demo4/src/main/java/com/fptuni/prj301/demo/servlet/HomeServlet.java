/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.fptuni.prj301.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DUNGHUYNH
 */
public class HomeServlet extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            

            
            String home = "<!DOCTYPE html>\n" +
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
"    	<ul class=\"navbar-nav mr-auto align-items-center\">\n" +
"    		<form class=\"bd-search hidden-sm-down\">\n" +
"    			<input type=\"text\" class=\"form-control bg-graylight border-0 font-weight-bold\" id=\"search-input\" placeholder=\"Search...\" autocomplete=\"off\">\n" +
"    			<div class=\"dropdown-menu bd-search-results\" id=\"search-results\">\n" +
"    			</div>\n" +
"    		</form>\n" +
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
"    		</button>\n" +
"    		<div class=\"collapse navbar-collapse\" id=\"navbarsExplore\">\n" +
"    			<ul class=\"navbar-nav\">\n" +
"    				<li class=\"nav-item\">\n" +
"    				<a class=\"nav-link\" href=\"#\">Lifestyle</a>\n" +
"    				</li>\n" +
"    				<li class=\"nav-item\">\n" +
"    				<a class=\"nav-link\" href=\"#\">Food</a>\n" +
"    				</li>\n" +
"    				<li class=\"nav-item\">\n" +
"    				<a class=\"nav-link\" href=\"#\">Home</a>\n" +
"    				</li>\n" +
"    				<li class=\"nav-item\">\n" +
"    				<a class=\"nav-link\" href=\"#\">Travel</a>\n" +
"    				</li>\n" +
"    				<li class=\"nav-item dropdown\">\n" +
"    				<a class=\"nav-link dropdown-toggle\" href=\"http://example.com\" id=\"dropdown01\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">More</a>\n" +
"    				<div class=\"dropdown-menu shadow-lg\" aria-labelledby=\"dropdown01\">\n" +
"    					<a class=\"dropdown-item\" href=\"#\">Astronomy</a>\n" +
"    					<a class=\"dropdown-item\" href=\"#\">Nature</a>\n" +
"    					<a class=\"dropdown-item\" href=\"#\">Cooking</a>\n" +
"    					<a class=\"dropdown-item\" href=\"#\">Fashion</a>\n" +
"    					<a class=\"dropdown-item\" href=\"#\">Wellness</a>\n" +
"    					<a class=\"dropdown-item\" href=\"#\">Dieting</a>\n" +
"    				</div>\n" +
"    				</li>\n" +
"    			</ul>\n" +
"    		</div>\n" +
"    		</nav>\n" +
"    	</div>\n" +
"    </div>\n" +
"    <div class=\"container-fluid\">\n" +
"    	<div class=\"row\">\n" +
"    		<div class=\"card-columns\">\n" +
"    			<div class=\"card card-pin\">\n" +
"    				<img class=\"card-img\" src=\"https://images.unsplash.com/photo-1489743342057-3448cc7c3bb9?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=6d284a2efbca5f89528546307f7e7b87&auto=format&fit=crop&w=500&q=60\" alt=\"Card image\">\n" +
"    				<div class=\"overlay\">\n" +
"    					<h2 class=\"card-title title\">Cool Title</h2>\n" +
"    					<div class=\"more\">\n" +
"    						<a href=\"post.html\">\n" +
"    						<i class=\"fa fa-arrow-circle-o-right\" aria-hidden=\"true\"></i> More </a>\n" +
"    					</div>\n" +
"    				</div>\n" +
"    			</div>\n" +
"    			<div class=\"card card-pin\">\n" +
"    				<img class=\"card-img\" src=\"https://images.unsplash.com/photo-1519996521430-02b798c1d881?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=79f770fc1a5d8ff9b0eb033d0f09e15d&auto=format&fit=crop&w=500&q=60\" alt=\"Card image\">\n" +
"    				<div class=\"overlay\">\n" +
"    					<h2 class=\"card-title title\">Cool Title</h2>\n" +
"    					<div class=\"more\">\n" +
"    						<a href=\"post.html\">\n" +
"    						<i class=\"fa fa-arrow-circle-o-right\" aria-hidden=\"true\"></i> More </a>\n" +
"    					</div>\n" +
"    				</div>\n" +
"    			</div>\n" +
"    			<div class=\"card card-pin\">\n" +
"    				<img class=\"card-img\" src=\"https://images.unsplash.com/photo-1505210512658-3ae58ae08744?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=2ef2e23adda7b89a804cf232f57e3ca3&auto=format&fit=crop&w=333&q=80\" alt=\"Card image\">\n" +
"    				<div class=\"overlay\">\n" +
"    					<h2 class=\"card-title title\">Cool Title</h2>\n" +
"    					<div class=\"more\">\n" +
"    						<a href=\"post.html\">\n" +
"    						<i class=\"fa fa-arrow-circle-o-right\" aria-hidden=\"true\"></i> More </a>\n" +
"    					</div>\n" +
"    				</div>\n" +
"    			</div>\n" +
"    			<div class=\"card card-pin\">\n" +
"    				<img class=\"card-img\" src=\"https://images.unsplash.com/photo-1488353816557-87cd574cea04?ixlib=rb-0.3.5&s=06371203b2e3ad3e241c45f4e149a1b3&auto=format&fit=crop&w=334&q=80\" alt=\"Card image\">\n" +
"    				<div class=\"overlay\">\n" +
"    					<h2 class=\"card-title title\">Cool Title</h2>\n" +
"    					<div class=\"more\">\n" +
"    						<a href=\"post.html\">\n" +
"    						<i class=\"fa fa-arrow-circle-o-right\" aria-hidden=\"true\"></i> More </a>\n" +
"    					</div>\n" +
"    				</div>\n" +
"    			</div>\n" +
"    			<div class=\"card card-pin\">\n" +
"    				<img class=\"card-img\" src=\"https://images.unsplash.com/photo-1518450757707-d21c8c53c8df?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=c88b5f311958f841525fdb01ab3b5deb&auto=format&fit=crop&w=500&q=60\" alt=\"Card image\">\n" +
"    				<div class=\"overlay\">\n" +
"    					<h2 class=\"card-title title\">Cool Title</h2>\n" +
"    					<div class=\"more\">\n" +
"    						<a href=\"post.html\">\n" +
"    						<i class=\"fa fa-arrow-circle-o-right\" aria-hidden=\"true\"></i> More </a>\n" +
"    					</div>\n" +
"    				</div>\n" +
"    			</div>\n" +
"    			<div class=\"card card-pin\">\n" +
"    				<img class=\"card-img\" src=\"https://images.unsplash.com/photo-1483190656465-2c49e54d29f3?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=7c4d831daffc28f6ce144ae9e44072e2&auto=format&fit=crop&w=500&q=60\" alt=\"Card image\">\n" +
"    				<div class=\"overlay\">\n" +
"    					<h2 class=\"card-title title\">Cool Title</h2>\n" +
"    					<div class=\"more\">\n" +
"    						<a href=\"post.html\">\n" +
"    						<i class=\"fa fa-arrow-circle-o-right\" aria-hidden=\"true\"></i> More </a>\n" +
"    					</div>\n" +
"    				</div>\n" +
"    			</div>\n" +
"    			<div class=\"card card-pin\">\n" +
"    				<img class=\"card-img\" src=\"https://images.unsplash.com/photo-1501813531019-338a4182efb0?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=ad934c7483b928cae6b0b9cde5ae3445&auto=format&fit=crop&w=500&q=60\" alt=\"Card image\">\n" +
"    				<div class=\"overlay\">\n" +
"    					<h2 class=\"card-title title\">Cool Title</h2>\n" +
"    					<div class=\"more\">\n" +
"    						<a href=\"post.html\">\n" +
"    						<i class=\"fa fa-arrow-circle-o-right\" aria-hidden=\"true\"></i> More </a>\n" +
"    					</div>\n" +
"    				</div>\n" +
"    			</div>\n" +
"    			<div class=\"card card-pin\">\n" +
"    				<img class=\"card-img\" src=\"https://images.unsplash.com/photo-1518542331925-4e91e9aa0074?ixlib=rb-0.3.5&s=6958cfb3469de1e681bf17587bed53be&auto=format&fit=crop&w=500&q=60\" alt=\"Card image\">\n" +
"    				<div class=\"overlay\">\n" +
"    					<h2 class=\"card-title title\">Cool Title</h2>\n" +
"    					<div class=\"more\">\n" +
"    						<a href=\"post.html\">\n" +
"    						<i class=\"fa fa-arrow-circle-o-right\" aria-hidden=\"true\"></i> More </a>\n" +
"    					</div>\n" +
"    				</div>\n" +
"    			</div>\n" +
"    			<div class=\"card card-pin\">\n" +
"    				<img class=\"card-img\" src=\"https://images.unsplash.com/photo-1513028179155-324cfec2566c?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=32ce1df4016dadc177d6fce1b2df2429&auto=format&fit=crop&w=350&q=80\" alt=\"Card image\">\n" +
"    				<div class=\"overlay\">\n" +
"    					<h2 class=\"card-title title\">Cool Title</h2>\n" +
"    					<div class=\"more\">\n" +
"    						<a href=\"post.html\">\n" +
"    						<i class=\"fa fa-arrow-circle-o-right\" aria-hidden=\"true\"></i> More </a>\n" +
"    					</div>\n" +
"    				</div>\n" +
"    			</div>\n" +
"    			<div class=\"card card-pin\">\n" +
"    				<img class=\"card-img\" src=\"https://images.unsplash.com/photo-1516601255109-506725109807?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=ce4f3db9818f60686e8e9b62d4920ce5&auto=format&fit=crop&w=500&q=60\" alt=\"Card image\">\n" +
"    				<div class=\"overlay\">\n" +
"    					<h2 class=\"card-title title\">Cool Title</h2>\n" +
"    					<div class=\"more\">\n" +
"    						<a href=\"post.html\">\n" +
"    						<i class=\"fa fa-arrow-circle-o-right\" aria-hidden=\"true\"></i> More </a>\n" +
"    					</div>\n" +
"    				</div>\n" +
"    			</div>\n" +
"    			<div class=\"card card-pin\">\n" +
"    				<img class=\"card-img\" src=\"https://images.unsplash.com/photo-1509233631037-deb7efd36207?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=75a5d784cdfc8f5ced8a6fe26c6d921e&auto=format&fit=crop&w=500&q=60\" alt=\"Card image\">\n" +
"    				<div class=\"overlay\">\n" +
"    					<h2 class=\"card-title title\">Cool Title</h2>\n" +
"    					<div class=\"more\">\n" +
"    						<a href=\"post.html\">\n" +
"    						<i class=\"fa fa-arrow-circle-o-right\" aria-hidden=\"true\"></i> More </a>\n" +
"    					</div>\n" +
"    				</div>\n" +
"    			</div>\n" +
"    			<div class=\"card card-pin\">\n" +
"    				<img class=\"card-img\" src=\"https://images.unsplash.com/photo-1416879595882-3373a0480b5b?ixlib=rb-0.3.5&s=c0043ea5aa03f62a294636f93725dd6e&auto=format&fit=crop&w=500&q=60\" alt=\"Card image\">\n" +
"    				<div class=\"overlay\">\n" +
"    					<h2 class=\"card-title title\">Cool Title</h2>\n" +
"    					<div class=\"more\">\n" +
"    						<a href=\"post.html\">\n" +
"    						<i class=\"fa fa-arrow-circle-o-right\" aria-hidden=\"true\"></i> More </a>\n" +
"    					</div>\n" +
"    				</div>\n" +
"    			</div>\n" +
"    			<div class=\"card card-pin\">\n" +
"    				<img class=\"card-img\" src=\"https://images.unsplash.com/photo-1485627658391-1365e4e0dbfe?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=976b0db5c3c2b9932bb20e72f98f9b61&auto=format&fit=crop&w=500&q=60\" alt=\"Card image\">\n" +
"    				<div class=\"overlay\">\n" +
"    					<h2 class=\"card-title title\">Cool Title</h2>\n" +
"    					<div class=\"more\">\n" +
"    						<a href=\"post.html\">\n" +
"    						<i class=\"fa fa-arrow-circle-o-right\" aria-hidden=\"true\"></i> More </a>\n" +
"    					</div>\n" +
"    				</div>\n" +
"    			</div>\n" +
"    			<div class=\"card card-pin\">\n" +
"    				<img class=\"card-img\" src=\"https://images.unsplash.com/photo-1502550900787-e956c314a221?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=e90f191de3a03c2002ac82c009490e07&auto=format&fit=crop&w=500&q=60\" alt=\"Card image\">\n" +
"    				<div class=\"overlay\">\n" +
"    					<h2 class=\"card-title title\">Cool Title</h2>\n" +
"    					<div class=\"more\">\n" +
"    						<a href=\"post.html\">\n" +
"    						<i class=\"fa fa-arrow-circle-o-right\" aria-hidden=\"true\"></i> More </a>\n" +
"    					</div>\n" +
"    				</div>\n" +
"    			</div>\n" +
"    			<div class=\"card card-pin\">\n" +
"    				<img class=\"card-img\" src=\"https://images.unsplash.com/photo-1466692476868-aef1dfb1e735?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=9e3cd6ce6496c9c05cbf1b6cda8be0f9&auto=format&fit=crop&w=500&q=60\" alt=\"Card image\">\n" +
"    				<div class=\"overlay\">\n" +
"    					<h2 class=\"card-title title\">Cool Title</h2>\n" +
"    					<div class=\"more\">\n" +
"    						<a href=\"post.html\">\n" +
"    						<i class=\"fa fa-arrow-circle-o-right\" aria-hidden=\"true\"></i> More </a>\n" +
"    					</div>\n" +
"    				</div>\n" +
"    			</div>\n" +
"    			<div class=\"card card-pin\">\n" +
"    				<img class=\"card-img\" src=\"https://images.unsplash.com/photo-1509885903707-b68568db61ed?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=5f11503655b51165836c2dcefa51a040&auto=format&fit=crop&w=500&q=60\" alt=\"Card image\">\n" +
"    				<div class=\"overlay\">\n" +
"    					<h2 class=\"card-title title\">Cool Title</h2>\n" +
"    					<div class=\"more\">\n" +
"    						<a href=\"post.html\">\n" +
"    						<i class=\"fa fa-arrow-circle-o-right\" aria-hidden=\"true\"></i> More </a>\n" +
"    					</div>\n" +
"    				</div>\n" +
"    			</div>\n" +
"    			<div class=\"card card-pin\">\n" +
"    				<img class=\"card-img\" src=\"https://images.unsplash.com/photo-1518707399486-6d702a84ff00?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=b5bb16fa7eaed1a1ed47614488f7588d&auto=format&fit=crop&w=500&q=60\" alt=\"Card image\">\n" +
"    				<div class=\"overlay\">\n" +
"    					<h2 class=\"card-title title\">Cool Title</h2>\n" +
"    					<div class=\"more\">\n" +
"    						<a href=\"post.html\">\n" +
"    						<i class=\"fa fa-arrow-circle-o-right\" aria-hidden=\"true\"></i> More </a>\n" +
"    					</div>\n" +
"    				</div>\n" +
"    			</div>\n" +
"    			<div class=\"card card-pin\">\n" +
"    				<img class=\"card-img\" src=\"https://images.unsplash.com/photo-1519408299519-b7a0274f7d67?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=d4891b98f4554cc55eab1e4a923cbdb1&auto=format&fit=crop&w=500&q=60\" alt=\"Card image\">\n" +
"    				<div class=\"overlay\">\n" +
"    					<h2 class=\"card-title title\">Cool Title</h2>\n" +
"    					<div class=\"more\">\n" +
"    						<a href=\"post.html\">\n" +
"    						<i class=\"fa fa-arrow-circle-o-right\" aria-hidden=\"true\"></i> More </a>\n" +
"    					</div>\n" +
"    				</div>\n" +
"    			</div>\n" +
"    			<div class=\"card card-pin\">\n" +
"    				<img class=\"card-img\" src=\"https://images.unsplash.com/photo-1506706435692-290e0c5b4505?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=0bb464bb1ceea5155bc079c4f50bc36a&auto=format&fit=crop&w=500&q=60\" alt=\"Card image\">\n" +
"    				<div class=\"overlay\">\n" +
"    					<h2 class=\"card-title title\">Cool Title</h2>\n" +
"    					<div class=\"more\">\n" +
"    						<a href=\"post.html\">\n" +
"    						<i class=\"fa fa-arrow-circle-o-right\" aria-hidden=\"true\"></i> More </a>\n" +
"    					</div>\n" +
"    				</div>\n" +
"    			</div>\n" +
"    			<div class=\"card card-pin\">\n" +
"    				<img class=\"card-img\" src=\"https://images.unsplash.com/photo-1512355144108-e94a235b10af?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=c622d56d975113a08c71c912618b5f83&auto=format&fit=crop&w=500&q=60\" alt=\"Card image\">\n" +
"    				<div class=\"overlay\">\n" +
"    					<h2 class=\"card-title title\">Cool Title</h2>\n" +
"    					<div class=\"more\">\n" +
"    						<a href=\"post.html\">\n" +
"    						<i class=\"fa fa-arrow-circle-o-right\" aria-hidden=\"true\"></i> More </a>\n" +
"    					</div>\n" +
"    				</div>\n" +
"    			</div>\n" +
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
            
            out.print(home);
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

}
