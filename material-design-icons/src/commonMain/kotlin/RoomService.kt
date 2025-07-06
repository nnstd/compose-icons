package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RoomService: ImageVector
    get() {
        if (_RoomService != null) {
            return _RoomService!!
        }
        _RoomService = ImageVector.Builder(
            name = "RoomService",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 7f)
                curveTo(14f, 7.24f, 13.96f, 7.47f, 13.88f, 7.69f)
                curveTo(17.95f, 8.5f, 21f, 11.91f, 21f, 16f)
                horizontalLineTo(3f)
                curveTo(3f, 11.91f, 6.05f, 8.5f, 10.12f, 7.69f)
                curveTo(10.04f, 7.47f, 10f, 7.24f, 10f, 7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 5f)
                moveTo(22f, 19f)
                horizontalLineTo(2f)
                verticalLineTo(17f)
                horizontalLineTo(22f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _RoomService!!
    }

@Suppress("ObjectPropertyName")
private var _RoomService: ImageVector? = null
