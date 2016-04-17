package com.nowcoder.leetcode;

import java.util.HashMap;
import java.util.Map;

public class DeepCopyTest {
	public RandomListNode head;

	public DeepCopyTest() {
		// TODO Auto-generated constructor stub
		head = null;
	}

	public void insert(int x) {

		RandomListNode node = new RandomListNode(x);
		/*
		 * node.next = head; head = node;
		 */
		if (head == null) {
			head = new RandomListNode(x);
			head.random = head;
			// head.next = null;
		} else {
			RandomListNode curr = head;
			while (curr.next != null) {
				curr = curr.next;
			}
			curr.next = new RandomListNode(x);
			curr.next.random = curr.next;
			curr = curr.next;
		}

	}

	class RandomListNode {
		int label;
		RandomListNode next, random;

		RandomListNode(int x) {
			this.label = x;
		}
	}

	public void print(RandomListNode head) {
		RandomListNode first = head;
		while (first != null) {
			if (first.random != null)
				System.out.print(first.label + "random->" + first.random.label + "**");
			else {
				System.out.print(first.label + "random->null");
			}
			first = first.next;
		}
		System.out.println();
	}

	// 函数在此实现
	/*
	 * 1.先不管random，将整个链表深拷贝到另一个链表，然后根据head表random求出random离表头的绝对距离
	 * 2.利用绝对距离可以计算copy表的random应该指向哪一个节点
	 */
	public RandomListNode copyRandomList(RandomListNode head) {
		if (head == null)
			return null;
		RandomListNode copyhead = new RandomListNode(0);
		RandomListNode curr = head;
		RandomListNode currcopy = copyhead;
		Map<RandomListNode, RandomListNode> map = new HashMap<>();
		while (curr != null) {
			if (!map.containsKey(curr))
				map.put(curr, new RandomListNode(curr.label));
			currcopy.next = map.get(curr);
			RandomListNode rand = curr.random;
			if (rand != null) {
				if (!map.containsKey(rand))
					map.put(rand, new RandomListNode(rand.label));
				currcopy.next.random = map.get(rand);
			}
			curr = curr.next;
			currcopy = currcopy.next;
		}
		return copyhead.next;

		/*
		 * RandomListNode copy = null;
		 * 
		 * if(head == null) return copy; else{ RandomListNode curr = head; copy
		 * = new RandomListNode(curr.label); RandomListNode currcopy = copy;
		 * while(curr.next != null){ curr = curr.next; RandomListNode node = new
		 * RandomListNode(curr.label); currcopy.next = node; currcopy =
		 * currcopy.next; } curr = head; currcopy = copy; while(curr != null){
		 * //int offset = getoffset(head, curr); //System.out.println(offset);
		 * RandomListNode offhead = head; RandomListNode offcurr = curr; int
		 * offset = 0; RandomListNode rand = offcurr.random; if(rand == null){
		 * offset =-1; } else while(offhead != null){ if(offhead == rand) break;
		 * else { offset++; offhead = offhead.next; } }
		 * 
		 * //System.out.println(offset); if(offset > 0){ RandomListNode copytemp
		 * = copy; for(int i=0; i<offset; i++) copytemp = copytemp.next;
		 * currcopy.random = copytemp; }else if(offset == 0) currcopy.random =
		 * head; curr = curr.next; currcopy = currcopy.next; } return copy; }
		 */
	}

	public static int getoffset(RandomListNode head, RandomListNode curr) {
		int offset = 0;
		RandomListNode rand = curr.random;
		if (rand == null) {
			offset = -1;
		} else
			while (head != null) {
				if (head == rand)
					break;
				else {
					offset++;
					head = head.next;
				}
			}
		return offset;
	}

	public static void main(String[] agrs) {
		int[] arr = { 2, 3, 2, 5, 6, 8 };
		DeepCopyTest dp = new DeepCopyTest();
		for (int i = 0; i < arr.length; i++) {
			dp.insert(arr[i]);
		}
		dp.print(dp.head);
		RandomListNode copy = dp.copyRandomList(dp.head);
		dp.print(copy);
	}
}
