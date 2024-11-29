// Generated code from Butter Knife. Do not modify!
package com.apsapps.indimessenger.activities;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.apsapps.indimessenger.R;
import com.google.android.gms.common.SignInButton;
import java.lang.IllegalStateException;
import java.lang.Override;

public class NameSignInActivity_ViewBinding implements Unbinder {
  private NameSignInActivity target;

  private View view2131296333;

  private View view2131296332;

  @UiThread
  public NameSignInActivity_ViewBinding(NameSignInActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public NameSignInActivity_ViewBinding(final NameSignInActivity target, View source) {
    this.target = target;

    View view;
    target.ivCompanyLogo = Utils.findRequiredViewAsType(source, R.id.iv_company_logo, "field 'ivCompanyLogo'", ImageView.class);
    target.etCompanyEmailId = Utils.findRequiredViewAsType(source, R.id.et_company_email_id, "field 'etCompanyEmailId'", EditText.class);
    target.etCompanyEmailPassword = Utils.findRequiredViewAsType(source, R.id.et_company_email_password, "field 'etCompanyEmailPassword'", EditText.class);
    view = Utils.findRequiredView(source, R.id.btn_login, "field 'btnLogin' and method 'onViewClicked'");
    target.btnLogin = Utils.castView(view, R.id.btn_login, "field 'btnLogin'", Button.class);
    view2131296333 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.tvOr = Utils.findRequiredViewAsType(source, R.id.tv_or, "field 'tvOr'", TextView.class);
    target.signInButton = Utils.findRequiredViewAsType(source, R.id.sign_in_button, "field 'signInButton'", SignInButton.class);
    view = Utils.findRequiredView(source, R.id.btn_google_sign_in, "field 'btnGoogleSignIn' and method 'onViewClicked'");
    target.btnGoogleSignIn = Utils.castView(view, R.id.btn_google_sign_in, "field 'btnGoogleSignIn'", Button.class);
    view2131296332 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    NameSignInActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ivCompanyLogo = null;
    target.etCompanyEmailId = null;
    target.etCompanyEmailPassword = null;
    target.btnLogin = null;
    target.tvOr = null;
    target.signInButton = null;
    target.btnGoogleSignIn = null;

    view2131296333.setOnClickListener(null);
    view2131296333 = null;
    view2131296332.setOnClickListener(null);
    view2131296332 = null;
  }
}
