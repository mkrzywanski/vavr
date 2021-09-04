package io.vavr.concurrent;

class InternalInterruptedException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    InternalInterruptedException(InterruptedException interruptedException) {
        super(interruptedException);
    }
}
