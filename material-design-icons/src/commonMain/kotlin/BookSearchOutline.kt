package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BookSearchOutline: ImageVector
    get() {
        if (_BookSearchOutline != null) {
            return _BookSearchOutline!!
        }
        _BookSearchOutline = ImageVector.Builder(
            name = "BookSearchOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.5f, 12f)
                curveTo(18f, 12f, 20f, 14f, 20f, 16.5f)
                curveTo(20f, 17.38f, 19.75f, 18.21f, 19.31f, 18.9f)
                lineTo(22.39f, 22f)
                lineTo(21f, 23.39f)
                lineTo(17.88f, 20.32f)
                curveTo(17.19f, 20.75f, 16.37f, 21f, 15.5f, 21f)
                curveTo(13f, 21f, 11f, 19f, 11f, 16.5f)
                curveTo(11f, 14f, 13f, 12f, 15.5f, 12f)
                moveTo(15.5f, 14f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 16.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 19f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 16.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 14f)
                moveTo(13f, 4f)
                verticalLineTo(12f)
                lineTo(10.5f, 9.75f)
                lineTo(8f, 12f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                verticalLineTo(20f)
                horizontalLineTo(10f)
                curveTo(10.54f, 20.81f, 11.23f, 21.5f, 12.03f, 22f)
                horizontalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 20f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 2f)
                horizontalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 4f)
                verticalLineTo(11.81f)
                curveTo(19.42f, 11.26f, 18.75f, 10.81f, 18f, 10.5f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                close()
            }
        }.build()

        return _BookSearchOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BookSearchOutline: ImageVector? = null
