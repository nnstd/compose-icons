package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MusicNoteBluetoothOff: ImageVector
    get() {
        if (_MusicNoteBluetoothOff != null) {
            return _MusicNoteBluetoothOff!!
        }
        _MusicNoteBluetoothOff = ImageVector.Builder(
            name = "MusicNoteBluetoothOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 9.85f)
                lineTo(19.14f, 7f)
                horizontalLineTo(18.64f)
                verticalLineTo(10.79f)
                lineTo(16.35f, 8.5f)
                lineTo(15.64f, 9.21f)
                lineTo(18.43f, 12f)
                lineTo(15.64f, 14.79f)
                lineTo(16.35f, 15.5f)
                lineTo(18.64f, 13.21f)
                verticalLineTo(17f)
                horizontalLineTo(19.14f)
                lineTo(22f, 14.15f)
                lineTo(19.85f, 12f)
                lineTo(22f, 9.85f)
                moveTo(19.64f, 8.91f)
                lineTo(20.58f, 9.85f)
                lineTo(19.64f, 10.79f)
                verticalLineTo(8.91f)
                moveTo(20.58f, 14.15f)
                lineTo(19.64f, 15.09f)
                verticalLineTo(13.21f)
                lineTo(20.58f, 14.15f)
                moveTo(1.96f, 3f)
                lineTo(0.687f, 4.27f)
                lineTo(9.69f, 13.27f)
                verticalLineTo(13.55f)
                curveTo(9.1f, 13.21f, 8.42f, 13f, 7.69f, 13f)
                curveTo(5.5f, 13f, 3.69f, 14.79f, 3.69f, 17f)
                reflectiveCurveTo(5.5f, 21f, 7.69f, 21f)
                reflectiveCurveTo(11.69f, 19.21f, 11.69f, 17f)
                verticalLineTo(15.27f)
                lineTo(17.42f, 21f)
                lineTo(18.69f, 19.73f)
                lineTo(1.96f, 3f)
                moveTo(11.69f, 7f)
                horizontalLineTo(15.69f)
                verticalLineTo(3f)
                horizontalLineTo(9.69f)
                verticalLineTo(8.18f)
                lineTo(11.69f, 10.18f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _MusicNoteBluetoothOff!!
    }

@Suppress("ObjectPropertyName")
private var _MusicNoteBluetoothOff: ImageVector? = null
