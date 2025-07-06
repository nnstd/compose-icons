package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FlipVertical: ImageVector
    get() {
        if (_FlipVertical != null) {
            return _FlipVertical!!
        }
        _FlipVertical = ImageVector.Builder(
            name = "FlipVertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 15f)
                verticalLineTo(17f)
                horizontalLineTo(5f)
                verticalLineTo(15f)
                moveTo(15f, 19f)
                verticalLineTo(21f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(9f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(9f)
                horizontalLineTo(21f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                moveTo(21f, 19f)
                horizontalLineTo(19f)
                verticalLineTo(21f)
                curveTo(20.1f, 21f, 21f, 20.1f, 21f, 19f)
                moveTo(1f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(23f)
                verticalLineTo(11f)
                moveTo(7f, 19f)
                verticalLineTo(21f)
                horizontalLineTo(9f)
                verticalLineTo(19f)
                moveTo(19f, 15f)
                verticalLineTo(17f)
                horizontalLineTo(21f)
                verticalLineTo(15f)
                moveTo(11f, 19f)
                verticalLineTo(21f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                moveTo(3f, 19f)
                curveTo(3f, 20.1f, 3.9f, 21f, 5f, 21f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _FlipVertical!!
    }

@Suppress("ObjectPropertyName")
private var _FlipVertical: ImageVector? = null
