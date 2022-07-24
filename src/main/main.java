package main;

import house.Eat;

public class main {
    public static void main(String[] args) {
        Eat nullEat = new Eat();
        Eat first = new Eat();
        Eat second = new Eat();

        nullEat.condition = "Hot";
        first.condition = "cold";
        second.condition = "norm";

        nullEat.what = "sup";
        first.what = "makarone";
        second.what = "sosiski";

        nullEat.showCondition();
        first.showCondition();
        second.showCondition();

        nullEat.showWhat();
        first.showWhat();
        second.showWhat();
    }
}
