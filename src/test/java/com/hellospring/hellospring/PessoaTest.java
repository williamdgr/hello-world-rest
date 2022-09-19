package com.hellospring.hellospring;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;
import com.hellospring.hellospring.entity.Pessoa;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

@SpringBootTest
public class PessoaTest {

    @BeforeClass
    public static void setUp() {
        FixtureFactoryLoader.loadTemplates("com.hellospring.hellospring.template");
    }

    @Test
    public void fixtureClient() {
        Pessoa pessoa = Fixture.from(Pessoa.class).gimme("valid");

        System.out.println("Pessoa : " + pessoa);

        assertNotNull("Pessoa should not be null", pessoa);
        assertNotNull("Pessoa - field 'idade' should not be null", pessoa.getIdade());
    }

    @Test
    public void invalidPessoa() {
        Pessoa pessoa = Fixture.from(Pessoa.class).gimme("invalid");

        System.out.println("Pessoa : " + pessoa);

        assertNotNull("Pessoa should not be null", pessoa);
        assertNull(pessoa.getIdade());
    }
}
