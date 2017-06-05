//
// Dynamsoft JavaScript Library for Basic Initiation of Dynamic Web TWAIN
// More info on DWT: http://www.dynamsoft.com/Products/WebTWAIN_Overview.aspx
//
// Copyright 2014, Dynamsoft Corporation 
// Author: Dynamsoft Team
// Version: 10.2.0.324
//
/// <reference path="dynamsoft.webtwain.initiate.js" />
var Dynamsoft = Dynamsoft || { WebTwainEnv: {} };

Dynamsoft.WebTwainEnv.AutoLoad = true;
///
Dynamsoft.WebTwainEnv.Containers = [{ContainerId:'dwtcontrolContainer', Width:338, Height:400}];
///
Dynamsoft.WebTwainEnv.ProductKey = 'X_PRODUCTKEY_X';
///
Dynamsoft.WebTwainEnv.Trial = X_TRIAL_X;
///
Dynamsoft.WebTwainEnv.Debug = X_DEBUG_X; // only for debugger output
///
Dynamsoft.WebTwainEnv.ResourcesPath = 'X_PATH_X';

/// All callbacks are defined in the dynamsoft.webtwain.install.js file, you can customize them.

// Dynamsoft.WebTwainEnv.RegisterEvent('OnWebTwainReady', function(){
// 		// webtwain has been inited
// });
