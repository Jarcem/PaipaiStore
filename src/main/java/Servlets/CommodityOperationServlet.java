package Servlets;

/*
  Author: Jarcem
  Date: 2019/5/26
  Time: 22:03
  Purpose: 添加购物车或购买
*/

import Beans.ShopcartBean;
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

public class CommodityOperationServlet extends HttpServlet {
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
        String actionParameter = req.getParameter("action");
        String goodsId = req.getParameter("goodsId");
        String shopcartId = null;
        if (session.getAttribute("userBean")!=null){
            switch (actionParameter){
                case "toShopcart":{
                    int userId = ((UserBean)session.getAttribute("userBean")).getUser_id();
                    bigCURDServiceImp = new BigCURDServiceImp();
                    mapList = new ArrayList<>();
                    map = new HashMap<>();
                    map.put("name", "shopcart_user_id");
                    map.put("rea", "=");
                    map.put("value", userId);
                    mapList.add(map);
                    objectList = bigCURDServiceImp.query("info_shopcart", mapList, new ShopcartBean());
                    for (Object object: objectList){
                        int[] commodityInfo = new int[2];
                        int switchKey = 0, contentCoodinate = 0;
                        ShopcartBean shopcartBean = (ShopcartBean) object;
                        List<String> shopcartContent = MiscKit.transformToList(shopcartBean.getShopcart_content());
                        for(String strContent : shopcartContent){
                            contentCoodinate++;
                            commodityInfo = MiscKit.getNumberAndPrice(strContent);
                            if (Integer.valueOf(goodsId) == commodityInfo[0]){
                                commodityInfo[1]++;
                                switchKey = 1;
                                break;
                            }
                        }
                        if(switchKey == 0){
                            String string = goodsId+"."+"1";
                            shopcartContent.add(string);
                        }else{
                            String str = commodityInfo[0]+"."+commodityInfo[1];
                            shopcartContent.set(contentCoodinate-1, str);
                        }
                        mapList = new ArrayList<>();
                        map = new HashMap<>();
                        map.put("name", "shopcart_user_id");
                        map.put("value", userId);
                        mapList.add(map);
                        map = new HashMap<>();
                        map.put("name", "shopcart_content");
                        map.put("value", MiscKit.transfromToString(shopcartContent));
                        mapList.add(map);
                        bigCURDServiceImp = new BigCURDServiceImp();
                        result = bigCURDServiceImp.update("info_shopcart", mapList, String.valueOf(shopcartBean.getShopcart_id()));
                    }
                }break;
                case "toBuy":{
                    req.getRequestDispatcher("").forward(req,resp);//go to buy commodity page
                }break;
            }
            if (result == 1) {
                req.getRequestDispatcher("/index.show").forward(req, resp);
            }else{
                PrintWriter printWriter = resp.getWriter();
                printWriter.println("<script>alert('商品添加失败');history.back();</script>");
            }
        }else{
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
