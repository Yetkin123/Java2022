public class BaseKrediManager {
    public double hesapla(double tutar) {
        return tutar * 1.18;
    }
}

// başka yerlerde override olmasını istemiyorsan "final" kullan
// mesela "public final double" hesapla(double tutar)

// overridable (üzerine yazılabilir/değiştirilebilir)
// Java'nın herhangi bir operasyonu, siz aksini belirtmediğiniz sürece overridable
