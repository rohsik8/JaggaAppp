package com.example.kishor.mvpdagerrxjava.Presenter;

import com.example.kishor.mvpdagerrxjava.Interface.LoginScreenContract;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoginScreenPresenter_Factory implements Factory<LoginScreenPresenter> {
  private final Provider<Retrofit> retrofitProvider;

  private final Provider<LoginScreenContract.View> viewProvider;

  public LoginScreenPresenter_Factory(
      Provider<Retrofit> retrofitProvider, Provider<LoginScreenContract.View> viewProvider) {
    assert retrofitProvider != null;
    this.retrofitProvider = retrofitProvider;
    assert viewProvider != null;
    this.viewProvider = viewProvider;
  }

  @Override
  public LoginScreenPresenter get() {
    return new LoginScreenPresenter(retrofitProvider.get(), viewProvider.get());
  }

  public static Factory<LoginScreenPresenter> create(
      Provider<Retrofit> retrofitProvider, Provider<LoginScreenContract.View> viewProvider) {
    return new LoginScreenPresenter_Factory(retrofitProvider, viewProvider);
  }
}
