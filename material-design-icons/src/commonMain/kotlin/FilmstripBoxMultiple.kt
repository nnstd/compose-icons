package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FilmstripBoxMultiple: ImageVector
    get() {
        if (_FilmstripBoxMultiple != null) {
            return _FilmstripBoxMultiple!!
        }
        _FilmstripBoxMultiple = ImageVector.Builder(
            name = "FilmstripBoxMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 6f)
                horizontalLineTo(2f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 22f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                moveTo(20f, 2f)
                horizontalLineTo(8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 4f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 18f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 16f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 2f)
                moveTo(10f, 15f)
                horizontalLineTo(8f)
                verticalLineTo(13f)
                horizontalLineTo(10f)
                verticalLineTo(15f)
                moveTo(10f, 11f)
                horizontalLineTo(8f)
                verticalLineTo(9f)
                horizontalLineTo(10f)
                verticalLineTo(11f)
                moveTo(10f, 7f)
                horizontalLineTo(8f)
                verticalLineTo(5f)
                horizontalLineTo(10f)
                verticalLineTo(7f)
                moveTo(20f, 15f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                moveTo(20f, 11f)
                horizontalLineTo(18f)
                verticalLineTo(9f)
                horizontalLineTo(20f)
                verticalLineTo(11f)
                moveTo(20f, 7f)
                horizontalLineTo(18f)
                verticalLineTo(5f)
                horizontalLineTo(20f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _FilmstripBoxMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _FilmstripBoxMultiple: ImageVector? = null
