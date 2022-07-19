function calcula(operacaoParam) {
	document.getElementById("operacaoHidden").value=operacaoParam;
	alert(document.getElementById("operacaoHidden").value);
	document.forms[0].submit();
}