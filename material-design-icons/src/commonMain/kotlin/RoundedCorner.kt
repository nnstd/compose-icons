package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RoundedCorner: ImageVector
    get() {
        if (_RoundedCorner != null) {
            return _RoundedCorner!!
        }
        _RoundedCorner = ImageVector.Builder(
            name = "RoundedCorner",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 19f)
                horizontalLineTo(21f)
                verticalLineTo(21f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                moveTo(19f, 17f)
                horizontalLineTo(21f)
                verticalLineTo(15f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                moveTo(3f, 13f)
                horizontalLineTo(5f)
                verticalLineTo(11f)
                horizontalLineTo(3f)
                verticalLineTo(13f)
                moveTo(3f, 17f)
                horizontalLineTo(5f)
                verticalLineTo(15f)
                horizontalLineTo(3f)
                verticalLineTo(17f)
                moveTo(3f, 9f)
                horizontalLineTo(5f)
                verticalLineTo(7f)
                horizontalLineTo(3f)
                verticalLineTo(9f)
                moveTo(3f, 5f)
                horizontalLineTo(5f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                moveTo(7f, 5f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                moveTo(15f, 21f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                horizontalLineTo(15f)
                verticalLineTo(21f)
                moveTo(11f, 21f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                horizontalLineTo(11f)
                verticalLineTo(21f)
                moveTo(15f, 21f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                horizontalLineTo(15f)
                verticalLineTo(21f)
                moveTo(7f, 21f)
                horizontalLineTo(9f)
                verticalLineTo(19f)
                horizontalLineTo(7f)
                verticalLineTo(21f)
                moveTo(3f, 21f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                horizontalLineTo(3f)
                verticalLineTo(21f)
                moveTo(21f, 8f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 3f)
                horizontalLineTo(11f)
                verticalLineTo(5f)
                horizontalLineTo(16f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 8f)
                verticalLineTo(13f)
                horizontalLineTo(21f)
                verticalLineTo(8f)
                close()
            }
        }.build()

        return _RoundedCorner!!
    }

@Suppress("ObjectPropertyName")
private var _RoundedCorner: ImageVector? = null
