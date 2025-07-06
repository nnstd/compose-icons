package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FlipHorizontal: ImageVector
    get() {
        if (_FlipHorizontal != null) {
            return _FlipHorizontal!!
        }
        _FlipHorizontal = ImageVector.Builder(
            name = "FlipHorizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 21f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                horizontalLineTo(15f)
                moveTo(19f, 9f)
                horizontalLineTo(21f)
                verticalLineTo(7f)
                horizontalLineTo(19f)
                moveTo(3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.1f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(9f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                moveTo(19f, 3f)
                verticalLineTo(5f)
                horizontalLineTo(21f)
                curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                moveTo(11f, 23f)
                horizontalLineTo(13f)
                verticalLineTo(1f)
                horizontalLineTo(11f)
                moveTo(19f, 17f)
                horizontalLineTo(21f)
                verticalLineTo(15f)
                horizontalLineTo(19f)
                moveTo(15f, 5f)
                horizontalLineTo(17f)
                verticalLineTo(3f)
                horizontalLineTo(15f)
                moveTo(19f, 13f)
                horizontalLineTo(21f)
                verticalLineTo(11f)
                horizontalLineTo(19f)
                moveTo(19f, 21f)
                curveTo(20.1f, 21f, 21f, 20.1f, 21f, 19f)
                horizontalLineTo(19f)
                close()
            }
        }.build()

        return _FlipHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _FlipHorizontal: ImageVector? = null
