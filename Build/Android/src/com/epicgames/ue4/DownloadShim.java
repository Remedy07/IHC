package com.epicgames.ue4;

import com.YourCompany.Final_Soul_v1.OBBDownloaderService;
import com.YourCompany.Final_Soul_v1.DownloaderActivity;


public class DownloadShim
{
	public static OBBDownloaderService DownloaderService;
	public static DownloaderActivity DownloadActivity;
	public static Class<DownloaderActivity> GetDownloaderType() { return DownloaderActivity.class; }
}

