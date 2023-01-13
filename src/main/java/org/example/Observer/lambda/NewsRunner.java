package org.example.Observer.lambda;

public class NewsRunner {
        public static void main(String[] args) {
                NewsTopic subject = new NewsTopic();
                Observer observer1 = news -> System.out.printf("Message received: %s%n", news);
                subject.register(observer1);
                subject.setNews("News Arrived!");
        }
}
