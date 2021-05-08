package com.example.getsource;

import android.os.AsyncTask;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.ref.WeakReference;

public class FetchSource extends AsyncTask<String, Void, String> {
    private WeakReference<TextView> mSourceText;

    public FetchSource(TextView mSourceText) {
        this.mSourceText = new WeakReference<>(mSourceText);
    }

    @Override
    protected String doInBackground(String... strings) {
        return NetworkUtils.getSource(strings[0]);
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        mSourceText.get().setText(s);
    }
}
