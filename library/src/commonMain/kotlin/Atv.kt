package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Atv: ImageVector
    get() {
        if (_Atv != null) {
            return _Atv!!
        }
        _Atv = ImageVector.Builder(
            name = "Atv",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 11f)
                curveTo(19.8f, 11f, 19.6f, 11f, 19.5f, 11.1f)
                lineTo(17.4f, 9f)
                horizontalLineTo(20f)
                verticalLineTo(6f)
                lineTo(16.3f, 7.9f)
                lineTo(13.4f, 5f)
                horizontalLineTo(9f)
                verticalLineTo(7f)
                horizontalLineTo(12.6f)
                lineTo(14.6f, 9f)
                horizontalLineTo(11f)
                lineTo(7f, 11f)
                lineTo(5f, 9f)
                horizontalLineTo(0f)
                verticalLineTo(11f)
                horizontalLineTo(4f)
                curveTo(1.8f, 11f, 0f, 12.8f, 0f, 15f)
                reflectiveCurveTo(1.8f, 19f, 4f, 19f)
                reflectiveCurveTo(8f, 17.2f, 8f, 15f)
                lineTo(10f, 17f)
                horizontalLineTo(13f)
                lineTo(16.5f, 10.9f)
                lineTo(17.5f, 11.9f)
                curveTo(16.6f, 12.6f, 16f, 13.8f, 16f, 15f)
                curveTo(16f, 17.2f, 17.8f, 19f, 20f, 19f)
                reflectiveCurveTo(24f, 17.2f, 24f, 15f)
                reflectiveCurveTo(22.2f, 11f, 20f, 11f)
                moveTo(4f, 17f)
                curveTo(2.9f, 17f, 2f, 16.1f, 2f, 15f)
                reflectiveCurveTo(2.9f, 13f, 4f, 13f)
                reflectiveCurveTo(6f, 13.9f, 6f, 15f)
                reflectiveCurveTo(5.1f, 17f, 4f, 17f)
                moveTo(20f, 17f)
                curveTo(18.9f, 17f, 18f, 16.1f, 18f, 15f)
                reflectiveCurveTo(18.9f, 13f, 20f, 13f)
                reflectiveCurveTo(22f, 13.9f, 22f, 15f)
                reflectiveCurveTo(21.1f, 17f, 20f, 17f)
                close()
            }
        }.build()

        return _Atv!!
    }

@Suppress("ObjectPropertyName")
private var _Atv: ImageVector? = null
