package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.KeyboardOutline: ImageVector
    get() {
        if (_KeyboardOutline != null) {
            return _KeyboardOutline!!
        }
        _KeyboardOutline = ImageVector.Builder(
            name = "KeyboardOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 7f)
                verticalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 19f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 17f)
                verticalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 5f)
                horizontalLineTo(4f)
                moveTo(4f, 7f)
                horizontalLineTo(20f)
                verticalLineTo(17f)
                horizontalLineTo(4f)
                verticalLineTo(7f)
                moveTo(5f, 8f)
                verticalLineTo(10f)
                horizontalLineTo(7f)
                verticalLineTo(8f)
                horizontalLineTo(5f)
                moveTo(8f, 8f)
                verticalLineTo(10f)
                horizontalLineTo(10f)
                verticalLineTo(8f)
                horizontalLineTo(8f)
                moveTo(11f, 8f)
                verticalLineTo(10f)
                horizontalLineTo(13f)
                verticalLineTo(8f)
                horizontalLineTo(11f)
                moveTo(14f, 8f)
                verticalLineTo(10f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                horizontalLineTo(14f)
                moveTo(17f, 8f)
                verticalLineTo(10f)
                horizontalLineTo(19f)
                verticalLineTo(8f)
                horizontalLineTo(17f)
                moveTo(5f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                moveTo(8f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(10f)
                verticalLineTo(11f)
                horizontalLineTo(8f)
                moveTo(11f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                moveTo(14f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(16f)
                verticalLineTo(11f)
                horizontalLineTo(14f)
                moveTo(17f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                verticalLineTo(11f)
                horizontalLineTo(17f)
                moveTo(8f, 14f)
                verticalLineTo(16f)
                horizontalLineTo(16f)
                verticalLineTo(14f)
                horizontalLineTo(8f)
                close()
            }
        }.build()

        return _KeyboardOutline!!
    }

@Suppress("ObjectPropertyName")
private var _KeyboardOutline: ImageVector? = null
