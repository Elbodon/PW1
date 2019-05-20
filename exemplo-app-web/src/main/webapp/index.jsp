<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<body>
<h1>HELLO SERVLET</h1>

<form action="/requisicao1" method="post" >
    <fieldset>
        <label>Numero de Requisicoes: </label>
        <input type="submit" value="Requisicao1"/>
    </fieldset>
</form>

<form action="/requisicao2" method="post" >
    <fieldset>
        <label>Numero de Requisicoes: </label>
        <input type="submit" value="Requisicao2" />
    </fieldset>
</form>

<h3>Requisicao 1:</h3> <fieldset> <c:out value="${Req1}"/> </fieldset> <br>
<h3>Requisicao 2:</h3><fieldset> <c:out value="${Req2}"/> </fieldset> <br>
<fieldset><c:out value="${mensagemErro}"/></fieldset>

</body>
</html>
