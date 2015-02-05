<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Lista de Cursos</title>
</head>
<body>
	
	<h3>Lista de Cursos</h3>
	
	</br>	
	
	<a href="novocurso.jsp">Inserir Novo Curso</a>
	
	</br></br>
	
	<c:if test="${not empty novocurso}">
		Novo aluno inserido com sucesso: ${novocurso}
	</c:if>

	</br></br>

	<table border=1px;>
		<tr>
			<td>Código</td>
			<td>Nome</td>
			<td colspan="2">Ação</td>
		</tr>

		<c:forEach var="curso" items="${cursos}">
			<tr>
				<td>${curso.cdCurso}</td>
				<td>${curso.nome}</td>
				<td><a href="filtro?tarefa=ProcuraCurso&codigo=${aluno.cdCurso}">Editar</a></td>
				<td><a href="filtro?tarefa=DeletaCurso&codigo=${aluno.cdCurso}"">Excluir</a></td>
			</tr>
		</c:forEach>
	</table>	
	
	</br>
	</br>
	
	<a href="index.jsp"> Voltar </a>
	
</body>
</html>