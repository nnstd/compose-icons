package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RoomServiceOutline: ImageVector
    get() {
        if (_RoomServiceOutline != null) {
            return _RoomServiceOutline!!
        }
        _RoomServiceOutline = ImageVector.Builder(
            name = "RoomServiceOutline",
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
                moveTo(12f, 9.5f)
                curveTo(8.89f, 9.5f, 6.25f, 11.39f, 5.34f, 14f)
                horizontalLineTo(18.66f)
                curveTo(17.75f, 11.39f, 15.11f, 9.5f, 12f, 9.5f)
                close()
            }
        }.build()

        return _RoomServiceOutline!!
    }

@Suppress("ObjectPropertyName")
private var _RoomServiceOutline: ImageVector? = null
