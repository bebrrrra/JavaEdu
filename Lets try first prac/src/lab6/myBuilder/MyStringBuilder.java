package lab6.myBuilder;

import java.util.Stack;

public class MyStringBuilder {

    private StringBuilder builder;
    private Stack<String> history;

    public MyStringBuilder() {
        builder = new StringBuilder();
        history = new Stack<>();
    }

    private void saveState() {
        history.push(builder.toString());
    }

    public MyStringBuilder append(String str) {
        saveState();
        builder.append(str);
        return this;
    }

    public MyStringBuilder delete(int start, int end) {
        saveState();
        builder.delete(start, end);
        return this;
    }

    public MyStringBuilder insert(int offset, String str) {
        saveState();
        builder.insert(offset, str);
        return this;
    }

    public MyStringBuilder replace(int start, int end, String str) {
        saveState();
        builder.replace(start, end, str);
        return this;
    }

    public MyStringBuilder reverse() {
        saveState();
        builder.reverse();
        return this;
    }

    public void undo() {
        if (!history.isEmpty()) {
            builder = new StringBuilder(history.pop());
        }
    }

    @Override
    public String toString() {
        return builder.toString();
    }
}
