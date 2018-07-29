package proj;

public class ExchangeRateSeries {


        private Rates[] rates;

        private String code;

        private String table;

        private String currency;

        public Rates[] getRates ()
        {
            return rates;
        }

        public void setRates (Rates[] rates)
        {
            this.rates = rates;
        }

        public String getCode ()
        {
            return code;
        }

        public void setCode (String code)
        {
            this.code = code;
        }

        public String getTable ()
        {
            return table;
        }

        public void setTable (String table)
        {
            this.table = table;
        }

        public String getCurrency ()
        {
            return currency;
        }

        public void setCurrency (String currency)
        {
            this.currency = currency;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [rates = "+rates+", code = "+code+", table = "+table+", currency = "+currency+"]";
        }
    }





