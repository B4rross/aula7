package org.example;

import java.util.List;

public class StringRecipe  {
    public String a;
    public List<StringTransformer> transformers;

    public StringRecipe(List<StringTransformer> transformers_){
        transformers=transformers_;
    }
    public void mix(StringDrink drink){
        for (StringTransformer trans : transformers){
            trans.execute(drink);
        }
    }
}
