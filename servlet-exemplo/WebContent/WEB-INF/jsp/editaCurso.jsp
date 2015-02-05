<html>
<head>
	<title>Editar curso</title>
</head>
<body>
	<h3>Editar curso</h3>
	
	<form action="filtro?tarefa=EditaCurso" method="post">
	
		Codigo: <input type="text" name="codigo" maxlength="200" value="${curso.cdCurso}" disabled="disabled"/>
		<input type="hidden" name="cdAluno" value="${curso.cdCurso}" />
		</br>
		Nome: <input type="text" name="nome" value="${curso.nome}" maxlength="200" />
		</br>
		<input type="submit" value="Salvar" />		
	</form>
	
	</br>
	</br>
	
	<a href="index.jsp"> Voltar </a>
	
</body>
</html>