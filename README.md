# Java ChatterBot 🤖

An intelligent conversational chatbot implemented in Java using pattern matching and response rules. This bot can engage in meaningful conversations and respond contextually to user inputs.

## ✨ Features

- **Pattern Matching**: Uses regex patterns to understand user input
- **Multiple Responses**: Varied responses for more natural conversations
- **Context Awareness**: Responds differently based on conversation context
- **Interactive CLI**: Clean command-line interface for chatting
- **Extensible**: Easy to add new patterns and responses

## 🚀 How to Run

### Compilation
```bash
javac ChatterBot.java
```

### Start Chatting
```bash
java ChatterBot
```

### See Demo
```bash
javac BotDemo.java
java BotDemo
```

## 🗣️ Sample Conversation
```
You: hello
Bot: Hello there! 👋

You: how are you?
Bot: I'm functioning optimally, thank you! 😊

You: what's your name?
Bot: I'm ChatBot, your Java-powered conversational assistant! 🤖

You: I love java programming
Bot: Java is awesome! I'm written entirely in Java. ☕

You: exit
Bot: Goodbye! 👋
```

## 🛠️ Technical Implementation

### Pattern Matching System
The bot uses regular expressions to match user input patterns:
```java
responses.put(Pattern.compile("(?i).*\\b(hi|hello|hey)\\b.*"), 
    new String[]{"Hello there! 👋", "Hey! How can I help you?"});
```

### Response Selection
- Randomly selects from multiple response options
- Falls back to default responses for unmatched inputs
- Handles empty inputs gracefully

## 📁 Project Structure
```
java-chatterbot/
├── ChatterBot.java  # Main chatbot class
├── BotDemo.java     # Demonstration class
└── README.md        # This documentation
```

## 🎯 Learning Outcomes

This project demonstrates:
- String manipulation and pattern matching
- Regular expressions in Java
- Random response generation
- Interactive console applications
- Object-oriented design principles

## 🔧 Extending the Bot

To add new responses:
1. Add new pattern to `responses` HashMap
2. Provide multiple response options
3. The bot will automatically handle the new pattern

Example:
```java
responses.put(Pattern.compile("(?i).*\\b(weather|temperature)\\b.*"), 
    new String[]{"I don't have weather data, but I love talking about climate!", 
                 "You should check a weather app for that! 🌤️"});
```

## Developer

Created by ARSHAN as a demonstration of AI conversation systems and Java programming skills.
