package test;

import com.sonClass.MallardDuck;
import com.sonClass.RedHeadDuck;
import com.sonClass.RubberDuck;

public class TestMode {
	public static void main(String[] args) {
		RedHeadDuck redheadDuck = new RedHeadDuck();
		MallardDuck mallardDuck = new MallardDuck();
		redheadDuck.display();
		redheadDuck.quack();
		redheadDuck.swim();
		redheadDuck.fly();
		mallardDuck.display();
		mallardDuck.swim();
		mallardDuck.fly();
		RubberDuck rubberDuck = new RubberDuck();
		rubberDuck.display();
		rubberDuck.fly();
	}
}
