package com.google.mediapipe.examples.objectdetection.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00a2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010%\u001a\u00020&H\u0003J\b\u0010\'\u001a\u00020&H\u0007J\b\u0010(\u001a\u00020&H\u0002J\u0010\u0010)\u001a\u00020&2\u0006\u0010*\u001a\u00020+H\u0016J$\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u000103H\u0016J\b\u00104\u001a\u00020&H\u0016J\u0018\u00105\u001a\u00020&2\u0006\u00106\u001a\u00020\u00052\u0006\u00107\u001a\u000208H\u0016J\b\u00109\u001a\u00020&H\u0016J\u0010\u0010:\u001a\u00020&2\u0006\u0010;\u001a\u00020<H\u0016J\b\u0010=\u001a\u00020&H\u0016J\u001a\u0010>\u001a\u00020&2\u0006\u0010?\u001a\u00020-2\b\u00102\u001a\u0004\u0018\u000103H\u0017J\b\u0010@\u001a\u00020&H\u0002J\u0018\u0010A\u001a\u00020&2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\u0005H\u0002J\u0010\u0010E\u001a\u00020&2\u0006\u0010F\u001a\u00020\u0005H\u0002J\b\u0010G\u001a\u00020&H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"\u00a8\u0006H"}, d2 = {"Lcom/google/mediapipe/examples/objectdetection/fragments/CameraFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/google/mediapipe/examples/objectdetection/ObjectDetectorHelper$DetectorListener;", "()V", "TAG", "", "_fragmentCameraBinding", "Lcom/google/mediapipe/examples/objectdetection/databinding/FragmentCameraBinding;", "backgroundExecutor", "Ljava/util/concurrent/ExecutorService;", "camera", "Landroidx/camera/core/Camera;", "cameraProvider", "Landroidx/camera/lifecycle/ProcessCameraProvider;", "fragmentCameraBinding", "getFragmentCameraBinding", "()Lcom/google/mediapipe/examples/objectdetection/databinding/FragmentCameraBinding;", "handler", "Landroid/os/Handler;", "imageAnalyzer", "Landroidx/camera/core/ImageAnalysis;", "lastExecutionTime", "", "objectDetectorHelper", "Lcom/google/mediapipe/examples/objectdetection/ObjectDetectorHelper;", "preview", "Landroidx/camera/core/Preview;", "spokenWords", "Ljava/lang/StringBuilder;", "textToSpeech", "Landroid/speech/tts/TextToSpeech;", "viewModel", "Lcom/google/mediapipe/examples/objectdetection/MainViewModel;", "getViewModel", "()Lcom/google/mediapipe/examples/objectdetection/MainViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "bindCameraUseCases", "", "downloadSpokenWords", "initBottomSheetControls", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onError", "error", "errorCode", "", "onPause", "onResults", "resultBundle", "Lcom/google/mediapipe/examples/objectdetection/ObjectDetectorHelper$ResultBundle;", "onResume", "onViewCreated", "view", "setUpCamera", "showPopup", "context", "Landroid/content/Context;", "message", "speakWithDelay", "text", "updateControlsUi", "app_debug"})
public final class CameraFragment extends androidx.fragment.app.Fragment implements com.google.mediapipe.examples.objectdetection.ObjectDetectorHelper.DetectorListener {
    private final java.lang.String TAG = "ObjectDetection";
    private android.speech.tts.TextToSpeech textToSpeech;
    private final android.os.Handler handler = null;
    private long lastExecutionTime = 0L;
    private final java.lang.StringBuilder spokenWords = null;
    private com.google.mediapipe.examples.objectdetection.databinding.FragmentCameraBinding _fragmentCameraBinding;
    private com.google.mediapipe.examples.objectdetection.ObjectDetectorHelper objectDetectorHelper;
    private final kotlin.Lazy viewModel$delegate = null;
    private androidx.camera.core.Preview preview;
    private androidx.camera.core.ImageAnalysis imageAnalyzer;
    private androidx.camera.core.Camera camera;
    private androidx.camera.lifecycle.ProcessCameraProvider cameraProvider;
    
    /**
     * Blocking ML operations are performed using this executor
     */
    private java.util.concurrent.ExecutorService backgroundExecutor;
    
    public CameraFragment() {
        super();
    }
    
    private final com.google.mediapipe.examples.objectdetection.databinding.FragmentCameraBinding getFragmentCameraBinding() {
        return null;
    }
    
    private final com.google.mediapipe.examples.objectdetection.MainViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    @java.lang.Override
    public void onPause() {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initBottomSheetControls() {
    }
    
    private final void updateControlsUi() {
    }
    
    private final void setUpCamera() {
    }
    
    @android.annotation.SuppressLint(value = {"UnsafeOptInUsageError"})
    private final void bindCameraUseCases() {
    }
    
    @java.lang.Override
    public void onConfigurationChanged(@org.jetbrains.annotations.NotNull
    android.content.res.Configuration newConfig) {
    }
    
    @java.lang.Override
    public void onResults(@org.jetbrains.annotations.NotNull
    com.google.mediapipe.examples.objectdetection.ObjectDetectorHelper.ResultBundle resultBundle) {
    }
    
    private final void speakWithDelay(java.lang.String text) {
    }
    
    @android.annotation.SuppressLint(value = {"SdCardPath"})
    public final void downloadSpokenWords() {
    }
    
    private final void showPopup(android.content.Context context, java.lang.String message) {
    }
    
    @java.lang.Override
    public void onError(@org.jetbrains.annotations.NotNull
    java.lang.String error, int errorCode) {
    }
}