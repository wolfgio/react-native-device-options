
package com.reactNativeOptions;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNDeviceOptionsModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNDeviceOptionsModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  public void open() {
    startActivityForResult(new Intent(android.provider.Settings.ACTION_SETTINGS), 0);
  }

  @Override
  public String getName() {
    return "RNDeviceOptions";
  }
}