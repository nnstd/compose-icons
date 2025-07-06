package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DoorClosed: ImageVector
    get() {
        if (_DoorClosed != null) {
            return _DoorClosed!!
        }
        _DoorClosed = ImageVector.Builder(
            name = "DoorClosed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 11f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                horizontalLineTo(16f)
                verticalLineTo(11f)
                moveTo(12f, 3f)
                horizontalLineTo(19f)
                curveTo(20.11f, 3f, 21f, 3.89f, 21f, 5f)
                verticalLineTo(19f)
                horizontalLineTo(22f)
                verticalLineTo(21f)
                horizontalLineTo(2f)
                verticalLineTo(19f)
                horizontalLineTo(10f)
                verticalLineTo(5f)
                curveTo(10f, 3.89f, 10.89f, 3f, 12f, 3f)
                moveTo(12f, 5f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                horizontalLineTo(12f)
                close()
            }
        }.build()

        return _DoorClosed!!
    }

@Suppress("ObjectPropertyName")
private var _DoorClosed: ImageVector? = null
