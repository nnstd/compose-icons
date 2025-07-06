package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SatelliteVariant: ImageVector
    get() {
        if (_SatelliteVariant != null) {
            return _SatelliteVariant!!
        }
        _SatelliteVariant = ImageVector.Builder(
            name = "SatelliteVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.62f, 1f)
                lineTo(17.28f, 6.67f)
                lineTo(15.16f, 8.79f)
                lineTo(13.04f, 6.67f)
                lineTo(11.62f, 8.09f)
                lineTo(13.95f, 10.41f)
                lineTo(12.79f, 11.58f)
                lineTo(13.24f, 12.04f)
                curveTo(14.17f, 11.61f, 15.31f, 11.77f, 16.07f, 12.54f)
                lineTo(12.54f, 16.07f)
                curveTo(11.77f, 15.31f, 11.61f, 14.17f, 12.04f, 13.24f)
                lineTo(11.58f, 12.79f)
                lineTo(10.41f, 13.95f)
                lineTo(8.09f, 11.62f)
                lineTo(6.67f, 13.04f)
                lineTo(8.79f, 15.16f)
                lineTo(6.67f, 17.28f)
                lineTo(1f, 11.62f)
                lineTo(3.14f, 9.5f)
                lineTo(5.26f, 11.62f)
                lineTo(6.67f, 10.21f)
                lineTo(3.84f, 7.38f)
                curveTo(3.06f, 6.6f, 3.06f, 5.33f, 3.84f, 4.55f)
                lineTo(4.55f, 3.84f)
                curveTo(5.33f, 3.06f, 6.6f, 3.06f, 7.38f, 3.84f)
                lineTo(10.21f, 6.67f)
                lineTo(11.62f, 5.26f)
                lineTo(9.5f, 3.14f)
                lineTo(11.62f, 1f)
                moveTo(18f, 14f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 18f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 14f)
                horizontalLineTo(18f)
                moveTo(22f, 14f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 22f)
                verticalLineTo(20f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 14f)
                horizontalLineTo(22f)
                close()
            }
        }.build()

        return _SatelliteVariant!!
    }

@Suppress("ObjectPropertyName")
private var _SatelliteVariant: ImageVector? = null
