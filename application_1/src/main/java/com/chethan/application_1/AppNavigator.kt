package com.chethan.application_1


import com.chethan.navigatory.*
import com.chethan.splashscreen.SplashScreenFragmentNavigation

class AppNavigator :
    BaseNavigator(),
    TermsAndConditionFragmentNavigation, LoginFragmentNavigation,
    SplashScreenFragmentNavigation, MyProfileFragmentNavigation,
    OnBoardingFragmentNavigation,
    PrivacyPolicyFragmentNavigation, InteractiveGuideNavigation, PayMethodNavigation,
    PostItemForSaleNavigation {


    override fun openHomeScreen() {
        navController?.navigate(R.id.toHome)
    }


    override fun openTermsAndCondition() {
        navController?.navigate(R.id.toHome)
    }

    override fun openMyProfileScreen() {
        navController?.navigate(R.id.toHome)
    }

    override fun openOnBoardingScreen() {
        navController?.navigate(R.id.toHome)
    }

    override fun openPrivacyPolicyScreen() {
        navController?.navigate(R.id.toHome)
    }

    override fun openInteractiveGuideScreen() {
        navController?.navigate(R.id.toHome)
    }

    override fun openPayMethodScreen() {
        navController?.navigate(R.id.toHome)
    }

    override fun openPostItemForSaleScreen() {
        navController?.navigate(R.id.toHome)
    }
}