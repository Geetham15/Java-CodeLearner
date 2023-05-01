package com.thread;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		List<CallableTask> tasks = List.of(new CallableTask("Anand"), new CallableTask("Geetha"),
				new CallableTask("Vignesh"));
		List<Future<String>> results = executorService.invokeAll(tasks); // wait for all the task to complete and put
																			// them in the list
		for (Future<String> result : results) {
			System.out.println(result.get());
		}
		executorService.shutdown();
	}

}
