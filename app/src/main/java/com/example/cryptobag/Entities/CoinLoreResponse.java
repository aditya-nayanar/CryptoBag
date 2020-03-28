
package com.example.cryptobag.Entities;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CoinLoreResponse {



    @SerializedName("data")
    @Expose
    private List<Coin> data;
    @SerializedName("info")
    @Expose
    private Info info;

    public List<Coin> getData() {
        return data;
    }

    public void setData(List<Coin> data) {
        this.data = data;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public static List <Coin> getCoinList(){

        String list = "{\n" +
                "  \"data\": [\n" +
                "    {\n" +
                "      \"id\": \"90\",\n" +
                "      \"symbol\": \"BTC\",\n" +
                "      \"name\": \"Bitcoin\",\n" +
                "      \"nameid\": \"bitcoin\",\n" +
                "      \"rank\": 1,\n" +
                "      \"price_usd\": \"6134.62\",\n" +
                "      \"percent_change_24h\": \"-9.98\",\n" +
                "      \"percent_change_1h\": \"-1.11\",\n" +
                "      \"percent_change_7d\": \"-5.73\",\n" +
                "      \"price_btc\": \"1.00\",\n" +
                "      \"market_cap_usd\": \"112147887132.36\",\n" +
                "      \"volume24\": 26014948892.677505,\n" +
                "      \"volume24a\": 27007052852.016777,\n" +
                "      \"csupply\": \"18281159.00\",\n" +
                "      \"tsupply\": \"18281159\",\n" +
                "      \"msupply\": \"21000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"80\",\n" +
                "      \"symbol\": \"ETH\",\n" +
                "      \"name\": \"Ethereum\",\n" +
                "      \"nameid\": \"ethereum\",\n" +
                "      \"rank\": 2,\n" +
                "      \"price_usd\": \"127.29\",\n" +
                "      \"percent_change_24h\": \"-9.36\",\n" +
                "      \"percent_change_1h\": \"-1.47\",\n" +
                "      \"percent_change_7d\": \"-9.14\",\n" +
                "      \"price_btc\": \"0.020656\",\n" +
                "      \"market_cap_usd\": \"14026619937.25\",\n" +
                "      \"volume24\": 9172010358.383867,\n" +
                "      \"volume24a\": 9404913571.120045,\n" +
                "      \"csupply\": \"110196485.00\",\n" +
                "      \"tsupply\": \"110196485\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"58\",\n" +
                "      \"symbol\": \"XRP\",\n" +
                "      \"name\": \"XRP\",\n" +
                "      \"nameid\": \"ripple\",\n" +
                "      \"rank\": 3,\n" +
                "      \"price_usd\": \"0.169088\",\n" +
                "      \"percent_change_24h\": \"-3.95\",\n" +
                "      \"percent_change_1h\": \"-0.31\",\n" +
                "      \"percent_change_7d\": \"2.21\",\n" +
                "      \"price_btc\": \"0.000027\",\n" +
                "      \"market_cap_usd\": \"7255477970.44\",\n" +
                "      \"volume24\": 2306393959.136893,\n" +
                "      \"volume24a\": 1870921790.5004947,\n" +
                "      \"csupply\": \"42909539227.00\",\n" +
                "      \"tsupply\": \"99991841593\",\n" +
                "      \"msupply\": \"100000000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"518\",\n" +
                "      \"symbol\": \"USDT\",\n" +
                "      \"name\": \"Tether\",\n" +
                "      \"nameid\": \"tether\",\n" +
                "      \"rank\": 4,\n" +
                "      \"price_usd\": \"1.00\",\n" +
                "      \"percent_change_24h\": \"0.11\",\n" +
                "      \"percent_change_1h\": \"0.04\",\n" +
                "      \"percent_change_7d\": \"0.18\",\n" +
                "      \"price_btc\": \"0.000163\",\n" +
                "      \"market_cap_usd\": \"4067123981.61\",\n" +
                "      \"volume24\": 31998921662.420395,\n" +
                "      \"volume24a\": 32460374849.905666,\n" +
                "      \"csupply\": \"4049107372.00\",\n" +
                "      \"tsupply\": \"4049107372\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"2321\",\n" +
                "      \"symbol\": \"BCH\",\n" +
                "      \"name\": \"Bitcoin Cash\",\n" +
                "      \"nameid\": \"bitcoin-cash\",\n" +
                "      \"rank\": 5,\n" +
                "      \"price_usd\": \"206.65\",\n" +
                "      \"percent_change_24h\": \"-11.07\",\n" +
                "      \"percent_change_1h\": \"-0.97\",\n" +
                "      \"percent_change_7d\": \"-9.85\",\n" +
                "      \"price_btc\": \"0.033536\",\n" +
                "      \"market_cap_usd\": \"3790825162.44\",\n" +
                "      \"volume24\": 2330654248.1527615,\n" +
                "      \"volume24a\": 2419507838.2612586,\n" +
                "      \"csupply\": \"18343840.00\",\n" +
                "      \"tsupply\": \"18343840\",\n" +
                "      \"msupply\": \"21000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"33234\",\n" +
                "      \"symbol\": \"BCHSV\",\n" +
                "      \"name\": \"Bitcoin SV\",\n" +
                "      \"nameid\": \"bitcoin-cash-sv\",\n" +
                "      \"rank\": 6,\n" +
                "      \"price_usd\": \"158.56\",\n" +
                "      \"percent_change_24h\": \"-9.85\",\n" +
                "      \"percent_change_1h\": \"0.14\",\n" +
                "      \"percent_change_7d\": \"-5.28\",\n" +
                "      \"price_btc\": \"0.025731\",\n" +
                "      \"market_cap_usd\": \"2908131445.27\",\n" +
                "      \"volume24\": 1554334248.4048667,\n" +
                "      \"volume24a\": 1649024822.6406994,\n" +
                "      \"csupply\": \"18341277.00\",\n" +
                "      \"tsupply\": \"21000000\",\n" +
                "      \"msupply\": \"21000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"1\",\n" +
                "      \"symbol\": \"LTC\",\n" +
                "      \"name\": \"Litecoin\",\n" +
                "      \"nameid\": \"litecoin\",\n" +
                "      \"rank\": 7,\n" +
                "      \"price_usd\": \"37.22\",\n" +
                "      \"percent_change_24h\": \"-8.53\",\n" +
                "      \"percent_change_1h\": \"-0.22\",\n" +
                "      \"percent_change_7d\": \"-8.91\",\n" +
                "      \"price_btc\": \"0.006041\",\n" +
                "      \"market_cap_usd\": \"2405465609.16\",\n" +
                "      \"volume24\": 2472857789.254801,\n" +
                "      \"volume24a\": 2351080955.870411,\n" +
                "      \"csupply\": \"64619858.00\",\n" +
                "      \"tsupply\": \"64619858\",\n" +
                "      \"msupply\": \"84000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"2679\",\n" +
                "      \"symbol\": \"EOS\",\n" +
                "      \"name\": \"EOS\",\n" +
                "      \"nameid\": \"eos\",\n" +
                "      \"rank\": 8,\n" +
                "      \"price_usd\": \"2.15\",\n" +
                "      \"percent_change_24h\": \"-8.77\",\n" +
                "      \"percent_change_1h\": \"-1.11\",\n" +
                "      \"percent_change_7d\": \"-8.95\",\n" +
                "      \"price_btc\": \"0.000348\",\n" +
                "      \"market_cap_usd\": \"1993605239.81\",\n" +
                "      \"volume24\": 2141038965.291887,\n" +
                "      \"volume24a\": 2082075043.0297446,\n" +
                "      \"csupply\": \"929000281.00\",\n" +
                "      \"tsupply\": \"1006245120\",\n" +
                "      \"msupply\": \"1006245120\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"2710\",\n" +
                "      \"symbol\": \"BNB\",\n" +
                "      \"name\": \"Binance Coin\",\n" +
                "      \"nameid\": \"binance-coin\",\n" +
                "      \"rank\": 9,\n" +
                "      \"price_usd\": \"12.01\",\n" +
                "      \"percent_change_24h\": \"-8.97\",\n" +
                "      \"percent_change_1h\": \"-0.77\",\n" +
                "      \"percent_change_7d\": \"-4.30\",\n" +
                "      \"price_btc\": \"0.001950\",\n" +
                "      \"market_cap_usd\": \"1868677880.39\",\n" +
                "      \"volume24\": 199621603.85094398,\n" +
                "      \"volume24a\": 249204584.43644077,\n" +
                "      \"csupply\": \"155536713.00\",\n" +
                "      \"tsupply\": \"192443301\",\n" +
                "      \"msupply\": \"200000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"3682\",\n" +
                "      \"symbol\": \"XTZ\",\n" +
                "      \"name\": \"Tezos\",\n" +
                "      \"nameid\": \"tezos\",\n" +
                "      \"rank\": 10,\n" +
                "      \"price_usd\": \"1.59\",\n" +
                "      \"percent_change_24h\": \"-10.27\",\n" +
                "      \"percent_change_1h\": \"0.70\",\n" +
                "      \"percent_change_7d\": \"-14.11\",\n" +
                "      \"price_btc\": \"0.000258\",\n" +
                "      \"market_cap_usd\": \"1047960620.62\",\n" +
                "      \"volume24\": 76866627.91615261,\n" +
                "      \"volume24a\": 67548341.97353615,\n" +
                "      \"csupply\": \"660373612.00\",\n" +
                "      \"tsupply\": \"763306930\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"33833\",\n" +
                "      \"symbol\": \"LEO\",\n" +
                "      \"name\": \"UNUS SED LEO\",\n" +
                "      \"nameid\": \"unus-sed-leo\",\n" +
                "      \"rank\": 11,\n" +
                "      \"price_usd\": \"1.00\",\n" +
                "      \"percent_change_24h\": \"-1.68\",\n" +
                "      \"percent_change_1h\": \"-0.13\",\n" +
                "      \"percent_change_7d\": \"1.71\",\n" +
                "      \"price_btc\": \"0.000163\",\n" +
                "      \"market_cap_usd\": \"1001890505.28\",\n" +
                "      \"volume24\": 2077151.2637338412,\n" +
                "      \"volume24a\": 1109781.4565204477,\n" +
                "      \"csupply\": \"999498893.00\",\n" +
                "      \"tsupply\": \"999498893\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"89\",\n" +
                "      \"symbol\": \"XLM\",\n" +
                "      \"name\": \"Stellar\",\n" +
                "      \"nameid\": \"stellar\",\n" +
                "      \"rank\": 12,\n" +
                "      \"price_usd\": \"0.039273\",\n" +
                "      \"percent_change_24h\": \"-8.46\",\n" +
                "      \"percent_change_1h\": \"-1.59\",\n" +
                "      \"percent_change_7d\": \"-7.71\",\n" +
                "      \"price_btc\": \"0.000006\",\n" +
                "      \"market_cap_usd\": \"796601466.54\",\n" +
                "      \"volume24\": 285619056.6224665,\n" +
                "      \"volume24a\": 295418054.3799453,\n" +
                "      \"csupply\": \"20283516588.00\",\n" +
                "      \"tsupply\": \"104303927518\",\n" +
                "      \"msupply\": \"104303927518\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"28\",\n" +
                "      \"symbol\": \"XMR\",\n" +
                "      \"name\": \"Monero\",\n" +
                "      \"nameid\": \"monero\",\n" +
                "      \"rank\": 13,\n" +
                "      \"price_usd\": \"45.35\",\n" +
                "      \"percent_change_24h\": \"-8.34\",\n" +
                "      \"percent_change_1h\": \"-1.11\",\n" +
                "      \"percent_change_7d\": \"7.22\",\n" +
                "      \"price_btc\": \"0.007359\",\n" +
                "      \"market_cap_usd\": \"778776653.93\",\n" +
                "      \"volume24\": 132528331.29665618,\n" +
                "      \"volume24a\": 166509581.07677954,\n" +
                "      \"csupply\": \"17174299.00\",\n" +
                "      \"tsupply\": \"17174299\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"257\",\n" +
                "      \"symbol\": \"ADA\",\n" +
                "      \"name\": \"Cardano\",\n" +
                "      \"nameid\": \"cardano\",\n" +
                "      \"rank\": 14,\n" +
                "      \"price_usd\": \"0.028368\",\n" +
                "      \"percent_change_24h\": \"-9.30\",\n" +
                "      \"percent_change_1h\": \"0.18\",\n" +
                "      \"percent_change_7d\": \"-7.32\",\n" +
                "      \"price_btc\": \"0.000005\",\n" +
                "      \"market_cap_usd\": \"735503858.66\",\n" +
                "      \"volume24\": 75325388.87130643,\n" +
                "      \"volume24a\": 76518521.89442977,\n" +
                "      \"csupply\": \"25927070538.00\",\n" +
                "      \"tsupply\": \"31112483745\",\n" +
                "      \"msupply\": \"45000000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"2751\",\n" +
                "      \"symbol\": \"LINK\",\n" +
                "      \"name\": \"ChainLink\",\n" +
                "      \"nameid\": \"chainlink\",\n" +
                "      \"rank\": 15,\n" +
                "      \"price_usd\": \"2.08\",\n" +
                "      \"percent_change_24h\": \"-10.77\",\n" +
                "      \"percent_change_1h\": \"-0.28\",\n" +
                "      \"percent_change_7d\": \"-14.76\",\n" +
                "      \"price_btc\": \"0.000338\",\n" +
                "      \"market_cap_usd\": \"728657994.90\",\n" +
                "      \"volume24\": 200651241.76588342,\n" +
                "      \"volume24a\": 195122006.63332328,\n" +
                "      \"csupply\": \"350000000.00\",\n" +
                "      \"tsupply\": \"1000000000\",\n" +
                "      \"msupply\": \"1000000000 \"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"2713\",\n" +
                "      \"symbol\": \"TRX\",\n" +
                "      \"name\": \"TRON\",\n" +
                "      \"nameid\": \"tron\",\n" +
                "      \"rank\": 16,\n" +
                "      \"price_usd\": \"0.010884\",\n" +
                "      \"percent_change_24h\": \"-9.30\",\n" +
                "      \"percent_change_1h\": \"-1.00\",\n" +
                "      \"percent_change_7d\": \"-8.11\",\n" +
                "      \"price_btc\": \"0.000002\",\n" +
                "      \"market_cap_usd\": \"725750856.00\",\n" +
                "      \"volume24\": 754514299.7705212,\n" +
                "      \"volume24a\": 836841889.4209474,\n" +
                "      \"csupply\": \"66682072191.00\",\n" +
                "      \"tsupply\": \"99000000000\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"8\",\n" +
                "      \"symbol\": \"DASH\",\n" +
                "      \"name\": \"Dash\",\n" +
                "      \"nameid\": \"dash\",\n" +
                "      \"rank\": 17,\n" +
                "      \"price_usd\": \"63.46\",\n" +
                "      \"percent_change_24h\": \"-8.01\",\n" +
                "      \"percent_change_1h\": \"-1.08\",\n" +
                "      \"percent_change_7d\": \"-11.83\",\n" +
                "      \"price_btc\": \"0.010298\",\n" +
                "      \"market_cap_usd\": \"596078245.09\",\n" +
                "      \"volume24\": 611993193.4614122,\n" +
                "      \"volume24a\": 511291572.8449913,\n" +
                "      \"csupply\": \"9393253.00\",\n" +
                "      \"tsupply\": \"9393253\",\n" +
                "      \"msupply\": \"18900000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"118\",\n" +
                "      \"symbol\": \"ETC\",\n" +
                "      \"name\": \"Ethereum Classic\",\n" +
                "      \"nameid\": \"ethereum-classic\",\n" +
                "      \"rank\": 18,\n" +
                "      \"price_usd\": \"4.76\",\n" +
                "      \"percent_change_24h\": \"-7.31\",\n" +
                "      \"percent_change_1h\": \"-0.66\",\n" +
                "      \"percent_change_7d\": \"-8.12\",\n" +
                "      \"price_btc\": \"0.000773\",\n" +
                "      \"market_cap_usd\": \"537863222.17\",\n" +
                "      \"volume24\": 1434847029.7860227,\n" +
                "      \"volume24a\": 1564071942.0857065,\n" +
                "      \"csupply\": \"112980348.00\",\n" +
                "      \"tsupply\": \"112980348\",\n" +
                "      \"msupply\": \"210000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"133\",\n" +
                "      \"symbol\": \"NEO\",\n" +
                "      \"name\": \"Neo\",\n" +
                "      \"nameid\": \"neo\",\n" +
                "      \"rank\": 19,\n" +
                "      \"price_usd\": \"6.28\",\n" +
                "      \"percent_change_24h\": \"-11.75\",\n" +
                "      \"percent_change_1h\": \"-2.50\",\n" +
                "      \"percent_change_7d\": \"-6.27\",\n" +
                "      \"price_btc\": \"0.001019\",\n" +
                "      \"market_cap_usd\": \"442994792.65\",\n" +
                "      \"volume24\": 369698510.6131225,\n" +
                "      \"volume24a\": 400237907.87886715,\n" +
                "      \"csupply\": \"70538831.00\",\n" +
                "      \"tsupply\": \"100000000\",\n" +
                "      \"msupply\": \"100000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"33538\",\n" +
                "      \"symbol\": \"MIN\",\n" +
                "      \"name\": \"MINDOL\",\n" +
                "      \"nameid\": \"mindol\",\n" +
                "      \"rank\": 20,\n" +
                "      \"price_usd\": \"2.81\",\n" +
                "      \"percent_change_24h\": \"40.18\",\n" +
                "      \"percent_change_1h\": \"-3.70\",\n" +
                "      \"percent_change_7d\": \"-6.04\",\n" +
                "      \"price_btc\": \"0.000456\",\n" +
                "      \"market_cap_usd\": \"436320223.16\",\n" +
                "      \"volume24\": 607568.1708110586,\n" +
                "      \"volume24a\": 433958.941699037,\n" +
                "      \"csupply\": \"155379617.00\",\n" +
                "      \"tsupply\": \"240000000\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"33285\",\n" +
                "      \"symbol\": \"USDC\",\n" +
                "      \"name\": \"USD Coin\",\n" +
                "      \"nameid\": \"usd-coin\",\n" +
                "      \"rank\": 21,\n" +
                "      \"price_usd\": \"0.999247\",\n" +
                "      \"percent_change_24h\": \"0.13\",\n" +
                "      \"percent_change_1h\": \"0.05\",\n" +
                "      \"percent_change_7d\": \"0.15\",\n" +
                "      \"price_btc\": \"0.000162\",\n" +
                "      \"market_cap_usd\": \"434704636.97\",\n" +
                "      \"volume24\": 217774730.04083124,\n" +
                "      \"volume24a\": 226690058.7115696,\n" +
                "      \"csupply\": \"435032301.00\",\n" +
                "      \"tsupply\": \"435032301\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"33819\",\n" +
                "      \"symbol\": \"CRO\",\n" +
                "      \"name\": \"Crypto.com Chain\",\n" +
                "      \"nameid\": \"crypto-com-chain\",\n" +
                "      \"rank\": 22,\n" +
                "      \"price_usd\": \"0.042218\",\n" +
                "      \"percent_change_24h\": \"-6.15\",\n" +
                "      \"percent_change_1h\": \"-0.72\",\n" +
                "      \"percent_change_7d\": \"3.05\",\n" +
                "      \"price_btc\": \"0.000007\",\n" +
                "      \"market_cap_usd\": \"391821246.63\",\n" +
                "      \"volume24\": 5125948.810042276,\n" +
                "      \"volume24a\": 5354137.3787612505,\n" +
                "      \"csupply\": \"9280821918.00\",\n" +
                "      \"tsupply\": \"100000000000\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"447\",\n" +
                "      \"symbol\": \"IOTA\",\n" +
                "      \"name\": \"IOTA\",\n" +
                "      \"nameid\": \"iota\",\n" +
                "      \"rank\": 23,\n" +
                "      \"price_usd\": \"0.133241\",\n" +
                "      \"percent_change_24h\": \"-10.31\",\n" +
                "      \"percent_change_1h\": \"-0.84\",\n" +
                "      \"percent_change_7d\": \"-10.90\",\n" +
                "      \"price_btc\": \"0.000022\",\n" +
                "      \"market_cap_usd\": \"370346085.50\",\n" +
                "      \"volume24\": 10828141.261286495,\n" +
                "      \"volume24a\": 11134380.89862502,\n" +
                "      \"csupply\": \"2779530283.00\",\n" +
                "      \"tsupply\": \"2779530283\",\n" +
                "      \"msupply\": \"2779530283\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"33830\",\n" +
                "      \"symbol\": \"ATOM\",\n" +
                "      \"name\": \"Cosmos\",\n" +
                "      \"nameid\": \"cosmos\",\n" +
                "      \"rank\": 24,\n" +
                "      \"price_usd\": \"1.91\",\n" +
                "      \"percent_change_24h\": \"-11.64\",\n" +
                "      \"percent_change_1h\": \"-1.06\",\n" +
                "      \"percent_change_7d\": \"-13.89\",\n" +
                "      \"price_btc\": \"0.000310\",\n" +
                "      \"market_cap_usd\": \"363766983.67\",\n" +
                "      \"volume24\": 114169510.82084793,\n" +
                "      \"volume24a\": 109888200.44655815,\n" +
                "      \"csupply\": \"190688439.00\",\n" +
                "      \"tsupply\": \"237928231\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"70\",\n" +
                "      \"symbol\": \"NEM\",\n" +
                "      \"name\": \"NEM\",\n" +
                "      \"nameid\": \"nem\",\n" +
                "      \"rank\": 25,\n" +
                "      \"price_usd\": \"0.036310\",\n" +
                "      \"percent_change_24h\": \"-9.05\",\n" +
                "      \"percent_change_1h\": \"-1.47\",\n" +
                "      \"percent_change_7d\": \"-9.50\",\n" +
                "      \"price_btc\": \"0.000006\",\n" +
                "      \"market_cap_usd\": \"326789042.96\",\n" +
                "      \"volume24\": 12464490.631292498,\n" +
                "      \"volume24a\": 24728046.554414846,\n" +
                "      \"csupply\": \"8999999999.00\",\n" +
                "      \"tsupply\": \"8999999999\",\n" +
                "      \"msupply\": \"8999999999\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"12377\",\n" +
                "      \"symbol\": \"MKR\",\n" +
                "      \"name\": \"Maker\",\n" +
                "      \"nameid\": \"maker\",\n" +
                "      \"rank\": 26,\n" +
                "      \"price_usd\": \"286.75\",\n" +
                "      \"percent_change_24h\": \"-12.80\",\n" +
                "      \"percent_change_1h\": \"-2.69\",\n" +
                "      \"percent_change_7d\": \"0.92\",\n" +
                "      \"price_btc\": \"0.046534\",\n" +
                "      \"market_cap_usd\": \"286751398.74\",\n" +
                "      \"volume24\": 4090026.424903683,\n" +
                "      \"volume24a\": 5079294.890719781,\n" +
                "      \"csupply\": \"1000000.00\",\n" +
                "      \"tsupply\": \"1000000\",\n" +
                "      \"msupply\": \"1000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"134\",\n" +
                "      \"symbol\": \"ZEC\",\n" +
                "      \"name\": \"Zcash\",\n" +
                "      \"nameid\": \"zcash\",\n" +
                "      \"rank\": 27,\n" +
                "      \"price_usd\": \"29.69\",\n" +
                "      \"percent_change_24h\": \"-9.02\",\n" +
                "      \"percent_change_1h\": \"-0.86\",\n" +
                "      \"percent_change_7d\": \"-14.07\",\n" +
                "      \"price_btc\": \"0.004818\",\n" +
                "      \"market_cap_usd\": \"281946103.89\",\n" +
                "      \"volume24\": 314624602.9525137,\n" +
                "      \"volume24a\": 213775694.65628758,\n" +
                "      \"csupply\": \"9496456.00\",\n" +
                "      \"tsupply\": \"9496456\",\n" +
                "      \"msupply\": \"21000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"33061\",\n" +
                "      \"symbol\": \"INB\",\n" +
                "      \"name\": \"Insight Chain\",\n" +
                "      \"nameid\": \"insight-chain\",\n" +
                "      \"rank\": 28,\n" +
                "      \"price_usd\": \"0.738400\",\n" +
                "      \"percent_change_24h\": \"-1.55\",\n" +
                "      \"percent_change_1h\": \"-0.85\",\n" +
                "      \"percent_change_7d\": \"-10.27\",\n" +
                "      \"price_btc\": \"0.000120\",\n" +
                "      \"market_cap_usd\": \"258368145.56\",\n" +
                "      \"volume24\": 12681397.793641927,\n" +
                "      \"volume24a\": 14186607.76091316,\n" +
                "      \"csupply\": \"349902689.00\",\n" +
                "      \"tsupply\": \"10000000000\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"2\",\n" +
                "      \"symbol\": \"DOGE\",\n" +
                "      \"name\": \"Dogecoin\",\n" +
                "      \"nameid\": \"dogecoin\",\n" +
                "      \"rank\": 29,\n" +
                "      \"price_usd\": \"0.001743\",\n" +
                "      \"percent_change_24h\": \"-6.60\",\n" +
                "      \"percent_change_1h\": \"-0.17\",\n" +
                "      \"percent_change_7d\": \"-6.23\",\n" +
                "      \"price_btc\": \"2.83E-7\",\n" +
                "      \"market_cap_usd\": \"215641197.63\",\n" +
                "      \"volume24\": 123979121.85495028,\n" +
                "      \"volume24a\": 126342712.86375985,\n" +
                "      \"csupply\": \"123727126384.00\",\n" +
                "      \"tsupply\": \"123727126384\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"32479\",\n" +
                "      \"symbol\": \"TUSD\",\n" +
                "      \"name\": \"TrueUSD\",\n" +
                "      \"nameid\": \"trueusd\",\n" +
                "      \"rank\": 30,\n" +
                "      \"price_usd\": \"0.997057\",\n" +
                "      \"percent_change_24h\": \"-0.03\",\n" +
                "      \"percent_change_1h\": \"0.16\",\n" +
                "      \"percent_change_7d\": \"-0.05\",\n" +
                "      \"price_btc\": \"0.000162\",\n" +
                "      \"market_cap_usd\": \"194907891.44\",\n" +
                "      \"volume24\": 517684034.4561158,\n" +
                "      \"volume24a\": 420871269.26897705,\n" +
                "      \"csupply\": \"195483256.00\",\n" +
                "      \"tsupply\": \"195483256\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"33820\",\n" +
                "      \"symbol\": \"PAX\",\n" +
                "      \"name\": \"Paxos Standard Token\",\n" +
                "      \"nameid\": \"paxos-standard-token\",\n" +
                "      \"rank\": 31,\n" +
                "      \"price_usd\": \"0.996242\",\n" +
                "      \"percent_change_24h\": \"-0.08\",\n" +
                "      \"percent_change_1h\": \"-0.13\",\n" +
                "      \"percent_change_7d\": \"-0.10\",\n" +
                "      \"price_btc\": \"0.000162\",\n" +
                "      \"market_cap_usd\": \"193636507.53\",\n" +
                "      \"volume24\": 517272463.5549146,\n" +
                "      \"volume24a\": 541508182.0471325,\n" +
                "      \"csupply\": \"194366961.00\",\n" +
                "      \"tsupply\": \"194366961\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"32331\",\n" +
                "      \"symbol\": \"ONT\",\n" +
                "      \"name\": \"Ontology\",\n" +
                "      \"nameid\": \"ontology\",\n" +
                "      \"rank\": 32,\n" +
                "      \"price_usd\": \"0.357353\",\n" +
                "      \"percent_change_24h\": \"-7.41\",\n" +
                "      \"percent_change_1h\": \"-1.34\",\n" +
                "      \"percent_change_7d\": \"-9.19\",\n" +
                "      \"price_btc\": \"0.000058\",\n" +
                "      \"market_cap_usd\": \"190641566.96\",\n" +
                "      \"volume24\": 52866914.87406101,\n" +
                "      \"volume24a\": 52152282.11156548,\n" +
                "      \"csupply\": \"533483170.00\",\n" +
                "      \"tsupply\": \"1000000000\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"184\",\n" +
                "      \"symbol\": \"BAT\",\n" +
                "      \"name\": \"Basic Attention Token\",\n" +
                "      \"nameid\": \"basic-attention-token\",\n" +
                "      \"rank\": 33,\n" +
                "      \"price_usd\": \"0.134833\",\n" +
                "      \"percent_change_24h\": \"-10.62\",\n" +
                "      \"percent_change_1h\": \"-1.60\",\n" +
                "      \"percent_change_7d\": \"-5.57\",\n" +
                "      \"price_btc\": \"0.000022\",\n" +
                "      \"market_cap_usd\": \"172482341.52\",\n" +
                "      \"volume24\": 51743454.85467639,\n" +
                "      \"volume24a\": 55305310.48810382,\n" +
                "      \"csupply\": \"1279225522.00\",\n" +
                "      \"tsupply\": \"1500000000\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"2741\",\n" +
                "      \"symbol\": \"VET\",\n" +
                "      \"name\": \"VeChain\",\n" +
                "      \"nameid\": \"vechain\",\n" +
                "      \"rank\": 34,\n" +
                "      \"price_usd\": \"0.002966\",\n" +
                "      \"percent_change_24h\": \"-15.12\",\n" +
                "      \"percent_change_1h\": \"0.22\",\n" +
                "      \"percent_change_7d\": \"0.04\",\n" +
                "      \"price_btc\": \"4.81E-7\",\n" +
                "      \"market_cap_usd\": \"164453794.21\",\n" +
                "      \"volume24\": 85989063.40818681,\n" +
                "      \"volume24a\": 100167245.11952046,\n" +
                "      \"csupply\": \"55454734800.00\",\n" +
                "      \"tsupply\": \"86712634466\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"32351\",\n" +
                "      \"symbol\": \"HT\",\n" +
                "      \"name\": \"Huobi Token\",\n" +
                "      \"nameid\": \"huobi-token\",\n" +
                "      \"rank\": 35,\n" +
                "      \"price_usd\": \"3.22\",\n" +
                "      \"percent_change_24h\": \"-5.64\",\n" +
                "      \"percent_change_1h\": \"0.04\",\n" +
                "      \"percent_change_7d\": \"-4.42\",\n" +
                "      \"price_btc\": \"0.000522\",\n" +
                "      \"market_cap_usd\": \"160950752.28\",\n" +
                "      \"volume24\": 138168048.86833593,\n" +
                "      \"volume24a\": 116217576.76572093,\n" +
                "      \"csupply\": \"50000200.00\",\n" +
                "      \"tsupply\": \"500000000\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"99\",\n" +
                "      \"symbol\": \"DCR\",\n" +
                "      \"name\": \"Decred\",\n" +
                "      \"nameid\": \"decred\",\n" +
                "      \"rank\": 36,\n" +
                "      \"price_usd\": \"10.81\",\n" +
                "      \"percent_change_24h\": \"-8.67\",\n" +
                "      \"percent_change_1h\": \"-0.70\",\n" +
                "      \"percent_change_7d\": \"-11.42\",\n" +
                "      \"price_btc\": \"0.001754\",\n" +
                "      \"market_cap_usd\": \"121652017.18\",\n" +
                "      \"volume24\": 73218093.26754557,\n" +
                "      \"volume24a\": 56786637.24450486,\n" +
                "      \"csupply\": \"11255663.00\",\n" +
                "      \"tsupply\": \"11255663\",\n" +
                "      \"msupply\": \"21000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"285\",\n" +
                "      \"symbol\": \"BTG\",\n" +
                "      \"name\": \"Bitcoin Gold\",\n" +
                "      \"nameid\": \"bitcoingold\",\n" +
                "      \"rank\": 37,\n" +
                "      \"price_usd\": \"6.97\",\n" +
                "      \"percent_change_24h\": \"-8.39\",\n" +
                "      \"percent_change_1h\": \"-0.52\",\n" +
                "      \"percent_change_7d\": \"-12.41\",\n" +
                "      \"price_btc\": \"0.001131\",\n" +
                "      \"market_cap_usd\": \"120210673.17\",\n" +
                "      \"volume24\": 16386206.75593247,\n" +
                "      \"volume24a\": 17601045.819122974,\n" +
                "      \"csupply\": \"17248611.00\",\n" +
                "      \"tsupply\": \"17348611\",\n" +
                "      \"msupply\": \"21000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"108\",\n" +
                "      \"symbol\": \"LSK\",\n" +
                "      \"name\": \"Lisk\",\n" +
                "      \"nameid\": \"lisk\",\n" +
                "      \"rank\": 38,\n" +
                "      \"price_usd\": \"0.975174\",\n" +
                "      \"percent_change_24h\": \"-5.96\",\n" +
                "      \"percent_change_1h\": \"-0.99\",\n" +
                "      \"percent_change_7d\": \"-13.68\",\n" +
                "      \"price_btc\": \"0.000158\",\n" +
                "      \"market_cap_usd\": \"116643646.39\",\n" +
                "      \"volume24\": 2542889.2698495463,\n" +
                "      \"volume24a\": 2353687.6187085346,\n" +
                "      \"csupply\": \"119613215.00\",\n" +
                "      \"tsupply\": \"125643660\",\n" +
                "      \"msupply\": \"159918400\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"237\",\n" +
                "      \"symbol\": \"QTUM\",\n" +
                "      \"name\": \"Qtum\",\n" +
                "      \"nameid\": \"qtum\",\n" +
                "      \"rank\": 39,\n" +
                "      \"price_usd\": \"1.17\",\n" +
                "      \"percent_change_24h\": \"-8.99\",\n" +
                "      \"percent_change_1h\": \"-0.74\",\n" +
                "      \"percent_change_7d\": \"-8.28\",\n" +
                "      \"price_btc\": \"0.000189\",\n" +
                "      \"market_cap_usd\": \"111916934.68\",\n" +
                "      \"volume24\": 323451056.1433947,\n" +
                "      \"volume24a\": 366753570.65985185,\n" +
                "      \"csupply\": \"95969372.00\",\n" +
                "      \"tsupply\": \"100909224\",\n" +
                "      \"msupply\": \"100909224\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"129\",\n" +
                "      \"symbol\": \"REP\",\n" +
                "      \"name\": \"Augur\",\n" +
                "      \"nameid\": \"augur\",\n" +
                "      \"rank\": 40,\n" +
                "      \"price_usd\": \"9.50\",\n" +
                "      \"percent_change_24h\": \"-7.70\",\n" +
                "      \"percent_change_1h\": \"-2.99\",\n" +
                "      \"percent_change_7d\": \"7.86\",\n" +
                "      \"price_btc\": \"0.001542\",\n" +
                "      \"market_cap_usd\": \"104554692.36\",\n" +
                "      \"volume24\": 16105616.88143678,\n" +
                "      \"volume24a\": 18641723.169016138,\n" +
                "      \"csupply\": \"11000000.00\",\n" +
                "      \"tsupply\": \"11000000\",\n" +
                "      \"msupply\": \"11000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"3708\",\n" +
                "      \"symbol\": \"ICX\",\n" +
                "      \"name\": \"ICON\",\n" +
                "      \"nameid\": \"icon\",\n" +
                "      \"rank\": 41,\n" +
                "      \"price_usd\": \"0.185327\",\n" +
                "      \"percent_change_24h\": \"-12.97\",\n" +
                "      \"percent_change_1h\": \"-2.21\",\n" +
                "      \"percent_change_7d\": \"-14.45\",\n" +
                "      \"price_btc\": \"0.000030\",\n" +
                "      \"market_cap_usd\": \"90894050.72\",\n" +
                "      \"volume24\": 15501973.532607488,\n" +
                "      \"volume24a\": 16362449.594508123,\n" +
                "      \"csupply\": \"490453303.00\",\n" +
                "      \"tsupply\": \"800460000\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"33821\",\n" +
                "      \"symbol\": \"ABBC\",\n" +
                "      \"name\": \"ABBC Coin\",\n" +
                "      \"nameid\": \"abbc-coin\",\n" +
                "      \"rank\": 42,\n" +
                "      \"price_usd\": \"0.088485\",\n" +
                "      \"percent_change_24h\": \"-9.10\",\n" +
                "      \"percent_change_1h\": \"-2.58\",\n" +
                "      \"percent_change_7d\": \"-14.35\",\n" +
                "      \"price_btc\": \"0.000014\",\n" +
                "      \"market_cap_usd\": \"88837390.53\",\n" +
                "      \"volume24\": 17870816.647889707,\n" +
                "      \"volume24a\": 21102822.92415108,\n" +
                "      \"csupply\": \"1003981087.00\",\n" +
                "      \"tsupply\": \"1003981087\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"2729\",\n" +
                "      \"symbol\": \"ZRX\",\n" +
                "      \"name\": \"0x\",\n" +
                "      \"nameid\": \"0x\",\n" +
                "      \"rank\": 43,\n" +
                "      \"price_usd\": \"0.145597\",\n" +
                "      \"percent_change_24h\": \"-9.57\",\n" +
                "      \"percent_change_1h\": \"-1.50\",\n" +
                "      \"percent_change_7d\": \"-12.20\",\n" +
                "      \"price_btc\": \"0.000024\",\n" +
                "      \"market_cap_usd\": \"87427383.61\",\n" +
                "      \"volume24\": 14106492.278504968,\n" +
                "      \"volume24a\": 13818948.232883582,\n" +
                "      \"csupply\": \"600475853.00\",\n" +
                "      \"tsupply\": \"1000000000\",\n" +
                "      \"msupply\": \"1000000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"32073\",\n" +
                "      \"symbol\": \"BCD\",\n" +
                "      \"name\": \"Bitcoin Diamond\",\n" +
                "      \"nameid\": \"bitcoin-diamond\",\n" +
                "      \"rank\": 44,\n" +
                "      \"price_usd\": \"0.449591\",\n" +
                "      \"percent_change_24h\": \"-10.05\",\n" +
                "      \"percent_change_1h\": \"0.22\",\n" +
                "      \"percent_change_7d\": \"-14.66\",\n" +
                "      \"price_btc\": \"0.000073\",\n" +
                "      \"market_cap_usd\": \"83845610.66\",\n" +
                "      \"volume24\": 5226365.309608466,\n" +
                "      \"volume24a\": 5595234.935380746,\n" +
                "      \"csupply\": \"186492898.00\",\n" +
                "      \"tsupply\": \"186492898\",\n" +
                "      \"msupply\": \"210000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"2750\",\n" +
                "      \"symbol\": \"KCS\",\n" +
                "      \"name\": \"KuCoin Shares\",\n" +
                "      \"nameid\": \"kucoin-shares\",\n" +
                "      \"rank\": 45,\n" +
                "      \"price_usd\": \"0.943472\",\n" +
                "      \"percent_change_24h\": \"-11.59\",\n" +
                "      \"percent_change_1h\": \"-1.17\",\n" +
                "      \"percent_change_7d\": \"-21.88\",\n" +
                "      \"price_btc\": \"0.000153\",\n" +
                "      \"market_cap_usd\": \"83729051.42\",\n" +
                "      \"volume24\": 7472476.54253868,\n" +
                "      \"volume24a\": 5661439.938389947,\n" +
                "      \"csupply\": \"88745681.00\",\n" +
                "      \"tsupply\": \"180730576\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"33531\",\n" +
                "      \"symbol\": \"OKB\",\n" +
                "      \"name\": \"OKB\",\n" +
                "      \"nameid\": \"okb\",\n" +
                "      \"rank\": 46,\n" +
                "      \"price_usd\": \"4.08\",\n" +
                "      \"percent_change_24h\": \"-5.92\",\n" +
                "      \"percent_change_1h\": \"0.46\",\n" +
                "      \"percent_change_7d\": \"-8.38\",\n" +
                "      \"price_btc\": \"0.000663\",\n" +
                "      \"market_cap_usd\": \"81662178.52\",\n" +
                "      \"volume24\": 218202293.09427178,\n" +
                "      \"volume24a\": 234718911.27931517,\n" +
                "      \"csupply\": \"20000000.00\",\n" +
                "      \"tsupply\": \"300000000\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"113\",\n" +
                "      \"symbol\": \"WAVES\",\n" +
                "      \"name\": \"Waves\",\n" +
                "      \"nameid\": \"waves\",\n" +
                "      \"rank\": 47,\n" +
                "      \"price_usd\": \"0.812775\",\n" +
                "      \"percent_change_24h\": \"-10.49\",\n" +
                "      \"percent_change_1h\": \"-1.57\",\n" +
                "      \"percent_change_7d\": \"-17.88\",\n" +
                "      \"price_btc\": \"0.000132\",\n" +
                "      \"market_cap_usd\": \"81277513.77\",\n" +
                "      \"volume24\": 39143359.232148886,\n" +
                "      \"volume24a\": 43101561.55164366,\n" +
                "      \"csupply\": \"100000000.00\",\n" +
                "      \"tsupply\": \"100000000\",\n" +
                "      \"msupply\": \"100000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"32417\",\n" +
                "      \"symbol\": \"DAI\",\n" +
                "      \"name\": \"Dai\",\n" +
                "      \"nameid\": \"dai\",\n" +
                "      \"rank\": 48,\n" +
                "      \"price_usd\": \"1.03\",\n" +
                "      \"percent_change_24h\": \"0.56\",\n" +
                "      \"percent_change_1h\": \"0.05\",\n" +
                "      \"percent_change_7d\": \"0.10\",\n" +
                "      \"price_btc\": \"0.000166\",\n" +
                "      \"market_cap_usd\": \"80260474.49\",\n" +
                "      \"volume24\": 11627797.580129122,\n" +
                "      \"volume24a\": 11449299.022304006,\n" +
                "      \"csupply\": \"78262606.00\",\n" +
                "      \"tsupply\": \"78262606\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"22\",\n" +
                "      \"symbol\": \"MONA\",\n" +
                "      \"name\": \"MonaCoin\",\n" +
                "      \"nameid\": \"monacoin\",\n" +
                "      \"rank\": 49,\n" +
                "      \"price_usd\": \"1.20\",\n" +
                "      \"percent_change_24h\": \"-5.50\",\n" +
                "      \"percent_change_1h\": \"-0.41\",\n" +
                "      \"percent_change_7d\": \"-7.40\",\n" +
                "      \"price_btc\": \"0.000194\",\n" +
                "      \"market_cap_usd\": \"78761808.99\",\n" +
                "      \"volume24\": 4160751.507243296,\n" +
                "      \"volume24a\": 4068152.4699380095,\n" +
                "      \"csupply\": \"65729675.00\",\n" +
                "      \"tsupply\": \"65729675\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"2515\",\n" +
                "      \"symbol\": \"KNC\",\n" +
                "      \"name\": \"Kyber Network\",\n" +
                "      \"nameid\": \"kyber-network\",\n" +
                "      \"rank\": 50,\n" +
                "      \"price_usd\": \"0.428281\",\n" +
                "      \"percent_change_24h\": \"-7.70\",\n" +
                "      \"percent_change_1h\": \"-2.83\",\n" +
                "      \"percent_change_7d\": \"-17.26\",\n" +
                "      \"price_btc\": \"0.000070\",\n" +
                "      \"market_cap_usd\": \"71893286.52\",\n" +
                "      \"volume24\": 50840483.97239817,\n" +
                "      \"volume24a\": 38233433.457539804,\n" +
                "      \"csupply\": \"167864614.00\",\n" +
                "      \"tsupply\": \"215625349\",\n" +
                "      \"msupply\": \"226000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"33723\",\n" +
                "      \"symbol\": \"SNX\",\n" +
                "      \"name\": \"Synthetix Network Token\",\n" +
                "      \"nameid\": \"synthetix-network-token\",\n" +
                "      \"rank\": 51,\n" +
                "      \"price_usd\": \"0.558421\",\n" +
                "      \"percent_change_24h\": \"-5.49\",\n" +
                "      \"percent_change_1h\": \"-0.27\",\n" +
                "      \"percent_change_7d\": \"8.15\",\n" +
                "      \"price_btc\": \"0.000091\",\n" +
                "      \"market_cap_usd\": \"70338048.48\",\n" +
                "      \"volume24\": 587085.8432112342,\n" +
                "      \"volume24a\": 801113.2847196766,\n" +
                "      \"csupply\": \"125958830.00\",\n" +
                "      \"tsupply\": \"125958830\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"211\",\n" +
                "      \"symbol\": \"MCO\",\n" +
                "      \"name\": \"Crypto.com\",\n" +
                "      \"nameid\": \"monaco\",\n" +
                "      \"rank\": 52,\n" +
                "      \"price_usd\": \"4.37\",\n" +
                "      \"percent_change_24h\": \"-11.51\",\n" +
                "      \"percent_change_1h\": \"-1.58\",\n" +
                "      \"percent_change_7d\": \"-1.05\",\n" +
                "      \"price_btc\": \"0.000710\",\n" +
                "      \"market_cap_usd\": \"69053377.75\",\n" +
                "      \"volume24\": 30538381.355403896,\n" +
                "      \"volume24a\": 34825841.78030558,\n" +
                "      \"csupply\": \"15793831.00\",\n" +
                "      \"tsupply\": \"31587682\",\n" +
                "      \"msupply\": \"31587682.3632061\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"232\",\n" +
                "      \"symbol\": \"OMG\",\n" +
                "      \"name\": \"OmiseGO\",\n" +
                "      \"nameid\": \"omisego\",\n" +
                "      \"rank\": 53,\n" +
                "      \"price_usd\": \"0.478965\",\n" +
                "      \"percent_change_24h\": \"-8.63\",\n" +
                "      \"percent_change_1h\": \"-1.81\",\n" +
                "      \"percent_change_7d\": \"-13.27\",\n" +
                "      \"price_btc\": \"0.000078\",\n" +
                "      \"market_cap_usd\": \"67172572.31\",\n" +
                "      \"volume24\": 120327538.38532871,\n" +
                "      \"volume24a\": 136771163.82923624,\n" +
                "      \"csupply\": \"140245398.00\",\n" +
                "      \"tsupply\": \"140245398\",\n" +
                "      \"msupply\": \"140245398\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"2835\",\n" +
                "      \"symbol\": \"NANO\",\n" +
                "      \"name\": \"Nano\",\n" +
                "      \"nameid\": \"nano\",\n" +
                "      \"rank\": 54,\n" +
                "      \"price_usd\": \"0.462699\",\n" +
                "      \"percent_change_24h\": \"-9.16\",\n" +
                "      \"percent_change_1h\": \"-1.47\",\n" +
                "      \"percent_change_7d\": \"-7.75\",\n" +
                "      \"price_btc\": \"0.000075\",\n" +
                "      \"market_cap_usd\": \"61653787.92\",\n" +
                "      \"volume24\": 2169316.5676566944,\n" +
                "      \"volume24a\": 2485642.4373865584,\n" +
                "      \"csupply\": \"133248297.00\",\n" +
                "      \"tsupply\": \"133248297\",\n" +
                "      \"msupply\": \"133248297\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"32386\",\n" +
                "      \"symbol\": \"RVN\",\n" +
                "      \"name\": \"Ravencoin\",\n" +
                "      \"nameid\": \"ravencoin\",\n" +
                "      \"rank\": 55,\n" +
                "      \"price_usd\": \"0.014093\",\n" +
                "      \"percent_change_24h\": \"-9.97\",\n" +
                "      \"percent_change_1h\": \"-0.74\",\n" +
                "      \"percent_change_7d\": \"-11.78\",\n" +
                "      \"price_btc\": \"0.000002\",\n" +
                "      \"market_cap_usd\": \"60268603.14\",\n" +
                "      \"volume24\": 8844207.330759194,\n" +
                "      \"volume24a\": 11483331.866103217,\n" +
                "      \"csupply\": \"4276480000.00\",\n" +
                "      \"tsupply\": \"4276480000\",\n" +
                "      \"msupply\": \"21000000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"2581\",\n" +
                "      \"symbol\": \"ENJ\",\n" +
                "      \"name\": \"Enjin Coin\",\n" +
                "      \"nameid\": \"enjin-coin\",\n" +
                "      \"rank\": 56,\n" +
                "      \"price_usd\": \"0.077516\",\n" +
                "      \"percent_change_24h\": \"-15.15\",\n" +
                "      \"percent_change_1h\": \"-2.46\",\n" +
                "      \"percent_change_7d\": \"2.80\",\n" +
                "      \"price_btc\": \"0.000013\",\n" +
                "      \"market_cap_usd\": \"60174076.41\",\n" +
                "      \"volume24\": 4762828.767793159,\n" +
                "      \"volume24a\": 11692696.080804871,\n" +
                "      \"csupply\": \"776278713.00\",\n" +
                "      \"tsupply\": \"1000000000\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"32604\",\n" +
                "      \"symbol\": \"NEXO\",\n" +
                "      \"name\": \"Nexo\",\n" +
                "      \"nameid\": \"nexo\",\n" +
                "      \"rank\": 57,\n" +
                "      \"price_usd\": \"0.101645\",\n" +
                "      \"percent_change_24h\": \"-6.10\",\n" +
                "      \"percent_change_1h\": \"-0.15\",\n" +
                "      \"percent_change_7d\": \"-12.77\",\n" +
                "      \"price_btc\": \"0.000016\",\n" +
                "      \"market_cap_usd\": \"56921309.68\",\n" +
                "      \"volume24\": 9512673.192083487,\n" +
                "      \"volume24a\": 9856705.023092391,\n" +
                "      \"csupply\": \"560000011.00\",\n" +
                "      \"tsupply\": \"1000000000\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"2482\",\n" +
                "      \"symbol\": \"BTM\",\n" +
                "      \"name\": \"Bytom\",\n" +
                "      \"nameid\": \"bytom\",\n" +
                "      \"rank\": 58,\n" +
                "      \"price_usd\": \"0.056403\",\n" +
                "      \"percent_change_24h\": \"-7.67\",\n" +
                "      \"percent_change_1h\": \"-0.42\",\n" +
                "      \"percent_change_7d\": \"-2.08\",\n" +
                "      \"price_btc\": \"0.000009\",\n" +
                "      \"market_cap_usd\": \"56543796.11\",\n" +
                "      \"volume24\": 130073494.49752603,\n" +
                "      \"volume24a\": 162764734.49870262,\n" +
                "      \"csupply\": \"1002499275.00\",\n" +
                "      \"tsupply\": \"1407000000\",\n" +
                "      \"msupply\": \"1407000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"33071\",\n" +
                "      \"symbol\": \"DX\",\n" +
                "      \"name\": \"DxChain Token\",\n" +
                "      \"nameid\": \"dxchain-token\",\n" +
                "      \"rank\": 59,\n" +
                "      \"price_usd\": \"0.001179\",\n" +
                "      \"percent_change_24h\": \"-7.73\",\n" +
                "      \"percent_change_1h\": \"-1.99\",\n" +
                "      \"percent_change_7d\": \"-11.95\",\n" +
                "      \"price_btc\": \"1.91E-7\",\n" +
                "      \"market_cap_usd\": \"54519769.08\",\n" +
                "      \"volume24\": 974771.0612724575,\n" +
                "      \"volume24a\": 1350593.5310140173,\n" +
                "      \"csupply\": \"46250000000.00\",\n" +
                "      \"tsupply\": \"100000000000\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"43\",\n" +
                "      \"symbol\": \"DGB\",\n" +
                "      \"name\": \"Digibyte\",\n" +
                "      \"nameid\": \"digibyte\",\n" +
                "      \"rank\": 60,\n" +
                "      \"price_usd\": \"0.004120\",\n" +
                "      \"percent_change_24h\": \"1.55\",\n" +
                "      \"percent_change_1h\": \"-0.96\",\n" +
                "      \"percent_change_7d\": \"4.83\",\n" +
                "      \"price_btc\": \"6.69E-7\",\n" +
                "      \"market_cap_usd\": \"53350782.18\",\n" +
                "      \"volume24\": 928925.2072918187,\n" +
                "      \"volume24a\": 1097133.892718687,\n" +
                "      \"csupply\": \"12950710845.00\",\n" +
                "      \"tsupply\": \"12950710845\",\n" +
                "      \"msupply\": \"21000000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"106\",\n" +
                "      \"symbol\": \"STEEM\",\n" +
                "      \"name\": \"STEEM\",\n" +
                "      \"nameid\": \"steem\",\n" +
                "      \"rank\": 61,\n" +
                "      \"price_usd\": \"0.153217\",\n" +
                "      \"percent_change_24h\": \"-13.36\",\n" +
                "      \"percent_change_1h\": \"-0.55\",\n" +
                "      \"percent_change_7d\": \"-29.78\",\n" +
                "      \"price_btc\": \"0.000025\",\n" +
                "      \"market_cap_usd\": \"52454812.86\",\n" +
                "      \"volume24\": 2767972.9708042503,\n" +
                "      \"volume24a\": 2561153.3979826737,\n" +
                "      \"csupply\": \"342356149.00\",\n" +
                "      \"tsupply\": \"342356149\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"183\",\n" +
                "      \"symbol\": \"SC\",\n" +
                "      \"name\": \"Siacoin\",\n" +
                "      \"nameid\": \"siacoin\",\n" +
                "      \"rank\": 62,\n" +
                "      \"price_usd\": \"0.001219\",\n" +
                "      \"percent_change_24h\": \"-8.79\",\n" +
                "      \"percent_change_1h\": \"-0.70\",\n" +
                "      \"percent_change_7d\": \"-7.76\",\n" +
                "      \"price_btc\": \"1.98E-7\",\n" +
                "      \"market_cap_usd\": \"50954861.80\",\n" +
                "      \"volume24\": 2278420.56984181,\n" +
                "      \"volume24a\": 2307680.3953771545,\n" +
                "      \"csupply\": \"41817047634.00\",\n" +
                "      \"tsupply\": \"41817047634\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"207\",\n" +
                "      \"symbol\": \"SNT\",\n" +
                "      \"name\": \"Status Network Token\",\n" +
                "      \"nameid\": \"status\",\n" +
                "      \"rank\": 63,\n" +
                "      \"price_usd\": \"0.014388\",\n" +
                "      \"percent_change_24h\": \"-16.71\",\n" +
                "      \"percent_change_1h\": \"-1.47\",\n" +
                "      \"percent_change_7d\": \"-3.79\",\n" +
                "      \"price_btc\": \"0.000002\",\n" +
                "      \"market_cap_usd\": \"49932343.79\",\n" +
                "      \"volume24\": 30942633.733267125,\n" +
                "      \"volume24a\": 38654408.00470497,\n" +
                "      \"csupply\": \"3470483788.00\",\n" +
                "      \"tsupply\": \"6804870174\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"111\",\n" +
                "      \"symbol\": \"DGD\",\n" +
                "      \"name\": \"DigixDAO\",\n" +
                "      \"nameid\": \"digixdao\",\n" +
                "      \"rank\": 64,\n" +
                "      \"price_usd\": \"24.40\",\n" +
                "      \"percent_change_24h\": \"-9.04\",\n" +
                "      \"percent_change_1h\": \"-1.27\",\n" +
                "      \"percent_change_7d\": \"-7.73\",\n" +
                "      \"price_btc\": \"0.003960\",\n" +
                "      \"market_cap_usd\": \"48802945.06\",\n" +
                "      \"volume24\": 906248.6144435138,\n" +
                "      \"volume24a\": 1180741.1757201706,\n" +
                "      \"csupply\": \"2000000.00\",\n" +
                "      \"tsupply\": \"2000000\",\n" +
                "      \"msupply\": \"2000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"32360\",\n" +
                "      \"symbol\": \"THETA\",\n" +
                "      \"name\": \"Theta Token\",\n" +
                "      \"nameid\": \"theta-token\",\n" +
                "      \"rank\": 65,\n" +
                "      \"price_usd\": \"0.067948\",\n" +
                "      \"percent_change_24h\": \"-11.08\",\n" +
                "      \"percent_change_1h\": \"-2.43\",\n" +
                "      \"percent_change_7d\": \"-8.91\",\n" +
                "      \"price_btc\": \"0.000011\",\n" +
                "      \"market_cap_usd\": \"48005255.65\",\n" +
                "      \"volume24\": 3414210.349173438,\n" +
                "      \"volume24a\": 3611841.5779340975,\n" +
                "      \"csupply\": \"706502689.00\",\n" +
                "      \"tsupply\": \"1000000000\",\n" +
                "      \"msupply\": null\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"33391\",\n" +
                "      \"symbol\": \"BTT\",\n" +
                "      \"name\": \"BitTorrent\",\n" +
                "      \"nameid\": \"bittorrent\",\n" +
                "      \"rank\": 66,\n" +
                "      \"price_usd\": \"0.000211\",\n" +
                "      \"percent_change_24h\": \"-5.88\",\n" +
                "      \"percent_change_1h\": \"-0.30\",\n" +
                "      \"percent_change_7d\": \"-11.77\",\n" +
                "      \"price_btc\": \"3.42E-8\",\n" +
                "      \"market_cap_usd\": \"44654858.62\",\n" +
                "      \"volume24\": 4513573.14539149,\n" +
                "      \"volume24a\": 3229103.737795371,\n" +
                "      \"csupply\": \"212116500000.00\",\n" +
                "      \"tsupply\": \"990000000000\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"54\",\n" +
                "      \"symbol\": \"BTS\",\n" +
                "      \"name\": \"BitShares\",\n" +
                "      \"nameid\": \"bitshares\",\n" +
                "      \"rank\": 67,\n" +
                "      \"price_usd\": \"0.015258\",\n" +
                "      \"percent_change_24h\": \"-8.37\",\n" +
                "      \"percent_change_1h\": \"-0.80\",\n" +
                "      \"percent_change_7d\": \"-12.72\",\n" +
                "      \"price_btc\": \"0.000002\",\n" +
                "      \"market_cap_usd\": \"41820495.53\",\n" +
                "      \"volume24\": 3721540.070656786,\n" +
                "      \"volume24a\": 2707239.3368128645,\n" +
                "      \"csupply\": \"2740910000.00\",\n" +
                "      \"tsupply\": \"2740910000\",\n" +
                "      \"msupply\": \"3600570502\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"32686\",\n" +
                "      \"symbol\": \"HOT\",\n" +
                "      \"name\": \"Holo\",\n" +
                "      \"nameid\": \"holo\",\n" +
                "      \"rank\": 68,\n" +
                "      \"price_usd\": \"0.000302\",\n" +
                "      \"percent_change_24h\": \"-8.38\",\n" +
                "      \"percent_change_1h\": \"-1.98\",\n" +
                "      \"percent_change_7d\": \"-11.93\",\n" +
                "      \"price_btc\": \"4.90E-8\",\n" +
                "      \"market_cap_usd\": \"40234142.49\",\n" +
                "      \"volume24\": 2831419.6266823183,\n" +
                "      \"volume24a\": 2832869.3121255212,\n" +
                "      \"csupply\": \"133214575156.00\",\n" +
                "      \"tsupply\": \"177619433541\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"33228\",\n" +
                "      \"symbol\": \"HC\",\n" +
                "      \"name\": \"HyperCash\",\n" +
                "      \"nameid\": \"hypercash\",\n" +
                "      \"rank\": 69,\n" +
                "      \"price_usd\": \"0.914054\",\n" +
                "      \"percent_change_24h\": \"-9.50\",\n" +
                "      \"percent_change_1h\": \"-0.85\",\n" +
                "      \"percent_change_7d\": \"-13.97\",\n" +
                "      \"price_btc\": \"0.000148\",\n" +
                "      \"market_cap_usd\": \"39788585.39\",\n" +
                "      \"volume24\": 1118830.1391436404,\n" +
                "      \"volume24a\": 1035050.3551970542,\n" +
                "      \"csupply\": \"43529781.00\",\n" +
                "      \"tsupply\": \"43529781\",\n" +
                "      \"msupply\": \"84000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"139\",\n" +
                "      \"symbol\": \"KMD\",\n" +
                "      \"name\": \"Komodo\",\n" +
                "      \"nameid\": \"komodo\",\n" +
                "      \"rank\": 70,\n" +
                "      \"price_usd\": \"0.340131\",\n" +
                "      \"percent_change_24h\": \"-14.10\",\n" +
                "      \"percent_change_1h\": \"-1.01\",\n" +
                "      \"percent_change_7d\": \"-14.51\",\n" +
                "      \"price_btc\": \"0.000055\",\n" +
                "      \"market_cap_usd\": \"39333543.11\",\n" +
                "      \"volume24\": 1248680.0596397847,\n" +
                "      \"volume24a\": 1417120.661255516,\n" +
                "      \"csupply\": \"115642437.00\",\n" +
                "      \"tsupply\": \"115642437\",\n" +
                "      \"msupply\": \"200000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"34406\",\n" +
                "      \"symbol\": \"ALGO\",\n" +
                "      \"name\": \"Algorand\",\n" +
                "      \"nameid\": \"algorand\",\n" +
                "      \"rank\": 71,\n" +
                "      \"price_usd\": \"0.148569\",\n" +
                "      \"percent_change_24h\": \"-9.21\",\n" +
                "      \"percent_change_1h\": \"-1.30\",\n" +
                "      \"percent_change_7d\": \"-12.11\",\n" +
                "      \"price_btc\": \"0.000024\",\n" +
                "      \"market_cap_usd\": \"38517547.09\",\n" +
                "      \"volume24\": 46756006.10529602,\n" +
                "      \"volume24a\": 46727006.703353405,\n" +
                "      \"csupply\": \"259256762.00\",\n" +
                "      \"tsupply\": \"2588969743\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"33535\",\n" +
                "      \"symbol\": \"VSYS\",\n" +
                "      \"name\": \"V Systems\",\n" +
                "      \"nameid\": \"v-systems\",\n" +
                "      \"rank\": 72,\n" +
                "      \"price_usd\": \"0.021228\",\n" +
                "      \"percent_change_24h\": \"-12.62\",\n" +
                "      \"percent_change_1h\": \"-2.02\",\n" +
                "      \"percent_change_7d\": \"-10.47\",\n" +
                "      \"price_btc\": \"0.000003\",\n" +
                "      \"market_cap_usd\": \"37972667.36\",\n" +
                "      \"volume24\": 3482908.1773249176,\n" +
                "      \"volume24a\": 3765767.3476206358,\n" +
                "      \"csupply\": \"1788818695.00\",\n" +
                "      \"tsupply\": \"5217805440\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"102\",\n" +
                "      \"symbol\": \"XVG\",\n" +
                "      \"name\": \"Verge\",\n" +
                "      \"nameid\": \"verge\",\n" +
                "      \"rank\": 73,\n" +
                "      \"price_usd\": \"0.002309\",\n" +
                "      \"percent_change_24h\": \"-9.35\",\n" +
                "      \"percent_change_1h\": \"-1.25\",\n" +
                "      \"percent_change_7d\": \"-8.13\",\n" +
                "      \"price_btc\": \"3.75E-7\",\n" +
                "      \"market_cap_usd\": \"36711298.83\",\n" +
                "      \"volume24\": 434963.24109974323,\n" +
                "      \"volume24a\": 500854.4798211733,\n" +
                "      \"csupply\": \"15900663549.00\",\n" +
                "      \"tsupply\": \"15900663549\",\n" +
                "      \"msupply\": \"16555000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"33085\",\n" +
                "      \"symbol\": \"QNT\",\n" +
                "      \"name\": \"Quant\",\n" +
                "      \"nameid\": \"quant\",\n" +
                "      \"rank\": 74,\n" +
                "      \"price_usd\": \"3.03\",\n" +
                "      \"percent_change_24h\": \"-2.83\",\n" +
                "      \"percent_change_1h\": \"-3.98\",\n" +
                "      \"percent_change_7d\": \"29.80\",\n" +
                "      \"price_btc\": \"0.000492\",\n" +
                "      \"market_cap_usd\": \"36592373.51\",\n" +
                "      \"volume24\": 2795506.62661273,\n" +
                "      \"volume24a\": 2703276.9380525467,\n" +
                "      \"csupply\": \"12072738.00\",\n" +
                "      \"tsupply\": \"45467000\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"33529\",\n" +
                "      \"symbol\": \"ZB\",\n" +
                "      \"name\": \"ZB\",\n" +
                "      \"nameid\": \"zb\",\n" +
                "      \"rank\": 75,\n" +
                "      \"price_usd\": \"0.221808\",\n" +
                "      \"percent_change_24h\": \"-5.35\",\n" +
                "      \"percent_change_1h\": \"-0.92\",\n" +
                "      \"percent_change_7d\": \"-8.89\",\n" +
                "      \"price_btc\": \"0.000036\",\n" +
                "      \"market_cap_usd\": \"36198757.19\",\n" +
                "      \"volume24\": 37850199.33422853,\n" +
                "      \"volume24a\": 35949626.662343994,\n" +
                "      \"csupply\": \"163198810.00\",\n" +
                "      \"tsupply\": \"2100000000\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"186\",\n" +
                "      \"symbol\": \"ZEN\",\n" +
                "      \"name\": \"Horizen\",\n" +
                "      \"nameid\": \"zencash\",\n" +
                "      \"rank\": 76,\n" +
                "      \"price_usd\": \"4.99\",\n" +
                "      \"percent_change_24h\": \"-10.89\",\n" +
                "      \"percent_change_1h\": \"-0.89\",\n" +
                "      \"percent_change_7d\": \"-13.76\",\n" +
                "      \"price_btc\": \"0.000810\",\n" +
                "      \"market_cap_usd\": \"35868116.82\",\n" +
                "      \"volume24\": 1259070.4379421186,\n" +
                "      \"volume24a\": 1032727.9937076006,\n" +
                "      \"csupply\": \"7185725.00\",\n" +
                "      \"tsupply\": \"7185725\",\n" +
                "      \"msupply\": \"21000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"32229\",\n" +
                "      \"symbol\": \"IOST\",\n" +
                "      \"name\": \"IOStoken\",\n" +
                "      \"nameid\": \"iostoken\",\n" +
                "      \"rank\": 77,\n" +
                "      \"price_usd\": \"0.002846\",\n" +
                "      \"percent_change_24h\": \"-13.01\",\n" +
                "      \"percent_change_1h\": \"-0.98\",\n" +
                "      \"percent_change_7d\": \"-14.89\",\n" +
                "      \"price_btc\": \"4.62E-7\",\n" +
                "      \"market_cap_usd\": \"34187487.59\",\n" +
                "      \"volume24\": 24745549.94222084,\n" +
                "      \"volume24a\": 24075719.82106558,\n" +
                "      \"csupply\": \"12013965609.00\",\n" +
                "      \"tsupply\": \"21000000000\",\n" +
                "      \"msupply\": \"21000000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"32764\",\n" +
                "      \"symbol\": \"SEELE\",\n" +
                "      \"name\": \"Seele\",\n" +
                "      \"nameid\": \"seele\",\n" +
                "      \"rank\": 78,\n" +
                "      \"price_usd\": \"0.047331\",\n" +
                "      \"percent_change_24h\": \"-6.23\",\n" +
                "      \"percent_change_1h\": \"-1.55\",\n" +
                "      \"percent_change_7d\": \"-7.20\",\n" +
                "      \"price_btc\": \"0.000008\",\n" +
                "      \"market_cap_usd\": \"32789792.83\",\n" +
                "      \"volume24\": 11391460.468471099,\n" +
                "      \"volume24a\": 11535611.16897282,\n" +
                "      \"csupply\": \"692776387.00\",\n" +
                "      \"tsupply\": \"1000000000\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"131\",\n" +
                "      \"symbol\": \"ARDR\",\n" +
                "      \"name\": \"Ardor\",\n" +
                "      \"nameid\": \"ardor\",\n" +
                "      \"rank\": 79,\n" +
                "      \"price_usd\": \"0.031286\",\n" +
                "      \"percent_change_24h\": \"-8.91\",\n" +
                "      \"percent_change_1h\": \"-1.57\",\n" +
                "      \"percent_change_7d\": \"-13.17\",\n" +
                "      \"price_btc\": \"0.000005\",\n" +
                "      \"market_cap_usd\": \"31254246.78\",\n" +
                "      \"volume24\": 639882.7702473872,\n" +
                "      \"volume24a\": 1327791.4237670603,\n" +
                "      \"csupply\": \"998999495.00\",\n" +
                "      \"tsupply\": \"998999495\",\n" +
                "      \"msupply\": \"998999495\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"32334\",\n" +
                "      \"symbol\": \"ZIL\",\n" +
                "      \"name\": \"Zilliqa\",\n" +
                "      \"nameid\": \"zilliqa\",\n" +
                "      \"rank\": 80,\n" +
                "      \"price_usd\": \"0.003593\",\n" +
                "      \"percent_change_24h\": \"-8.79\",\n" +
                "      \"percent_change_1h\": \"-1.39\",\n" +
                "      \"percent_change_7d\": \"-13.96\",\n" +
                "      \"price_btc\": \"5.83E-7\",\n" +
                "      \"market_cap_usd\": \"31212904.34\",\n" +
                "      \"volume24\": 7822920.684345206,\n" +
                "      \"volume24a\": 7991487.774189887,\n" +
                "      \"csupply\": \"8687360058.00\",\n" +
                "      \"tsupply\": \"12600000000\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"156\",\n" +
                "      \"symbol\": \"GNT\",\n" +
                "      \"name\": \"Golem\",\n" +
                "      \"nameid\": \"golem-network-tokens\",\n" +
                "      \"rank\": 81,\n" +
                "      \"price_usd\": \"0.031918\",\n" +
                "      \"percent_change_24h\": \"-8.88\",\n" +
                "      \"percent_change_1h\": \"-1.33\",\n" +
                "      \"percent_change_7d\": \"-13.88\",\n" +
                "      \"price_btc\": \"0.000005\",\n" +
                "      \"market_cap_usd\": \"30783542.72\",\n" +
                "      \"volume24\": 2382264.1402708176,\n" +
                "      \"volume24a\": 2552275.551649345,\n" +
                "      \"csupply\": \"964450000.00\",\n" +
                "      \"tsupply\": \"1000000000\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"32226\",\n" +
                "      \"symbol\": \"ELF\",\n" +
                "      \"name\": \"aelf\",\n" +
                "      \"nameid\": \"aelf\",\n" +
                "      \"rank\": 82,\n" +
                "      \"price_usd\": \"0.056007\",\n" +
                "      \"percent_change_24h\": \"-4.82\",\n" +
                "      \"percent_change_1h\": \"-1.90\",\n" +
                "      \"percent_change_7d\": \"-6.16\",\n" +
                "      \"price_btc\": \"0.000009\",\n" +
                "      \"market_cap_usd\": \"27991156.81\",\n" +
                "      \"volume24\": 51148328.183298625,\n" +
                "      \"volume24a\": 27497063.927193865,\n" +
                "      \"csupply\": \"499780000.00\",\n" +
                "      \"tsupply\": \"499780000\",\n" +
                "      \"msupply\": \"1000000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"32238\",\n" +
                "      \"symbol\": \"WAX\",\n" +
                "      \"name\": \"WAX\",\n" +
                "      \"nameid\": \"wax\",\n" +
                "      \"rank\": 83,\n" +
                "      \"price_usd\": \"0.028469\",\n" +
                "      \"percent_change_24h\": \"-9.49\",\n" +
                "      \"percent_change_1h\": \"-2.32\",\n" +
                "      \"percent_change_7d\": \"-24.53\",\n" +
                "      \"price_btc\": \"0.000005\",\n" +
                "      \"market_cap_usd\": \"26841315.40\",\n" +
                "      \"volume24\": 97181.77613674405,\n" +
                "      \"volume24a\": 109987.39087495177,\n" +
                "      \"csupply\": \"942821662.00\",\n" +
                "      \"tsupply\": \"1850000000\",\n" +
                "      \"msupply\": \"1850000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"32338\",\n" +
                "      \"symbol\": \"WICC\",\n" +
                "      \"name\": \"WaykiChain\",\n" +
                "      \"nameid\": \"waykichain\",\n" +
                "      \"rank\": 84,\n" +
                "      \"price_usd\": \"0.136940\",\n" +
                "      \"percent_change_24h\": \"-10.40\",\n" +
                "      \"percent_change_1h\": \"-2.27\",\n" +
                "      \"percent_change_7d\": \"-13.46\",\n" +
                "      \"price_btc\": \"0.000022\",\n" +
                "      \"market_cap_usd\": \"25881705.95\",\n" +
                "      \"volume24\": 1119075.4336406193,\n" +
                "      \"volume24a\": 841180.3321775594,\n" +
                "      \"csupply\": \"189000000.00\",\n" +
                "      \"tsupply\": \"210000000\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"2731\",\n" +
                "      \"symbol\": \"AE\",\n" +
                "      \"name\": \"Aeternity\",\n" +
                "      \"nameid\": \"aeternity\",\n" +
                "      \"rank\": 85,\n" +
                "      \"price_usd\": \"0.092221\",\n" +
                "      \"percent_change_24h\": \"-8.96\",\n" +
                "      \"percent_change_1h\": \"-0.86\",\n" +
                "      \"percent_change_7d\": \"-13.56\",\n" +
                "      \"price_btc\": \"0.000015\",\n" +
                "      \"market_cap_usd\": \"25852708.03\",\n" +
                "      \"volume24\": 7244103.798607459,\n" +
                "      \"volume24a\": 7285153.541815417,\n" +
                "      \"csupply\": \"280333087.00\",\n" +
                "      \"tsupply\": \"280333087\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"32342\",\n" +
                "      \"symbol\": \"NPXS\",\n" +
                "      \"name\": \"Pundi X\",\n" +
                "      \"nameid\": \"pundi-x\",\n" +
                "      \"rank\": 86,\n" +
                "      \"price_usd\": \"0.000106\",\n" +
                "      \"percent_change_24h\": \"-7.70\",\n" +
                "      \"percent_change_1h\": \"-0.89\",\n" +
                "      \"percent_change_7d\": \"-8.61\",\n" +
                "      \"price_btc\": \"1.73E-8\",\n" +
                "      \"market_cap_usd\": \"25020395.33\",\n" +
                "      \"volume24\": 856991.4198935055,\n" +
                "      \"volume24a\": 833036.0565352554,\n" +
                "      \"csupply\": \"235171468515.00\",\n" +
                "      \"tsupply\": \"280255193861\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"95\",\n" +
                "      \"symbol\": \"MAID\",\n" +
                "      \"name\": \"MaidSafeCoin\",\n" +
                "      \"nameid\": \"maidsafecoin\",\n" +
                "      \"rank\": 87,\n" +
                "      \"price_usd\": \"0.054316\",\n" +
                "      \"percent_change_24h\": \"-9.09\",\n" +
                "      \"percent_change_1h\": \"-0.81\",\n" +
                "      \"percent_change_7d\": \"-4.29\",\n" +
                "      \"price_btc\": \"0.000009\",\n" +
                "      \"market_cap_usd\": \"24581016.64\",\n" +
                "      \"volume24\": 97664.46327781421,\n" +
                "      \"volume24a\": 148758.25524248707,\n" +
                "      \"csupply\": \"452552412.00\",\n" +
                "      \"tsupply\": \"452552412\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"258\",\n" +
                "      \"symbol\": \"MANA\",\n" +
                "      \"name\": \"Decentraland\",\n" +
                "      \"nameid\": \"decentraland\",\n" +
                "      \"rank\": 88,\n" +
                "      \"price_usd\": \"0.023240\",\n" +
                "      \"percent_change_24h\": \"-9.25\",\n" +
                "      \"percent_change_1h\": \"-2.28\",\n" +
                "      \"percent_change_7d\": \"-10.90\",\n" +
                "      \"price_btc\": \"0.000004\",\n" +
                "      \"market_cap_usd\": \"24405532.57\",\n" +
                "      \"volume24\": 18618669.364966452,\n" +
                "      \"volume24a\": 16113627.82549841,\n" +
                "      \"csupply\": \"1050141509.00\",\n" +
                "      \"tsupply\": \"2644403343\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"2732\",\n" +
                "      \"symbol\": \"GXS\",\n" +
                "      \"name\": \"GXChain\",\n" +
                "      \"nameid\": \"gxchain\",\n" +
                "      \"rank\": 89,\n" +
                "      \"price_usd\": \"0.370416\",\n" +
                "      \"percent_change_24h\": \"-11.81\",\n" +
                "      \"percent_change_1h\": \"-0.66\",\n" +
                "      \"percent_change_7d\": \"15.01\",\n" +
                "      \"price_btc\": \"0.000060\",\n" +
                "      \"market_cap_usd\": \"24077040.56\",\n" +
                "      \"volume24\": 422646.4684007461,\n" +
                "      \"volume24a\": 2106371.5029613487,\n" +
                "      \"csupply\": \"65000000.00\",\n" +
                "      \"tsupply\": \"100000000\",\n" +
                "      \"msupply\": \"100000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"264\",\n" +
                "      \"symbol\": \"RCN\",\n" +
                "      \"name\": \"Ripio Credit Network\",\n" +
                "      \"nameid\": \"ripiocreditnetwork\",\n" +
                "      \"rank\": 90,\n" +
                "      \"price_usd\": \"0.048294\",\n" +
                "      \"percent_change_24h\": \"-10.28\",\n" +
                "      \"percent_change_1h\": \"-2.57\",\n" +
                "      \"percent_change_7d\": \"9.05\",\n" +
                "      \"price_btc\": \"0.000008\",\n" +
                "      \"market_cap_usd\": \"23824984.21\",\n" +
                "      \"volume24\": 375765.96009014314,\n" +
                "      \"volume24a\": 507634.87589163764,\n" +
                "      \"csupply\": \"493330791.00\",\n" +
                "      \"tsupply\": \"999942647\",\n" +
                "      \"msupply\": \"1000000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"32390\",\n" +
                "      \"symbol\": \"REN\",\n" +
                "      \"name\": \"Republic Protocol\",\n" +
                "      \"nameid\": \"republic-protocol\",\n" +
                "      \"rank\": 91,\n" +
                "      \"price_usd\": \"0.040135\",\n" +
                "      \"percent_change_24h\": \"-15.94\",\n" +
                "      \"percent_change_1h\": \"-3.13\",\n" +
                "      \"percent_change_7d\": \"-9.76\",\n" +
                "      \"price_btc\": \"0.000007\",\n" +
                "      \"market_cap_usd\": \"23609651.89\",\n" +
                "      \"volume24\": 1767958.0747392161,\n" +
                "      \"volume24a\": 2673832.256120374,\n" +
                "      \"csupply\": \"588261205.00\",\n" +
                "      \"tsupply\": \"1000000000\",\n" +
                "      \"msupply\": null\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"36419\",\n" +
                "      \"symbol\": \"CVCC\",\n" +
                "      \"name\": \"CryptoVerificationCoin\",\n" +
                "      \"nameid\": \"cryptoverificationcoin\",\n" +
                "      \"rank\": 92,\n" +
                "      \"price_usd\": \"19.97\",\n" +
                "      \"percent_change_24h\": \"-8.80\",\n" +
                "      \"percent_change_1h\": \"-6.54\",\n" +
                "      \"percent_change_7d\": \"-11.10\",\n" +
                "      \"price_btc\": \"0.003240\",\n" +
                "      \"market_cap_usd\": \"23017741.99\",\n" +
                "      \"volume24\": 64100.92900025744,\n" +
                "      \"volume24a\": 0,\n" +
                "      \"csupply\": \"1152727.00\",\n" +
                "      \"tsupply\": \"1152727\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"2765\",\n" +
                "      \"symbol\": \"DATA\",\n" +
                "      \"name\": \"Streamr DATAcoin\",\n" +
                "      \"nameid\": \"streamr-datacoin\",\n" +
                "      \"rank\": 93,\n" +
                "      \"price_usd\": \"0.033911\",\n" +
                "      \"percent_change_24h\": \"-18.60\",\n" +
                "      \"percent_change_1h\": \"-4.59\",\n" +
                "      \"percent_change_7d\": \"12.94\",\n" +
                "      \"price_btc\": \"0.000006\",\n" +
                "      \"market_cap_usd\": \"22962731.49\",\n" +
                "      \"volume24\": 2480807.9077289156,\n" +
                "      \"volume24a\": 8713054.721608078,\n" +
                "      \"csupply\": \"677154514.00\",\n" +
                "      \"tsupply\": \"987154514\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"166\",\n" +
                "      \"symbol\": \"RLC\",\n" +
                "      \"name\": \"iExec RLC\",\n" +
                "      \"nameid\": \"rlc\",\n" +
                "      \"rank\": 94,\n" +
                "      \"price_usd\": \"0.285480\",\n" +
                "      \"percent_change_24h\": \"-2.88\",\n" +
                "      \"percent_change_1h\": \"-3.30\",\n" +
                "      \"percent_change_7d\": \"-4.27\",\n" +
                "      \"price_btc\": \"0.000046\",\n" +
                "      \"market_cap_usd\": \"22858574.48\",\n" +
                "      \"volume24\": 2795850.1105359783,\n" +
                "      \"volume24a\": 137339.09357410562,\n" +
                "      \"csupply\": \"80070793.00\",\n" +
                "      \"tsupply\": \"86999785\",\n" +
                "      \"msupply\": \" 87000000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"2781\",\n" +
                "      \"symbol\": \"LRC\",\n" +
                "      \"name\": \"Loopring\",\n" +
                "      \"nameid\": \"loopring\",\n" +
                "      \"rank\": 95,\n" +
                "      \"price_usd\": \"0.025411\",\n" +
                "      \"percent_change_24h\": \"-9.22\",\n" +
                "      \"percent_change_1h\": \"-1.56\",\n" +
                "      \"percent_change_7d\": \"-17.98\",\n" +
                "      \"price_btc\": \"0.000004\",\n" +
                "      \"market_cap_usd\": \"22826599.82\",\n" +
                "      \"volume24\": 2790989.608491414,\n" +
                "      \"volume24a\": 2494404.362592482,\n" +
                "      \"csupply\": \"898304697.00\",\n" +
                "      \"tsupply\": \"1374956262\",\n" +
                "      \"msupply\": \"1395076055\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"120\",\n" +
                "      \"symbol\": \"STRAT\",\n" +
                "      \"name\": \"Stratis\",\n" +
                "      \"nameid\": \"stratis\",\n" +
                "      \"rank\": 96,\n" +
                "      \"price_usd\": \"0.227421\",\n" +
                "      \"percent_change_24h\": \"-12.84\",\n" +
                "      \"percent_change_1h\": \"-0.95\",\n" +
                "      \"percent_change_7d\": \"-16.42\",\n" +
                "      \"price_btc\": \"0.000037\",\n" +
                "      \"market_cap_usd\": \"22680454.03\",\n" +
                "      \"volume24\": 492311.3934152141,\n" +
                "      \"volume24a\": 490460.2735109426,\n" +
                "      \"csupply\": \"99729045.00\",\n" +
                "      \"tsupply\": \"99729045\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"132\",\n" +
                "      \"symbol\": \"XZC\",\n" +
                "      \"name\": \"ZCoin\",\n" +
                "      \"nameid\": \"zcoin\",\n" +
                "      \"rank\": 97,\n" +
                "      \"price_usd\": \"3.01\",\n" +
                "      \"percent_change_24h\": \"-9.34\",\n" +
                "      \"percent_change_1h\": \"-2.49\",\n" +
                "      \"percent_change_7d\": \"-17.03\",\n" +
                "      \"price_btc\": \"0.000488\",\n" +
                "      \"market_cap_usd\": \"22657897.63\",\n" +
                "      \"volume24\": 30364661.256895594,\n" +
                "      \"volume24a\": 28948804.1962689,\n" +
                "      \"csupply\": \"7529868.00\",\n" +
                "      \"tsupply\": \"7529868\",\n" +
                "      \"msupply\": \"21400000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"33536\",\n" +
                "      \"symbol\": \"MATIC\",\n" +
                "      \"name\": \"Matic Network\",\n" +
                "      \"nameid\": \"matic-network\",\n" +
                "      \"rank\": 98,\n" +
                "      \"price_usd\": \"0.010366\",\n" +
                "      \"percent_change_24h\": \"-13.96\",\n" +
                "      \"percent_change_1h\": \"-1.38\",\n" +
                "      \"percent_change_7d\": \"-10.91\",\n" +
                "      \"price_btc\": \"0.000002\",\n" +
                "      \"market_cap_usd\": \"22548566.12\",\n" +
                "      \"volume24\": 9835946.095883556,\n" +
                "      \"volume24a\": 14223141.15908669,\n" +
                "      \"csupply\": \"2175190262.00\",\n" +
                "      \"tsupply\": \"10000000000\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"33764\",\n" +
                "      \"symbol\": \"RIF\",\n" +
                "      \"name\": \"RIF Token\",\n" +
                "      \"nameid\": \"rif-token\",\n" +
                "      \"rank\": 99,\n" +
                "      \"price_usd\": \"0.046652\",\n" +
                "      \"percent_change_24h\": \"-6.26\",\n" +
                "      \"percent_change_1h\": \"-0.48\",\n" +
                "      \"percent_change_7d\": \"-3.61\",\n" +
                "      \"price_btc\": \"0.000008\",\n" +
                "      \"market_cap_usd\": \"22298738.32\",\n" +
                "      \"volume24\": 6797284.508174148,\n" +
                "      \"volume24a\": 8429843.857924564,\n" +
                "      \"csupply\": \"477980957.00\",\n" +
                "      \"tsupply\": \"1000000000\",\n" +
                "      \"msupply\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"180\",\n" +
                "      \"symbol\": \"ANT\",\n" +
                "      \"name\": \"Aragon\",\n" +
                "      \"nameid\": \"aragon\",\n" +
                "      \"rank\": 100,\n" +
                "      \"price_usd\": \"0.743253\",\n" +
                "      \"percent_change_24h\": \"-9.01\",\n" +
                "      \"percent_change_1h\": \"-2.07\",\n" +
                "      \"percent_change_7d\": \"6.93\",\n" +
                "      \"price_btc\": \"0.000121\",\n" +
                "      \"market_cap_usd\": \"22265462.27\",\n" +
                "      \"volume24\": 90772.28181783353,\n" +
                "      \"volume24a\": 88836.40106386546,\n" +
                "      \"csupply\": \"29956794.00\",\n" +
                "      \"tsupply\": \"39609524\",\n" +
                "      \"msupply\": \"\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"info\": {\n" +
                "    \"coins_num\": 3972,\n" +
                "    \"time\": 1585369265\n" +
                "  }\n" +
                "}";

        Gson gson = new Gson();
        CoinLoreResponse clr = gson.fromJson(list, CoinLoreResponse.class);
        return clr.getData();

    }

}
