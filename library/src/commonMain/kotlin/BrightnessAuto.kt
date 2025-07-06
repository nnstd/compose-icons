package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BrightnessAuto: ImageVector
    get() {
        if (_BrightnessAuto != null) {
            return _BrightnessAuto!!
        }
        _BrightnessAuto = ImageVector.Builder(
            name = "BrightnessAuto",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.3f, 16f)
                lineTo(13.6f, 14f)
                horizontalLineTo(10.4f)
                lineTo(9.7f, 16f)
                horizontalLineTo(7.8f)
                lineTo(11f, 7f)
                horizontalLineTo(13f)
                lineTo(16.2f, 16f)
                horizontalLineTo(14.3f)
                moveTo(20f, 8.69f)
                verticalLineTo(4f)
                horizontalLineTo(15.31f)
                lineTo(12f, 0.69f)
                lineTo(8.69f, 4f)
                horizontalLineTo(4f)
                verticalLineTo(8.69f)
                lineTo(0.69f, 12f)
                lineTo(4f, 15.31f)
                verticalLineTo(20f)
                horizontalLineTo(8.69f)
                lineTo(12f, 23.31f)
                lineTo(15.31f, 20f)
                horizontalLineTo(20f)
                verticalLineTo(15.31f)
                lineTo(23.31f, 12f)
                lineTo(20f, 8.69f)
                moveTo(10.85f, 12.65f)
                horizontalLineTo(13.15f)
                lineTo(12f, 9f)
                lineTo(10.85f, 12.65f)
                close()
            }
        }.build()

        return _BrightnessAuto!!
    }

@Suppress("ObjectPropertyName")
private var _BrightnessAuto: ImageVector? = null
