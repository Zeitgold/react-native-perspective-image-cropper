
package com.reactlibrary2;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNCustomCropModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNCustomCropModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNCustomCrop";
  }
}
