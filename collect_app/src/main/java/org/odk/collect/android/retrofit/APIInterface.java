package org.odk.collect.android.retrofit;

import org.odk.collect.android.retrofitmodels.LoginResult;
import org.odk.collect.android.retrofitmodels.MappedGirls;
import org.odk.collect.android.retrofitmodels.AuthModel;
import org.odk.collect.android.retrofitmodels.UserModel;
import org.odk.collect.android.retrofitmodels.mappedgirls.MappedGirl;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface APIInterface {
    //todo# get only the user's mapped girls. add filter
    @GET("api/v1/girls")
    Call<MappedGirl> getMappedGirls();

    @GET("auth/me/")
    Call<UserModel> getLoggedInUserDetails();

    @FormUrlEncoded
    @POST("v1/sessions")
    Call<LoginResult> login(@Field("email") String email, @Field("password") String password);

    @FormUrlEncoded
    @POST("auth/login/")
    Call<AuthModel> loginUser(@Field("username") String username, @Field("password") String password);
}