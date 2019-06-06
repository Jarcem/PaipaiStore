package Servlets;

/*
  Author: Jarcem
  Date: 2019/5/26
  Time: 12:55
  Purpose: 商品展示服务
*/

import Beans.CommodityBean;
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

public class CommodityShowServlet extends HttpServlet {
    BigCURDServiceImp bigCURDServiceImp = null;
    List<Map<String, Object>> mapList = null;
    Map<String, Object> map = null;
    List<Object> objectList = null;
    int result = 0, page = 1, startNum = 1;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=utf-8");
        resp.setCharacterEncoding("UTF-8");
        req.setCharacterEncoding("UTF-8");
        HttpSession session = req.getSession();
        int pageParameter = (req.getParameter("page") == null ? 1 : Integer.valueOf(req.getParameter("page")));
        if (pageParameter != 1) {
            page = pageParameter;
            startNum = 1 + 20 * (page - 1);
        }
        mapList = new ArrayList<>();
        map = new HashMap<>();
        map.put("name", "commodity_id");
        map.put("rea", ">=");
        map.put("value", startNum + " limit 20");
        mapList.add(map);
        bigCURDServiceImp = new BigCURDServiceImp();
        objectList = bigCURDServiceImp.query("info_commodity", mapList, new CommodityBean());
        List<CommodityBean>[] commodityBeanList = new ArrayList[4];
        int counter = 0, i = 0;
        for (Object object : objectList) {
            CommodityBean commodityBean = (CommodityBean) object;
            if (counter < 5) {
                commodityBeanList[i].add(commodityBean);
                counter++;
            } else {
                counter = 0;
                i++;
            }
        }
        for (int j = 0; j < 4; j++) {
            session.setAttribute(("goodsList" + String.valueOf(j + 1)), (((List<CommodityBean>) session.getAttribute("goodsList" + String.valueOf(j + 1))) == null ? commodityBeanList[j] : (((List<CommodityBean>) session.getAttribute("goodsList" + String.valueOf(j + 1))).addAll(commodityBeanList[j]))));
        }
        session.setAttribute("page", page);
        req.getRequestDispatcher("/shop/commodityShow.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
