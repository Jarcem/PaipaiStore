<!doctype html>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <html>
      <head>
        <link rel="stylesheet" href="./css/PaipaiStore.css"/>

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.0.0/css/bootstrap.min.css"/>

        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.slim.min.js"></script>
        <script src="https://cdn.bootcss.com/popper.js/1.12.9/umd/popper.min.js"></script>
        <script src="https://cdn.bootcss.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>

        <!-- icons -->
        <script src="https://unpkg.com/ionicons@4.5.5/dist/ionicons.js"></script>

        <title>拍派商城</title>
      </head>
      <body>
        <div>
          <!-- top menu -->
          <nav class="navbar navbar-expand-lg navbar-light" style="background-color: #e3f2fd;">
            <div>
              <h1>
                <span class="badge badge-pill badge-warning">Paipai</span>Store</h1>
            </div>
            &nbsp;&nbsp;&nbsp;
            <div>
              <form class="form-inline">
                <div class="input-group">
                  <input type="text" class="form-control" placeholder="商品关键字" aria-label="Power by JarcemLeo" aria-describedby="basic-addon1"></div>
                  <button class="btn btn-outline-info my-2 my-sm-0" type="submit">
                    <ion-icon name="search"></ion-icon>
                  </button>
                </form>
              </div>

              <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Power by JarcemLeo">
                <span class="navbar-toggler-icon"></span>
              </button>
              &nbsp;&nbsp;&nbsp;
              <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                  <li class="nav-item">
                    <form class="form-inline">
                      <div class="input-group">
                        <input type="text" class="form-control" placeholder="商品关键字" aria-label="Power by JarcemLeo" aria-describedby="basic-addon1"></div>
                        <button class="btn btn-outline-info my-2 my-sm-0" type="submit">
                          <ion-icon name="search"></ion-icon>
                        </button>
                      </form>
                    </li>
                    &nbsp;&nbsp;&nbsp;
                  </ul>
                </div>
              </nav>

              <!--broadcast-->
              <div class="alert alert-warning" role="alert">
                <a style="max-width: 100px; overflow: hidden; text-overflow: ellipsis; white-space: nowrap;" href="#collapseExample" data-toggle="collapse" role="button" aria-expanded="false" aria-controls="collapseExample">
                  <ion-icon name="volume-high"></ion-icon>&nbsp;${broadcast}</a>
              </div>
              <div class="collapse" id="collapseExample">
                <div class="card card-body">
                  ${broadcast}
                </div>
              </div>

              <div style="width:100%;">
                <!-- head banner -->
                <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
                  <ol class="carousel-indicators">
                    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                  </ol>
                  <div class="carousel-inner">
                    <c:forEach var="banner" items="${bannerList}">
                      <!-- <div class="carousel-item active"> <img class="d-block w-100" src="${banner.banner_img}" alt="Paipai Store"></div> <div class="carousel-item"></c:forEach> -->
                      <div class="carousel-item active">
                        <img class="d-block w-100" src="d:\Photos\6b8c14f8gy1fisg74o0wbj21kw0wwtd9.jpg" alt="First slide"></div>
                        <div class="carousel-item">
                          <img class="d-block w-100" src="d:\Photos\6b8c14f8gy1fiu01cm414j218g0qon10.jpg" alt="Second slide"></div>
                          <div class="carousel-item">
                            <img class="d-block w-100" src="d:\Photos\6b8c14f8gy1fft5f8fhnuj215y0pmjwf.jpg" alt="Third slide"></div>
                          </div>
                          <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
                            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                            <span class="sr-only">Previous</span>
                          </a>
                          <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
                            <span class="carousel-control-next-icon" aria-hidden="true"></span>
                            <span class="sr-only">Next</span>
                          </a>
                        </div>
                      </div>

                      <!-- shortcut -->
                      <div>
                        <div class="jumbotron jumbotron-fluid">
                          <div class="container">
                            <form class="magicShow" style="justify-content: flex-start;">
                              <c:forEach var="shortcut" items="shortcutList">
                                <div class="card" style="width: 10rem;">
                                  <a href="${shortcut.shortcut_target}">
                                    <img class="card-img-top" src="${shortcut.shortcut_image}" alt="Power by JarcemLeo"></a>
                                    <div class="card-body">
                                      <p class="card-text">${shortcut.shortcut_name}</p>
                                    </div>
                                  </div>
                                </c:forEach>
                              </form>
                            </div>
                            <hr class="display-4"/>
                          </div>
                        </div>

                        <div style="margin: auto 30px;">
                          <!-- commodity show -->
                          <iframe frameborder="0" id="mainframe" name="mainframe" width="100%" height="100%" scrolling="no" src="commodity.show"></iframe>
                          <script type="text/javascript" language="javascript">
                            function changeFrameHeight() {
                              var ifm = document.getElementById("mainframe");
                              ifm.height = document.documentElement.clientHeight - 56;
                            }
                            window.onresize = function () {
                              changeFrameHeight();
                            }
                            $(function () {
                              changeFrameHeight();
                            });
                          </script>
                        </div>

                        <!--<script>
                          $(window).scroll(function () {
                            loadmore($(this));
                          });
                          var flag = true; //标志，确定达到之后则停止,为了同时只进行一次加载操作
                          function loadmore(obj) {
                            var scrollTop = $(obj).scrollTop(); //目前所在的位置
                            var scrollHeight = $(document).height(); //文章一共有多长
                            var windowHeight = $(obj).height(); //一页一共有多长
                            if (scrollHeight - (scrollTop + windowHeight) <= 20) {
                              if (flag) {
                                alert("test"); //到底了在这里请求新的一页，这里可以放ajax获取新一页
                                flag = false; //只执行一次
                              }
                            }
                          }
                        </script>-->

                        <!-- bottom menu -->
                        <div style="width: 100%;" class="bottombar btn-block ">
                          <div class="nav btn-group-lg justify-content-center" role="group" aria-label="Power by JarcemLeo">
                            <button style="width:150px;" type="button" class="btn btn-dark">
                              <ion-icon name="home"></ion-icon>&nbsp;首页</button>
                            <button style="width:150px; margin-left:10px;" type="button" class="btn btn-dark">
                              <ion-icon name="briefcase"></ion-icon>&nbsp;超市</button>
                            <button style="width:150px; margin-left:10px;" type="button" class="btn btn-dark">
                              <ion-icon name="cart"></ion-icon>&nbsp;购物车&nbsp;<span id="shopcart" class="badge badge-light">${shopcartNumber}</span>
                            </button>
                            <button style="width:150px; margin-left:10px;" type="button" class="btn btn-dark">
                              <ion-icon name="person"></ion-icon>&nbsp;个人中心</button>
                          </div>
                        </div>

                      </body>
                    </html>
