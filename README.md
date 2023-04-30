# assignment3
#Mukanova Amina, SE-2215
Stack methods:
1) public void push(E element) { //push method that add element
   list.add(element);
   }
The push method in a stack implementation is to insert an element at the top of the stack. The push method receives an element of type E and adds it to the underlying MyArrayList using the add method, which inserts the element at the end of the list.

2) public E pop() { //method is to remove and return the top element of a stack
   if (list.isEmpty()) {
   throw new NoSuchElementException("Stack is empty");
   }
   return list.remove(list.size() - 1);
   }
The pop method in a stack taking out and returning the top element of the stack. In the provided implementation, this method checks if the MyArrayList used internally is empty by calling the isEmpty method. If the list is found empty, it throws a NoSuchElementException with the message "Stack is empty". If the list contains elements, the method removes the last element of the list by calling the remove method and then returns it.

3)  public E peek() { // method that return the top element of the stack without removing it
    if (list.isEmpty()) {
    throw new EmptyStackException();
    }
    return list.get(list.size() - 1);
    }
The peek method is used to access the topmost element of the stack without removing it. The implementation checks if the internal ArrayList is empty using the isEmpty method, and if so, it throws an EmptyStackException. Otherwise, the method returns the last element of the ArrayList using the get method.

4)  public boolean isEmpty() { //method is to check if the stack is empty
    return list.isEmpty();
    }
The isEmpty method in a stack implementation is responsible for checking if the stack is empty or not. In the given implementation, the isEmpty method returns true if the internal MyArrayList is empty and false otherwise.

5) public int size() { //method is to return the number of elements in the stack
   return list.size();
   }
The size method in a stack implementation is responsible for returning the number of elements currently in the stack. In the given implementation, the size method returns the size of the internal MyArrayList using the size method of the list.

Queue methods:
1) public MyArrayListQueue() {
   list = new MyArrayList<>(); //instance variable
   }

2) public void enqueue(E element) { //method is to add an element to the back of the queue
   list.add(element);
   }
   
3) public E dequeue() { //method is to remove and return the front element of the queue
   if (list.isEmpty()) {
   throw new NoSuchElementException("Queue is empty");
   }
   return list.remove(0);
   }
4) public E peek() { // method is to return the front element of the queue without removing it
   if (list.isEmpty()) {
   throw new NoSuchElementException("Queue is empty");
   }
   return list.get(0);
   }
5) public boolean isEmpty() { // method is to determine whether the queue is empty
   return list.isEmpty();
   }
6) public int size() { //method is to return the number of elements in the queue
   return list.size();
   }

