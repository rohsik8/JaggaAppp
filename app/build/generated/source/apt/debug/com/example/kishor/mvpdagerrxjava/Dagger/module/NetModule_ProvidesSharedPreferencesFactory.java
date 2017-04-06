package com.example.kishor.mvpdagerrxjava.Dagger.module;

import android.app.Application;
import android.content.SharedPreferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NetModule_ProvidesSharedPreferencesFactory
    implements Factory<SharedPreferences> {
  private final NetModule module;

  private final Provider<Application> mApplicationProvider;

  public NetModule_ProvidesSharedPreferencesFactory(
      NetModule module, Provider<Application> mApplicationProvider) {
    assert module != null;
    this.module = module;
    assert mApplicationProvider != null;
    this.mApplicationProvider = mApplicationProvider;
  }

  @Override
  public SharedPreferences get() {
    return Preconditions.checkNotNull(
        module.providesSharedPreferences(mApplicationProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<SharedPreferences> create(
      NetModule module, Provider<Application> mApplicationProvider) {
    return new NetModule_ProvidesSharedPreferencesFactory(module, mApplicationProvider);
  }
}
