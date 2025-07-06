package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VibrateOff: ImageVector
    get() {
        if (_VibrateOff != null) {
            return _VibrateOff!!
        }
        _VibrateOff = ImageVector.Builder(
            name = "VibrateOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.2f, 5f)
                lineTo(6.55f, 3.35f)
                curveTo(6.81f, 3.12f, 7.15f, 3f, 7.5f, 3f)
                horizontalLineTo(16.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 4.5f)
                verticalLineTo(14.8f)
                lineTo(16f, 12.8f)
                verticalLineTo(5f)
                horizontalLineTo(8.2f)
                moveTo(0f, 15f)
                horizontalLineTo(2f)
                verticalLineTo(9f)
                horizontalLineTo(0f)
                verticalLineTo(15f)
                moveTo(21f, 17f)
                verticalLineTo(7f)
                horizontalLineTo(19f)
                verticalLineTo(15.8f)
                lineTo(20.2f, 17f)
                horizontalLineTo(21f)
                moveTo(3f, 17f)
                horizontalLineTo(5f)
                verticalLineTo(7f)
                horizontalLineTo(3f)
                verticalLineTo(17f)
                moveTo(18f, 17.35f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(18f, 19.85f)
                curveTo(17.83f, 20.54f, 17.21f, 21f, 16.5f, 21f)
                horizontalLineTo(7.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 19.5f)
                verticalLineTo(7.89f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(6.09f, 5.44f)
                lineTo(8f, 7.34f)
                lineTo(16f, 15.34f)
                lineTo(18f, 17.34f)
                verticalLineTo(17.35f)
                moveTo(16f, 17.89f)
                lineTo(8f, 9.89f)
                verticalLineTo(19f)
                horizontalLineTo(16f)
                verticalLineTo(17.89f)
                moveTo(22f, 9f)
                verticalLineTo(15f)
                horizontalLineTo(24f)
                verticalLineTo(9f)
                horizontalLineTo(22f)
                close()
            }
        }.build()

        return _VibrateOff!!
    }

@Suppress("ObjectPropertyName")
private var _VibrateOff: ImageVector? = null
