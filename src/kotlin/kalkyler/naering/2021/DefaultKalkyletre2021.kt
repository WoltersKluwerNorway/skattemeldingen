object DefaultKalkyletre2021 : Kalkyletre(
    GevinstOgTapskonto,
    LineaertavskrevetAnleggsmiddel,
    SaldoavskrevetAnleggsmiddel,
    SpesifikasjonAvOmloepsmiddel,
    TransportmiddelNaering,
    SkogOgToemmerkonto,
    Resultatregnskapet,
    IkkeAvskrivbartAnleggsmiddel,
    PermanenteForskjellerBeregning,
    MidlertidigeForskjellerBeregning,
    HarKalkyletre { Kalkyletre(SkattemessigResultatBeregning) },
    HarKalkyletre { Kalkyletre(FordeltBeregnetNaeringsinntektUnntak) },
    FordeltBeregnetNaeringsinntektBeregning,
    HarKalkyletre { Kalkyletre(FordeltBeregnetPersoninntektUnntak) },
    HarKalkyletre { Kalkyletre(FordeltBeregnetIdentifikatorHaandtering) },
    HarKalkyletre { Kalkyletre(FordeltBeregnetPersoninntektBeregning) },
    Balanse,
    BalanseFormueOgGjeld,
    HarKalkyletre { Kalkyletre(OvernattingsOgServeringsstedBeregning) },
    HarKalkyletre { Kalkyletre(EgenkapitalavstemmingBeregning) },
)