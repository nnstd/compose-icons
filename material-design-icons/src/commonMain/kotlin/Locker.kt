package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Locker: ImageVector
    get() {
        if (_Locker != null) {
            return _Locker!!
        }
        _Locker = ImageVector.Builder(
            name = "Locker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 2f)
                horizontalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 4f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 22f)
                horizontalLineTo(8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 20f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 2f)
                moveTo(8f, 4f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                verticalLineTo(4f)
                horizontalLineTo(8f)
                moveTo(10f, 13f)
                horizontalLineTo(12f)
                verticalLineTo(17f)
                horizontalLineTo(10f)
                verticalLineTo(13f)
                moveTo(10f, 6f)
                horizontalLineTo(14f)
                verticalLineTo(7.5f)
                horizontalLineTo(10f)
                verticalLineTo(6f)
                moveTo(10f, 9f)
                horizontalLineTo(14f)
                verticalLineTo(10.5f)
                horizontalLineTo(10f)
                verticalLineTo(9f)
                close()
            }
        }.build()

        return _Locker!!
    }

@Suppress("ObjectPropertyName")
private var _Locker: ImageVector? = null
