function validacao(){
	
	var erro = $("#erro").val();
	
	var nome = document.getElementById("nome");
	if (nome == ""){		
		erro.innerHTML = "O campo nome é obrigatório";
	}
	
	var quatidade = document.getElementById("quantidade");
	if (quatidade == ""){		
		erro.innerHTML = "O campo quatidade é obrigatório";
	}
	
	var preco = document.getElementById("preco");
	if (preco == ""){		
		erro.innerHTML = "O campo preço é obrigatório";
	}
	
	var selecionaTipo = document.getElementById("selecionaTipo");
	if(selecionaTipo.val == "selecione"){
		erro.innerHTML = "Selecione um tipo";
	}
	
}

function limpaErro(){
	var erro =  document.getElementById("erro");
	erro.innerHTML = "";
}
