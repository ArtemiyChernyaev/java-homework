package pr_7.Math;

class MathFunc implements MathCaclulable{

    public long power(int value, int powValue) {
        long ans = 1;
        for(int i = 0; i < powValue; i++) {
            ans *= value;
        }
        return ans;
    }

    public float abs(float re, float im) {
        return (float) Math.sqrt(re*re + im*im);
    }

    public static void main(String[] args) {
        MathCaclulable mc1 = new MathFunc();

        System.out.println(mc1.power(5,5));
        System.out.println(mc1.abs(4f,3f));
    }
}
