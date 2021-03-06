package model;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Call {

	private static final Integer MIN_DURATION = 5;
	private static final Integer MAX_DURATION = 10;
	/**
	 * Generate automatically the id of the calls, starting at 1
	 */
	private static final AtomicInteger ID_GENERATOR = new AtomicInteger(1);
	private Integer id;
	private Integer duration;

	public Call() {
		this.id = ID_GENERATOR.getAndIncrement();
		this.duration = new Random().nextInt(MAX_DURATION - MIN_DURATION + 1) + MIN_DURATION;
	}

	/**
	 * Reset the current generator of id calls to 1
	 */
	public static void resetIdSequence() {
		ID_GENERATOR.set(1);
	}

	public Integer getId() {
		return id;
	}

	Integer getDuration() {
		return duration;
	}
}
