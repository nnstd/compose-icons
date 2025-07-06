package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Table: ImageVector
    get() {
        if (_Table != null) {
            return _Table!!
        }
        _Table = ImageVector.Builder(
            name = "Table",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 4f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 6f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 20f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 18f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 4f)
                moveTo(5f, 8f)
                verticalLineTo(12f)
                horizontalLineTo(11f)
                verticalLineTo(8f)
                horizontalLineTo(5f)
                moveTo(13f, 8f)
                verticalLineTo(12f)
                horizontalLineTo(19f)
                verticalLineTo(8f)
                horizontalLineTo(13f)
                moveTo(5f, 14f)
                verticalLineTo(18f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
                horizontalLineTo(5f)
                moveTo(13f, 14f)
                verticalLineTo(18f)
                horizontalLineTo(19f)
                verticalLineTo(14f)
                horizontalLineTo(13f)
                close()
            }
        }.build()

        return _Table!!
    }

@Suppress("ObjectPropertyName")
private var _Table: ImageVector? = null
