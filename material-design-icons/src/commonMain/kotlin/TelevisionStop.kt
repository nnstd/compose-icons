package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TelevisionStop: ImageVector
    get() {
        if (_TelevisionStop != null) {
            return _TelevisionStop!!
        }
        _TelevisionStop = ImageVector.Builder(
            name = "TelevisionStop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 3f)
                horizontalLineTo(21f)
                curveTo(22.1f, 3f, 23f, 3.89f, 23f, 5f)
                verticalLineTo(17f)
                curveTo(23f, 18.1f, 22.1f, 19f, 21f, 19f)
                horizontalLineTo(16f)
                verticalLineTo(21f)
                horizontalLineTo(8f)
                verticalLineTo(19f)
                horizontalLineTo(3f)
                curveTo(1.9f, 19f, 1f, 18.1f, 1f, 17f)
                verticalLineTo(5f)
                curveTo(1f, 3.89f, 1.89f, 3f, 3f, 3f)
                moveTo(3f, 5f)
                verticalLineTo(17f)
                horizontalLineTo(21f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                moveTo(9f, 8f)
                horizontalLineTo(15f)
                verticalLineTo(14f)
                horizontalLineTo(9f)
                verticalLineTo(8f)
                close()
            }
        }.build()

        return _TelevisionStop!!
    }

@Suppress("ObjectPropertyName")
private var _TelevisionStop: ImageVector? = null
