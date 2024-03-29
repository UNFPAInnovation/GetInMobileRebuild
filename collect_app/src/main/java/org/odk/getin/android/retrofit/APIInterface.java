package org.odk.getin.android.retrofit;

import org.odk.getin.android.retrofitmodels.LoginResult;
import org.odk.getin.android.retrofitmodels.AuthModel;
import org.odk.getin.android.retrofitmodels.UserModel;
import org.odk.getin.android.retrofitmodels.appointments.Appointments;
import org.odk.getin.android.retrofitmodels.healthfacilitymodels.HealthFacilities;
import org.odk.getin.android.retrofitmodels.mappedgirls.MappedGirl;
import org.odk.getin.android.retrofitmodels.systemusers.UserSystemModel;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface APIInterface {
    @GET("api/v1/girls")
    Call<MappedGirl> getMappedGirls();

    @GET("api/v1/appointments")
    Call<Appointments> getAppointments();

    @GET("api/v1/healthfacilities")
    Call<HealthFacilities> getHealthFacilities();

    @GET("api/v1/users")
    Call<UserSystemModel> getUsers();

    @GET("auth/me/")
    Call<UserModel> getLoggedInUserDetails();

    @FormUrlEncoded
    @POST("auth/login/")
    Call<AuthModel> loginUser(@Field("username") String username, @Field("password") String password);

    @POST("auth/logout/")
    Call<AuthModel> logOutUser();
}
