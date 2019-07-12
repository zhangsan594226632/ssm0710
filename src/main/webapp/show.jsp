<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body >
 <div>
   <form action="/getknows" method="post">
    关键字:<input  name="title" value="${tit}">
    <input type="submit" value="查询">
   </form>
   <a href="/getclasses">添加书籍</a>
   </div>
   <div>
     <table border="1" cellspacing="0" width="70%">
       <tr>
         <td>序号</td>
         <td>标题</td>
         <td>分类</td>
         <td>最后编辑</td>
       </tr>
      <c:forEach items="${pi.list}" var="b" varStatus="sta">
       <tr>
         <td>${sta.count}</td>
         <td><a href="findbyid?id=${b.id}">${b.title}</a></td>
         <td>${b.classes.cname}</td>
         <td><fmt:formatDate value="${b.lastmodified}" pattern="yyyy-MM-dd hh:mm:ss"></fmt:formatDate>  </td>
       </tr>
       </c:forEach>  
        <tr>
         <td colspan="4">
              <a href="getknows?title=${tit}">首页</a>
               <a href="getknows?index=${pi.prePage==0?1:pi.prePage}&title=${tit}">上一页</a>
                <a href="getknows?index=${pi.nextPage==0?pi.pages:pi.nextPage}&title=${tit}">下一页</a>
                 <a href="getknows?index=${pi.pages}&title=${tit}">尾页</a>
                 第${pi.pageNum}页/共${pi.pages}页 (${pi.total}条数据)
         </td>
       </tr>
     </table>
     
   </div>

</body>
</html>