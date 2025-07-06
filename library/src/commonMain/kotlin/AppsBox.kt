package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AppsBox: ImageVector
    get() {
        if (_AppsBox != null) {
            return _AppsBox!!
        }
        _AppsBox = ImageVector.Builder(
            name = "AppsBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 3f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 21f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 3f)
                moveTo(7f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(9f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                moveTo(11f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                horizontalLineTo(11f)
                moveTo(15f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(17f)
                verticalLineTo(7f)
                horizontalLineTo(15f)
                moveTo(7f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                horizontalLineTo(7f)
                moveTo(11f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                moveTo(15f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(17f)
                verticalLineTo(11f)
                horizontalLineTo(15f)
                moveTo(7f, 15f)
                verticalLineTo(17f)
                horizontalLineTo(9f)
                verticalLineTo(15f)
                horizontalLineTo(7f)
                moveTo(11f, 15f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                moveTo(15f, 15f)
                verticalLineTo(17f)
                horizontalLineTo(17f)
                verticalLineTo(15f)
                horizontalLineTo(15f)
                close()
            }
        }.build()

        return _AppsBox!!
    }

@Suppress("ObjectPropertyName")
private var _AppsBox: ImageVector? = null
