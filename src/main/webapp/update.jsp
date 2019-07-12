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
            $("[value='删除']").click(function(){
                 var kid=$("[name='id']").val();
                 location.href="delete?id="+kid;
            });
        });
    </script>
</head>
<body>
    <h1>add</h1>
    <form action="update" method="post">
        <input type="hidden" name="id" value="${know.id}">
      分类:
      <select name="classid" >
          <c:forEach items="${clist}" var="c">
             <option value="${c.id}"  ${c.id==know.classes.id?"selected":""}>${c.cname}</option>
          </c:forEach>
      </select><br>
      标题:<input type="text" name="title" value="${know.title}"><br>
   内容:<textarea rows="5" cols="20" name="content">${know.content}</textarea> <br>
  最后修改时间:${know.lastmodified}<br>
   <input type="submit" value="更新">
        <input type="button" value="删除">
    </form>
</body>
</html>











