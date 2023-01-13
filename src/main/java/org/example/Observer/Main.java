package org.example.Observer;

/*
Nazwa tego wzorca (Obserwator) jest związana z obserwacją zmian stanu obiektu. Możemy
        wykorzystać ten wzorzec jeżeli zależy nam na obserwowaniu zmiany stanu jakiegoś obiektu i
        odpowiedniej reakcji jeżeli taki stan ulegnie zmianie.
         gdy chcemy powiadomić pewną ilość obserwatorów o
zaistnieniu pewnego wydarzenia.

*/


public class Main {
        public static void main(String[] args) {
        
                NewsTopic subject = new NewsTopic();
                Observer observer1 = new NewsSubscriber("NewsSubscriber1");
                Observer observer2 = new NewsSubscriber("NewsSubscriber2");
                Observer observer3 = new NewsSubscriber("NewsSubscriber3");
                subject.register(observer1);
                subject.register(observer2);
                subject.register(observer3);
                subject.setNews("News Arrived!");

        }
}