package br.com.calculadora.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import br.com.calculadora.form.CalculadoraForm;
import br.com.calculadora.service.CalculadoraService;

public class CalculadoraAction extends Action {

    public ActionForward execute(
            ActionMapping mapping,
            ActionForm form,
            HttpServletRequest request,
            HttpServletResponse response)
            throws Exception {
    	
    	CalculadoraForm calculadoraForm = (CalculadoraForm) form;
    	
    	CalculadoraService calculadoraService = new CalculadoraService();
    	
    	int total=0;
    	
    	if(request.getParameter("operacaoHidden").equals("-")) {
    		total = calculadoraService.subtrai(Integer.parseInt(calculadoraForm.getCampoA()), Integer.parseInt(calculadoraForm.getCampoB()));
    	}else {
    		total = calculadoraService.soma(Integer.parseInt(calculadoraForm.getCampoA()), Integer.parseInt(calculadoraForm.getCampoB()));
    	}
    	
    	calculadoraForm.setMessage("O resultado é "+total);
    	
        request.setAttribute("total", total);

		return mapping.findForward("telaCalculadora");

	}
    
    

}
