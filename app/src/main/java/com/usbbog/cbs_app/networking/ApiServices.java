package com.usbbog.cbs_app.networking;

import com.usbbog.cbs_app.modelHelper.AppData;
import com.usbbog.cbs_app.modelHelper.CasosHolder;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Part;
import retrofit2.http.Path;

public interface ApiServices {

    String cName = AppData.getNombreCaso();

    @GET("api/cases/{nombreCaso}")
    Call<CasosHolder> getCasoByNombreCaso(
            @Path("nombreCaso") String nombreCaso
    );

    @GET("api/cases/{nombreCaso}/archivo")
    Call<ResponseBody> descargarArchivo(
            @Part MultipartBody.Part evidencias
    );

}
