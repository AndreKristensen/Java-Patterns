package no.ask.strategy;
// Configured with a ConcreteStrategy object and maintains a reference to a Strategy object
class Context {
 
    private Strategy strategy;
 
    // Constructor
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
 
    public int executeStrategy(int a, int b) {
        return strategy.execute(a, b);
    }
}