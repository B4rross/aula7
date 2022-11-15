package org.example;

public class StringCaseChanger implements StringTransformer{
    @Override
    public void execute(StringDrink drink) {
        StringBuilder a = new StringBuilder(drink.getText());
        for (int i=0; i<a.length();i++){
            if(Character.isUpperCase(a.charAt(i))){
                a.setCharAt(i,Character.toLowerCase(a.charAt(i)));
            }
            else if(Character.isLowerCase(a.charAt(i))){
                a.setCharAt(i,Character.toUpperCase(a.charAt(i)));
            }
        }
        drink.setText(a.toString());

    }
}
