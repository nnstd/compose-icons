package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LaptopAccount: ImageVector
    get() {
        if (_LaptopAccount != null) {
            return _LaptopAccount!!
        }
        _LaptopAccount = ImageVector.Builder(
            name = "LaptopAccount",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 4f)
                curveTo(21.1f, 4f, 22f, 4.89f, 22f, 6f)
                verticalLineTo(16f)
                curveTo(22f, 17.11f, 21.11f, 18f, 20f, 18f)
                horizontalLineTo(24f)
                verticalLineTo(20f)
                horizontalLineTo(0f)
                verticalLineTo(18f)
                horizontalLineTo(4f)
                curveTo(2.9f, 18f, 2f, 17.11f, 2f, 16f)
                verticalLineTo(6f)
                curveTo(2f, 4.89f, 2.89f, 4f, 4f, 4f)
                horizontalLineTo(20f)
                moveTo(20f, 6f)
                horizontalLineTo(4f)
                verticalLineTo(16f)
                horizontalLineTo(20f)
                verticalLineTo(6f)
                moveTo(12f, 12f)
                curveTo(14.21f, 12f, 16f, 12.9f, 16f, 14f)
                verticalLineTo(15f)
                horizontalLineTo(8f)
                verticalLineTo(14f)
                curveTo(8f, 12.9f, 9.79f, 12f, 12f, 12f)
                moveTo(12f, 7f)
                curveTo(13.11f, 7f, 14f, 7.9f, 14f, 9f)
                reflectiveCurveTo(13.11f, 11f, 12f, 11f)
                reflectiveCurveTo(10f, 10.11f, 10f, 9f)
                reflectiveCurveTo(10.9f, 7f, 12f, 7f)
                close()
            }
        }.build()

        return _LaptopAccount!!
    }

@Suppress("ObjectPropertyName")
private var _LaptopAccount: ImageVector? = null
