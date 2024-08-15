package br.eduardoqa.exampletdd.estudosjava;

//Curso ander teste

import br.eduardoqa.exampletdd.service.InterfaceOne;

import java.util.ArrayList;

public class ClasseSUT {

    private InterfaceOne service;

    public ClasseSUT(InterfaceOne service) {
        this.service = service;

    }

    public ArrayList<String> Teste(String teste) {
        var testecourse  = new ArrayList<String>();
        var allTeste = service.teste01(teste);

        for (String testador : allTeste) {
            if (teste.contains("Unitario")) {
                testecourse.add(teste);
            }
        }

        return testecourse;

                
    }

}
