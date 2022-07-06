package com.example.AntiStress;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController()
public class RelaxingTipsController {

    @GetMapping("/tips")
    public List<RelaxingTip> getAllTips() {

        //Creating list of Books
        List<RelaxingTip> list = new ArrayList<RelaxingTip>();
        RelaxingTip a1 = new RelaxingTip("Breathe it out", "Breathing exercises are one of the simplest relaxation strategies, and can effectively calm your stressed-out body and mind anywhere at any time. Sit or lay down in a quiet and safe place such as on your bed or the floor in your home and put one of your hands on your belly. Breathe in to a slow count of three, and then breathe out to the same slow count of three. Feel your belly rise and fall as you breathe in and out. Repeat five times, or as long as you need to feel relaxed.");
        RelaxingTip a2 = new RelaxingTip("Release physical tension", "When we feel mentally stressed, we often feel physically stressed as well. Releasing any physical tension can help relieve stress in your body and mind. Lay on a soft surface, such as your bed, a carpet, or a yoga mat. Tense up one part of your body at a time, and then slowly release your muscles. As you do this, notice how your body sensations change. Many people start either with the muscles in their face or those their toes, and then work their way through the muscles across their bodies to the opposite end.");
        RelaxingTip a3 = new RelaxingTip("Write down your thoughts", "Getting things off your mind by writing them down may help you relax. When you feel stressed, take a few minutes to write down some short notes about how you’re feeling or how your day is going. You might do this in a notebook or in a notes app on your smartphone. Don’t worry about being poetic or spelling everything correctly. Just focus on expressing yourself to help release some of your stress.");
        RelaxingTip a4 = new RelaxingTip("Make a list", "Making a list about what you’re grateful for can help some people feel relaxed. Experts say that when we’re stressed, we tend to focus on the negative parts of life rather than the positive. Thinking about the positive parts of your life and writing them down may help you chill out. Try to think of three good things that happened to you today and write them down, even if they’re small things like getting to work on time or eating a delicious lunch.");
        RelaxingTip a5 = new RelaxingTip("Visualize your calm.", "Have you ever heard the expression “find your happy place”? Sit in a quiet and safe place, such as your bedroom, and begin to think about a place in the world where you feel most calm. Close your eyes and imagine all the details linked to that place: the sights, sounds, smells, tastes, and tactile feelings. For example, if you think of the beach, you might imagine calm waves, the sound of children playing in the sand, the smell of sunscreen, the taste of cool ice cream and the feel of gritty sand under your feet. The more you get into your visualization, the more you can relax.");
        RelaxingTip a6 = new RelaxingTip("Connect to nature", "Spending just a few minutes in nature when you feel stressed may help you relax. When you’re feeling stressed, take a step outside and go for a short walk, or simply sit in nature. But you don’t necessarily need to be in nature to feel its stress-reducing effects. Scientists have found that simply looking at images of natureTrusted Source with greenery for five minutes on a computer screen can help calm you down. So, thanks to technology, even people living and working in big cities far from nature can still experience its calming effects.");
        //Adding relaxingTIPS to list
        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);
        list.add(a5);
        list.add(a6);
        //Traversing list
        return list;
    }

}