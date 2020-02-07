package edu.handong.isel.allgitclone.control;

import java.util.Map;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.QueryMap;

public interface GithubService {
	
	@Headers("Accept: application/vnd.github.cloak-preview")
	@GET("search/commits")
	Call<JsonObject> getUserCommits(@QueryMap Map<String, String> lang);
	
	@GET("search/repositories")
	Call<JsonObject> getJavaRepositories(@QueryMap Map<String, String> lang);
	
	@GET("search/issues")
	Call<JsonObject> getIssues(@QueryMap Map<String, String> lang);
	
}