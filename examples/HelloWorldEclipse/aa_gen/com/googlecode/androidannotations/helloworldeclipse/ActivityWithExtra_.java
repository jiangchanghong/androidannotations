//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.0.
//


package com.googlecode.androidannotations.helloworldeclipse;

import java.io.Serializable;
import java.util.Date;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.googlecode.androidannotations.helloworldeclipse.R.id;
import com.googlecode.androidannotations.helloworldeclipse.R.layout;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class ActivityWithExtra_
    extends ActivityWithExtra
    implements HasViews, OnViewChangedListener
{

    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();
    public final static String CLASS_CAST_EXCEPTION_EXTRA = "myIntExtra";
    public final static String UNBOUND_EXTRA = "unboundExtra";
    public final static String MY_DATE_EXTRA = "myDateExtra";
    public final static String MY_MESSAGE_EXTRA = "myStringExtra";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
        setContentView(layout.activity_with_extra);
    }

    private void init_(Bundle savedInstanceState) {
        OnViewChangedNotifier.registerOnViewChangedListener(this);
        injectExtras_();
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view, LayoutParams params) {
        super.setContentView(view, params);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    public static ActivityWithExtra_.IntentBuilder_ intent(Context context) {
        return new ActivityWithExtra_.IntentBuilder_(context);
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        extraTextView = ((TextView) hasViews.findViewById(id.extraTextView));
        init();
    }

    private void injectExtras_() {
        Bundle extras_ = getIntent().getExtras();
        if (extras_!= null) {
            if (extras_.containsKey(CLASS_CAST_EXCEPTION_EXTRA)) {
                classCastExceptionExtra = extras_.getString(CLASS_CAST_EXCEPTION_EXTRA);
            }
            if (extras_.containsKey(UNBOUND_EXTRA)) {
                unboundExtra = extras_.getString(UNBOUND_EXTRA);
            }
            if (extras_.containsKey(MY_DATE_EXTRA)) {
                myDate = ((Date) extras_.getSerializable(MY_DATE_EXTRA));
            }
            if (extras_.containsKey(MY_MESSAGE_EXTRA)) {
                myMessage = extras_.getString(MY_MESSAGE_EXTRA);
            }
        }
    }

    @Override
    public void setIntent(Intent newIntent) {
        super.setIntent(newIntent);
        injectExtras_();
    }

    public static class IntentBuilder_ {

        private Context context_;
        private final Intent intent_;

        public IntentBuilder_(Context context) {
            context_ = context;
            intent_ = new Intent(context, ActivityWithExtra_.class);
        }

        public Intent get() {
            return intent_;
        }

        public ActivityWithExtra_.IntentBuilder_ flags(int flags) {
            intent_.setFlags(flags);
            return this;
        }

        public void start() {
            context_.startActivity(intent_);
        }

        public void startForResult(int requestCode) {
            if (context_ instanceof Activity) {
                ((Activity) context_).startActivityForResult(intent_, requestCode);
            } else {
                context_.startActivity(intent_);
            }
        }

        public ActivityWithExtra_.IntentBuilder_ classCastExceptionExtra(String classCastExceptionExtra) {
            intent_.putExtra(CLASS_CAST_EXCEPTION_EXTRA, classCastExceptionExtra);
            return this;
        }

        public ActivityWithExtra_.IntentBuilder_ unboundExtra(String unboundExtra) {
            intent_.putExtra(UNBOUND_EXTRA, unboundExtra);
            return this;
        }

        public ActivityWithExtra_.IntentBuilder_ myDate(Date myDate) {
            intent_.putExtra(MY_DATE_EXTRA, ((Serializable) myDate));
            return this;
        }

        public ActivityWithExtra_.IntentBuilder_ myMessage(String myMessage) {
            intent_.putExtra(MY_MESSAGE_EXTRA, myMessage);
            return this;
        }

    }

}
