package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MouseMoveVertical: ImageVector
    get() {
        if (_MouseMoveVertical != null) {
            return _MouseMoveVertical!!
        }
        _MouseMoveVertical = ImageVector.Builder(
            name = "MouseMoveVertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 6f)
                horizontalLineTo(23f)
                lineTo(19f, 2f)
                lineTo(15f, 6f)
                horizontalLineTo(18f)
                verticalLineTo(18f)
                horizontalLineTo(15f)
                lineTo(19f, 22f)
                lineTo(23f, 18f)
                horizontalLineTo(20f)
                verticalLineTo(6f)
                moveTo(9f, 3.09f)
                curveTo(11.83f, 3.57f, 14f, 6.04f, 14f, 9f)
                horizontalLineTo(9f)
                verticalLineTo(3.09f)
                moveTo(14f, 11f)
                verticalLineTo(15f)
                curveTo(14f, 18.3f, 11.3f, 21f, 8f, 21f)
                reflectiveCurveTo(2f, 18.3f, 2f, 15f)
                verticalLineTo(11f)
                horizontalLineTo(14f)
                moveTo(7f, 9f)
                horizontalLineTo(2f)
                curveTo(2f, 6.04f, 4.17f, 3.57f, 7f, 3.09f)
                verticalLineTo(9f)
                close()
            }
        }.build()

        return _MouseMoveVertical!!
    }

@Suppress("ObjectPropertyName")
private var _MouseMoveVertical: ImageVector? = null
