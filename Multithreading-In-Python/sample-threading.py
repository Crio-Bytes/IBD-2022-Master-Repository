# # import threading as th

# # # creating a child class of the Thread class 
# # class thread(th.Thread): 
# #     # overriding the init method of the Thread class
# # 	def __init__(self, thread_name, thread_ID):
# # 		th.Thread.__init__(self)
# # 		self.thread_name = thread_name
# # 		self.thread_ID = thread_ID
# # 	def run(self):
# # 		print(str(self.thread_name) +" "+ str(self.thread_ID))

# # thread1 = thread("thread-1", 1000)
# # thread2 = thread("thread-2", 2000);

# # thread1.start()
# # thread2.start()

# # print("End of program")


# # from threading import Thread
# # t = Thread(target=print, args=["Hello "])
# # t.start()

# from threading import Thread
# from time import sleep

# # function to create threads
# def print_func(arg):
#     for i in range(arg):
#         print("Hello Geek!")
#         sleep(1)


# if __name__ == "__main__":
#     thread  = Thread(target = print_func , args=(5,))
#     thread.run()
#     print("Onto the main thread")


from threading import Thread
from threading import Event
import time


class Connection(Thread):
	StopEvent = 0
	def __init__(self,args):
		Thread.__init__(self)
		self.StopEvent = args
	# The run method is overridden to define
	# the thread body
	def run(self):
		for i in range(1,10):
			if(self.StopEvent.wait(0)):
				print ("Asked to stop")
				break;
			print("The Child Thread sleep count is %d"%(i))
			time.sleep(3)
		print ("A Child Thread is exiting")

Stop = Event()
Connection = Connection(Stop)		
Connection.start()
print("Main thread is starting to wait for 5 seconds")

Connection.join(5)
print("Main thread says : I cant't wait for more than 5 \
seconds for the child thread;\n Will ask child thread to stop")

# ask(signal) the child thread to stop
Stop.set()

# wait for the child thread to stop
Connection.join()

print("Main thread says : Now I do something else to compensate\
the child thread task and exit")
print("Main thread is exiting")
