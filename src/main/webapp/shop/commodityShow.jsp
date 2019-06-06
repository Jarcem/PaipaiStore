<!doctype html>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <html>
      <head>
        <link rel="stylesheet" href="../css/PaipaiStore.css"/>
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.0.0/css/bootstrap.min.css"/>

        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.slim.min.js"></script>
        <script src="https://cdn.bootcss.com/popper.js/1.12.9/umd/popper.min.js"></script>
        <script src="https://cdn.bootcss.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>

      </head>
      <body>
        <form class="magicShow">
          <div class="magicShowItem">
            <c:forEach var="goods" items="${goodsList1}">
              <div class="card" style="width: 350px; margin:5px;">
                <img class="card-img-top" src="${goods.commodity_image}" alt="Paipai Store">
                  <div class="card-body">
                    <h5 class="card-title">${goods.commodity_name}</h5>
                    <p class="card-text">
                      <span class="badge badge-danger">
                        <ion-icon name="logo-yen"></ion-icon>&nbsp;${goods.commodity_price}</span>
                      <span class="badge badge-info">${goods.commodity_unit}</span>
                      <!--<nav aria-label="Page navigation example">
                        <ul class="pagination">
                          <li class="page-item">
                            <a class="page-link" href="#">-</a>
                          </li>
                          <li class="page-item disabled">
                            <a class="page-link">0</a>
                          </li>
                          <li class="page-item">
                            <a class="page-link" href="#">+</a>
                          </li>
                        </ul>
                      </nav>-->
                    </p>
                  </div>
                  <ul class="list-group list-group-flush">
                    <li class="list-group-item">
                      <ul class="nav justify-content-around">
                        <li class="nav-item">
                          <a class="btn btn-primary" href="commodity.operate?action=toShopcart?goodsId=${goods.commodity_id}">加入购物车</a>
                        </li>
                        <li class="nav-item">
                          <a class="btn btn-warning" href="commodity.operate?action=toBuy?goodsId=${goods.commodity_id}">立即购买</a>
                        </li>
                      </ul>
                    </li>
                  </ul>
                </div>
              </c:forEach>
            </div>
            </form>
          </body>
        </html>
