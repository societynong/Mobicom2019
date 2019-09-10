package zyn.web;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;

public class ServletResource extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
//        ServletContext context = getServletContext();
//        InputStream inputStream = context.getResourceAsStream("download/照片.png");
//        String path = getServletContext().getRealPath("download/照片.png");
//
//        String filename = path.substring(path.lastIndexOf('\\')+1);
//        resp.setHeader("Content-Disposition","attachment; filename="+ URLEncoder.encode(filename,"UTF-8"));
//
//        int len = 0;
//        byte[] bytes = new byte[1024];
//
//        ServletOutputStream servletOutputStream = resp.getOutputStream();
//
//        while((len = inputStream.read(bytes)) > 0) {
//            servletOutputStream.write(bytes,0,len);
//        }
//
//        servletOutputStream.close();
//        inputStream.close();

//        resp.getWriter().write("3秒跳转");
//        resp.setHeader("Refresh","3;url=index.jsp");
        resp.sendRedirect("index.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}