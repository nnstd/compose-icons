package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HomeBattery: ImageVector
    get() {
        if (_HomeBattery != null) {
            return _HomeBattery!!
        }
        _HomeBattery = ImageVector.Builder(
            name = "HomeBattery",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 20f)
                lineTo(5f, 20f)
                verticalLineTo(12f)
                horizontalLineTo(2f)
                lineTo(12f, 3f)
                lineTo(14.78f, 5.5f)
                horizontalLineTo(14f)
                verticalLineTo(7.17f)
                curveTo(12.84f, 7.58f, 12f, 8.7f, 12f, 10f)
                verticalLineTo(20f)
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
                close()
            }
        }.build()

        return _HomeBattery!!
    }

@Suppress("ObjectPropertyName")
private var _HomeBattery: ImageVector? = null
