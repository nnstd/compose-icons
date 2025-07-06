package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PowerSocketUk: ImageVector
    get() {
        if (_PowerSocketUk != null) {
            return _PowerSocketUk!!
        }
        _PowerSocketUk = ImageVector.Builder(
            name = "PowerSocketUk",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 4f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 22f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 20f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 2f)
                horizontalLineTo(4f)
                moveTo(4f, 4f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                moveTo(11f, 7f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                horizontalLineTo(11f)
                moveTo(6f, 14.75f)
                verticalLineTo(17f)
                horizontalLineTo(9.5f)
                verticalLineTo(14.75f)
                horizontalLineTo(6f)
                moveTo(14.5f, 14.75f)
                verticalLineTo(17f)
                horizontalLineTo(18f)
                verticalLineTo(14.75f)
                horizontalLineTo(14.5f)
                close()
            }
        }.build()

        return _PowerSocketUk!!
    }

@Suppress("ObjectPropertyName")
private var _PowerSocketUk: ImageVector? = null
