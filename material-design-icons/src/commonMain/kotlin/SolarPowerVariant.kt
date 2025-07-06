package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SolarPowerVariant: ImageVector
    get() {
        if (_SolarPowerVariant != null) {
            return _SolarPowerVariant!!
        }
        _SolarPowerVariant = ImageVector.Builder(
            name = "SolarPowerVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.33f, 16f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(4f)
                lineTo(3.33f, 16f)
                moveTo(13f, 16f)
                horizontalLineTo(20.67f)
                lineTo(20f, 13f)
                horizontalLineTo(13f)
                verticalLineTo(16f)
                moveTo(21.11f, 18f)
                horizontalLineTo(13f)
                verticalLineTo(22f)
                horizontalLineTo(22f)
                lineTo(21.11f, 18f)
                moveTo(2f, 22f)
                horizontalLineTo(11f)
                verticalLineTo(18f)
                horizontalLineTo(2.89f)
                lineTo(2f, 22f)
                moveTo(11f, 8f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineTo(8f)
                moveTo(15.76f, 7.21f)
                lineTo(17.18f, 5.79f)
                lineTo(19.3f, 7.91f)
                lineTo(17.89f, 9.33f)
                lineTo(15.76f, 7.21f)
                moveTo(4.71f, 7.91f)
                lineTo(6.83f, 5.79f)
                lineTo(8.24f, 7.21f)
                lineTo(6.12f, 9.33f)
                lineTo(4.71f, 7.91f)
                moveTo(3f, 2f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                horizontalLineTo(3f)
                verticalLineTo(2f)
                moveTo(18f, 2f)
                horizontalLineTo(21f)
                verticalLineTo(4f)
                horizontalLineTo(18f)
                verticalLineTo(2f)
                moveTo(12f, 7f)
                curveTo(14.76f, 7f, 17f, 4.76f, 17f, 2f)
                horizontalLineTo(7f)
                curveTo(7f, 4.76f, 9.24f, 7f, 12f, 7f)
                close()
            }
        }.build()

        return _SolarPowerVariant!!
    }

@Suppress("ObjectPropertyName")
private var _SolarPowerVariant: ImageVector? = null
