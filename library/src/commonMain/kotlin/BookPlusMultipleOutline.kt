package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BookPlusMultipleOutline: ImageVector
    get() {
        if (_BookPlusMultipleOutline != null) {
            return _BookPlusMultipleOutline!!
        }
        _BookPlusMultipleOutline = ImageVector.Builder(
            name = "BookPlusMultipleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.09f, 20f)
                horizontalLineTo(5f)
                verticalLineTo(6f)
                horizontalLineTo(3f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 22f)
                horizontalLineTo(13.81f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.09f, 20f)
                moveTo(19f, 2f)
                horizontalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 4f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 18f)
                horizontalLineTo(13.09f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.81f, 16f)
                horizontalLineTo(9f)
                verticalLineTo(4f)
                horizontalLineTo(11f)
                verticalLineTo(10f)
                lineTo(13.5f, 7.75f)
                lineTo(16f, 10f)
                verticalLineTo(4f)
                horizontalLineTo(19f)
                verticalLineTo(13f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 13.34f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 2f)
                moveTo(20f, 15f)
                verticalLineTo(18f)
                horizontalLineTo(23f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                verticalLineTo(23f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                horizontalLineTo(15f)
                verticalLineTo(18f)
                horizontalLineTo(18f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _BookPlusMultipleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BookPlusMultipleOutline: ImageVector? = null
