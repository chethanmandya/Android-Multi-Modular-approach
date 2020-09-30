# Using Navigation Component to Navigate Between Dynamic Feature Modules

Recently I’ve been working on a brand new application that is fairly complex and has over 30 different screens to start with. 
We decided that we are going to take advantage of the Dynamic Feature Modules and ended up having an architecture like this: 

The app module is the core module of the application. It serves as a starting point and contains some common classes used along with modules. 
Each new feature is a new dynamic module and acts like it's living in its own world without any knowledge of other features. 
They only know about the app module.


The benefit of using this approach is huge. For one, we have an architecture that will be so easy to scale because adding a new feature will not affect other parts 
of the code. Working in a team? Each team member can work on separate feature reducing the chances of something breaking in other places.

This project will help you to learn how the dynamic feature or any feature module are made . more importantly you learn the way of navigation between this module. 


How dynamic Feature Modules Work

Another benefit of dynamic delivery is that your app doesn’t have to install all at once. Instead, you break it down into pieces that install on demand.

This is possible with mechanism in Dynamic Delivery called split APK.

Split APKs are available on Android 5.0 and higher.
Split APKs are similar to regular APKs, except they contain only a part of your app. Android is able to treat multiple split APKs as a single app. This enables you to break up your app into smaller chunks that download and install when required.

There are three types of split APKs:

- Base APK: Contains code and resources for the app’s base functionality. Downloads when the user first downloads the app.
- Configuration APKs: Hold native libraries and specific screen density, CPU architecture or language resources.
- Dynamic feature APKs: Contain code and resources for a feature of your app from a single feature module. You can customize when and how the feature downloads using Play Core library.
