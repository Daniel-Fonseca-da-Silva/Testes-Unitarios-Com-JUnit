package br.ce.wcaquino.servicos;

import br.ce.wcaquino.exception.N√£oPodeDividirPorZeroExeption;

public class Calculadora {

	public int somar(int a, int b) 
	{
		return a + b;
	}

	public int subtrair(int a, int b) 
	{
		return  a - b;
	}

	public int dividi(int a, int b) throws N√£oPodeDividirPorZeroExeption 
	{
		if(b == 0)
		{
			throw new N√£oPodeDividirPorZeroExeption();
		}
		
		return a / b;
	}
	
	public int divide(String a, String b)
	{
		return Integer.valueOf(a) / Integer.valueOf(b);
	}
	
}
