package br.com.calculadora.form;

import java.io.Serializable;

import org.apache.struts.action.ActionForm;

public class CalculadoraForm extends ActionForm implements Serializable {

	private static final long serialVersionUID = 1L;

	private String campoA="";

	private String campoB="";

	private String message="";

	private String operacaoHidden="";

	public CalculadoraForm() {
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCampoA() {
		return campoA;
	}

	public void setCampoA(String campoA) {
		this.campoA = campoA;
	}

	public String getCampoB() {
		return campoB;
	}

	public void setCampoB(String campoB) {
		this.campoB = campoB;
	}

	public String getOperacaoHidden() {
		return operacaoHidden;
	}

	public void setOperacaoHidden(String operacaoHidden) {
		this.operacaoHidden = operacaoHidden;
	}


}
