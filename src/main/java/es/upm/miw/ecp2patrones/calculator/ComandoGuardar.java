package es.upm.miw.ecp2patrones.calculator;

import upm.jbb.IO;

public class ComandoGuardar extends Comando {

	private GestorMementos<MementoCalculadora> gestorMementos;

	public ComandoGuardar(CalculadoraMementable calc, GestorMementos<MementoCalculadora> gm) {
		this.calculadora = calc;
		 this.gestorMementos = gm;
	}

	@Override
	public String name() {
		return "Guardar";
	}

	@Override
	public void execute() {
		this.gestorMementos.addMemento(IO.in.readString("Nombre del memento"),
				this.calculadora.guardar());
	}

}
