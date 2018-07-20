package ash.com.junk.design.patterns.creational.abstractfactory;

public abstract class AbstractFactory {
	abstract Color getColor(String color);
	abstract Shape getShape(String shape);
}
