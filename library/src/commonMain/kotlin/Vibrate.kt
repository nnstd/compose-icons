package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Vibrate: ImageVector
    get() {
        if (_Vibrate != null) {
            return _Vibrate!!
        }
        _Vibrate = ImageVector.Builder(
            name = "Vibrate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 19f)
                horizontalLineTo(8f)
                verticalLineTo(5f)
                horizontalLineTo(16f)
                moveTo(16.5f, 3f)
                horizontalLineTo(7.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 4.5f)
                verticalLineTo(19.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 21f)
                horizontalLineTo(16.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 19.5f)
                verticalLineTo(4.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 3f)
                moveTo(19f, 17f)
                horizontalLineTo(21f)
                verticalLineTo(7f)
                horizontalLineTo(19f)
                moveTo(22f, 9f)
                verticalLineTo(15f)
                horizontalLineTo(24f)
                verticalLineTo(9f)
                moveTo(3f, 17f)
                horizontalLineTo(5f)
                verticalLineTo(7f)
                horizontalLineTo(3f)
                moveTo(0f, 15f)
                horizontalLineTo(2f)
                verticalLineTo(9f)
                horizontalLineTo(0f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _Vibrate!!
    }

@Suppress("ObjectPropertyName")
private var _Vibrate: ImageVector? = null
