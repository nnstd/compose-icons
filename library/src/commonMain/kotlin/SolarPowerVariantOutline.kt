package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SolarPowerVariantOutline: ImageVector
    get() {
        if (_SolarPowerVariantOutline != null) {
            return _SolarPowerVariantOutline!!
        }
        _SolarPowerVariantOutline = ImageVector.Builder(
            name = "SolarPowerVariantOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 12f)
                horizontalLineTo(4f)
                lineTo(2f, 22f)
                horizontalLineTo(22f)
                lineTo(20f, 12f)
                moveTo(18.36f, 14f)
                lineTo(18.76f, 16f)
                horizontalLineTo(13f)
                verticalLineTo(14f)
                horizontalLineTo(18.36f)
                moveTo(11f, 14f)
                verticalLineTo(16f)
                horizontalLineTo(5.24f)
                lineTo(5.64f, 14f)
                horizontalLineTo(11f)
                moveTo(4.84f, 18f)
                horizontalLineTo(11f)
                verticalLineTo(20f)
                horizontalLineTo(4.44f)
                lineTo(4.84f, 18f)
                moveTo(13f, 20f)
                verticalLineTo(18f)
                horizontalLineTo(19.16f)
                lineTo(19.56f, 20f)
                horizontalLineTo(13f)
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
                horizontalLineTo(15f)
                curveTo(15f, 3.65f, 13.65f, 5f, 12f, 5f)
                reflectiveCurveTo(9f, 3.65f, 9f, 2f)
                horizontalLineTo(7f)
                curveTo(7f, 4.76f, 9.24f, 7f, 12f, 7f)
                close()
            }
        }.build()

        return _SolarPowerVariantOutline!!
    }

@Suppress("ObjectPropertyName")
private var _SolarPowerVariantOutline: ImageVector? = null
