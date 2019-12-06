class FlowChartModel {

    /**
     * Canvas를 통해 초기 Flow Line을 그려주는 Method
     * @param {*} canvas 
     */
    drawLine(canvas) {

        const ctx = canvas.getContext("2d");

        //제강->주조
        ctx.beginPath();
        ctx.moveTo(260, 220);
        ctx.lineTo(350, 220);
        ctx.lineWidth = 15;
        ctx.strokeStyle = "rgb(227,221,216)";
        ctx.stroke();

        //주조->제강
        ctx.beginPath();
        ctx.moveTo(460, 190);
        ctx.lineTo(460, 120);
        ctx.lineTo(150, 120);
        ctx.lineTo(150, 190);
        ctx.lineWidth = 15;
        ctx.stroke();

        //주조->1차전단
        ctx.beginPath();
        ctx.moveTo(570, 220);
        ctx.lineTo(650, 220);
        ctx.stroke();

        //1차전단->2차전단
        ctx.beginPath();
        ctx.moveTo(860, 220);
        ctx.lineTo(950, 220);
        ctx.stroke();

        //1차전단->정정
        ctx.beginPath();
        ctx.moveTo(750, 250);
        ctx.lineTo(750, 320);
        ctx.lineTo(1330, 320);
        ctx.lineTo(1330, 250);
        ctx.stroke();

        //2차전단->정정
        ctx.beginPath();
        ctx.moveTo(1170, 220);
        ctx.lineTo(1250, 220);
        ctx.stroke();

        //정정->장입
        ctx.beginPath();
        ctx.moveTo(1360, 190);
        ctx.lineTo(1360, 120);
        ctx.lineTo(1600, 120);
        ctx.stroke();

        //정정->Scrap
        ctx.beginPath();
        ctx.moveTo(1360, 250);
        ctx.lineTo(1360, 320);
        ctx.lineTo(1600, 320);
        ctx.stroke();
    }

    /**
 * 후판, 박판 강종 여부에 따라 경로Path를 그려주는 Method
 * @param {*} canvas 
 * @param {*} steelGrd
 */
    drawPathLine(canvas, steelGrd) {
        const ctx = canvas.getContext("2d");
        ctx.clearRect(0, 0, canvas.width, canvas.height);
        if (steelGrd === 'P') {
            //제강->주조
            ctx.beginPath();
            ctx.moveTo(260, 220);
            ctx.lineTo(350, 220);
            ctx.lineWidth = 15;
            ctx.strokeStyle = "rgb(33,133,208)";
            ctx.stroke();

            //주조->제강
            ctx.beginPath();
            ctx.moveTo(460, 190);
            ctx.lineTo(460, 120);
            ctx.lineTo(150, 120);
            ctx.lineTo(150, 190);
            ctx.strokeStyle = "rgb(227,221,216)";
            ctx.stroke();

            //주조->1차전단
            ctx.beginPath();
            ctx.moveTo(570, 220);
            ctx.lineTo(650, 220);
            ctx.strokeStyle = "rgb(33,133,208)";
            ctx.stroke();

            //1차전단->2차전단
            ctx.beginPath();
            ctx.moveTo(860, 220);
            ctx.lineTo(950, 220);
            ctx.strokeStyle = "rgb(227,221,216)";
            ctx.stroke();

            //1차전단->정정
            ctx.beginPath();
            ctx.moveTo(750, 250);
            ctx.lineTo(750, 320);
            ctx.lineTo(1330, 320);
            ctx.lineTo(1330, 250);
            ctx.strokeStyle = "rgb(33,133,208)";
            ctx.stroke();

            //2차전단->정정
            ctx.beginPath();
            ctx.moveTo(1170, 220);
            ctx.lineTo(1250, 220);
            ctx.strokeStyle = "rgb(227,221,216)";
            ctx.stroke();

            //정정->장입
            ctx.beginPath();
            ctx.moveTo(1360, 190);
            ctx.lineTo(1360, 120);
            ctx.lineTo(1600, 120);
            ctx.stroke();

            //정정->Scrap
            ctx.beginPath();
            ctx.moveTo(1360, 250);
            ctx.lineTo(1360, 320);
            ctx.lineTo(1600, 320);
            ctx.stroke();
        }
        else if (steelGrd === 'T') {
            //제강->주조
            ctx.beginPath();
            ctx.moveTo(260, 220);
            ctx.lineTo(350, 220);
            ctx.lineWidth = 15;
            ctx.strokeStyle = "rgb(33,133,208)";
            ctx.stroke();

            //주조->제강
            ctx.beginPath();
            ctx.moveTo(460, 190);
            ctx.lineTo(460, 120);
            ctx.lineTo(150, 120);
            ctx.lineTo(150, 190);
            ctx.strokeStyle = "rgb(227,221,216)";
            ctx.stroke();

            //주조->1차전단
            ctx.beginPath();
            ctx.moveTo(570, 220);
            ctx.lineTo(650, 220);
            ctx.strokeStyle = "rgb(33,133,208)";
            ctx.stroke();

            //1차전단->2차전단
            ctx.beginPath();
            ctx.moveTo(860, 220);
            ctx.lineTo(950, 220);
            ctx.strokeStyle = "rgb(33,133,208)";
            ctx.stroke();

            //1차전단->정정
            ctx.beginPath();
            ctx.moveTo(750, 250);
            ctx.lineTo(750, 320);
            ctx.lineTo(1330, 320);
            ctx.lineTo(1330, 250);
            ctx.strokeStyle = "rgb(227,221,216)";
            ctx.stroke();

            //2차전단->정정
            ctx.beginPath();
            ctx.moveTo(1170, 220);
            ctx.lineTo(1250, 220);
            ctx.strokeStyle = "rgb(33,133,208)";
            ctx.stroke();

            //정정->장입
            ctx.beginPath();
            ctx.moveTo(1360, 190);
            ctx.lineTo(1360, 120);
            ctx.lineTo(1600, 120);
            ctx.strokeStyle = "rgb(227,221,216)";
            ctx.stroke();

            //정정->Scrap
            ctx.beginPath();
            ctx.moveTo(1360, 250);
            ctx.lineTo(1360, 320);
            ctx.lineTo(1600, 320);
            ctx.stroke();
        }
        else this.drawLine(canvas);
    }

    /**
     * 성공여부에 따라 Path를 추가적으로 그려주는 Method
     * @param {*} canvas 
     * @param {*} isSuccess 
     */
    drawIsSuccessLine(canvas, isSuccess) {
        const ctx = canvas.getContext("2d");
        if (isSuccess === true) {
            //정정->장입
            ctx.beginPath();
            ctx.moveTo(1360, 190);
            ctx.lineTo(1360, 120);
            ctx.lineTo(1600, 120);
            ctx.strokeStyle = "rgb(33,133,208)";
            ctx.stroke();
        }
        else if (isSuccess === false) {
            //정정->Scrap
            ctx.beginPath();
            ctx.moveTo(1360, 250);
            ctx.lineTo(1360, 320);
            ctx.lineTo(1600, 320);
            ctx.strokeStyle = "rgb(33,133,208)";
            ctx.stroke();
        }
    }

    /**
     * 공정진행 과정에 따라 해당 Route 애니메이션으로 표시하는 Method
     * @param {*} canvas 
     * @param {*} result 
     */
    animatedLine(canvas, result) {

        const ctx = canvas.getContext("2d");

        if (result.node[0] === true) return this.processNode1st(ctx);
        else if (result.node[1] === true) return this.processNode2nd(ctx);
        else if (result.node[2] === true) return this.processNode3rd(ctx);
        else if (result.node[3] === true) return this.processNode4th(ctx);
        else if (result.node[4] === true) return this.processNode5th(ctx);
        else if (result.node[5] === true) return this.processNode6th(ctx);
        else if (result.node[6] === true) return this.processNode7th(ctx);
        else if (result.node[7] === true) return this.processNode8th(ctx);
        else return;
    }

    /**
     * 제강->주조 애니메이션 Method
     * @param {*} ctx 
     */
    processNode1st(ctx) {

        const x = 270;
        const y = 230;
        let moveSize = 0;

        const animate = setInterval(() => {
            ctx.clearRect(260, y - 20, 200, 40);
            moveSize += 5;
            const moveX = x + moveSize;

            ctx.beginPath();
            ctx.moveTo(moveX, y);
            ctx.lineTo(moveX + 15, y - 10);
            ctx.lineTo(moveX, y - 20);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            ctx.beginPath();
            ctx.moveTo(moveX + 30, y);
            ctx.lineTo(moveX + 45, y - 10);
            ctx.lineTo(moveX + 30, y - 20);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            ctx.beginPath();
            ctx.moveTo(moveX + 60, y);
            ctx.lineTo(moveX + 75, y - 10);
            ctx.lineTo(moveX + 60, y - 20);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();
            if (moveX >= 350) {
                moveSize = 0;
            }
        }, 100);
        return animate;
    }

    /**
     * 주조 -> 제강 애니메이션 Method
     * @param {*} ctx 
     */
    processNode2nd(ctx) {

        const x1 = 450;
        const y1 = 230;
        const x2 = 440;
        const y2 = 130;
        const x3 = 140;
        const y3 = 120;
        let moveSize1 = 0;
        let moveSize2 = 0;
        let moveSize3 = 0;

        const animate = setInterval(() => {

            ctx.clearRect(0, 70, 600, 120);

            moveSize1 += 5;
            const moveY1 = y1 - moveSize1;

            ctx.beginPath();
            ctx.moveTo(x1, moveY1);
            ctx.lineTo(x1 + 20, moveY1);
            ctx.lineTo(x1 + 10, moveY1 - 15);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            ctx.beginPath();
            ctx.moveTo(x1, moveY1 - 30);
            ctx.lineTo(x1 + 20, moveY1 - 30);
            ctx.lineTo(x1 + 10, moveY1 - 45);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            if (moveY1 <= 160) {
                moveSize1 = 0;
            }

            moveSize2 += 5;
            const moveX = x2 - moveSize2;

            ctx.beginPath();
            ctx.moveTo(moveX, y2);
            ctx.lineTo(moveX, y2 - 20);
            ctx.lineTo(moveX - 15, y2 - 10);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            ctx.beginPath();
            ctx.moveTo(moveX - 30, y2);
            ctx.lineTo(moveX - 30, y2 - 20);
            ctx.lineTo(moveX - 45, y2 - 10);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            ctx.beginPath();
            ctx.moveTo(moveX - 60, y2);
            ctx.lineTo(moveX - 60, y2 - 20);
            ctx.lineTo(moveX - 75, y2 - 10);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            ctx.beginPath();
            ctx.moveTo(moveX - 90, y2);
            ctx.lineTo(moveX - 90, y2 - 20);
            ctx.lineTo(moveX - 105, y2 - 10);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            ctx.beginPath();
            ctx.moveTo(moveX - 120, y2);
            ctx.lineTo(moveX - 120, y2 - 20);
            ctx.lineTo(moveX - 135, y2 - 10);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            ctx.beginPath();
            ctx.moveTo(moveX - 150, y2);
            ctx.lineTo(moveX - 150, y2 - 20);
            ctx.lineTo(moveX - 165, y2 - 10);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            ctx.beginPath();
            ctx.moveTo(moveX - 180, y2);
            ctx.lineTo(moveX - 180, y2 - 20);
            ctx.lineTo(moveX - 195, y2 - 10);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            ctx.beginPath();
            ctx.moveTo(moveX - 210, y2);
            ctx.lineTo(moveX - 210, y2 - 20);
            ctx.lineTo(moveX - 225, y2 - 10);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            ctx.beginPath();
            ctx.moveTo(moveX - 240, y2);
            ctx.lineTo(moveX - 240, y2 - 20);
            ctx.lineTo(moveX - 255, y2 - 10);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            ctx.beginPath();
            ctx.moveTo(moveX - 240, y2);
            ctx.lineTo(moveX - 240, y2 - 20);
            ctx.lineTo(moveX - 255, y2 - 10);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            if (moveX <= 410) {
                moveSize2 = 0;
            }

            moveSize3 += 5;
            const moveY2 = y3 + moveSize3;

            ctx.beginPath();
            ctx.moveTo(x3, moveY2);
            ctx.lineTo(x3 + 20, moveY2);
            ctx.lineTo(x3 + 10, moveY2 + 15);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            ctx.beginPath();
            ctx.moveTo(x3, moveY2 + 30);
            ctx.lineTo(x3 + 20, moveY2 + 30);
            ctx.lineTo(x3 + 10, moveY2 + 45);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            if (moveY2 >= 200) {
                moveSize3 = 0;
            }

        }, 100);
        return animate;
    }

    /**
     * 주조->1차전단 애니메이션 Method
     * @param {*} ctx 
     */
    processNode3rd(ctx) {

        const x = 580;
        const y = 230;
        let moveSize = 0;

        const animate = setInterval(() => {
            ctx.clearRect(570, y - 20, 200, 40);
            moveSize += 5;
            const moveX = x + moveSize;

            ctx.beginPath();
            ctx.moveTo(moveX, y);
            ctx.lineTo(moveX + 15, y - 10);
            ctx.lineTo(moveX, y - 20);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            ctx.beginPath();
            ctx.moveTo(moveX + 30, y);
            ctx.lineTo(moveX + 45, y - 10);
            ctx.lineTo(moveX + 30, y - 20);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            ctx.beginPath();
            ctx.moveTo(moveX + 60, y);
            ctx.lineTo(moveX + 75, y - 10);
            ctx.lineTo(moveX + 60, y - 20);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            if (moveX >= 700) {
                moveSize = 0;
            }
        }, 100);
        return animate;
    }

    /**
         * 1차전단->2차전단 애니메이션 Method
         * @param {*} ctx 
         */
    processNode4th(ctx) {
        const x = 870;
        const y = 230;
        let moveSize = 0;

        const animate = setInterval(() => {
            ctx.clearRect(860, y - 20, 200, 40);
            moveSize += 5;
            const moveX = x + moveSize;

            ctx.beginPath();
            ctx.moveTo(moveX, y);
            ctx.lineTo(moveX + 15, y - 10);
            ctx.lineTo(moveX, y - 20);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            ctx.beginPath();
            ctx.moveTo(moveX + 30, y);
            ctx.lineTo(moveX + 45, y - 10);
            ctx.lineTo(moveX + 30, y - 20);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            ctx.beginPath();
            ctx.moveTo(moveX + 60, y);
            ctx.lineTo(moveX + 75, y - 10);
            ctx.lineTo(moveX + 60, y - 20);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            if (moveX >= 1000) {
                moveSize = 0;
            }
        }, 100);
        return animate;
    }

    /**
     * 1차전단->정정 애니메이션 Method
     * @param {*} ctx 
     */
    processNode5th(ctx) {

        const x1 = 750;
        const y1 = 250;
        const x2 = 765;
        const y2 = 330;
        const x3 = 1300;
        const y3 = 330;
        let moveSize1 = 0;
        let moveSize2 = 0;
        let moveSize3 = 0;

        const animate = setInterval(() => {
            ctx.clearRect(700, 250, 640, 100);
            moveSize1 += 5;
            const moveY1 = y1 + moveSize1;

            ctx.beginPath();
            ctx.moveTo(x1, moveY1);
            ctx.lineTo(x1 + 20, moveY1);
            ctx.lineTo(x1 + 10, moveY1 + 15);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            ctx.beginPath();
            ctx.moveTo(x1, moveY1 + 30);
            ctx.lineTo(x1 + 20, moveY1 + 30);
            ctx.lineTo(x1 + 10, moveY1 + 45);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            if (moveY1 >= 300) {
                moveSize1 = 0;
            }

            moveSize2 += 5;
            const moveX = x2 + moveSize2;

            ctx.beginPath();
            ctx.moveTo(moveX, y2);
            ctx.lineTo(moveX + 15, y2 - 10);
            ctx.lineTo(moveX, y2 - 20);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            ctx.beginPath();
            ctx.moveTo(moveX + 30, y2);
            ctx.lineTo(moveX + 45, y2 - 10);
            ctx.lineTo(moveX + 30, y2 - 20);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            ctx.beginPath();
            ctx.moveTo(moveX + 60, y2);
            ctx.lineTo(moveX + 75, y2 - 10);
            ctx.lineTo(moveX + 60, y2 - 20);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            ctx.beginPath();
            ctx.moveTo(moveX + 90, y2);
            ctx.lineTo(moveX + 105, y2 - 10);
            ctx.lineTo(moveX + 90, y2 - 20);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            ctx.beginPath();
            ctx.moveTo(moveX + 120, y2);
            ctx.lineTo(moveX + 135, y2 - 10);
            ctx.lineTo(moveX + 120, y2 - 20);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            ctx.beginPath();
            ctx.moveTo(moveX + 150, y2);
            ctx.lineTo(moveX + 165, y2 - 10);
            ctx.lineTo(moveX + 150, y2 - 20);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            ctx.beginPath();
            ctx.moveTo(moveX + 180, y2);
            ctx.lineTo(moveX + 195, y2 - 10);
            ctx.lineTo(moveX + 180, y2 - 20);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            ctx.beginPath();
            ctx.moveTo(moveX + 210, y2);
            ctx.lineTo(moveX + 225, y2 - 10);
            ctx.lineTo(moveX + 210, y2 - 20);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            ctx.beginPath();
            ctx.moveTo(moveX + 240, y2);
            ctx.lineTo(moveX + 255, y2 - 10);
            ctx.lineTo(moveX + 240, y2 - 20);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            ctx.beginPath();
            ctx.moveTo(moveX + 270, y2);
            ctx.lineTo(moveX + 285, y2 - 10);
            ctx.lineTo(moveX + 270, y2 - 20);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            ctx.beginPath();
            ctx.moveTo(moveX + 300, y2);
            ctx.lineTo(moveX + 315, y2 - 10);
            ctx.lineTo(moveX + 300, y2 - 20);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            ctx.beginPath();
            ctx.moveTo(moveX + 330, y2);
            ctx.lineTo(moveX + 345, y2 - 10);
            ctx.lineTo(moveX + 330, y2 - 20);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            ctx.beginPath();
            ctx.moveTo(moveX + 360, y2);
            ctx.lineTo(moveX + 375, y2 - 10);
            ctx.lineTo(moveX + 360, y2 - 20);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            ctx.beginPath();
            ctx.moveTo(moveX + 390, y2);
            ctx.lineTo(moveX + 405, y2 - 10);
            ctx.lineTo(moveX + 390, y2 - 20);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            ctx.beginPath();
            ctx.moveTo(moveX + 420, y2);
            ctx.lineTo(moveX + 435, y2 - 10);
            ctx.lineTo(moveX + 420, y2 - 20);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            ctx.beginPath();
            ctx.moveTo(moveX + 450, y2);
            ctx.lineTo(moveX + 465, y2 - 10);
            ctx.lineTo(moveX + 450, y2 - 20);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            ctx.beginPath();
            ctx.moveTo(moveX + 480, y2);
            ctx.lineTo(moveX + 495, y2 - 10);
            ctx.lineTo(moveX + 480, y2 - 20);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            if (moveX >= 810) {
                moveSize2 = 0;
            }

            moveSize3 += 5;
            const moveY2 = y3 - moveSize3;

            ctx.beginPath();
            ctx.moveTo(x3, moveY2);
            ctx.lineTo(x3 + 20, moveY2);
            ctx.lineTo(x3 + 10, moveY2 - 15);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            ctx.beginPath();
            ctx.moveTo(x3, moveY2 - 30);
            ctx.lineTo(x3 + 20, moveY2 - 30);
            ctx.lineTo(x3 + 10, moveY2 - 45);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            if (moveY2 <= 220) {
                moveSize3 = 0;
            }

        }, 100);
        return animate;
    }

    /**
     * 2차전단->정정 애니메이션 Method
     * @param {*} ctx 
     */
    processNode6th(ctx) {
        const x = 1180;
        const y = 230;
        let moveSize = 0;

        const animate = setInterval(() => {
            ctx.clearRect(1170, y - 20, 200, 40);
            moveSize += 5;
            const moveX = x + moveSize;

            ctx.beginPath();
            ctx.moveTo(moveX, y);
            ctx.lineTo(moveX + 15, y - 10);
            ctx.lineTo(moveX, y - 20);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            ctx.beginPath();
            ctx.moveTo(moveX + 30, y);
            ctx.lineTo(moveX + 45, y - 10);
            ctx.lineTo(moveX + 30, y - 20);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            ctx.beginPath();
            ctx.moveTo(moveX + 60, y);
            ctx.lineTo(moveX + 75, y - 10);
            ctx.lineTo(moveX + 60, y - 20);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            if (moveX >= 1300) {
                moveSize = 0;
            }
        }, 100);
        return animate;
    }

    /**
     * 정정->장입 애니메이션 Method
     * @param {*} ctx 
     */
    processNode7th(ctx) {
        const x1 = 1360;
        const y1 = 190;
        const x2 = 1360;
        const y2 = 120;
        let moveSize1 = 0;
        let moveSize2 = 0;

        const animate = setInterval(() => {
            ctx.clearRect(1300, 100, 400, 100);
            moveSize1 += 5;
            const moveY = y1 - moveSize1;

            ctx.beginPath();
            ctx.moveTo(x1, moveY);
            ctx.lineTo(x1 + 20, moveY);
            ctx.lineTo(x1 + 10, moveY - 15);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            ctx.beginPath();
            ctx.moveTo(x1, moveY - 30);
            ctx.lineTo(x1 + 20, moveY - 30);
            ctx.lineTo(x1 + 10, moveY - 45);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            if (moveY <= 160) {
                moveSize1 = 0;
            }

            moveSize2 += 5;
            const moveX = x2 + moveSize2;

            ctx.beginPath();
            ctx.moveTo(moveX, y2);
            ctx.lineTo(moveX + 15, y2 - 10);
            ctx.lineTo(moveX, y2 - 20);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            ctx.beginPath();
            ctx.moveTo(moveX + 30, y2);
            ctx.lineTo(moveX + 45, y2 - 10);
            ctx.lineTo(moveX + 30, y2 - 20);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            ctx.beginPath();
            ctx.moveTo(moveX + 60, y2);
            ctx.lineTo(moveX + 75, y2 - 10);
            ctx.lineTo(moveX + 60, y2 - 20);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            ctx.beginPath();
            ctx.moveTo(moveX + 90, y2);
            ctx.lineTo(moveX + 105, y2 - 10);
            ctx.lineTo(moveX + 90, y2 - 20);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            ctx.beginPath();
            ctx.moveTo(moveX + 120, y2);
            ctx.lineTo(moveX + 135, y2 - 10);
            ctx.lineTo(moveX + 120, y2 - 20);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            ctx.beginPath();
            ctx.moveTo(moveX + 150, y2);
            ctx.lineTo(moveX + 165, y2 - 10);
            ctx.lineTo(moveX + 150, y2 - 20);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            ctx.beginPath();
            ctx.moveTo(moveX + 180, y2);
            ctx.lineTo(moveX + 195, y2 - 10);
            ctx.lineTo(moveX + 180, y2 - 20);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            if (moveX >= 1400) {
                moveSize2 = 0;
            }

        }, 100);
        return animate;
    }

    /**
     * 정정->Scrap 애니메이션 Method
     * @param {*} ctx 
     */
    processNode8th(ctx) {
        const x1 = 1360;
        const y1 = 250;
        const x2 = 1360;
        const y2 = 330;
        let moveSize1 = 0;
        let moveSize2 = 0;

        const animate = setInterval(() => {
            ctx.clearRect(1350, 250, 400, 120);

            moveSize1 += 5;
            const moveY = y1 + moveSize1;

            ctx.beginPath();
            ctx.moveTo(x1, moveY);
            ctx.lineTo(x1 + 20, moveY);
            ctx.lineTo(x1 + 10, moveY + 15);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            ctx.beginPath();
            ctx.moveTo(x1, moveY + 30);
            ctx.lineTo(x1 + 20, moveY + 30);
            ctx.lineTo(x1 + 10, moveY + 45);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            if (moveY >= 300) {
                moveSize1 = 0;
            }

            moveSize2 += 5;
            const moveX = x2 + moveSize2;

            ctx.beginPath();
            ctx.moveTo(moveX, y2);
            ctx.lineTo(moveX + 15, y2 - 10);
            ctx.lineTo(moveX, y2 - 20);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            ctx.beginPath();
            ctx.moveTo(moveX + 30, y2);
            ctx.lineTo(moveX + 45, y2 - 10);
            ctx.lineTo(moveX + 30, y2 - 20);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            ctx.beginPath();
            ctx.moveTo(moveX + 60, y2);
            ctx.lineTo(moveX + 75, y2 - 10);
            ctx.lineTo(moveX + 60, y2 - 20);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            ctx.beginPath();
            ctx.moveTo(moveX + 90, y2);
            ctx.lineTo(moveX + 105, y2 - 10);
            ctx.lineTo(moveX + 90, y2 - 20);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            ctx.beginPath();
            ctx.moveTo(moveX + 120, y2);
            ctx.lineTo(moveX + 135, y2 - 10);
            ctx.lineTo(moveX + 120, y2 - 20);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            ctx.beginPath();
            ctx.moveTo(moveX + 150, y2);
            ctx.lineTo(moveX + 165, y2 - 10);
            ctx.lineTo(moveX + 150, y2 - 20);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            ctx.beginPath();
            ctx.moveTo(moveX + 180, y2);
            ctx.lineTo(moveX + 195, y2 - 10);
            ctx.lineTo(moveX + 180, y2 - 20);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            if (moveX >= 1400) {
                moveSize2 = 0;
            }

        }, 100);
        return animate;
    }
}

export default FlowChartModel;