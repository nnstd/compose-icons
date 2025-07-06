package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DoorOpen: ImageVector
    get() {
        if (_DoorOpen != null) {
            return _DoorOpen!!
        }
        _DoorOpen = ImageVector.Builder(
            name = "DoorOpen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3f)
                curveTo(10.89f, 3f, 10f, 3.89f, 10f, 5f)
                horizontalLineTo(3f)
                verticalLineTo(19f)
                horizontalLineTo(2f)
                verticalLineTo(21f)
                horizontalLineTo(22f)
                verticalLineTo(19f)
                horizontalLineTo(21f)
                verticalLineTo(5f)
                curveTo(21f, 3.89f, 20.11f, 3f, 19f, 3f)
                horizontalLineTo(12f)
                moveTo(12f, 5f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                horizontalLineTo(12f)
                verticalLineTo(5f)
                moveTo(5f, 11f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                horizontalLineTo(5f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _DoorOpen!!
    }

@Suppress("ObjectPropertyName")
private var _DoorOpen: ImageVector? = null
