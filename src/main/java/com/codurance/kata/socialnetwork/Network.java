package com.codurance.kata.socialnetwork;

public class Network {
  private final MessageRepository messageRepository;
  private final MessageFactory messageFactory;
  private final MessagePrinter messagePrinter;
  private final FriendRepository friendRepository;

  public Network(MessageRepository messageRepository, MessageFactory messageFactory, MessagePrinter messagePrinter, FriendRepository friendRepository) {
    this.messageRepository = messageRepository;
    this.messageFactory = messageFactory;
    this.messagePrinter = messagePrinter;
    this.friendRepository = friendRepository;
  }
}
