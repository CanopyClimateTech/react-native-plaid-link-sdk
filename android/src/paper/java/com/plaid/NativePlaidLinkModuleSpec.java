
/**
 * This code was generated by [react-native-codegen](https://www.npmjs.com/package/react-native-codegen).
 *
 * Do not edit this file as changes may cause incorrect behavior and will be lost
 * once the code is regenerated.
 *
 * @generated by codegen project: GenerateModuleJavaSpec.js
 *
 * @nolint
 */

package com.plaid;

import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativePlaidLinkModuleSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
  public NativePlaidLinkModuleSpec(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @ReactMethod
  @DoNotStrip
  public abstract void continueFromRedirectUriString(String redirectUriString);

  @ReactMethod
  @DoNotStrip
  public abstract void create(ReadableMap configuration);

  @ReactMethod
  @DoNotStrip
  public abstract void open(Callback onSuccess, Callback onExit);

  @ReactMethod
  @DoNotStrip
  public abstract void dismiss();

  @ReactMethod
  @DoNotStrip
  public abstract void startLinkActivityForResult(String data, Callback onSuccessCallback, Callback onExitCallback);
}
