package com.company;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.List;

public class Bot extends TelegramLongPollingBot {
    private static final String BOT_NAME = "BOTFORYOURMOTHER";
    private static final String BOT_TOKEN = "590267126:AAEwiDn8dRZUMVyoLZs4A56RugvwXafwzi8";

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage()) {
            String calculations = new String();
            Message message = update.getMessage();
            message.getText();

            update.getMessage().getChatId();
            String text = message.getText();

            long chatID = update.getMessage().getChatId();
            System.out.println(text);

            SendMessage sendMessage = new SendMessage();
            sendMessage.setText(text);

            String reply = "Okay";


            sendMessage.setText(reply);
            sendMessage.setChatId(chatID);

            ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
            List<KeyboardRow> keyboard = new ArrayList<>();
            KeyboardRow row = new KeyboardRow();
            row.add("Help");
            keyboard.add(row);

            row = new KeyboardRow();
            row.add("Another help");
            keyboard.add(row);

            row = new KeyboardRow();
            row.add("Another help");
            keyboard.add(row);
            if (text.equals("Calculations")){
                String reply1 = calculations;
                sendMessage.setText(String.valueOf(reply1));
                sendMessage.setChatId(chatID);
            }
            if (text.equals(reply)){
                String reply2 = "Ogo";
                sendMessage.setText(reply2);
                sendMessage.setChatId(chatID);
            }


            replyKeyboardMarkup.setKeyboard(keyboard);
            sendMessage.setReplyMarkup(replyKeyboardMarkup);

            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }

        }

    }


    @Override
    public String getBotUsername() {
        return BOT_NAME;
    }

    @Override
    public String getBotToken() {
        return BOT_TOKEN;
    }
}
