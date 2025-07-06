package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RadioFm: ImageVector
    get() {
        if (_RadioFm != null) {
            return _RadioFm!!
        }
        _RadioFm = ImageVector.Builder(
            name = "RadioFm",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 7f)
                verticalLineTo(17f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                horizontalLineTo(8f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineTo(9f)
                verticalLineTo(7f)
                horizontalLineTo(3f)
                moveTo(13f, 7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 9f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(15f)
                verticalLineTo(16f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                horizontalLineTo(21f)
                verticalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 7f)
                horizontalLineTo(13f)
                close()
            }
        }.build()

        return _RadioFm!!
    }

@Suppress("ObjectPropertyName")
private var _RadioFm: ImageVector? = null
