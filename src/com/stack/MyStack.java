package com.stack;

import java.util.Stack;

public class MyStack {
	private Stack<Integer> stackData;
	private Stack<Integer> stackMin;

	public MyStack(Stack<Integer> stackData, Stack<Integer> stackMin) {
		super();
		this.stackData = stackData;
		this.stackMin = stackMin;
	}

	public void push(Integer newNum) {
		if (stackMin.empty())
			stackMin.push(newNum);
		else if (newNum <= this.getMin()) {
			stackMin.push(newNum);
		}
		stackData.push(newNum);
	}

	public int pop() {
		if (stackData.empty())
			try {
				throw new Exception("栈为空");
			} catch (Exception e) {
				e.printStackTrace();
			}
		Integer pop = stackData.pop();
		if (pop == stackData.pop())
			stackMin.pop();
		return pop;
	}

	public int getMin() {
		if (stackMin.empty())
			throw new RuntimeException("栈为空");
		return stackMin.peek();
	}
}
