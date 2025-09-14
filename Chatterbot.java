import java.util.*;
import java.util.regex.*;

/**
 * Java ChatterBot - A simple interactive chatbot
 * Uses pattern matching and response rules to simulate conversation
 */
public class ChatterBot {

    // Response patterns and answers
    private static final Map<Pattern, String[]> responses = new HashMap<>();
    private static final String[] defaultResponses = {
        "That's interesting. Tell me more.",
        "I see. What else is on your mind?",
        "Why do you say that?",
        "Can you elaborate?",
        "How does that make you feel?"
    };

    // Initialize response patterns
    static {
        // Greetings
        responses.put(Pattern.compile("(?i).*\\b(hi|hello|hey|hola)\\b.*"), 
            new String[]{"Hello there! 👋", "Hey! How can I help you?", "Hi! What's on your mind?"});
        
        // How are you
        responses.put(Pattern.compile("(?i).*\\b(how are you|how're you|how do you feel)\\b.*"), 
            new String[]{"I'm functioning optimally, thank you! 😊", "All systems operational! How are you?", "I'm just a program, but I feel great!"});
        
        // Name
        responses.put(Pattern.compile("(?i).*\\b(your name|who are you|what are you)\\b.*"), 
            new String[]{"I'm ChatBot, your Java-powered conversational assistant! 🤖", "I'm ChatBot! Nice to meet you.", "Call me ChatBot. I'm here to chat!"});
        
        // Thanks
        responses.put(Pattern.compile("(?i).*\\b(thanks|thank you|thx|ty)\\b.*"), 
            new String[]{"You're welcome! 😊", "Happy to help!", "Anytime!"});
        
        // Time
        responses.put(Pattern.compile("(?i).*\\b(time|what time|current time)\\b.*"), 
            new String[]{"The current time is: " + new Date(), "It's " + new Date() + " right now."});
        
        // Java
        responses.put(Pattern.compile("(?i).*\\b(java|programming|code)\\b.*"), 
            new String[]{"Java is awesome! I'm written entirely in Java. ☕", "Programming is fun! What language do you prefer?", "I love talking about code! 💻"});
        
        // Feelings
        responses.put(Pattern.compile("(?i).*\\b(sad|happy|angry|excited|bored)\\b.*"), 
            new String[]{"I understand those feelings. Tell me more.", "That's very human of you. I'm here to listen."});
        
        // Goodbye
        responses.put(Pattern.compile("(?i).*\\b(bye|exit|quit|goodbye|see ya)\\b.*"), 
            new String[]{"Goodbye! 👋 It was nice talking to you.", "See you later! 😊", "Bye! Come back soon!"});
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("🤖 Java ChatterBot Activated!");
        System.out.println("=============================");
        System.out.println("Type 'exit' to end the conversation");
        System.out.println("➡️  Hello! I'm ChatBot. How can I help you today?");
        
        while (true) {
            System.out.print("\nYou: ");
            String input = scanner.nextLine().trim();
            
            if (input.equalsIgnoreCase("exit") || input.equalsIgnoreCase("quit")) {
                System.out.println("🤖 ChatBot: Goodbye! 👋");
                break;
            }
            
            if (input.isEmpty()) {
                System.out.println("🤖 ChatBot: Please type something...");
                continue;
            }
            
            String response = generateResponse(input);
            System.out.println("🤖 ChatBot: " + response);
        }
        
        scanner.close();
    }

    /**
     * Generates intelligent response based on input patterns
     */
    private static String generateResponse(String input) {
        // Check for matching patterns
        for (Map.Entry<Pattern, String[]> entry : responses.entrySet()) {
            if (entry.getKey().matcher(input).matches()) {
                String[] possibleResponses = entry.getValue();
                return possibleResponses[new Random().nextInt(possibleResponses.length)];
            }
        }
        
        // Default response if no pattern matches
        return defaultResponses[new Random().nextInt(defaultResponses.length)];
    }

    /**
     * Additional method to demonstrate bot capabilities
     */
    public static void demonstrate() {
        String[] testInputs = {
            "Hello",
            "How are you?",
            "What's your name?",
            "I love Java programming",
            "I'm feeling happy today",
            "What time is it?",
            "Thank you",
            "Goodbye"
        };
        
        System.out.println("\n🧪 Demonstration Mode:");
        System.out.println("======================");
        
        for (String input : testInputs) {
            System.out.println("You: " + input);
            System.out.println("Bot: " + generateResponse(input));
            System.out.println();
        }
    }
                      }
