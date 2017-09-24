package com.stack;

import java.util.Stack;

public class MyQueue {
	private Stack<Object> stackpush;
	private Stack<Object> stackpop;

	public MyQueue() {
		this.stackpush = new Stack<Object>();
		this.stackpop = new Stack<Object>();
	}

	public void add(Object obj) {
		stackpush.push(obj);
	}

	public Object peek() {
		if (stackpop.empty() && stackpush.empty()) {
			throw new RuntimeException("队列为空");
		} else if (stackpop.empty()) {
			while (!stackpush.empty()) {
				stackpop.push(stackpush.pop());
			}

		}
		return stackpop.peek();
	}

	public Object poll() {
		if (stackpop.empty() && stackpush.empty()) {
			throw new RuntimeException("队列为空");
		} else if (stackpop.empty()) {
			while (!stackpush.empty()) {
				stackpop.push(stackpush.pop());
			}

		}
		return stackpop.pop();
	}
}
