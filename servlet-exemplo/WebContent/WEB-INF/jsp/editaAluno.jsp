<html>
<head>
	<title>Editar aluno</title>
</head>
<body>
	<h3>Editar aluno</h3>
	
	<form action="filtro?tarefa=EditaAluno" method="post">
	
		Codigo: <input type="text" name="codigo" maxlength="200" value="${aluno.cdAluno}" disabled="disabled"/>
		<input type="hidden" name="cdAluno" value="${aluno.cdAluno}" />
		</br>
		Nome: <input type="text" name="nome" value="${aluno.nome}" maxlength="200" />
		</br>
		<input type="submit" value="Salvar" />		
	</form>
	
	</br>
	</br>
	
	<a href="index.jsp"> Voltar </a>
	
</body>
</html>