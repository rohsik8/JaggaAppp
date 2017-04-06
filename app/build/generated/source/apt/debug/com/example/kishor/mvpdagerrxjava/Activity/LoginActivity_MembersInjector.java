package com.example.kishor.mvpdagerrxjava.Activity;

import com.example.kishor.mvpdagerrxjava.Presenter.LoginScreenPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoginActivity_MembersInjector implements MembersInjector<LoginActivity> {
  private final Provider<LoginScreenPresenter> mainScreenPresenterProvider;

  public LoginActivity_MembersInjector(Provider<LoginScreenPresenter> mainScreenPresenterProvider) {
    assert mainScreenPresenterProvider != null;
    this.mainScreenPresenterProvider = mainScreenPresenterProvider;
  }

  public static MembersInjector<LoginActivity> create(
      Provider<LoginScreenPresenter> mainScreenPresenterProvider) {
    return new LoginActivity_MembersInjector(mainScreenPresenterProvider);
  }

  @Override
  public void injectMembers(LoginActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mainScreenPresenter = mainScreenPresenterProvider.get();
  }

  public static void injectMainScreenPresenter(
      LoginActivity instance, Provider<LoginScreenPresenter> mainScreenPresenterProvider) {
    instance.mainScreenPresenter = mainScreenPresenterProvider.get();
  }
}
