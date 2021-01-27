package com.tts;

class Message {


    String message ;
    public Message(){}
    public Message(String message)
    {
        this.message = message;
    }
    public synchronized void setMessage(String message)
    {
        this.message = message;
    }
    public synchronized String getMessage()
    {
        return message;
    }
}

public class BadThreads {
    static Message message = new Message();
    private static class CorrectorThread
            extends Thread {

        public void run() {
            try {
                sleep(2000);
            } catch (InterruptedException e) {}
            // Key statement 1:
            message.setMessage("Mares do eat oats.");
            System.out.println(message.getMessage());
        }
    }

    public static void main(String args[])
            throws InterruptedException {

        (new CorrectorThread()).start();
        message.setMessage("Mares do not eat oats.");
        Thread.sleep(1000);
        // Key statement 2:
        System.out.println(message.getMessage());
    }
}

