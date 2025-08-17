/*
 * Copyright (c) 2005 - Ben Mazur (bmazur@sev.org)
 * Copyright (C) 2022-2025 The MegaMek Team. All Rights Reserved.
 *
 * This file is part of MegaMek.
 *
 * MegaMek is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License (GPL),
 * version 3 or (at your option) any later version,
 * as published by the Free Software Foundation.
 *
 * MegaMek is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 *
 * A copy of the GPL should have been included with this project;
 * if not, see <https://www.gnu.org/licenses/>.
 *
 * NOTICE: The MegaMek organization is a non-profit group of volunteers
 * creating free software for the BattleTech community.
 *
 * MechWarrior, BattleMech, `Mech and AeroTech are registered trademarks
 * of The Topps Company, Inc. All Rights Reserved.
 *
 * Catalyst Game Labs and the Catalyst Game Labs logo are trademarks of
 * InMediaRes Productions, LLC.
 *
 * MechWarrior Copyright Microsoft Corporation. MegaMek was created under
 * Microsoft's "Game Content Usage Rules"
 * <https://www.xbox.com/en-US/developers/rules> and it is not endorsed by or
 * affiliated with Microsoft.
 */

package megamek.common.weapons.missiles.innerSphere;

import static megamek.common.equipment.MountedHelper.isArtemisIV;
import static megamek.common.equipment.MountedHelper.isArtemisProto;

import megamek.common.equipment.Mounted;
import megamek.common.SimpleTechLevel;
import megamek.common.alphaStrike.AlphaStrikeElement;
import megamek.common.weapons.missiles.MMLWeapon;

/**
 * @author Sebastian Brocks
 */
public class ISMML5 extends MMLWeapon {

    /**
     *
     */
    private static final long serialVersionUID = -546200914895806968L;

    /**
     *
     */
    public ISMML5() {
        super();
        name = "MML 5";
        setInternalName("ISMML5");
        addLookupName("IS MML-5");
        heat = 3;
        rackSize = 5;
        tonnage = 3;
        criticals = 3;
        bv = 45;
        cost = 75000;
        shortAV = 3;
        medAV = 3;
        longAV = 3;
        maxRange = RANGE_LONG;
        rulesRefs = "229, TM";
        // March 2022 - CGL (Greekfire) requested MML adjustments to Tech Progression.
        techAdvancement.setTechBase(TechBase.IS)
              .setIntroLevel(false)
              .setUnofficial(false)
              .setTechRating(TechRating.D)
              .setAvailability(AvailabilityValue.X, AvailabilityValue.X, AvailabilityValue.E, AvailabilityValue.D)
              .setISAdvancement(DATE_NONE, 3067, 3073, DATE_NONE, DATE_NONE)
              .setISApproximate(false, true, false, false, false)
              .setProductionFactions(Faction.MERC, Faction.WB)
              .setStaticTechLevel(SimpleTechLevel.STANDARD);
    }

    @Override
    public double getBattleForceDamage(int range, Mounted<?> fcs) {
        if (range == AlphaStrikeElement.SHORT_RANGE) {
            return (isArtemisIV(fcs) || isArtemisProto(fcs)) ? 0.8 : 0.6;
        } else if (range == AlphaStrikeElement.MEDIUM_RANGE) {
            return (isArtemisIV(fcs) || isArtemisProto(fcs)) ? 0.6 : 0.45;
        } else if (range == AlphaStrikeElement.LONG_RANGE) {
            return (isArtemisIV(fcs) || isArtemisProto(fcs)) ? 0.4 : 0.3;
        } else {
            return 0;
        }
    }
}
