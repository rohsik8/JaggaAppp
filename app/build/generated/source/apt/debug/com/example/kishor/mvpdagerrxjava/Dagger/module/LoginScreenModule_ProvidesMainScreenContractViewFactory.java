package com.example.kishor.mvpdagerrxjava.Dagger.module;

import com.example.kishor.mvpdagerrxjava.Interface.LoginScreenContract;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoginScreenModule_ProvidesMainScreenContractViewFactory
    implements Factory<LoginScreenContract.View> {
  private final LoginScreenModule module;

  public LoginScreenModule_ProvidesMainScreenContractViewFactory(LoginScreenModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LoginScreenContract.View get() {
    return Preconditions.checkNotNull(
        module.providesMainScreenContractView(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LoginScreenContract.View> create(LoginScreenModule module) {
    return new LoginScreenModule_ProvidesMainScreenContractViewFactory(module);
  }
}
