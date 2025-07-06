package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MeterGas: ImageVector
    get() {
        if (_MeterGas != null) {
            return _MeterGas!!
        }
        _MeterGas = ImageVector.Builder(
            name = "MeterGas",
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
                moveTo(12f, 18f)
                curveTo(10.62f, 18f, 9.5f, 16.9f, 9.5f, 15.54f)
                curveTo(9.5f, 14.45f, 9.93f, 14.15f, 12f, 11.75f)
                curveTo(14.05f, 14.13f, 14.5f, 14.45f, 14.5f, 15.54f)
                curveTo(14.5f, 16.9f, 13.38f, 18f, 12f, 18f)
                moveTo(16f, 10f)
                horizontalLineTo(8f)
                verticalLineTo(8f)
                horizontalLineTo(16f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _MeterGas!!
    }

@Suppress("ObjectPropertyName")
private var _MeterGas: ImageVector? = null
