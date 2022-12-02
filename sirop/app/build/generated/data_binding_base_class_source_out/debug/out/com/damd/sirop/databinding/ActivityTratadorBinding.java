// Generated by view binder compiler. Do not edit!
package com.damd.sirop.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.damd.sirop.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityTratadorBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnEditarOperacion;

  @NonNull
  public final Button btnIngresarOperacion;

  @NonNull
  public final Button btnInicioTratador;

  private ActivityTratadorBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button btnEditarOperacion, @NonNull Button btnIngresarOperacion,
      @NonNull Button btnInicioTratador) {
    this.rootView = rootView;
    this.btnEditarOperacion = btnEditarOperacion;
    this.btnIngresarOperacion = btnIngresarOperacion;
    this.btnInicioTratador = btnInicioTratador;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityTratadorBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityTratadorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_tratador, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityTratadorBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnEditarOperacion;
      Button btnEditarOperacion = ViewBindings.findChildViewById(rootView, id);
      if (btnEditarOperacion == null) {
        break missingId;
      }

      id = R.id.btnIngresarOperacion;
      Button btnIngresarOperacion = ViewBindings.findChildViewById(rootView, id);
      if (btnIngresarOperacion == null) {
        break missingId;
      }

      id = R.id.btnInicioTratador;
      Button btnInicioTratador = ViewBindings.findChildViewById(rootView, id);
      if (btnInicioTratador == null) {
        break missingId;
      }

      return new ActivityTratadorBinding((ConstraintLayout) rootView, btnEditarOperacion,
          btnIngresarOperacion, btnInicioTratador);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
