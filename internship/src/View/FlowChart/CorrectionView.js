import React, { Component } from 'react';
import { Step, Icon } from 'semantic-ui-react'
import '../View.css';

class CorrectionView extends Component {
    render() {
        return (
            <div className="Correction">
                <Step.Group>
                    {
                        this.props.correction.result === true ?
                            <Step completed>
                                <Icon name='th' />
                                <Step.Content>
                                    <Step.Title>숙주분리</Step.Title>
                                    <Step.Description>숙주세포 분리 및 증식 세포 복제</Step.Description>
                                </Step.Content>
                            </Step>
                            :
                            <Step active>
                                <Icon name='th' />
                                <Step.Content>
                                    <Step.Title>숙주분리</Step.Title>
                                    <Step.Description>숙주세포 분리 및 증식 세포 복제</Step.Description>
                                </Step.Content>
                            </Step>}
                </Step.Group>
            </div>
        );
    }
}

export default CorrectionView;
