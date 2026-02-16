class MyCircularQueue:

    def __init__(self, k: int):
        self.size = k
        self.circleQueue = []

    def enQueue(self, value: int) -> bool:
        if(len(self.circleQueue)!=self.size):
            self.circleQueue.append(value)

            return True
        return False

    def deQueue(self) -> bool:
        if(len(self.circleQueue)!=0):
            self.circleQueue.pop(0)

            return True
        return False

    def Front(self) -> int:
        if(len(self.circleQueue)!=0):
            return self.circleQueue[0]
        return -1

    def Rear(self) -> int:
        if(len(self.circleQueue)!=0):
            return self.circleQueue[-1]
        return -1

    def isEmpty(self) -> bool:
        return len(self.circleQueue)==0

    def isFull(self) -> bool:
        return len(self.circleQueue)==self.size


# Your MyCircularQueue object will be instantiated and called as such:
# obj = MyCircularQueue(k)
# param_1 = obj.enQueue(value)
# param_2 = obj.deQueue()
# param_3 = obj.Front()
# param_4 = obj.Rear()
# param_5 = obj.isEmpty()
# param_6 = obj.isFull()