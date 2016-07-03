package com.dssp.genorapreparation.retro;

import com.dssp.genorapreparation.util.Constant;
import com.squareup.okhttp.OkHttpClient;

import retrofit.RestAdapter;
import retrofit.client.OkClient;

/**
 * Created by dhanrajnaik522 on 7/3/2016.
 */
public class RestClient {

    private static final RestAdapter.LogLevel LOG_LEVEL = RestAdapter.LogLevel.FULL;

    private static RestAdapter getGenoraAdapter(){
        return new RestAdapter.Builder()
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .setEndpoint(Constant.GENORA_URL)
                .setClient(new OkClient(new OkHttpClient()))
                .build();
    }

    public static GenoraApi getGenoraApi(){
        return  getGenoraAdapter().create(GenoraApi.class);
    }

    public  interface GenoraApi{

    }






    /*
    private static RestAdapter getSaleAppAdapter(final String token) {
        return new RestAdapter.Builder()
                .setRequestInterceptor(new RequestInterceptor() {
                    @Override
                    public void intercept(RequestInterceptor.RequestFacade request) {
                        request.addHeader("Accept", "application/json;versions=1");
                        request.addHeader("Authorization", "Bearer " + token);
                    }
                })
                .setLogLevel(LOG_LEVEL)
                .setEndpoint(Constant.API_REQUEST)
                .setClient(new OkClient(new OkHttpClient()))
                .build();
    }

    */
}
