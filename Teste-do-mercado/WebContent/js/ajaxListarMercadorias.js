$(document).ready(function(){
	
	var acao = "listarMercDisp";	
	
	$.post("MercadoriaServlet", {acao : "listarMercDisp"},function(data) {console.log(data); });
	
	$.ajax({
		type: "POST",	
		url: '$.post("MercadoriaServlet", {acao : "listarMercDisp"})',
		data: acao,
		success: function(data){
			console.log(data);
		}
	})
	
})