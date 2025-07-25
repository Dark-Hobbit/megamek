/*
 * MegaMek - Copyright (C) 2004, 2005 Ben Mazur (bmazur@sev.org)
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the Free
 * Software Foundation; either version 2 of the License, or (at your option)
 * any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 * for more details.
 */
package megamek.common.weapons.bombs;

import megamek.common.BombType;
import megamek.common.BombType.BombTypeEnum;
import megamek.common.weapons.tag.TAGWeapon;

/**
 * @author Sebastian Brocks
 * @since Sep 7, 2005
 */
public class ISBombTAG extends TAGWeapon {
    private static final long serialVersionUID = -7692653575300083613L;

    public ISBombTAG() {
        super();

        this.name = "TAG Pod";
        this.setInternalName(BombTypeEnum.TAG.getWeaponName());
        this.tonnage = 1;
        this.criticals = 0;
        this.hittable = false;
        this.spreadable = false;
        this.heat = 0;
        this.damage = 0;
        this.shortRange = 5;
        this.mediumRange = 10;
        this.longRange = 15;
        this.extremeRange = 20;
        this.bv = 0;
        this.cost = 50000;
        flags = flags.or(F_BOMB_WEAPON).andNot(F_MEK_WEAPON).andNot(F_TANK_WEAPON);
        rulesRefs = "238, TM";
        techAdvancement.setTechBase(TechBase.IS)
                .setIntroLevel(false)
                .setUnofficial(false)
                .setTechRating(TechRating.E)
                .setAvailability(AvailabilityValue.E, AvailabilityValue.F, AvailabilityValue.D, AvailabilityValue.D)
                .setISAdvancement(2600, 2605, 2645, 2835, 3035)
                .setISApproximate(true, false, false, false, false)
                .setPrototypeFactions(Faction.TH)
                .setProductionFactions(Faction.TH);
    }
}
