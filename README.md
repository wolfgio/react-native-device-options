
# react-native-device-options

## Getting started

`$ npm install react-native-device-options --save`

### Mostly automatic installation

`$ react-native link react-native-device-options`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-device-options` and add `RNDeviceOptions.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNDeviceOptions.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactNativeOptions.RNDeviceOptionsPackage;` to the imports at the top of the file
  - Add `new RNDeviceOptionsPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-device-options'
  	project(':react-native-device-options').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-device-options/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-device-options')
  	```


## Usage
```javascript
import RNDeviceOptions from 'react-native-device-options';

// TODO: What to do with the module?
RNDeviceOptions;
```
  