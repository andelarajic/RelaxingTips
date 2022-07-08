package com.example.AntiStress;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController()
public class YogaController {

    @GetMapping("/yoga")
    public List<Yoga> getAllTips() {

        //Creating list of Books
        List<Yoga> list = new ArrayList<Yoga>();
        Yoga a1 = new Yoga("Mountain Pose", "Stand with your feet together or hip-width apart. Ground down through the four corners of your feet. Roll your shoulders away from your ears, draw your shoulder blades down your back, and lift the crown of your head.\n" +
                "\n" +
                "Engage your thighs, draw your belly button in, and lengthen up through the spine. Turn your palms facing the front of the room. Relax your jaw and unfurrow your brow. Breathe easy.\n" +
                "\nIt may seem like you’re, well, just standing there, but bear with us. This is the blueprint for all other poses. It promotes balance and directs your attention to the present moment.");
        Yoga a2 = new Yoga(" Chair Pose", "Start in Mountain Pose. As you inhale, raise your arms, spread your fingers, and reach up through your fingertips. As you exhale, sit back and down as if sitting into a chair.\n" +
                "\n" +
                "Shift your weight toward the heels and lengthen up through the spine. As you inhale, lift and lengthen through your arms. As you exhale, sit deeper into the pose.\n" +
                "\nThis heating standing pose (give it a minute, you’ll feel the burn) strengthens your legs, upper back, and shoulders. As a bonus, you’ll have an opportunity to practice patience as your thighs work hard. Just remember to breathe.\n" +
                "\n");
        Yoga a3 = new Yoga(" Down Dog on a chair", "Place your hands on the back of a chair with palms shoulder-distance apart. Step your feet back until they align under hips, creating a right angle with your body, spine parallel with the floor.\n" +
                "\n" +
                "Ground through your feet and lift through thighs. Reach hips away from hands to lengthen the sides of your torso. Firm your outer arms in and lengthen through the crown of your head. Downward-Facing Dog is the bread and butter of yoga, but it can be challenging for beginners.\n" +
                "\n" +
                "This modification shares the same benefits as the classic pose — stretching the hamstrings, opening the shoulders, and creating length in the spine — without all the weight on your upper body.");
        Yoga a4 = new Yoga("Downward-Facing Dog", "From all fours, walk your hands 6 inches in front of you. Tuck your toes and lift your hips up and back to lengthen your spine. If your hamstrings are tight, keep your knees bent in order to bring your weight back into the legs.\n" +
                "\n" +
                "Spread your fingers wide, press into your hands, and rotate your arms so that your biceps are facing toward one another. Press your thighs back toward the wall behind you. This classic pose opens your shoulders, lengthens your spine, and stretches your hamstrings. Since your head is below your heart, the mild inversion creates a calming effect.");
        Yoga a5 = new Yoga("Warrior II", "Stand with feet wide, 3–4 feet apart. Shift your right heel out so your toes are pointing slightly inward. Turn your left foot out 90 degrees. Line up your left heel with the arch of your right foot.\n" +
                "\n" +
                "Bend your left knee to a 90-degree angle, keeping the knee in line with the second toe to protect the knee joint. Stretch through your straight back leg and ground down into the back foot.\n" +
                "\n" +
                "On an inhale, bring arms to a T at shoulder height. Draw your shoulder blades down the back. Spread your fingers and keep palms facedown. Gaze over the front fingers. As you exhale, sink deeper into the stretch.\n" +
                "\n" +
                "Pro tip: To draw your shoulder blades down the back, rotate your palms face-up. Notice how that shifts your shoulders. Once settled, rotate your palms facedown.\n" +
                "\n A pose with “warrior” in its name may not sound very zen, but this standing pose can help calm and steady your mind. Tougher than it looks, it also strengthens your legs and ankles while increasing stamina.\n" +
                "\n");
        Yoga a6 = new Yoga("Triangle Pose", "Stand with feet wide, 3–4 feet apart. Shift your right heel out so your toes are pointing slightly inward. Turn your left foot out 90 degrees. Line up your left heel with the arch of your right foot.\n" +
                "\n" +
                "Keeping both legs straight, ground through your feet. Lift arms into a T at shoulder height. Reach forward with your front arm. When you can’t reach anymore, hinge at the front hip.\n" +
                "\n" +
                "Bring your front arm down to your shin, a foam block, or the ground. Lift your back arm up toward the sky and spread your fingers. Take your gaze down to the floor or up toward your lifted hand. While this pose can be challenging for those with tight muscles, it will help promote balance, stretch the hamstrings and inner thighs, and create a feeling of expansion in the body.");
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