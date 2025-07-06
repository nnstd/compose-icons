package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FitToScreen: ImageVector
    get() {
        if (_FitToScreen != null) {
            return _FitToScreen!!
        }
        _FitToScreen = ImageVector.Builder(
            name = "FitToScreen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 4f)
                horizontalLineTo(20f)
                curveTo(21.1f, 4f, 22f, 4.9f, 22f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
                verticalLineTo(6f)
                horizontalLineTo(17f)
                verticalLineTo(4f)
                moveTo(4f, 8f)
                verticalLineTo(6f)
                horizontalLineTo(7f)
                verticalLineTo(4f)
                horizontalLineTo(4f)
                curveTo(2.9f, 4f, 2f, 4.9f, 2f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(4f)
                moveTo(20f, 16f)
                verticalLineTo(18f)
                horizontalLineTo(17f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                curveTo(21.1f, 20f, 22f, 19.1f, 22f, 18f)
                verticalLineTo(16f)
                horizontalLineTo(20f)
                moveTo(7f, 18f)
                horizontalLineTo(4f)
                verticalLineTo(16f)
                horizontalLineTo(2f)
                verticalLineTo(18f)
                curveTo(2f, 19.1f, 2.9f, 20f, 4f, 20f)
                horizontalLineTo(7f)
                verticalLineTo(18f)
                moveTo(18f, 8f)
                horizontalLineTo(6f)
                verticalLineTo(16f)
                horizontalLineTo(18f)
                verticalLineTo(8f)
                close()
            }
        }.build()

        return _FitToScreen!!
    }

@Suppress("ObjectPropertyName")
private var _FitToScreen: ImageVector? = null
