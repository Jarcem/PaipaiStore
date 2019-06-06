package Servlets;

/*
  Author: Jarcem
  Date: 2019/5/22
  Time: 16:57
  Purpose: 首页服务
*/

import Beans.*;
import ServicesImp.BigCURDServiceImp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IndexServlet extends HttpServlet {
    BigCURDServiceImp bigCURDServiceImp = null;
    List<Map<String, Object>> mapList = null;
    Map<String, Object> map = null;
    List<Object> objectList = null;
    int result = 0;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=utf-8");
        resp.setCharacterEncoding("UTF-8");
        req.setCharacterEncoding("UTF-8");
        HttpSession session = req.getSession();
        int shopcartNumber = 0;
        if (session.getAttribute("userBean") != null) {
            bigCURDServiceImp = new BigCURDServiceImp();
            mapList = new ArrayList<>();
            map = new HashMap<>();
            map.put("name", "shopcart_id");
            map.put("rea", "=");
            map.put("value", ((UserBean) session.getAttribute("userBean")).getUser_id());
            mapList.add(map);
            objectList = bigCURDServiceImp.query("info_shopcart", mapList, new OrderBean());
            ShopcartBean shopcartBean = (ShopcartBean) objectList.get(0);
            shopcartNumber = shopcartBean.getShopcart_amount();
        }
        session.setAttribute("shopcartNumber", shopcartNumber);
        bigCURDServiceImp = new BigCURDServiceImp();
        mapList = new ArrayList<>();
        map = new HashMap<>();
        map.put("name", "broadcast_id");
        map.put("rea", "=");
        map.put("value", "(select MAX(broadcast_id) from info_broadcast)");
        mapList = new ArrayList<>();
        mapList.add(map);
        objectList = bigCURDServiceImp.query("info_broadcast", mapList, new BroadCastBean());
        BroadCastBean broadCastBean = (BroadCastBean) objectList.get(0);
        session.setAttribute("broadcast", broadCastBean.getBroadcast_message());
        objectList = bigCURDServiceImp.query("info_shortcut", new ShortcutBean());
        session.setAttribute("shortcutList", objectList);
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}