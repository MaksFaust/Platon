package com.vistula.platon.data.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0004J\u0006\u0010\u0016\u001a\u00020\u0004J\u0006\u0010\u0017\u001a\u00020\u0004J\u0006\u0010\u0018\u001a\u00020\u0004J\u0006\u0010\u0019\u001a\u00020\u0004R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006\u00a8\u0006\u001b"}, d2 = {"Lcom/vistula/platon/data/network/CasClient;", "", "()V", "TAG_ERROR_WITH_BODY", "", "getTAG_ERROR_WITH_BODY", "()Ljava/lang/String;", "TAG_EVENTID", "getTAG_EVENTID", "TAG_EXECUTION", "getTAG_EXECUTION", "TAG_LT", "getTAG_LT", "TAG_SERVICE", "getTAG_SERVICE", "cutOff", "str", "prefix", "sufix", "getBody", "", "getEventId", "getExecution", "getLT", "getService", "getSubmit", "Companion", "app_debug"})
public final class CasClient {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG_ERROR_WITH_BODY = "Can`t execute request to CAS";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG_LT = "name=\"lt\" value=";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG_EXECUTION = "name=\"execution\" value=";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG_EVENTID = "name=\"_eventId\" value=\"";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG_SERVICE = "?service=";
    private static java.lang.String body;
    public static final com.vistula.platon.data.network.CasClient.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG_ERROR_WITH_BODY() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG_LT() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG_EXECUTION() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG_EVENTID() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG_SERVICE() {
        return null;
    }
    
    public final boolean getBody() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLT() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getExecution() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEventId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSubmit() {
        return null;
    }
    
    private final java.lang.String cutOff(java.lang.String str, java.lang.String prefix, java.lang.String sufix) {
        return null;
    }
    
    public CasClient() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u00a8\u0006\u0006"}, d2 = {"Lcom/vistula/platon/data/network/CasClient$Companion;", "", "()V", "body", "", "body$annotations", "app_debug"})
    public static final class Companion {
        
        @java.lang.Deprecated()
        private static void body$annotations() {
        }
        
        private Companion() {
            super();
        }
    }
}