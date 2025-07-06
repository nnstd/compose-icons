package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Pipe: ImageVector
    get() {
        if (_Pipe != null) {
            return _Pipe!!
        }
        _Pipe = ImageVector.Builder(
            name = "Pipe",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 14f)
                horizontalLineTo(20f)
                verticalLineTo(16f)
                horizontalLineTo(14f)
                verticalLineTo(13f)
                horizontalLineTo(16f)
                verticalLineTo(11f)
                horizontalLineTo(14f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 4f)
                horizontalLineTo(4f)
                verticalLineTo(2f)
                horizontalLineTo(2f)
                verticalLineTo(10f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                horizontalLineTo(10f)
                verticalLineTo(11f)
                horizontalLineTo(8f)
                verticalLineTo(13f)
                horizontalLineTo(10f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 20f)
                horizontalLineTo(20f)
                verticalLineTo(22f)
                horizontalLineTo(22f)
            }
        }.build()

        return _Pipe!!
    }

@Suppress("ObjectPropertyName")
private var _Pipe: ImageVector? = null
