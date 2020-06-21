package Mail;

import java.util.*;
import java.util.function.Consumer;

public class MailService <T> implements Consumer<Sendable> {

    private Map<String, List<T>> mailBox= new HashMap<String, List<T>>() {
        @Override
        public List<T> get(Object key) {
            return super.getOrDefault(key, new LinkedList<T>());
        }
    };

//    List<T>list=new ArrayList<>();


    public Map<String,List<T>> getMailBox() {

        return mailBox;
    }


    @Override
    public void accept(Sendable tSendable) {

        if (!mailBox.containsKey(tSendable.getTo()))
            mailBox.put(tSendable.getTo(), new ArrayList<>());

        mailBox.get(tSendable.getTo()).add((T) tSendable.getContent());
    }

    @Override
    public Consumer<Sendable> andThen(Consumer<? super Sendable> after) {
        return null;
    }


}