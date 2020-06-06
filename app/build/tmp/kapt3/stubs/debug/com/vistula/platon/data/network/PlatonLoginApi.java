package com.vistula.platon.data.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u0000 \r2\u00020\u0001:\u0001\rJT\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u0006H\'\u00a8\u0006\u000e"}, d2 = {"Lcom/vistula/platon/data/network/PlatonLoginApi;", "", "userLogin", "Lretrofit2/Call;", "Lokhttp3/ResponseBody;", "service", "", "username", "password", "lt", "execution", "_eventId", "submit", "Companion", "app_debug"})
public abstract interface PlatonLoginApi {
    public static final com.vistula.platon.data.network.PlatonLoginApi.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "login/")
    @retrofit2.http.FormUrlEncoded()
    public abstract retrofit2.Call<okhttp3.ResponseBody> userLogin(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "service")
    java.lang.String service, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "username")
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "password")
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "lt")
    java.lang.String lt, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "execution")
    java.lang.String execution, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "_eventId")
    java.lang.String _eventId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "submit")
    java.lang.String submit);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u0086\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/vistula/platon/data/network/PlatonLoginApi$Companion;", "", "()V", "invoke", "Lcom/vistula/platon/data/network/PlatonLoginApi;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.vistula.platon.data.network.PlatonLoginApi invoke() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}