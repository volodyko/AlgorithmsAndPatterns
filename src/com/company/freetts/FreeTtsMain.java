package com.company.freetts;


import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

/**
 * Created by volodyko on 25.05.16.
 */
public class FreeTtsMain {
    public static void main(String[] args) {
        VoiceManager voiceManager = VoiceManager.getInstance();
        Voice[] voices = voiceManager.getVoices();
        for (Voice v : voices) {
            System.out.printf("    %s\n", v.getName());
        }

        String voiceName = (args.length > 0)
                ? args[0]
                : "kevin16";

        System.out.printf("\nUsing voice: %s", voiceName);
        Voice voice = voiceManager.getVoice(voiceName);
        voice.allocate();
        voice.speak("");
        voice.deallocate();
    }
}
