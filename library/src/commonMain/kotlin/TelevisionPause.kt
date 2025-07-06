package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TelevisionPause: ImageVector
    get() {
        if (_TelevisionPause != null) {
            return _TelevisionPause!!
        }
        _TelevisionPause = ImageVector.Builder(
            name = "TelevisionPause",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 3f)
                curveTo(1.89f, 3f, 1f, 3.89f, 1f, 5f)
                verticalLineTo(17f)
                curveTo(1f, 18.1f, 1.9f, 19f, 3f, 19f)
                horizontalLineTo(8f)
                verticalLineTo(21f)
                horizontalLineTo(16f)
                verticalLineTo(19f)
                horizontalLineTo(21f)
                curveTo(22.1f, 19f, 23f, 18.1f, 23f, 17f)
                verticalLineTo(5f)
                curveTo(23f, 3.89f, 22.1f, 3f, 21f, 3f)
                moveTo(3f, 5f)
                horizontalLineTo(21f)
                verticalLineTo(17f)
                horizontalLineTo(3f)
                moveTo(9f, 8f)
                verticalLineTo(14f)
                horizontalLineTo(11f)
                verticalLineTo(8f)
                moveTo(13f, 8f)
                verticalLineTo(14f)
                horizontalLineTo(15f)
                verticalLineTo(8f)
            }
        }.build()

        return _TelevisionPause!!
    }

@Suppress("ObjectPropertyName")
private var _TelevisionPause: ImageVector? = null
