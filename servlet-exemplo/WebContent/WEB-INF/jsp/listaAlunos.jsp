<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Lista de Alunos</title>
</head>
<body>
	
	<h3>Lista de Alunos</h3>
	
	</br>	
	
	<a href="novoaluno.jsp">Inserir Novo Aluno</a>
	
	</br></br>
	
	<c:if test="${not empty novoaluno}">
		Novo aluno inserido com sucesso: ${novoaluno}
	</c:if>

	</br></br>

	<table border=1px;>
		<tr>
			<td>Código</td>
			<td>Nome</td>
			<td colspan="2">Ação</td>
		</tr>

		<c:forEach var="aluno" items="${alunos}">
			<tr>
				<td>${aluno.cdAluno}</td>
				<td>${aluno.nome}</td>
				<td><a href="filtro?tarefa=ProcuraAluno&codigo=${aluno.cdAluno}">Editar</a></td>
				<td><a href="filtro?tarefa=DeletaAluno&codigo=${aluno.cdAluno}"">Excluir</a></td>
			</tr>
		</c:forEach>
	</table>	
	
	</br>
	</br>
	
	<a href="index.jsp"> Voltar </a>
	
</body>
</html>