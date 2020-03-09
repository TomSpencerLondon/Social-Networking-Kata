package com.codurance.kata.socialnetwork;

public class WallMessageFormatter implements MessageFormatter {
  private MessageFormatter innerFormatter;

  public WallMessageFormatter(MessageFormatter innerFormatter) {
    this.innerFormatter = innerFormatter;
  }

  public String format(Message message) {
    return null;
  }
}
