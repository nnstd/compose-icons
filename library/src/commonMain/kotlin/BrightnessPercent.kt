package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BrightnessPercent: ImageVector
    get() {
        if (_BrightnessPercent != null) {
            return _BrightnessPercent!!
        }
        _BrightnessPercent = ImageVector.Builder(
            name = "BrightnessPercent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.04f, 8.71f)
                verticalLineTo(4f)
                horizontalLineTo(15.34f)
                lineTo(12f, 0.69f)
                lineTo(8.71f, 4f)
                horizontalLineTo(4f)
                verticalLineTo(8.71f)
                lineTo(0.69f, 12f)
                lineTo(4f, 15.34f)
                verticalLineTo(20.04f)
                horizontalLineTo(8.71f)
                lineTo(12f, 23.35f)
                lineTo(15.34f, 20.04f)
                horizontalLineTo(20.04f)
                verticalLineTo(15.34f)
                lineTo(23.35f, 12f)
                lineTo(20.04f, 8.71f)
                moveTo(8.83f, 7.05f)
                curveTo(9.81f, 7.05f, 10.6f, 7.84f, 10.6f, 8.83f)
                arcTo(1.77f, 1.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.83f, 10.6f)
                curveTo(7.84f, 10.6f, 7.05f, 9.81f, 7.05f, 8.83f)
                curveTo(7.05f, 7.84f, 7.84f, 7.05f, 8.83f, 7.05f)
                moveTo(15.22f, 17f)
                curveTo(14.24f, 17f, 13.45f, 16.2f, 13.45f, 15.22f)
                arcTo(1.77f, 1.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.22f, 13.45f)
                curveTo(16.2f, 13.45f, 17f, 14.24f, 17f, 15.22f)
                arcTo(1.78f, 1.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.22f, 17f)
                moveTo(8.5f, 17.03f)
                lineTo(7f, 15.53f)
                lineTo(15.53f, 7f)
                lineTo(17.03f, 8.5f)
                lineTo(8.5f, 17.03f)
                close()
            }
        }.build()

        return _BrightnessPercent!!
    }

@Suppress("ObjectPropertyName")
private var _BrightnessPercent: ImageVector? = null
