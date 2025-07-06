package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ServerMinus: ImageVector
    get() {
        if (_ServerMinus != null) {
            return _ServerMinus!!
        }
        _ServerMinus = ImageVector.Builder(
            name = "ServerMinus",
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
                moveTo(8f, 16f)
                horizontalLineTo(16f)
                verticalLineTo(18f)
                horizontalLineTo(8f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _ServerMinus!!
    }

@Suppress("ObjectPropertyName")
private var _ServerMinus: ImageVector? = null
