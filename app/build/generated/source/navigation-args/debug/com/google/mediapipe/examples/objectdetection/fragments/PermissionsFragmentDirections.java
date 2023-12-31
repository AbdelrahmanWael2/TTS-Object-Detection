package com.google.mediapipe.examples.objectdetection.fragments;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.google.mediapipe.examples.objectdetection.R;

public class PermissionsFragmentDirections {
  private PermissionsFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionPermissionsToCamera() {
    return new ActionOnlyNavDirections(R.id.action_permissions_to_camera);
  }
}
