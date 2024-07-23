v.getFishing().useRod(1542);
    v.getCallbacks().afterTicks(1, () -> {
            v.invoke("Use", "<col=ff9040>Guam leaf",0,25,8,9764864, false);
    v.invoke("Use", "<col=ffff>Guam leaf</col><col=ffffff> -> <col=ff9040>Swamp tar</col>",0,58,4,9764864,false);
     v.getInventory().drop(11330, 11328, 11332);
});