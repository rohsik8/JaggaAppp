package com.example.kishor.mvpdagerrxjava.Activity;

import com.example.kishor.mvpdagerrxjava.Presenter.MainScreenPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<MainScreenPresenter> mainScreenPresenterProvider;

  public MainActivity_MembersInjector(Provider<MainScreenPresenter> mainScreenPresenterProvider) {
    assert mainScreenPresenterProvider != null;
    this.mainScreenPresenterProvider = mainScreenPresenterProvider;
  }

  public static MembersInjector<MainActivity> create(
      Provider<MainScreenPresenter> mainScreenPresenterProvider) {
    return new MainActivity_MembersInjector(mainScreenPresenterProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mainScreenPresenter = mainScreenPresenterProvider.get();
  }

  public static void injectMainScreenPresenter(
      MainActivity instance, Provider<MainScreenPresenter> mainScreenPresenterProvider) {
    instance.mainScreenPresenter = mainScreenPresenterProvider.get();
  }
}
