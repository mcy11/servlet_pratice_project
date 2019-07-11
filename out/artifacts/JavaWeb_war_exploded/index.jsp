<%--
  Created by IntelliJ IDEA.
  User: hashu
  Date: 2019/7/11
  Time: 13:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
      <form action="${PageContext.request.contextPath}/addRel" method="post">
        <table align="center" border="1">
          <tr>
            <td>用户名称</td>
            <td>
              <input name="userName" type="text">
            </td>
            <td>负责人姓名</td>
            <td>
              <input type="text" name="leadingName">
            </td>
          </tr>
          <tr>
            <td>
              <button type="submit">提交</button>
            </td>
          </tr>
        </table>
      </form>
  </body>
</html>
