package com.codurance.kata.socialnetwork;

public class MessagePrinter {
  private final Output output;
  private final MessageFormatter messageFormatter;
  private final WallMessageFormatter wallMessageFormatter;

  public MessagePrinter(Output output, MessageFormatter messageFormatter, WallMessageFormatter wallMessageFormatter) {
    this.output = output;
    this.messageFormatter = messageFormatter;
    this.wallMessageFormatter = wallMessageFormatter;
  }
}
