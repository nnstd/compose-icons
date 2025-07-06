package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BorderRadius: ImageVector
    get() {
        if (_BorderRadius != null) {
            return _BorderRadius!!
        }
        _BorderRadius = ImageVector.Builder(
            name = "BorderRadius",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 16f)
                curveTo(3f, 18.8f, 5.2f, 21f, 8f, 21f)
                horizontalLineTo(10f)
                verticalLineTo(19f)
                horizontalLineTo(8f)
                curveTo(6.3f, 19f, 5f, 17.7f, 5f, 16f)
                verticalLineTo(14f)
                horizontalLineTo(3f)
                verticalLineTo(16f)
                moveTo(21f, 8f)
                curveTo(21f, 5.2f, 18.8f, 3f, 16f, 3f)
                horizontalLineTo(14f)
                verticalLineTo(5f)
                horizontalLineTo(16f)
                curveTo(17.7f, 5f, 19f, 6.3f, 19f, 8f)
                verticalLineTo(10f)
                horizontalLineTo(21f)
                verticalLineTo(8f)
                moveTo(16f, 21f)
                curveTo(18.8f, 21f, 21f, 18.8f, 21f, 16f)
                verticalLineTo(14f)
                horizontalLineTo(19f)
                verticalLineTo(16f)
                curveTo(19f, 17.7f, 17.7f, 19f, 16f, 19f)
                horizontalLineTo(14f)
                verticalLineTo(21f)
                horizontalLineTo(16f)
                moveTo(8f, 3f)
                curveTo(5.2f, 3f, 3f, 5.2f, 3f, 8f)
                verticalLineTo(10f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                curveTo(5f, 6.3f, 6.3f, 5f, 8f, 5f)
                horizontalLineTo(10f)
                verticalLineTo(3f)
                horizontalLineTo(8f)
                close()
            }
        }.build()

        return _BorderRadius!!
    }

@Suppress("ObjectPropertyName")
private var _BorderRadius: ImageVector? = null
