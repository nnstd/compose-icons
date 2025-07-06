package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DoorSliding: ImageVector
    get() {
        if (_DoorSliding != null) {
            return _DoorSliding!!
        }
        _DoorSliding = ImageVector.Builder(
            name = "DoorSliding",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 13f)
                horizontalLineTo(8f)
                verticalLineTo(11f)
                horizontalLineTo(10f)
                verticalLineTo(13f)
                moveTo(16f, 11f)
                horizontalLineTo(14f)
                verticalLineTo(13f)
                horizontalLineTo(16f)
                verticalLineTo(11f)
                moveTo(21f, 19f)
                verticalLineTo(21f)
                horizontalLineTo(3f)
                verticalLineTo(19f)
                horizontalLineTo(4f)
                verticalLineTo(5f)
                curveTo(4f, 3.9f, 4.9f, 3f, 6f, 3f)
                horizontalLineTo(18f)
                curveTo(19.1f, 3f, 20f, 3.9f, 20f, 5f)
                verticalLineTo(19f)
                horizontalLineTo(21f)
                moveTo(11f, 5f)
                horizontalLineTo(6f)
                verticalLineTo(19f)
                horizontalLineTo(11f)
                verticalLineTo(5f)
                moveTo(18f, 5f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                horizontalLineTo(18f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return _DoorSliding!!
    }

@Suppress("ObjectPropertyName")
private var _DoorSliding: ImageVector? = null
