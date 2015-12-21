<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>首页</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <style type="text/css">
        *{margin: 0px;padding: 0px}
        body{padding-top: 54px;height: 100%}
        .navbar{padding-left: 5%;padding-right: 5%;}
        #rightBox{position: fixed;height: auto;width: 44px;top: 70%;right: 1px;}
        #rightBox #cuntomBox{cursor: pointer}
        #rightBox #customB, #rightBox #upB{width: 100%;height: 44px;display: block;z-index: 11}
        #rightBox #customT{width: 100%;height: 44px;display: block;z-index: 12;top: 0px;position: absolute;
            background-color: #333;text-align: center;padding-top: 1px;padding-left: 1px;right: -51px;
            opacity: 0.8;filter:alpha(opacity=80) }
        #rightBox #customT div{font-weight: 900;font-size: 16px;color: #FFF;letter-spacing: 1px;}
        #rightBox #upB{margin-top: 5px}
        #rightBox #customB img{width: 100%;height: 100%}
        .modal-header{padding-top: 10px;padding-bottom: 10px}
        .modal-body{height: 400px;overflow-y: auto}
        .modal-body li{list-style: none;color: #666;font-size: 16px;width: 100%;margin-top: 3px}
        .modal-body li img{width: 29px;height: 29px;border-radius: 50%;}
        .modal-body .li-left img{float: left}
        .modal-body .li-right img{float: right}
        .modal-body li .chat{background-color: #5bc0de;padding: 5px 10px;border-radius: 5px;display: block;
            max-width: 70%;word-break: break-all}
        .modal-body .li-left .chat{float: left;margin-left: 5px}
        .modal-body .li-right .chat{float: right;margin-right: 5px}
        .modal-body .notice{padding: 1px 20px;background-color: #333;opacity: 0.5;filter:alpha(opacity=50);
            border-radius: 15px;font-size: 12px;max-width: 80%;color: #fff;text-align: center;margin: 3px auto 0px;
            word-break: break-all;font-weight: 700}
        .modal-body .li-time{font-size: 12px;color: #666;text-align: center}
        .modal-body .question-list{font-size: 14px;background-color: #e6e6e6;padding: 5px 10px;border-radius: 5px;
            width: 70%;word-break: break-all}
        .modal-body .question-list a{word-break: break-all}
        .modal-footer{padding-bottom: 10px;padding-top: 3px;}
        .model-sub{width: 100%;height: auto}
        .model-sub div{width: auto;float: left;height: 20px;font-size: 19px;color: #999}
        .model-sub span{cursor: pointer;margin: 0px 3px}
        .model-sub span:hover{color: #333;}
        .modal-footer textarea{width: 100%;height: 50px;padding: 3px;border: none;resize: none;margin-top: 3px;
            outline: none;color: #333;font-family: 微软雅黑}
        .clear{clear: both}
    </style>
</head>
<body>
<nav class="navbar navbar-fixed-top navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">
                <span class="glyphicon glyphicon-home" aria-hidden="true"></span>&nbsp;首页
            </a>
        </div>
        <ul class="nav navbar-nav navbar-right">
            <li>
                <a href="#"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span>&nbsp;注册</a>
            </li>
            <li>
                <a href="#" data-toggle="modal">
                    <span class="glyphicon glyphicon-user" aria-hidden="true"></span>&nbsp;登录
                </a>
            </li>
        </ul>
    </div>
</nav>

<!-- 客服图标开始 -->
<div id="rightBox">
    <div id="cuntomBox" data-toggle="modal" data-target="#customModal">
        <span id="customB"><img src="img/custom.png" alt="客服"></span>
        <span id="customT">
            <div>联系</div>
            <div>客服</div>
        </span>
    </div>
    <span id="upB"></span>
</div>
<!-- 客服图标结束 -->
<!-- 聊天面板开始 -->
<div class="modal fade" id="customModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">客服</h4>
            </div>
            <div class="modal-body">
                <ul>
                    <li class="question-list">
                        <p>1、<a href="#">问题一</a></p>
                        <p>2、<a href="#">问题二</a></p>
                        <p>3、<a href="#">问题三</a></p>
                        <p>4、<a href="#">问题四</a></p>
                        <p>5、<a href="#">人工服务</a></p>
                    </li>
                    <li class="li-right">
                        <img src="img/custom.png" alt="头像">
                        <div class="chat">问题一</div>
                        <div class="clear"></div>
                    </li>
                    <li class="question-list">
                       答案一
                    </li>
                    <li class="notice">正在链接客服</li>
                    <li class="notice">您已经链接5号客服</li>
                    <li class="li-time">
                        2015-12-10 19:42
                    </li>
                    <li class="li-left">
                        <img src="img/custom.png" alt="头像">
                        <div class="chat">你好，请问有什么可以帮助你的吗？</div>
                        <div class="clear"></div>
                    </li>
                    <li class="li-right">
                        <img src="img/custom.png" alt="头像">
                        <div class="chat">并没有</div>
                        <div class="clear"></div>
                    </li>
                </ul>
            </div>

            <div class="modal-footer">
                <div class="model-sub">
                    <div>
                        <span class="glyphicon glyphicon-th-large" aria-hidden="true"
                              data-toggle="tooltip" data-placement="top" title="表情"></span>
                        <span class="glyphicon glyphicon-picture" aria-hidden="true"
                              data-toggle="tooltip" data-placement="top" title="图片"></span>
                        <span class="glyphicon glyphicon-font" aria-hidden="true"
                              data-toggle="tooltip" data-placement="top" title="字体"></span>
                        <span class="glyphicon glyphicon-th-list" aria-hidden="true"
                              data-toggle="tooltip" data-placement="top" title="列出菜单"></span>
                    </div>
                    <button type="button" class="btn btn-primary" style="padding: 1px 10px">发送</button>
                </div>
                <textarea type="text" placeholder="请输入您的问题..."></textarea>
            </div>
        </div>
    </div>
</div>
<!-- 聊天面板结束 -->

<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/index.js"></script>
</body>
</html>
