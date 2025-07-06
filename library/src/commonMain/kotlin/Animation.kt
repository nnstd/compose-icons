package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Animation: ImageVector
    get() {
        if (_Animation != null) {
            return _Animation!!
        }
        _Animation = ImageVector.Builder(
            name = "Animation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 2f)
                curveTo(2.89f, 2f, 2f, 2.89f, 2f, 4f)
                verticalLineTo(14f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineTo(14f)
                verticalLineTo(2f)
                horizontalLineTo(4f)
                moveTo(8f, 6f)
                curveTo(6.89f, 6f, 6f, 6.89f, 6f, 8f)
                verticalLineTo(18f)
                horizontalLineTo(8f)
                verticalLineTo(8f)
                horizontalLineTo(18f)
                verticalLineTo(6f)
                horizontalLineTo(8f)
                moveTo(12f, 10f)
                curveTo(10.89f, 10f, 10f, 10.89f, 10f, 12f)
                verticalLineTo(20f)
                curveTo(10f, 21.11f, 10.89f, 22f, 12f, 22f)
                horizontalLineTo(20f)
                curveTo(21.11f, 22f, 22f, 21.11f, 22f, 20f)
                verticalLineTo(12f)
                curveTo(22f, 10.89f, 21.11f, 10f, 20f, 10f)
                horizontalLineTo(12f)
                close()
            }
        }.build()

        return _Animation!!
    }

@Suppress("ObjectPropertyName")
private var _Animation: ImageVector? = null
