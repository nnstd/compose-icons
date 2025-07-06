package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FlipToBack: ImageVector
    get() {
        if (_FlipToBack != null) {
            return _FlipToBack!!
        }
        _FlipToBack = ImageVector.Builder(
            name = "FlipToBack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 17f)
                horizontalLineTo(17f)
                verticalLineTo(15f)
                horizontalLineTo(15f)
                moveTo(15f, 5f)
                horizontalLineTo(17f)
                verticalLineTo(3f)
                horizontalLineTo(15f)
                moveTo(5f, 7f)
                horizontalLineTo(3f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 21f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                moveTo(19f, 17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 15f)
                horizontalLineTo(19f)
                moveTo(19f, 9f)
                horizontalLineTo(21f)
                verticalLineTo(7f)
                horizontalLineTo(19f)
                moveTo(19f, 13f)
                horizontalLineTo(21f)
                verticalLineTo(11f)
                horizontalLineTo(19f)
                moveTo(9f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 17f)
                moveTo(13f, 3f)
                horizontalLineTo(11f)
                verticalLineTo(5f)
                horizontalLineTo(13f)
                moveTo(19f, 3f)
                verticalLineTo(5f)
                horizontalLineTo(21f)
                curveTo(21f, 3.89f, 20.1f, 3f, 19f, 3f)
                moveTo(13f, 15f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                moveTo(9f, 3f)
                curveTo(7.89f, 3f, 7f, 3.89f, 7f, 5f)
                horizontalLineTo(9f)
                moveTo(9f, 11f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                horizontalLineTo(9f)
                moveTo(9f, 7f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                horizontalLineTo(9f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _FlipToBack!!
    }

@Suppress("ObjectPropertyName")
private var _FlipToBack: ImageVector? = null
