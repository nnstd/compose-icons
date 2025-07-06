package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HoopHouse: ImageVector
    get() {
        if (_HoopHouse != null) {
            return _HoopHouse!!
        }
        _HoopHouse = ImageVector.Builder(
            name = "HoopHouse",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 5f)
                curveTo(6.5f, 5f, 2f, 9.5f, 2f, 15f)
                verticalLineTo(21f)
                horizontalLineTo(22f)
                verticalLineTo(15f)
                curveTo(22f, 9.5f, 17.5f, 5f, 12f, 5f)
                moveTo(12f, 7f)
                curveTo(14.53f, 7f, 16.78f, 8.17f, 18.25f, 10f)
                horizontalLineTo(5.76f)
                curveTo(7.22f, 8.17f, 9.47f, 7f, 12f, 7f)
                moveTo(8f, 19f)
                horizontalLineTo(4f)
                verticalLineTo(15f)
                curveTo(4f, 13.94f, 4.21f, 12.93f, 4.58f, 12f)
                horizontalLineTo(8f)
                verticalLineTo(19f)
                moveTo(14f, 19f)
                horizontalLineTo(10f)
                verticalLineTo(12f)
                horizontalLineTo(14f)
                verticalLineTo(19f)
                moveTo(20f, 19f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(19.42f)
                curveTo(19.79f, 12.93f, 20f, 13.94f, 20f, 15f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _HoopHouse!!
    }

@Suppress("ObjectPropertyName")
private var _HoopHouse: ImageVector? = null
