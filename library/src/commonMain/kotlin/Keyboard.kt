package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Keyboard: ImageVector
    get() {
        if (_Keyboard != null) {
            return _Keyboard!!
        }
        _Keyboard = ImageVector.Builder(
            name = "Keyboard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 10f)
                horizontalLineTo(17f)
                verticalLineTo(8f)
                horizontalLineTo(19f)
                moveTo(19f, 13f)
                horizontalLineTo(17f)
                verticalLineTo(11f)
                horizontalLineTo(19f)
                moveTo(16f, 10f)
                horizontalLineTo(14f)
                verticalLineTo(8f)
                horizontalLineTo(16f)
                moveTo(16f, 13f)
                horizontalLineTo(14f)
                verticalLineTo(11f)
                horizontalLineTo(16f)
                moveTo(16f, 17f)
                horizontalLineTo(8f)
                verticalLineTo(15f)
                horizontalLineTo(16f)
                moveTo(7f, 10f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                horizontalLineTo(7f)
                moveTo(7f, 13f)
                horizontalLineTo(5f)
                verticalLineTo(11f)
                horizontalLineTo(7f)
                moveTo(8f, 11f)
                horizontalLineTo(10f)
                verticalLineTo(13f)
                horizontalLineTo(8f)
                moveTo(8f, 8f)
                horizontalLineTo(10f)
                verticalLineTo(10f)
                horizontalLineTo(8f)
                moveTo(11f, 11f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                moveTo(11f, 8f)
                horizontalLineTo(13f)
                verticalLineTo(10f)
                horizontalLineTo(11f)
                moveTo(20f, 5f)
                horizontalLineTo(4f)
                curveTo(2.89f, 5f, 2f, 5.89f, 2f, 7f)
                verticalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 19f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 17f)
                verticalLineTo(7f)
                curveTo(22f, 5.89f, 21.1f, 5f, 20f, 5f)
                close()
            }
        }.build()

        return _Keyboard!!
    }

@Suppress("ObjectPropertyName")
private var _Keyboard: ImageVector? = null
