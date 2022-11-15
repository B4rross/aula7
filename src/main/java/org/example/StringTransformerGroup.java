package org.example;

import java.util.List;

public class StringTransformerGroup implements StringTransformer{
    public String a;
    public List<StringTransformer> transformers;

    public StringTransformerGroup(List<StringTransformer> transformers_){
        transformers=transformers_;
    }
    public void execute(StringDrink drink){
        for (StringTransformer trans : transformers){
            trans.execute(drink);
        }
    }
}
