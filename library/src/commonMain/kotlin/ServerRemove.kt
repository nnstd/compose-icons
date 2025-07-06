package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ServerRemove: ImageVector
    get() {
        if (_ServerRemove != null) {
            return _ServerRemove!!
        }
        _ServerRemove = ImageVector.Builder(
            name = "ServerRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 4f)
                horizontalLineTo(20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5f)
                verticalLineTo(9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 10f)
                horizontalLineTo(4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 9f)
                verticalLineTo(5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
                moveTo(9f, 8f)
                horizontalLineTo(10f)
                verticalLineTo(6f)
                horizontalLineTo(9f)
                verticalLineTo(8f)
                moveTo(5f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(7f)
                verticalLineTo(6f)
                horizontalLineTo(5f)
                moveTo(10.59f, 17f)
                lineTo(8f, 14.41f)
                lineTo(9.41f, 13f)
                lineTo(12f, 15.59f)
                lineTo(14.59f, 13f)
                lineTo(16f, 14.41f)
                lineTo(13.41f, 17f)
                lineTo(16f, 19.59f)
                lineTo(14.59f, 21f)
                lineTo(12f, 18.41f)
                lineTo(9.41f, 21f)
                lineTo(8f, 19.59f)
                lineTo(10.59f, 17f)
                close()
            }
        }.build()

        return _ServerRemove!!
    }

@Suppress("ObjectPropertyName")
private var _ServerRemove: ImageVector? = null
