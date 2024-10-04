package com.mycompany.app;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PessoaTest {
    @Test
    public void testGetNome(){
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Alysson");
        assertEquals("Alysson", pessoa.getNome());
    }
    public void testSetNome(){
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Alysson");
        assertEquals("Alysson", pessoa.getNome());
    }
}
