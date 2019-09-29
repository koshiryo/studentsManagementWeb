<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Students Management System Admin page</title>
    <link rel="shortcut icon" href="favicon.ico"/>
	<link rel="bookmark" href="favicon.ico"/>
    <link rel="stylesheet" type="text/css" href="easyui/css/default.css" />
    <link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css" />
    <link rel="stylesheet" type="text/css" href="easyui/themes/icon.css" />
    <script type="text/javascript" src="easyui/jquery.min.js"></script>
    <script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
	<script type="text/javascript" src='easyui/js/outlook2.js'> </script>
    <script type="text/javascript">
	 var _menus = {"menus":[
						
						{"menuid":"2","icon":"","menuname":"Student management",
							"menus":[
									{"menuid":"21","menuname":"Students list","icon":"icon-user-student","url":"StudentServlet?method=toStudentListView"},
								]
						},
						<c:if test="${userType == 1 || userType == 3}">
						{"menuid":"4","icon":"","menuname":"Class management",
							"menus":[
									{"menuid":"42","menuname":"Classes list","icon":"icon-house","url":"ClazzServlet?method=toClazzListView"}
								]
						},
						</c:if>
						<c:if test="${userType == 1 || userType == 3}">
						{"menuid":"3","icon":"","menuname":"Teacher management",
							"menus":[
									{"menuid":"31","menuname":"Teacher list","icon":"icon-user-teacher","url":"TeacherServlet?method=toTeacherListView"},
								]
						},
						</c:if>
						{"menuid":"5","icon":"","menuname":"System management",
							"menus":[
							        {"menuid":"51","menuname":"Reset password","icon":"icon-set","url":"SystemServlet?method=toPersonalView"},
								]
						}
				]};


    </script>

</head>
<body class="easyui-layout" style="overflow-y: hidden"  scroll="no">
	
    <div region="north" split="true" border="false" style="overflow: hidden; height: 30px;
        line-height: 20px;color: #fffs">
        <span style="float:right; padding-right:20px;" class="head"><span style="color:blue; font-weight:bold;">${user.name}&nbsp;&nbsp;&nbsp;</span>Hello&nbsp;&nbsp;&nbsp;<a href="LoginServlet?method=logout" style="color:blue; id="Sign out">Logout</a></span>
        <span style="padding-left:10px; font-size: 16px; ">Students Management System</span>
    </div>
    <div region="south" split="true" style="height: 30px; background: #D2E0F2; ">
        <div class="footer">Copyright &copy; KoshiRyo </div>
    </div>
    <div region="west" hide="true" split="true" title="Navigator" style="width:200px;" id="west">
	<div id="nav" class="easyui-accordion" fit="true" border="false">
		<!--  导航内容 -->
	</div>
	
    </div>
    <div id="mainPanle" region="center" style="background: #eee; overflow-y:hidden">
        <div id="tabs" class="easyui-tabs"  fit="true" border="false" >
			<jsp:include page="welcome.jsp" />
		</div>
    </div>
	

	
</body>
</html>