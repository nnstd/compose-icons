package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CarDoor: ImageVector
    get() {
        if (_CarDoor != null) {
            return _CarDoor!!
        }
        _CarDoor = ImageVector.Builder(
            name = "CarDoor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 14f)
                horizontalLineTo(16f)
                verticalLineTo(16f)
                horizontalLineTo(19f)
                verticalLineTo(14f)
                moveTo(22f, 21f)
                horizontalLineTo(3f)
                verticalLineTo(11f)
                lineTo(11f, 3f)
                horizontalLineTo(21f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 4f)
                verticalLineTo(21f)
                moveTo(11.83f, 5f)
                lineTo(5.83f, 11f)
                horizontalLineTo(20f)
                verticalLineTo(5f)
                horizontalLineTo(11.83f)
                close()
            }
        }.build()

        return _CarDoor!!
    }

@Suppress("ObjectPropertyName")
private var _CarDoor: ImageVector? = null
