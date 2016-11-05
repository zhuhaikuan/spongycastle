package org.bouncycastle.jsse.provider;

import javax.net.ssl.X509KeyManager;
import javax.net.ssl.X509TrustManager;

import org.bouncycastle.tls.crypto.TlsCrypto;

final class ContextData
{
    private final TlsCrypto crypto;
    private final X509KeyManager km;
    private final X509TrustManager tm;

    ContextData(TlsCrypto crypto, X509KeyManager km, X509TrustManager tm)
    {
        this.crypto = crypto;
        this.km = km;
        this.tm = tm;
    }

    TlsCrypto getCrypto()
    {
        return crypto;
    }

    X509KeyManager getKeyManager()
    {
        return km;
    }

    X509TrustManager getTrustManager()
    {
        return tm;
    }
}
