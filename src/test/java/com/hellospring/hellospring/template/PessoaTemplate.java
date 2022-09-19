package com.hellospring.hellospring.template;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;
import com.hellospring.hellospring.entity.Pessoa;

public class PessoaTemplate implements TemplateLoader {

    @Override
    public void load() {
        Fixture.of(Pessoa.class).addTemplate("valid", new Rule(){{
            add("id", random(Long.class, range(1L, 200L)));
            add("nome", random("Anderson Parra", "Arthur Hirata"));
            add("idade", random(30, 40, 50 ,60 , 70));
        }});

        Fixture.of(Pessoa.class).addTemplate("invalid").inherits("valid", new Rule(){{
            add("idade", null);
        }});
    }
}
