import java.lang.reflect.Array;
import java.util.EmptyStackException;

/**
 * Created by anujparikh on 11/12/16.
 */
@SuppressWarnings("unchecked")
public class Stack<E> {

    private int capacity;
    private E[] stackData;
    private int topIndex;

    Stack(Class<E> c, int capacity) {
        this.capacity = capacity;
        this.stackData = (E[]) Array.newInstance(c, capacity);
        this.topIndex = 0;
    }

    public boolean push(E data) {

        if (topIndex == capacity - 1)
            return false;

        stackData[topIndex] = data;
        topIndex++;
        return true;
    }

    public E pop() {
        if (topIndex == 0)
            throw new EmptyStackException();
        return stackData[--topIndex];
    }

    public E peep() {
        if (topIndex == 0)
            throw new EmptyStackException();
        return stackData[topIndex - 1];
    }

    public boolean empty() {
        if (topIndex == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void printStack() {
        for (int i = topIndex - 1; i >= 0; i--) {
            System.out.println(stackData[i]);
        }
    }

    public static String infixToPostFix(String inputExpression) {
        StringBuilder output = new StringBuilder(inputExpression);
        Stack postFixStack = new Stack(Character.class, 10);
        for (int i = 0; i < inputExpression.length(); i++) {
            char currentChar = inputExpression.charAt(i);
            if (isOperand(currentChar)) {
                output = output.append(currentChar);
            } else {
                if (currentChar == '(') {
                    postFixStack.push(currentChar);
                } else if (currentChar == ')') {
                    while ((Character) postFixStack.peep() != '(') {
                        output.append(postFixStack.pop());
                    }
                } else if (getPrecedenceForOperator((Character) postFixStack.peep()) < getPrecedenceForOperator(currentChar)) {
                    postFixStack.push(currentChar);
                } else {
                    while (getPrecedenceForOperator((Character) postFixStack.peep()) < getPrecedenceForOperator(currentChar)) {
                        output.append(postFixStack.pop());
                    }
                }
            }
        }
        return null;
    }

    private static int getPrecedenceForOperator(char a) {
        int precedenceNumber = -1;
        switch (a) {
            case '(':
                precedenceNumber = 1;
                break;
            case ')':
                precedenceNumber = 2;
                break;
            case '^':
                precedenceNumber = 3;
                break;
            case '/':
                precedenceNumber = 4;
                break;
            case '*':
                precedenceNumber = 5;
                break;
            case '+':
                precedenceNumber = 6;
                break;
            case '-':
                precedenceNumber = 7;
        }
        return precedenceNumber;
    }

    private static boolean isOperand(char a) {
        return ((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z'));
    }

}
