
package ppl_assignment;

public class rand {
     public int randnum(int min, int max) {
		return (int)(Math.random() * ((max - min) + 1)) + min;
	}
    public float Frandnum(float min, float max) {
		return (float)(Math.random() * ((max - min) + 1)) + min;
	}
}
