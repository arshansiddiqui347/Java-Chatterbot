#!/bin/bash

# Java ChatterBot Runner
echo "🤖 Building Java ChatterBot..."
javac ChatterBot.java BotDemo.java

if [ $? -eq 0 ]; then
    echo "✅ Build successful!"
    echo "Choose mode:"
    echo "1. Interactive Chat (java ChatterBot)"
    echo "2. Demonstration (java BotDemo)"
    echo -n "Enter choice (1 or 2): "
    read choice
    
    if [ "$choice" = "1" ]; then
        echo "🚀 Starting interactive chat..."
        java ChatterBot
    elif [ "$choice" = "2" ]; then
        echo "🎭 Starting demonstration..."
        java BotDemo
    else
        echo "❌ Invalid choice!"
    fi
else
    echo "❌ Build failed!"
    exit 1
fi
