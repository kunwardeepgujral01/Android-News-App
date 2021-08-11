# NewsApp

[![Platform](https://img.shields.io/badge/platform-Android-yellow.svg)](https://www.android.com)


The main goal of this App is to give regularly-updated news to the user from the internet. The news is broadly divided into 5 different categories and the top headlines will be of the user's country.



# Documentation

## Gradle
```
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath "com.android.tools.build:gradle:4.2.1"
    }
}

dependencies {

    implementation 'androidx.appcompat:appcompat:1.3.0'
    implementation 'com.google.android.material:material:1.4.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.0.4'
    implementation 'org.jetbrains:annotations:15.0'
    testImplementation 'junit:junit:4.+'
    androidTestImplementation 'androidx.test.ext:junit:1.1.3'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.4.0'

    //Glide
    implementation 'com.github.bumptech.glide:glide:4.12.0'

    //Retrofit
    implementation 'com.squareup.retrofit2:retrofit:2.9.0'
    implementation 'com.squareup.retrofit2:converter-gson:2.9.0'

    //Lottie Animations
    implementation 'com.airbnb.android:lottie:4.0.0'
}
```
### Dependencies

1. [Glide](https://github.com/bumptech/glide)

1. [Retrofit](https://square.github.io/retrofit)

1. [Lottie Animations](https://github.com/airbnb/lottie-android)

## Notes

###  News API
---
I created my  [News API](https://newsapi.org/) key from this link and it provides data in JSON format which gets updated after five minutes automatically.
## Features

- 5 Different categories
- Updated news after every minute
- Open any news in webview
- Easy to use UI

## Screenshots

###### Splash Screen and Home Screen <img src="https://github.com/kunwardeepgujral01/Android-News-App/blob/master/Splash_Screen.png" width="30%"><img src="https://github.com/kunwardeepgujral01/Android-News-App/blob/master/Home_Screen.png" width="30%">

## Feedback

If you have any feedback, please reach out to me at kunwardeepgujral000@gmail.com


If you find a bug or think something could be better, please file an issue! If you think a code change should be made, feel free to raise a PR.

  
