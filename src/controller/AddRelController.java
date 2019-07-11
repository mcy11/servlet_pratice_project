package controller;

import model.UserRel;
import service.UserRelService;
import service.impl.UserRelServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author mcy
 * @date 2019/7/11
 */
@WebServlet("/addRel")
public class AddRelController extends HttpServlet {

    private String message;

    private UserRelService userRelService = new UserRelServiceImpl();

    @Override
    public void init() throws ServletException {
        message = "Hello world, this message is from servlet!";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");
        String userName = req.getParameter("userName");
        String leadingName = req.getParameter("leadingName");
        UserRel userRel = new UserRel();
        userRel.setUserName(userName);
        userRel.setLeadingName(leadingName);
        userRelService.addUserRel(userRel);
        //设置逻辑实现

        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        out.println("关系建立成功");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    public void destroy() {
        super.destroy();
    }

}
