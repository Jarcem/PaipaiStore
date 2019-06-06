package Servlets;

/*
  Author: Jarcem
  Date: 2019/6/3
  Time: 16:44
  Purpose: 
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

public class RegisterServlet extends HttpServlet {
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
        HttpSession session = req.getSession();
        PrintWriter printWriter = resp.getWriter();
        bigCURDServiceImp = new BigCURDServiceImp();
        UserBean userBean = new UserBean();
        userBean.setUser_account(req.getParameter("username"));
        userBean.setUser_password(req.getParameter("password"));
        if (MiscKit.isNotNull(userBean.getUser_account()) && MiscKit.isNotNull(userBean.getUser_password())) {
            if (bigCURDServiceImp.loginCheck(userBean.getUser_account(), userBean.getUser_password()) == 0) {
                mapList = new ArrayList<>();
                map = new HashMap<>();
                map.put("name", "user_account");
                map.put("value", req.getParameter("account"));
                mapList.add(map);
                map = new HashMap<>();
                map.put("name", "user_password");
                map.put("value", req.getParameter("password"));
                mapList.add(map);
                map = new HashMap<>();
                map.put("name", "user_type");
                map.put("value", 1);
                mapList.add(map);
                map = new HashMap<>();
                map.put("name", "user_name");
                map.put("value", req.getParameter("user_name"));
                mapList.add(map);
                map = new HashMap<>();
                map.put("name", "user_phone_number");
                map.put("value", req.getParameter("phonenumber"));
                mapList.add(map);
                map = new HashMap<>();
                map.put("name", "account_status");
                map.put("value", 1);
                mapList.add(map);
                result = bigCURDServiceImp.add("info_user", mapList);
                if (result == 1){
                    req.getRequestDispatcher("/index.show").forward(req, resp);
                }else{
                    printWriter.println("<script>alert('注册失败，请联系客服获取详细情况');history.back();</script>");
                }
            } else {
                printWriter.println("<script>alert('账号已存在');history.back();</script>");
            }
        }else{
            printWriter.println("<script>alert('账号或密码栏不能为空');history.back();</script>");
        }
    }
}
