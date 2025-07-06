package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.KeyboardClose: ImageVector
    get() {
        if (_KeyboardClose != null) {
            return _KeyboardClose!!
        }
        _KeyboardClose = ImageVector.Builder(
            name = "KeyboardClose",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 23f)
                lineTo(16f, 19f)
                horizontalLineTo(8f)
                moveTo(19f, 8f)
                horizontalLineTo(17f)
                verticalLineTo(6f)
                horizontalLineTo(19f)
                moveTo(19f, 11f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                horizontalLineTo(19f)
                moveTo(16f, 8f)
                horizontalLineTo(14f)
                verticalLineTo(6f)
                horizontalLineTo(16f)
                moveTo(16f, 11f)
                horizontalLineTo(14f)
                verticalLineTo(9f)
                horizontalLineTo(16f)
                moveTo(16f, 15f)
                horizontalLineTo(8f)
                verticalLineTo(13f)
                horizontalLineTo(16f)
                moveTo(7f, 8f)
                horizontalLineTo(5f)
                verticalLineTo(6f)
                horizontalLineTo(7f)
                moveTo(7f, 11f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineTo(7f)
                moveTo(8f, 9f)
                horizontalLineTo(10f)
                verticalLineTo(11f)
                horizontalLineTo(8f)
                moveTo(8f, 6f)
                horizontalLineTo(10f)
                verticalLineTo(8f)
                horizontalLineTo(8f)
                moveTo(11f, 9f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                moveTo(11f, 6f)
                horizontalLineTo(13f)
                verticalLineTo(8f)
                horizontalLineTo(11f)
                moveTo(20f, 3f)
                horizontalLineTo(4f)
                curveTo(2.89f, 3f, 2f, 3.89f, 2f, 5f)
                verticalLineTo(15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 17f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 15f)
                verticalLineTo(5f)
                curveTo(22f, 3.89f, 21.1f, 3f, 20f, 3f)
                close()
            }
        }.build()

        return _KeyboardClose!!
    }

@Suppress("ObjectPropertyName")
private var _KeyboardClose: ImageVector? = null
