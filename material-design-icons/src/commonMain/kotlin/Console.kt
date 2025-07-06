package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Console: ImageVector
    get() {
        if (_Console != null) {
            return _Console!!
        }
        _Console = ImageVector.Builder(
            name = "Console",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 19f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                verticalLineTo(19f)
                horizontalLineTo(20f)
                moveTo(20f, 3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 21f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 19f)
                verticalLineTo(5f)
                curveTo(2f, 3.89f, 2.9f, 3f, 4f, 3f)
                horizontalLineTo(20f)
                moveTo(13f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(18f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                moveTo(9.58f, 13f)
                lineTo(5.57f, 9f)
                horizontalLineTo(8.4f)
                lineTo(11.7f, 12.3f)
                curveTo(12.09f, 12.69f, 12.09f, 13.33f, 11.7f, 13.72f)
                lineTo(8.42f, 17f)
                horizontalLineTo(5.59f)
                lineTo(9.58f, 13f)
                close()
            }
        }.build()

        return _Console!!
    }

@Suppress("ObjectPropertyName")
private var _Console: ImageVector? = null
