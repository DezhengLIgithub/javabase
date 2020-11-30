package com.para.particle;

import java.applet.Applet;

public class ParticleApplet extends Applet {
    protected Thread[] threads = null;
    protected final ParticleCanvas canvas = new ParticleCanvas(100);
    public void init() {
        add(canvas);
    }

    protected Thread makeThread(final Particle p){
        Runnable runloop = new Runnable() {
            @Override
            public void run() {
                try {
                    for(;;) {
                        canvas.repaint();
                        Thread.sleep(1000);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            }
        };

        return new Thread(runloop);
    }


    public synchronized void start() {
        int n = 10;

        if(threads == null) {
            Particle[] particles = new Particle[n];
            for(int i=0; i<n; i++) {
                particles[i] = new Particle(50 ,50);
            }

            canvas.setParticles(particles);
            threads = new Thread[n];

            for(int i = 0; i<n; i++) {
                threads[i] = makeThread(particles[i]);
                threads[i].start();
            }
        }
    }


    public synchronized void stop() {
        if(threads != null) {
            for(int i= 0; i< threads.length; ++i) {
                threads[i].interrupt();
            }
            threads=null;
        }
    }
}
