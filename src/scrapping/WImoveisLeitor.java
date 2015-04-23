package scrapping;

import java.util.List;

import com.jaunt.Document;
import com.jaunt.Element;
import com.jaunt.Elements;
import com.jaunt.HttpRequest;
import com.jaunt.ResponseException;
import com.jaunt.SearchException;
import com.jaunt.UserAgent;
import com.jaunt.component.Form;
import com.jaunt.util.CacheException;

public class WImoveisLeitor {


	
	public static void main(String a[]) throws ResponseException, SearchException, CacheException{
		UserAgent userAgent = new UserAgent(); 
		
		
		
		userAgent.visit("http://www.wimoveis.com.br/df/brasilia/apartamento/aluguel?busca=galeria&quarto=todos&o=F&planta=1&pronto=1");
		 
		Form form = userAgent.doc.getForm("<form>");            //retrieve Form object by its name.
		
		
		Elements divCampos = userAgent.doc.findEach("<div class=listagem_foto>");       //find non-nested tables   
		
		userAgent.setCacheEnabled(true);   
		
		
		for(Element campo : divCampos){                               //iterate through Results
		    //System.out.println(campo.innerHTML() + "\n----\n");      //print each element and its contents
		    System.out.println("url = " + campo.findFirst("<img>").getAt("src"));
		    Element anunciante = campo.findFirst("<div class=anunciante>");
		    System.out.println("anunciante");
		    for(Element anuncianteDetalhe :  anunciante.findEach("<a class=link-imobiliaria>")){
		    	if(anuncianteDetalhe.findEach("<img>").size() > 0)
		    		System.out.println("Link = " + anuncianteDetalhe.findFirst("<img>").getAt("src"));
		    	else
		    		System.out.println("Nome = " + anuncianteDetalhe.innerHTML());
		    	
		    }
		    
		    Element dadosAp = campo.findFirst("<div class=borda_galeria>");
			  
			System.out.println("Endereco = " +  dadosAp.findFirst("<a>").findFirst("<h3>").innerHTML());
			System.out.println("Link do anuncio = " +  dadosAp.findFirst("<a>").getAt("href"));
			int i  = 0;
			for(Element tamanho : dadosAp.findEach("<span>")){
				if(i == 0)
					System.out.println("quartos: " + tamanho.innerHTML());
				if(i == 1)
					System.out.println("suites: " + tamanho.innerHTML());
				if(i == 2)
					System.out.println("garagens: " + tamanho.innerHTML());
				i++;
			}

			

			Element dadosPreco = campo.findEach("<div class=borda_galeria>").getElement(1);
			System.out.println("preco: " + dadosPreco.findFirst("<h4>").innerHTML());
			System.out.println("valor do metro: " + dadosPreco.findFirst("<span class=valormetroquadrado>").innerHTML());
			System.out.println("area util: "+campo.findEach("<div>").getElement(2).findFirst("<b>").innerHTML());
			System.out.println("Data: "+ campo.findEach("<b>").getElement(2).innerHTML());
			
			System.out.println("");
			System.out.println("");
			System.out.println("");
			
		}
		 
		if(true)
			return;
		
		Document doc = userAgent.doc;
		   
		  
		  //doc.choose("Cód do Imóvel:", "DF"); //choose "advanced" from the menu labelled "Account Type:"
		  doc.submit("Busca");      //press the submit button labelled 'create trial account'
		  System.out.println(userAgent.getLocation());  //print the current location (url)
		  
		//form.addPermutationTarget("keyword", new String[]{"cat", "dog"}); //specify seach terms to permute thru
		form.addPermutationTarget("cbxUf");            //specify that movietype field will be permuted (all values)
//		form.addPermutationTarget("cbxNegocio");  
//		form.addPermutationTarget("cbxCidade");                 //specify that lang field will be permuted (all values)
//		form.addPermutationTarget("cbxRegiao");
//		form.addPermutationTarget("cbxBairro");
//		form.addPermutationTarget("cbxTipo");
		List<HttpRequest> requests = form.getRequestPermutations();       //generate list of request permutations
		   
		System.out.println("request permutations:");
		for(HttpRequest request : requests){               //print the list of request permutation
		  System.out.println(request.asUrl());
		} 
	}
}
