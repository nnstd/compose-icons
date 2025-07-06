package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MouseMoveDown: ImageVector
    get() {
        if (_MouseMoveDown != null) {
            return _MouseMoveDown!!
        }
        _MouseMoveDown = ImageVector.Builder(
            name = "MouseMoveDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 9f)
                horizontalLineTo(2f)
                curveTo(2f, 6.04f, 4.17f, 3.57f, 7f, 3.09f)
                verticalLineTo(9f)
                moveTo(20f, 7f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                horizontalLineTo(15f)
                lineTo(19f, 17f)
                lineTo(23f, 13f)
                horizontalLineTo(20f)
                verticalLineTo(7f)
                moveTo(9f, 3.09f)
                verticalLineTo(9f)
                horizontalLineTo(14f)
                curveTo(14f, 6.04f, 11.83f, 3.57f, 9f, 3.09f)
                moveTo(2f, 15f)
                curveTo(2f, 18.3f, 4.7f, 21f, 8f, 21f)
                reflectiveCurveTo(14f, 18.3f, 14f, 15f)
                verticalLineTo(11f)
                horizontalLineTo(2f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _MouseMoveDown!!
    }

@Suppress("ObjectPropertyName")
private var _MouseMoveDown: ImageVector? = null
