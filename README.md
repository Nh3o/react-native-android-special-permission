
# react-native-react-native-android-special-permission

## Getting started

`$ npm install react-native-react-native-android-special-permission --save`

### Mostly automatic installation

`$ react-native link react-native-react-native-android-special-permission`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-react-native-android-special-permission` and add `RNReactNativeAndroidSpecialPermission.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNReactNativeAndroidSpecialPermission.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNReactNativeAndroidSpecialPermissionPackage;` to the imports at the top of the file
  - Add `new RNReactNativeAndroidSpecialPermissionPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-react-native-android-special-permission'
  	project(':react-native-react-native-android-special-permission').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-react-native-android-special-permission/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-react-native-android-special-permission')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNReactNativeAndroidSpecialPermission.sln` in `node_modules/react-native-react-native-android-special-permission/windows/RNReactNativeAndroidSpecialPermission.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using React.Native.Android.Special.Permission.RNReactNativeAndroidSpecialPermission;` to the usings at the top of the file
  - Add `new RNReactNativeAndroidSpecialPermissionPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNReactNativeAndroidSpecialPermission from 'react-native-react-native-android-special-permission';

// TODO: What to do with the module?
RNReactNativeAndroidSpecialPermission;
```
  