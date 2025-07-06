package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.KeyboardF12: ImageVector
    get() {
        if (_KeyboardF12 != null) {
            return _KeyboardF12!!
        }
        _KeyboardF12 = ImageVector.Builder(
            name = "KeyboardF12",
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
                moveTo(16f, 7f)
                horizontalLineTo(20f)
                curveTo(21.11f, 7f, 22f, 7.9f, 22f, 9f)
                verticalLineTo(11f)
                curveTo(22f, 12.11f, 21.11f, 13f, 20f, 13f)
                horizontalLineTo(18f)
                verticalLineTo(15f)
                horizontalLineTo(22f)
                verticalLineTo(17f)
                horizontalLineTo(16f)
                verticalLineTo(13f)
                curveTo(16f, 11.9f, 16.9f, 11f, 18f, 11f)
                horizontalLineTo(20f)
                verticalLineTo(9f)
                horizontalLineTo(16f)
                verticalLineTo(7f)
                moveTo(10f, 7f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                horizontalLineTo(12f)
                verticalLineTo(9f)
                horizontalLineTo(10f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _KeyboardF12!!
    }

@Suppress("ObjectPropertyName")
private var _KeyboardF12: ImageVector? = null
