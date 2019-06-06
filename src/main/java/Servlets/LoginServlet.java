package Servlets;

/*
  Author: Jarcem
  Date: 2019/5/30
  Time: 17:10
  Purpose: 用户登录
*/

import Beans.UserBean;
import Misc.MiscKit;
import ServicesImp.BigCURDServiceImp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoginServlet extends HttpServlet {
    BigCURDServiceImp bigCURDServiceImp = null;
    List<Map<String, Object>> mapList = null;
    Map<String, Object> map = null;
    List<Object> objectList = null;
    int result = 0;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=utf-8");
        resp.setCharacterEncoding("UTF-8");
        req.setCharacterEncoding("UTF-8");
        PrintWriter printWriter = resp.getWriter();
        HttpSession session = req.getSession();
        bigCURDServiceImp = new BigCURDServiceImp();
        UserBean userBean = new UserBean();
        userBean.setUser_account(req.getParameter("username"));
        userBean.setUser_password(req.getParameter("password"));
        if (MiscKit.isNotNull(userBean.getUser_account()) && MiscKit.isNotNull(userBean.getUser_password())) {
            if (bigCURDServiceImp.loginCheck(userBean.getUser_account(), userBean.getUser_password()) == 1) {
                mapList = new ArrayList<>();
                map = new HashMap<>();
                map.put("name", "user_account");
                map.put("rea", "=");
                map.put("value", userBean.getUser_account());
                objectList = bigCURDServiceImp.query("info_user", mapList, new UserBean());
                for (Object o:objectList){
                    userBean = (UserBean) o;
                            session.setAttribute("userBean", userBean);
                }
                req.getRequestDispatcher("/index.show").forward(req, resp);
            } else {
                printWriter.println("<script>alert('登录失败');history.back();</script>");
            }
        }
    }
}
