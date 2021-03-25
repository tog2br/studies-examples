package com.examples.studies.enums;

import org.springframework.data.util.Version;

import com.examples.studies.request.Request;
import com.examples.studies.response.Response;

import reactor.core.publisher.Mono;

public enum PlatformTypesEnum {
	
	ANDROID {
		@Override
		public Mono<Response> checkVersion(Request request, String appVersion, Version minAndroidVersion) {
			if(Version.parse(appVersion).isLessThan(minAndroidVersion)) {
				//Check the method, etc....
				return Mono.just(new Response("1", "android"));
			}
			//Check the method, etc....
			return Mono.just(new Response("2", "android"));
		}
	},
	IOS {
		@Override
		public Mono<Response> checkVersion(Request request, String appVersion, Version minAndroidVersion) {
			if(Version.parse(appVersion).isLessThan(minAndroidVersion)) {
				//Check the method, etc....
				return Mono.just(new Response("1", "ios"));
			}
			//Check the method, etc....
			return Mono.just(new Response("2", "ios"));
		}
	};
	
	public abstract Mono<Response> checkVersion(Request request, String appVersion, Version minAndroidVersion);

}