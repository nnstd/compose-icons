package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MeterGasOutline: ImageVector
    get() {
        if (_MeterGasOutline != null) {
            return _MeterGasOutline!!
        }
        _MeterGasOutline = ImageVector.Builder(
            name = "MeterGasOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 4f)
                horizontalLineTo(15f)
                verticalLineTo(2f)
                horizontalLineTo(13f)
                verticalLineTo(4f)
                horizontalLineTo(11f)
                verticalLineTo(2f)
                horizontalLineTo(9f)
                verticalLineTo(4f)
                horizontalLineTo(8f)
                curveTo(5.79f, 4f, 4f, 5.79f, 4f, 8f)
                verticalLineTo(18f)
                curveTo(4f, 20.21f, 5.79f, 22f, 8f, 22f)
                horizontalLineTo(16f)
                curveTo(18.21f, 22f, 20f, 20.21f, 20f, 18f)
                verticalLineTo(8f)
                curveTo(20f, 5.79f, 18.21f, 4f, 16f, 4f)
                moveTo(18f, 18f)
                curveTo(18f, 19.1f, 17.1f, 20f, 16f, 20f)
                horizontalLineTo(8f)
                curveTo(6.9f, 20f, 6f, 19.1f, 6f, 18f)
                verticalLineTo(8f)
                curveTo(6f, 6.9f, 6.9f, 6f, 8f, 6f)
                horizontalLineTo(16f)
                curveTo(17.1f, 6f, 18f, 6.9f, 18f, 8f)
                verticalLineTo(18f)
                moveTo(9.5f, 15.54f)
                curveTo(9.5f, 16.9f, 10.62f, 18f, 12f, 18f)
                reflectiveCurveTo(14.5f, 16.9f, 14.5f, 15.54f)
                curveTo(14.5f, 14.45f, 14.05f, 14.13f, 12f, 11.75f)
                curveTo(9.93f, 14.15f, 9.5f, 14.46f, 9.5f, 15.54f)
                moveTo(8f, 8f)
                horizontalLineTo(16f)
                verticalLineTo(10f)
                horizontalLineTo(8f)
                verticalLineTo(8f)
                close()
            }
        }.build()

        return _MeterGasOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MeterGasOutline: ImageVector? = null
