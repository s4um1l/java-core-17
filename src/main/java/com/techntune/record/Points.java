package com.techntune.record;

import java.util.List;

record Points(List<Point> pointList) {
     Points(List<Point> pointList){
        this.pointList=List.copyOf(pointList);
    }
}
