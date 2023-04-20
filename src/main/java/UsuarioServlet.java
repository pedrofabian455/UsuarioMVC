
import com.pedro.model.Usuario;
import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fabian
 */
@WebServlet(urlPatterns="/UsuarioServlet")
public class UsuarioServlet extends HttpServlet {
    Usuario user = new Usuario();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
       req.setAttribute("id", user.getId());
        req.setAttribute("nombre", user.getNombre());
        req.setAttribute("email", user.getEmail());
        req.setAttribute("nacionalidad", user.getNacionalidad());
        
        
        
        req.getServletContext().getRequestDispatcher("/UsuarioDatos.jsp").forward(req, resp);
    }
    
    @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        user.setId(req.getParameter("id"));
        user.setNombre(req.getParameter("nombre"));
        user.setEmail(req.getParameter("email"));
        user.setNacionalidad(req.getParameter("nacionalidad"));
        
        resp.sendRedirect(req.getContextPath()+"/UsuarioServlet");
    }
    
}
    

