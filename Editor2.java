import java.awt.Color;

/**
 * Demonstrates the scaling (resizing) operation featured by Runigram.java.
 * The program recieves three command-line arguments: a string representing the
 * name
 * of the PPM file of a source image, and two integers that specify the width
 * and the
 * height of the scaled, output image. For example, to scale/resize ironman.ppm
 * to a width
 * of 100 pixels and a height of 900 pixels, use: java Editor2 ironman.ppm 100
 * 900
 */
// This client class is designed to test the scaling operation just described.
// The class receives three
// command-line arguments: the name of the PPM file representing the image that
// should be scaled, and
// two integers that specify the width and height of the scaled image. For
// example:
// % java Editor2 ironman.ppm 800 500
public class Editor2 {

	public static void main(String[] args) {
		String ppmFile = args[0];
		int width = Integer.parseInt(args[1]);
		int height = Integer.parseInt(args[2]);

		Color[][] imageIn = Runigram.read(ppmFile);
		Color[][] imageOut = Runigram.scaled(imageIn, width, height);

		Runigram.setCanvas(imageIn);
		Runigram.display(imageIn);
		StdDraw.pause(3000);

		Runigram.setCanvas(imageOut);
		Runigram.display(imageOut);

	}
}
