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
package megamek.common.weapons.autocannons;

import megamek.common.alphaStrike.AlphaStrikeElement;
import megamek.common.Mounted;

/**
 * @author Andrew Hunter
 * @since Oct 15, 2004
 */
public class ISLB5XAC extends LBXACWeapon {
    private static final long serialVersionUID = 3466212961123086341L;

    public ISLB5XAC() {
        super();
        name = "LB 5-X AC";
        setInternalName("ISLBXAC5");
        addLookupName("IS LB 5-X AC");
        sortingName = "LB 05-X AC";
        heat = 1;
        damage = 5;
        rackSize = 5;
        minimumRange = 3;
        shortRange = 7;
        mediumRange = 14;
        longRange = 21;
        extremeRange = 28;
        tonnage = 8.0;
        criticals = 5;
        bv = 83;
        cost = 250000;
        shortAV = getBaseAeroDamage();
        medAV = shortAV;
        longAV = shortAV;
        maxRange = RANGE_LONG;
        rulesRefs = "207, TM";
        techAdvancement.setTechBase(TECH_BASE_IS)
                .setIntroLevel(false)
                .setUnofficial(false)
                .setTechRating(RATING_E)
                .setAvailability(RATING_X, RATING_X, RATING_E, RATING_D)
                .setISAdvancement(3055, 3058, 3060, DATE_NONE, DATE_NONE)
                .setISApproximate(true, false, false, false, false)
                .setPrototypeFactions(F_FS)
                .setProductionFactions(F_FS);
    }

    @Override
    public double getBattleForceDamage(int range, Mounted<?> fcs) {
        if (range == AlphaStrikeElement.SHORT_RANGE) {
            return 0.236;
        } else if (range <= AlphaStrikeElement.LONG_RANGE) {
            return 0.315;
        } else {
            return 0;
        }
    }
}
