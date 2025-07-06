package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DeleteForeverOutline: ImageVector
    get() {
        if (_DeleteForeverOutline != null) {
            return _DeleteForeverOutline!!
        }
        _DeleteForeverOutline = ImageVector.Builder(
            name = "DeleteForeverOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.12f, 10.47f)
                lineTo(12f, 12.59f)
                lineTo(9.87f, 10.47f)
                lineTo(8.46f, 11.88f)
                lineTo(10.59f, 14f)
                lineTo(8.47f, 16.12f)
                lineTo(9.88f, 17.53f)
                lineTo(12f, 15.41f)
                lineTo(14.12f, 17.53f)
                lineTo(15.53f, 16.12f)
                lineTo(13.41f, 14f)
                lineTo(15.53f, 11.88f)
                lineTo(14.12f, 10.47f)
                moveTo(15.5f, 4f)
                lineTo(14.5f, 3f)
                horizontalLineTo(9.5f)
                lineTo(8.5f, 4f)
                horizontalLineTo(5f)
                verticalLineTo(6f)
                horizontalLineTo(19f)
                verticalLineTo(4f)
                horizontalLineTo(15.5f)
                moveTo(6f, 19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 21f)
                horizontalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 19f)
                verticalLineTo(7f)
                horizontalLineTo(6f)
                verticalLineTo(19f)
                moveTo(8f, 9f)
                horizontalLineTo(16f)
                verticalLineTo(19f)
                horizontalLineTo(8f)
                verticalLineTo(9f)
                close()
            }
        }.build()

        return _DeleteForeverOutline!!
    }

@Suppress("ObjectPropertyName")
private var _DeleteForeverOutline: ImageVector? = null
