import java.rmi.RemoteException;

public class CalculadoraImpl implements Interfaz {

    public float sumar(float a, float b) throws RemoteException {
        return a + b;
    }

    public float restar(float a, float b) throws RemoteException {
        return a - b;
    }

    public float multiplicar(float a, float b) throws RemoteException {
        return a * b;
    }

    public float dividir(float a, float b) throws RemoteException {
        if (b == 0) throw new ArithmeticException("División por 0");
        return a / b;
    }

    public float raiz(float n) throws RemoteException {
        if (n < 0) throw new ArithmeticException("Raíz negativa");
        return (float) Math.sqrt(n);
    }

    public float sumarArray(float[] nums) throws RemoteException {
        float suma = 0;
        for (float n : nums) suma += n;
        return suma;
    }
}