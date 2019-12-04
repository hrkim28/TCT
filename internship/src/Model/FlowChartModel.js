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
     * 공정진행 과정에 따라 해당 Route 애니메이션으로 표시하는 Method
     * @param {*} canvas 
     * @param {*} result 
     */
    animatedLine(canvas, result) {

        const ctx = canvas.getContext("2d");

        if (result.node[0] === true)  return this.processNode1st(ctx);
        else if (result.node[1] === true)  return this.processNode2nd(ctx);
        // else if (result.node[2] === true) return this.processNode3rd(ctx);
        else if (result.node[3] === true)  return this.processNode4th(ctx);
        // else if (result.node[4] === true) this.processNode5th(ctx);
        else if (result.node[5] === true)  return this.processNode6th(ctx);
        // else if (result.node[6] === true) this.processNode7th(ctx);
        // else if (result.node[7] === true) this.processNode8th(ctx);
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
                // clearInterval(animate);
            }
        }, 100);
        return animate;
    }

    /**
     * 주조 -> 제강 애니메이션 Method
     * @param {*} ctx 
     */
    processNode2nd(ctx) {

        const x = 450;
        const y = 180;
        let moveSize = 0;

        const animate = setInterval(() => {
            ctx.clearRect(100, 110, 400, 80);
            moveSize += 5;
            const moveY = y - moveSize;

            ctx.beginPath();
            ctx.moveTo(x, moveY);
            ctx.lineTo(x + 20, moveY);
            ctx.lineTo(x + 10, moveY - 15);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            ctx.beginPath();
            ctx.moveTo(x, moveY - 30);
            ctx.lineTo(x + 20, moveY - 30);
            ctx.lineTo(x + 10, moveY - 45);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            ctx.beginPath();
            ctx.moveTo(x, moveY - 60);
            ctx.lineTo(x + 20, moveY - 60);
            ctx.lineTo(x + 10, moveY - 75);
            ctx.closePath();
            ctx.fillStyle = "rgb(33,186,69)";
            ctx.fill();

            if (moveY <= 80) {
                clearInterval(animate);
                ctx.beginPath();
                ctx.moveTo(460, 190);
                ctx.lineTo(460, 120);
                ctx.lineTo(150, 120);
                ctx.lineTo(150, 190);
                ctx.lineWidth = 15;
                ctx.stroke();
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
                clearInterval(animate);
                ctx.beginPath();
                ctx.moveTo(860, 220);
                ctx.lineTo(950, 220);
                ctx.lineWidth = 15;
                ctx.stroke();
            }
        }, 100);
        return animate;
    }

    /**
     * 1차전단->정정 애니메이션 Method
     * @param {*} ctx 
     */
    processNode5th(ctx) {
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
                clearInterval(animate);
                ctx.beginPath();
                ctx.moveTo(860, 220);
                ctx.lineTo(950, 220);
                ctx.lineWidth = 15;
                ctx.stroke();
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
                clearInterval(animate);
                ctx.beginPath();
                ctx.moveTo(1170, 220);
                ctx.lineTo(1250, 220);
                ctx.lineWidth = 15;
                ctx.stroke();
            }
        }, 100);
        return animate;
    }

    /**
     * 정정->장입 애니메이션 Method
     * @param {*} ctx 
     */
    processNode7th(ctx) {
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
                clearInterval(animate);
                ctx.beginPath();
                ctx.moveTo(860, 220);
                ctx.lineTo(950, 220);
                ctx.lineWidth = 15;
                ctx.stroke();
            }
        }, 100);
        return animate;
    }

    /**
     * 정정->Scrap 애니메이션 Method
     * @param {*} ctx 
     */
    processNode8th(ctx) {
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
                clearInterval(animate);
                ctx.beginPath();
                ctx.moveTo(860, 220);
                ctx.lineTo(950, 220);
                ctx.lineWidth = 15;
                ctx.stroke();
            }
        }, 100);
        return animate;
    }
}

export default FlowChartModel;