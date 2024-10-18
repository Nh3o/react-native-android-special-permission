import { NativeModules } from 'react-native';
const { OpenSettings } = NativeModules;

export const openSettings = (action, packageName) => {
  OpenSettings.openSettings(action, packageName);
};

export const hasManageAllFilesAccess = (callback) => {
  OpenSettings.hasManageAllFilesAccess(callback);
};
