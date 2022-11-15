package org.example;

public class StringReplacer implements StringTransformer{
    public char ichar;
    public char fchar;
    public StringReplacer(char a, char b){
        ichar=a;
        fchar=b;
    }
    @Override
    public void execute(StringDrink drink) {
        StringBuilder a = new StringBuilder(drink.getText());
        for (int i=0; i<a.length();i++){
            if(a.charAt(i)==ichar){
                a.setCharAt(i,fchar);
            }
        }
        drink.setText(a.toString());

    }
}
