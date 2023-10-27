package com.krakedev.sobrecarga;

import com.krakedev.herencia.Gato;

public class TestSobreCarga {

	public static void main(String[] args) {
		Gato gato = new Gato();
		gato.maullar();
		gato.maullar("Feroz");
	}

}
