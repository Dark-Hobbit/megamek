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
package megamek.common.weapons.unofficial;

import megamek.common.AmmoType;
import megamek.common.weapons.autocannons.LBXACWeapon;

/**
 * @author Andrew Hunter
 * @since Oct 15, 2004
 */
public class ISTHBLB20XAC extends LBXACWeapon {
    private static final long serialVersionUID = 1568107024307749233L;

    public ISTHBLB20XAC() {
        super();
        name = "LB 20-X AC (THB)";
        setInternalName("ISTHBLBXAC20");
        addLookupName("IS LB 20-X AC (THB)");
        heat = 6;
        damage = 20;
        rackSize = 20;
        ammoType = AmmoType.AmmoTypeEnum.AC_LBX_THB;
        shortRange = 4;
        mediumRange = 7;
        longRange = 12;
        extremeRange = 14;
        tonnage = 14.0;
        criticals = 10;
        shortAV = getBaseAeroDamage();
        medAV = shortAV;
        longAV = shortAV;
        extAV = shortAV;
        bv = 204;
        cost = 700000;
        // Since this are the Tactical Handbook Weapons I'm using the TM Stats.
        rulesRefs = "THB (Unofficial)";
        techAdvancement.setTechBase(TechBase.IS)
                .setIntroLevel(false)
                .setUnofficial(true)
                .setTechRating(TechRating.E)
                .setAvailability(AvailabilityValue.X, AvailabilityValue.X, AvailabilityValue.E, AvailabilityValue.D)
                .setISAdvancement(3055, 3058, 3060, DATE_NONE, DATE_NONE)
                .setISApproximate(true, false, false, false, false)
                .setPrototypeFactions(Faction.FS)
                .setProductionFactions(Faction.FS);
    }
}
