package com.commonlauncher.nativeplugin;

public class MaliOptNative {
    static {
        System.loadLibrary("maliopt");
    }

    // Inicialização
    public static native void detectExtensions();

    // Relatório completo
    public static native String getExtensionReport();

    // Extensões OpenGL ES
    public static native boolean isFramebufferFetchSupported();
    public static native boolean isFramebufferFetchDepthStencilSupported();
    public static native boolean isPLSSupported();
    public static native boolean isMaliBinarySupported();
    public static native boolean isASTCLDRSupported();
    public static native boolean isASTCHDRSupported();
    public static native boolean isETC2Supported();
    public static native boolean isStandardDerivativesSupported();
    public static native boolean isTextureFloatSupported();
    public static native boolean isTextureFloatLinearSupported();
    public static native boolean isTextureHalfFloatSupported();
    public static native boolean isTextureHalfFloatLinearSupported();
    public static native boolean isMultisampledRTSupported();
    public static native boolean isMultisampledRT2Supported();
    public static native boolean isSRGBSupported();
    public static native boolean isSRGBWriteControlSupported();
    public static native boolean isAnisotropicFilteringSupported();
    public static native boolean isProgramBinarySupported();
    public static native boolean isTextureStorageSupported();
    public static native boolean isTextureNPOTSupported();
    public static native boolean isMapBufferSupported();
    public static native boolean isBufferStorageSupported();
    public static native boolean isTimerQuerySupported();
    public static native boolean isDebugMarkerSupported();
    public static native boolean isKHRDebugSupported();
    public static native boolean isRobustnessSupported();

    // Extensões EGL (implementadas em mali_opt_egl.c)
    public static native boolean isFenceSyncSupported();
    public static native boolean isNativeFenceSyncSupported();
    public static native boolean isWaitSyncSupported();

    // Limites de hardware
    public static native int getMaxTextureSize();
    public static native int getMaxSamples();
    public static native int getMaxAnisotropy();
    public static native int getMaxVertexAttribs();
    public static native int getMaxCombinedTextureImageUnits();

    // Contexto de execução
    public static native String getActiveRenderContext();
    public static native String getGPURenderer();
    public static native String getGPUVendor();
    public static native String getGLESVersion();

    // Strings brutas de extensões (para debug)
    public static native String getRawGLExtensions();
    public static native String getRawEGLExtensions();
}
