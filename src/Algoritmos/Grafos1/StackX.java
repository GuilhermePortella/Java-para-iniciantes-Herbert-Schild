package Algoritmos.Grafos1;

import static java.lang.Integer.SIZE;

/**
 *
 * @author Guilherme
 */
public class StackX {
    
    private final int Size = 20;
    private int[] st;
    private int top;
    
    public StackX() {
        st = new int[SIZE];
        top = -1;
    }
    
    public void push(int j) {
        st[++top] = j;
    }
    
    public int pop(){
        return st[top--];
    }
    
    public int peek(){
        return st[top];
    }
    
    public boolean isEmpty(){
        return (top == -1);
    }
}
