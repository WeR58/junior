package ru.job4j.heroes.character.endead;

import ru.job4j.heroes.Hero;
import ru.job4j.heroes.character.BaseHero;

/**
 * //TODO add comments.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class Necromancer implements Hero {
    private final BaseHero base;

    public Necromancer(final BaseHero base) {
        this.base = base;
    }

    @Override
    public void upgrade(Hero comrade) {
        this.base.upgrade(comrade);
    }

    @Override
    public void degrade(Hero enemy) {
        this.base.degrade(enemy);
    }

    @Override
    public void damage(int value) {
        this.base.damage(value);
    }

    @Override
    public boolean isLife() {
        return this.base.isLife();
    }

    @Override
    public boolean actionToTeam() {
        return false;
    }

    @Override
    public void skills(boolean up) {
        this.base.skills(up);
    }
}
