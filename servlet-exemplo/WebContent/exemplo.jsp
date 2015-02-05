<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Lista exemplo</title>
</head>
<body>
	<h3>Lista de alunos</h3>
	
	<ul>
		<c:forEach items="${alunos}" var="aluno" >
			<li>${aluno.nome}</li>
		</c:forEach>
	</ul>
	
	<select>
		<option id=""> Texto </option>
	</select>
	
	<c:if test="${not empty alunos}">
		Mensagem de sucesso
	</c:if>
	
	
</body>
</html>