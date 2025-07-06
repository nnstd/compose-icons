package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.KeyboardF1: ImageVector
    get() {
        if (_KeyboardF1 != null) {
            return _KeyboardF1!!
        }
        _KeyboardF1 = ImageVector.Builder(
            name = "KeyboardF1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 7f)
                horizontalLineTo(12f)
                verticalLineTo(9f)
                horizontalLineTo(8f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(8f)
                verticalLineTo(17f)
                horizontalLineTo(6f)
                verticalLineTo(7f)
                moveTo(14f, 7f)
                horizontalLineTo(18f)
                verticalLineTo(17f)
                horizontalLineTo(16f)
                verticalLineTo(9f)
                horizontalLineTo(14f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _KeyboardF1!!
    }

@Suppress("ObjectPropertyName")
private var _KeyboardF1: ImageVector? = null
