package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ContentDuplicate: ImageVector
    get() {
        if (_ContentDuplicate != null) {
            return _ContentDuplicate!!
        }
        _ContentDuplicate = ImageVector.Builder(
            name = "ContentDuplicate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 17f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 15f)
                verticalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 1f)
                horizontalLineTo(16f)
                verticalLineTo(3f)
                horizontalLineTo(4f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                lineTo(15f, 16f)
                lineTo(11f, 19f)
                verticalLineTo(17f)
                moveTo(19f, 21f)
                verticalLineTo(7f)
                horizontalLineTo(8f)
                verticalLineTo(13f)
                horizontalLineTo(6f)
                verticalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 5f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 7f)
                verticalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 23f)
                horizontalLineTo(8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 21f)
                verticalLineTo(19f)
                horizontalLineTo(8f)
                verticalLineTo(21f)
                horizontalLineTo(19f)
                close()
            }
        }.build()

        return _ContentDuplicate!!
    }

@Suppress("ObjectPropertyName")
private var _ContentDuplicate: ImageVector? = null
