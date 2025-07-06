package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.KeyboardF10: ImageVector
    get() {
        if (_KeyboardF10 != null) {
            return _KeyboardF10!!
        }
        _KeyboardF10 = ImageVector.Builder(
            name = "KeyboardF10",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 7f)
                horizontalLineTo(8f)
                verticalLineTo(9f)
                horizontalLineTo(4f)
                verticalLineTo(11f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                horizontalLineTo(4f)
                verticalLineTo(17f)
                horizontalLineTo(2f)
                verticalLineTo(7f)
                moveTo(10f, 7f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                horizontalLineTo(12f)
                verticalLineTo(9f)
                horizontalLineTo(10f)
                verticalLineTo(7f)
                moveTo(18f, 7f)
                horizontalLineTo(20f)
                curveTo(21.11f, 7f, 22f, 7.9f, 22f, 9f)
                verticalLineTo(15f)
                curveTo(22f, 16.11f, 21.11f, 17f, 20f, 17f)
                horizontalLineTo(18f)
                curveTo(16.9f, 17f, 16f, 16.11f, 16f, 15f)
                verticalLineTo(9f)
                curveTo(16f, 7.9f, 16.9f, 7f, 18f, 7f)
                moveTo(18f, 9f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _KeyboardF10!!
    }

@Suppress("ObjectPropertyName")
private var _KeyboardF10: ImageVector? = null
