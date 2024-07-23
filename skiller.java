// Fish IDs
int leaping_trout = 11328;
int leaping_salmon = 11330;
int leaping_sturgeon = 11332;

// Get nearest fishing spot
NPC fishingSpot = v.getNpc().findNearest(1542);

// Main fishing logic
void fish() {
    
    // Check running energy
    handleRunning();
    
    // Check if the player is idle and has enough inventory space
    if (v.getLocalPlayer().hasAnimation(-1) && !v.getInventory().inventoryFull()) {
        // If so, bait the fishing spot
        v.getFishing().bait(fishingSpot);
    } else {
        // Otherwise, manage inventory
        manageInventory();
    }
}

// Enable running if energy is full
void handleRunning() {
    if (client.getEnergy() == 10000) {
        v.getWalking().turnRunningOn();
    }
}

// Manage inventory - drop fish if inventory is full
void manageInventory() {
    if (v.getInventory().inventoryFull()) {
        v.getInventory().drop(leaping_trout);
        v.getInventory().drop(leaping_salmon);
        v.getInventory().drop(leaping_sturgeon);
    }
}

// Call the main function
fish();

