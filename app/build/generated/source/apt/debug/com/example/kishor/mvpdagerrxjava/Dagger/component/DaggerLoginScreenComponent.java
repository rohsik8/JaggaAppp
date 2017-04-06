package com.example.kishor.mvpdagerrxjava.Dagger.component;

import com.example.kishor.mvpdagerrxjava.Activity.LoginActivity;
import com.example.kishor.mvpdagerrxjava.Activity.LoginActivity_MembersInjector;
import com.example.kishor.mvpdagerrxjava.Dagger.module.LoginScreenModule;
import com.example.kishor.mvpdagerrxjava.Dagger.module.LoginScreenModule_ProvidesMainScreenContractViewFactory;
import com.example.kishor.mvpdagerrxjava.Interface.LoginScreenContract;
import com.example.kishor.mvpdagerrxjava.Presenter.LoginScreenPresenter;
import com.example.kishor.mvpdagerrxjava.Presenter.LoginScreenPresenter_Factory;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.ScopedProvider;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerLoginScreenComponent implements LoginScreenComponent {
  private Provider<Retrofit> retrofitProvider;

  private Provider<LoginScreenContract.View> providesMainScreenContractViewProvider;

  private Provider<LoginScreenPresenter> loginScreenPresenterProvider;

  private MembersInjector<LoginActivity> loginActivityMembersInjector;

  private DaggerLoginScreenComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.retrofitProvider =
        new Factory<Retrofit>() {
          private final NetComponent netComponent = builder.netComponent;

          @Override
          public Retrofit get() {
            return Preconditions.checkNotNull(
                netComponent.retrofit(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.providesMainScreenContractViewProvider =
        ScopedProvider.create(
            LoginScreenModule_ProvidesMainScreenContractViewFactory.create(
                builder.loginScreenModule));

    this.loginScreenPresenterProvider =
        LoginScreenPresenter_Factory.create(
            retrofitProvider, providesMainScreenContractViewProvider);

    this.loginActivityMembersInjector =
        LoginActivity_MembersInjector.create(loginScreenPresenterProvider);
  }

  @Override
  public void inject(LoginActivity activity) {
    loginActivityMembersInjector.injectMembers(activity);
  }

  public static final class Builder {
    private LoginScreenModule loginScreenModule;

    private NetComponent netComponent;

    private Builder() {}

    public LoginScreenComponent build() {
      if (loginScreenModule == null) {
        throw new IllegalStateException(
            LoginScreenModule.class.getCanonicalName() + " must be set");
      }
      if (netComponent == null) {
        throw new IllegalStateException(NetComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerLoginScreenComponent(this);
    }

    public Builder loginScreenModule(LoginScreenModule loginScreenModule) {
      this.loginScreenModule = Preconditions.checkNotNull(loginScreenModule);
      return this;
    }

    public Builder netComponent(NetComponent netComponent) {
      this.netComponent = Preconditions.checkNotNull(netComponent);
      return this;
    }
  }
}
