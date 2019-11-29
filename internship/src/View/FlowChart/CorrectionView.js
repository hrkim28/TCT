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
                                <Icon name='credit card' />
                                <Step.Content>
                                    <Step.Title>정정</Step.Title>
                                    <Step.Description>주편 및 슬라브 마감처리</Step.Description>
                                </Step.Content>
                            </Step>
                            :
                            <Step active>
                                <Icon name='credit card' />
                                <Step.Content>
                                    <Step.Title>정정</Step.Title>
                                    <Step.Description>주편 및 슬라브 마감처리</Step.Description>
                                </Step.Content>
                            </Step>}
                </Step.Group>
            </div>
        );
    }
}

export default CorrectionView;
