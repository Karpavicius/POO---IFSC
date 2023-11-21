package algoritmo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import entidades.*;

public class Main {

	public static void main(String[] args) {
		Escalonador esc = new Escalonador();
		esc.lerArquivo("E:\\SO\\filosofos.txt\\");
    }

}
