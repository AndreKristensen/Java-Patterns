package no.ask.strategy;
// The classes that implement a concrete strategy should implement this.
// The context class uses this to call the concrete strategy.
interface Strategy {
    int execute(int a, int b); 
}
 
// Implements the algorithm using the strategy interface
class ConcreteStrategyAdd implements Strategy {
 
    public int execute(int a, int b) {
        System.out.println("Called ConcreteStrategyAdd's execute()");
        return a + b;  // Do an addition with a and b
    }
}
 
class ConcreteStrategySubtract implements Strategy {
 
    public int execute(int a, int b) {
        System.out.println("Called ConcreteStrategySubtract's execute()");
        return a - b;  // Do a subtraction with a and b
    }
}
 
class ConcreteStrategyMultiply implements Strategy {
 
    public int execute(int a, int b) {
        System.out.println("Called ConcreteStrategyMultiply's execute()");
        return a * b;   // Do a multiplication with a and b
    }    
}
 

 

