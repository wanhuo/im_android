package com.beetle.bauhinia.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.beetle.bauhinia.db.IMessage;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class MessageContentView extends FrameLayout implements PropertyChangeListener {
    protected Context context;
    LayoutInflater inflater;
    protected IMessage message;

    public MessageContentView(Context context) {
        super(context);
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    public void setMessage(IMessage msg) {
        if (this.message != null) {
            this.message.removePropertyChangeListener(this);
        }
        this.message = msg;
        this.message.addPropertyChangeListener(this);
    }

    public IMessage getMessage() {
        return message;
    }

    @Override
    public void propertyChange(PropertyChangeEvent event) {

    }
}
