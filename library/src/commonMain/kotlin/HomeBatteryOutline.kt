package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HomeBatteryOutline: ImageVector
    get() {
        if (_HomeBatteryOutline != null) {
            return _HomeBatteryOutline!!
        }
        _HomeBatteryOutline = ImageVector.Builder(
            name = "HomeBatteryOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 9f)
                horizontalLineTo(16f)
                verticalLineTo(7.5f)
                horizontalLineTo(20f)
                verticalLineTo(9f)
                horizontalLineTo(21f)
                curveTo(21.55f, 9f, 22f, 9.45f, 22f, 10f)
                verticalLineTo(21f)
                curveTo(22f, 21.55f, 21.55f, 22f, 21f, 22f)
                horizontalLineTo(15f)
                curveTo(14.45f, 22f, 14f, 21.55f, 14f, 21f)
                verticalLineTo(10f)
                curveTo(14f, 9.45f, 14.45f, 9f, 15f, 9f)
                moveTo(16f, 11f)
                verticalLineTo(14f)
                horizontalLineTo(20f)
                verticalLineTo(11f)
                horizontalLineTo(16f)
                moveTo(12f, 5.69f)
                lineTo(7f, 10.19f)
                verticalLineTo(18f)
                horizontalLineTo(12f)
                verticalLineTo(20f)
                horizontalLineTo(5f)
                verticalLineTo(12f)
                horizontalLineTo(2f)
                lineTo(12f, 3f)
                lineTo(14.78f, 5.5f)
                horizontalLineTo(14f)
                verticalLineTo(7.17f)
                lineTo(13.76f, 7.27f)
                lineTo(12f, 5.69f)
                close()
            }
        }.build()

        return _HomeBatteryOutline!!
    }

@Suppress("ObjectPropertyName")
private var _HomeBatteryOutline: ImageVector? = null
