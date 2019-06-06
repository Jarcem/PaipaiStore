<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
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
      <title>用户登录</title>
    </head>
    <body style="padding: 50px;">
      <div style="border: 2px solid; margin:5% auto; padding: 30px; border-radius: 24px; color:#3089c2;">
        <div style="color:black; text-align:center">
          <h1>
            <span class="badge badge-pill badge-warning">Paipai</span>Store</h1>
        </div>
        <ul class="nav nav-tabs" id="myTab" role="tablist">
          <li class="nav-item">
            <a class="nav-link active" id="home-tab" data-toggle="tab" href="#login" role="tab" aria-controls="home" aria-selected="true">登录</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" id="profile-tab" data-toggle="tab" href="#register" role="tab" aria-controls="profile" aria-selected="false">注册</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" id="contact-tab" data-toggle="tab" href="#others" role="tab" aria-controls="contact" aria-selected="false">第三方</a>
          </li>
        </ul>
        <div class="tab-content" id="myTabContent">
          <div class="tab-pane fade show active" id="login" role="tabpanel" aria-labelledby="home-tab">
            <form id="login" action="login.action" method="post">
              <div class="input-group mb-3">
                <div class="input-group-prepend">
                  <span class="input-group-text" id="inputGroup-sizing-default">账号</span>
                </div>
                <input id="account" type="text" class="form-control" aria-label="Default" aria-describedby="inputGroup-sizing-default"></div>
                <div class="input-group mb-3">
                  <div class="input-group-prepend">
                    <span class="input-group-text" id="inputGroup-sizing-default">密码</span>
                  </div>
                  <input id="password" type="password" class="form-control" aria-label="Default" aria-describedby="inputGroup-sizing-default"></div>
                  <button type="submit" class="btn btn-info btn-lg btn-block">提交</button>
                </form>
              </div>
              <div class="tab-pane fade" id="register" role="tabpanel" aria-labelledby="profile-tab">
                <form id="registerform" action="register.action" method="post">
                  <div class="input-group mb-3">
                    <div class="input-group-prepend">
                      <span class="input-group-text" id="inputGroup-sizing-default">账号</span>
                    </div>
                    <input id="account" type="text" class="form-control" aria-label="Default" aria-describedby="inputGroup-sizing-default" placeholder="登录名"></div>
                    <div class="input-group mb-3">
                      <div class="input-group-prepend">
                        <span class="input-group-text" id="inputGroup-sizing-default">密码</span>
                      </div>
                      <input id="password" type="password" class="form-control" aria-label="Default" aria-describedby="inputGroup-sizing-default" placeholder="密码"></div>
                      <div class="input-group mb-3">
                        <div class="input-group-prepend">
                          <span class="input-group-text" id="inputGroup-sizing-default">密码</span>
                        </div>
                        <input id="password1" type="password" class="form-control" aria-label="Default" aria-describedby="inputGroup-sizing-default" placeholder="确认密码"></div>
                        <div class="input-group mb-3">
                          <div class="input-group-prepend">
                            <span class="input-group-text" id="inputGroup-sizing-default">姓名</span>
                          </div>
                          <input id="username" type="text" class="form-control" aria-label="Default" aria-describedby="inputGroup-sizing-default" placeholder="真实姓名"></div>
                          <div class="input-group mb-3">
                            <div class="input-group-prepend">
                              <span class="input-group-text" id="inputGroup-sizing-default">电话</span>
                            </div>
                            <input id="phonenumber" type="text" class="form-control" aria-label="Default" aria-describedby="inputGroup-sizing-default" placeholder="将作为默认收货联系电话"></div>
                            <div class="alert alert-warning" role="alert">
                              所有项都为必填项，不能为空
                            </div>
                            <!-- <div class="form-group"> <div class="form-check"> <input class="form-check-input" type="checkbox" value="" id="invalidCheck" required="required"> <label class="form-check-label" for="invalidCheck"> 用户注册协议 </label> <div class="invalid-feedback">
                            必须同意用户注册协议才可继续 </div> </div> </div> -->
                            <button type="button" class="btn btn-info btn-lg btn-block" data-toggle="modal" data-target="#userTreatyModal">提交</button>
                          </form>
                        </div>
                        <div class="tab-pane fade" id="others" role="tabpanel" aria-labelledby="contact-tab">开发中...</div>
                      </div>
                    </div>

                    <!-- Modal -->
                    <div class="modal fade" id="userTreatyModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                      <div class="modal-dialog" role="document">
                        <div class="modal-content">
                          <div class="modal-header">
                            <h5 class="modal-title" id="exampleModalLabel">用户注册协议</h5>
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                              <span aria-hidden="true">&times;</span>
                            </button>
                          </div>
                          <div class="modal-body">
                            ...
                          </div>
                          <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-dismiss="modal">不同意</button>
                            <button id="submitReg" type="button" class="btn btn-primary">同意</button>
                            <script>
                              $("#submitReg").click(function () {
                                var pwd = document.getElementById("password").value;
                                var tpwd = document.getElementById("password1").value;

                                if (tpwd == "pwd") {
                                  alert("您两次密码不一致");
                                  return
                                }
                                $("#registerform").submit();
                              });
                            </script>
                          </div>
                        </div>
                      </div>
                    </div>
                  </body>
                </html>
