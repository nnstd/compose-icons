package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PipeDisconnected: ImageVector
    get() {
        if (_PipeDisconnected != null) {
            return _PipeDisconnected!!
        }
        _PipeDisconnected = ImageVector.Builder(
            name = "PipeDisconnected",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(8f)
                verticalLineTo(9f)
                horizontalLineTo(10f)
                verticalLineTo(8f)
                horizontalLineTo(4f)
                verticalLineTo(10f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineTo(12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 6f)
                verticalLineTo(9f)
                horizontalLineTo(16f)
                moveTo(10f, 15f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 20f)
                horizontalLineTo(20f)
                verticalLineTo(22f)
                horizontalLineTo(22f)
                verticalLineTo(14f)
                horizontalLineTo(20f)
                verticalLineTo(16f)
                horizontalLineTo(14f)
                verticalLineTo(15f)
                horizontalLineTo(16f)
                verticalLineTo(13f)
                horizontalLineTo(8f)
                verticalLineTo(15f)
                horizontalLineTo(10f)
                close()
            }
        }.build()

        return _PipeDisconnected!!
    }

@Suppress("ObjectPropertyName")
private var _PipeDisconnected: ImageVector? = null
