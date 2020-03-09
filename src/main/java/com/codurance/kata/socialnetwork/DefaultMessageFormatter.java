package com.codurance.kata.socialnetwork;

public class DefaultMessageFormatter implements MessageFormatter {
  private Clock clock;

  public DefaultMessageFormatter(Clock clock) {
    this.clock = clock;
  }

  @Override
  public String format(Message message) {
    return null;
  }
}
