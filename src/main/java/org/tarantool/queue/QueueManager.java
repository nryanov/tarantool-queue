package org.tarantool.queue;

import org.tarantool.queue.internals.operations.Operation;

public interface QueueManager<T> {
    Operation<T> put(T task);

    Operation<T> release(long taskId);

    Operation<T> ack(long taskId);

    Operation<T> peek(long taskId);

    Operation<T> bury(long taskId);

    Operation<T> take();

    Operation<T> takeWithTimeout(long timeout);

    Operation<T> delete(long taskId);
}
