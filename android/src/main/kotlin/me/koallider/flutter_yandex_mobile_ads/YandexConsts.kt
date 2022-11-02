package me.koallider.flutter_yandex_mobile_ads

object YandexConsts {
    const val MAIN_CHANNEL = "me.koallider.flutter_yandex_mobile_ads"
    const val INIT = "initialize"
    const val LOAD_INTERSTITIAL = "loadInterstitial"
    const val SHOW_INTERSTITIAL = "showInterstitial"
    const val LOAD_REWARDED = "loadRewardedVideo"
    const val SHOW_REWARDED_VIDEO = "showRewardedVideo"

    // Rewarded keys
    const val ON_REWARDED_VIDEO_AD_OPENED = "onRewardedVideoAdOpened"
    const val ON_REWARDED_VIDEO_AD_CLOSED = "onRewardedVideoAdClosed"
    const val ON_REWARDED_VIDEO_AD_STARTED = "onRewardedVideoAdStarted"
    const val ON_REWARDED_VIDEO_AD_REWARDED = "onRewardedVideoAdRewarded"
    const val ON_REWARDED_VIDEO_AD_CLICKED = "onRewardedVideoAdClicked"
    const val ON_REWARDED_AD_READY = "onRewardedAdReady"
    const val ON_REWARDED_AD_LOAD_FAILED = "onRewardedAdLoadFailed"

    //  Interstitial keys
    const val ON_INTERSTITIAL_AD_OPENED = "onInterstitialAdOpened"
    const val ON_INTERSTITIAL_AD_READY = "onInterstitialAdReady"
    const val ON_INTERSTITIAL_AD_CLOSED = "onInterstitialAdClosed"
    const val ON_INTERSTITIAL_AD_LOAD_FAILED = "onInterstitialAdLoadFailed"
    const val ON_INTERSTITIAL_AD_SHOW_FAILED = "onInterstitialAdShowFailed"
    const val ON_INTERSTITIAL_AD_SHOW_SUCCEEDED = "onInterstitialAdShowSucceeded"
    const val ON_INTERSTITIAL_AD_CLICKED = "onInterstitialAdClicked"
}