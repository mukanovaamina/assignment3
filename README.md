# assignment3
#Mukanova Amina, SE-2215
Stack methods:
1) public void push(E element) { //push method that add element
   list.add(element);
   }
2) public E pop() { //method is to remove and return the top element of a stack
   if (list.isEmpty()) {
   throw new NoSuchElementException("Stack is empty");
   }
   return list.remove(list.size() - 1);
   }
3)  public E peek() { // method that return the top element of the stack without removing it
    if (list.isEmpty()) {
    throw new EmptyStackException();
    }
    return list.get(list.size() - 1);
    }
4)  public boolean isEmpty() { //method is to check if the stack is empty
    return list.isEmpty();
    }
5) public int size() { //method is to return the number of elements in the stack
   return list.size();
   }

Queue methods:
1) public int size() { //method is to return the number of elements in the stack
   return list.size();
   }
2) public E dequeue() { //method is to remove and return the front element of the queue
   if (list.isEmpty()) {
   throw new NoSuchElementException("Queue is empty");
   }
   return list.remove(0);
   }
3) public E dequeue() { //method is to remove and return the front element of the queue
   if (list.isEmpty()) {
   throw new NoSuchElementException("Queue is empty");
   }
   return list.remove(0);
   }
4) public E dequeue() { //method is to remove and return the front element of the queue
   if (list.isEmpty()) {
   throw new NoSuchElementException("Queue is empty");
   }
   return list.remove(0);
   }
5) public E dequeue() { //method is to remove and return the front element of the queue
   if (list.isEmpty()) {
   throw new NoSuchElementException("Queue is empty");
   }
   return list.remove(0);
   }

