import React, { Component } from 'react';
import { Form, Radio, Button, Icon } from 'semantic-ui-react'
import "./ControlView.css";

class ControlView extends Component {

    render() {
        const searchParam = this.props.searchParam;

        const steelGrdOptions = [
            {
                key: '',
                text: '',
                value: ''
            },
            {
                key: 'P',
                text: '일반',
                value: 'P',
            },
            {
                key: 'T',
                text: 'PCR',
                value: 'T',
            },
        ]

        
        return (
            <div className="ControlView">
                <Form massive widths={10}>
                    <Form.Group>
                        <Form.Field width={3}>
                            <Form.Select
                                className="ControlSelect"
                                fluid label='복제방식'
                                value={searchParam.steelGrd}
                                options={steelGrdOptions}
                                onChange={(e, option) =>
                                    this.props.onChangeSteelGrd(option.value)} />
                        </Form.Field>
                        <Form.Field width={2}>
                            <label>복제세포 상태</label>
                            <Radio
                                className="ControlRadio"
                                label='양호'
                                name='radioGroup'
                                value={true}
                                checked={searchParam.qualityRes === true}
                                onChange={(e) => this.props.onChangeQualityTest()}
                            />
                            <Radio
                                className="ControlRadio"
                                label='불량'
                                name='radioGroup'
                                value={false}
                                checked={searchParam.qualityRes === false}
                                onChange={(e) => this.props.onChangeQualityTest()}
                            />
                        </Form.Field>
                        <Form.Field width={2}>
                            <label>복제조건</label>
                            <input
                                className="ControlInput"
                                type='range'
                                min={0}
                                max={5}
                                value={searchParam.refinedRes}
                                onChange={(e) => this.props.onChangeRefine(e.target.value)}
                            />
                        </Form.Field>
                        <Form.Field>
                            <div className="ControlButton">
                            <Button content='Start' primary
                                onClick={(e) => {
                                    this.props.onProgress(searchParam);
                                }} />
                            <Button secondary onClick={(e) => this.props.onRestart()}>
                                <Icon fitted name='undo' />
                            </Button>
                            </div>
                        </Form.Field>
                    </Form.Group>
                </Form>
            </div>
        );
    }
}

export default ControlView;