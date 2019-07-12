<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript">
 $(function(){
	 $("form").submit(function(){
		 //验证信息
		 var str=$("[name='cid']").val();
		 if(str=='请选择'){
			 alert("请选择分类");
			 return false;
		 }
		 
		 var title=$("[name='title']").val();
		 if($.trim(title).length==0){
			 alert("请填写标题");
			 return false;
		 }
		 
		 var content=$("[name='content']").val();
		 if($.trim(content).length==0){
			 alert("请填写内容");
			 return false;
		 }
		 
		 
		 return true;
		 
		 
	 });
 })
</script>
</head>
<body>
    <h1>add</h1>
    <form action="addknow" method="post">
      分类:
      <select name="classid" >
          <option>请选择</option>
          <c:forEach items="${clist}" var="c">
             <option value="${c.id}">${c.cname}</option>
          </c:forEach>
      </select><br>
      标题:<input type="text" name="title"><br>
   内容:<textarea rows="5" cols="20" name="content"></textarea> <br>
   <input type="submit" value="add">  
    </form>
</body>
</html>