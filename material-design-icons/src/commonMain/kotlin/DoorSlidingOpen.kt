package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DoorSlidingOpen: ImageVector
    get() {
        if (_DoorSlidingOpen != null) {
            return _DoorSlidingOpen!!
        }
        _DoorSlidingOpen = ImageVector.Builder(
            name = "DoorSlidingOpen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(4f)
                verticalLineTo(11f)
                horizontalLineTo(6f)
                moveTo(22f, 5f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                horizontalLineTo(22f)
                verticalLineTo(5f)
                moveTo(7f, 5f)
                horizontalLineTo(2f)
                lineTo(2f, 19f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                moveTo(22f, 3f)
                curveTo(23.11f, 3f, 24f, 3.89f, 24f, 5f)
                verticalLineTo(21f)
                horizontalLineTo(0f)
                verticalLineTo(5f)
                curveTo(0f, 3.89f, 0.894f, 3f, 2f, 3f)
                horizontalLineTo(9f)
                verticalLineTo(19f)
                horizontalLineTo(15f)
                verticalLineTo(3f)
                horizontalLineTo(22f)
                moveTo(20f, 11f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                horizontalLineTo(20f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _DoorSlidingOpen!!
    }

@Suppress("ObjectPropertyName")
private var _DoorSlidingOpen: ImageVector? = null
