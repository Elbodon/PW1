<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Familia Nogueira
  Date: 23/05/2019
  Time: 21:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h2>Usuário:</h2>
Nome: <c:out value="${usuario.primeiroNome}"></c:out>
Sobrenome: <c:out value="${usuario.ultimoNome}"></c:out>
Data de nascimento: <c:out value="${usuario.dataNascimento}"></c:out>
Gênero: <c:out value="${usuario.genero}"></c:out>
Telefone: <c:out value="${usuario.telefone}"></c:out>
Email: <c:out value="${usuario.email}"></c:out>
Senha: <c:out value="${usuario.senha}"></c:out>
Cidade: <c:out value="${usuario.cidade}"></c:out>
País: <c:out value="${usuario.pais}"></c:out>


</body>
</html>
