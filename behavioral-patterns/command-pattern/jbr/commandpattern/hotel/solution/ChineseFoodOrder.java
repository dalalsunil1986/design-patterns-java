package jbr.commandpattern.hotel.solution;

import jbr.commandpattern.common.Food;

public class ChineseFoodOrder implements FoodOrder {

  private Chef chef;
  private String food;

  public ChineseFoodOrder(String food, Chef chef) {
    this.food = food;
    this.chef = chef;
  }

  public Food prepareFood() {
    return chef.preparChineseFood(food);
  }

}
