package com.jpaexample.coolboot.repository;

import com.jpaexample.coolboot.entity.Product;
import org.springframework.scheduling.annotation.Async;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ProductTestRepository {

        @Async
        public Future<List<Product>> doStuff(String category) throws InterruptedException {
            Future<List<Product>> theFuture = new Future<List<Product>>() {
                @Override
                public boolean cancel(boolean mayInterruptIfRunning) {
                    return false;
                }

                @Override
                public boolean isCancelled() {
                    return false;
                }

                @Override
                public boolean isDone() {
                    return false;
                }

                @Override
                public List<Product> get() throws InterruptedException, ExecutionException {
                    return null;
                }

                @Override
                public List<Product> get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
                    return null;
                }
            };

            Thread.sleep(2000L);

        //    theFuture.cancel(true);

            return theFuture;
        }
}
