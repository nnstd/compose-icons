package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TagPlusOutline: ImageVector
    get() {
        if (_TagPlusOutline != null) {
            return _TagPlusOutline!!
        }
        _TagPlusOutline = ImageVector.Builder(
            name = "TagPlusOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.5f, 5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 8f, 6.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, 5f)
                moveTo(6.5f, 5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 8f, 6.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, 5f)
                moveTo(21.41f, 11.58f)
                lineTo(12.41f, 2.58f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 2f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 4f)
                verticalLineTo(11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.59f, 12.42f)
                lineTo(3f, 12.82f)
                arcTo(5.62f, 5.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.08f, 12.08f)
                lineTo(4f, 11f)
                verticalLineTo(4f)
                horizontalLineTo(11f)
                lineTo(20f, 13f)
                lineTo(13f, 20f)
                lineTo(11.92f, 18.92f)
                arcTo(5.57f, 5.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.18f, 21f)
                lineTo(11.59f, 21.41f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 22f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.41f, 21.41f)
                lineTo(21.41f, 14.41f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.41f, 11.58f)
                moveTo(6.5f, 5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 8f, 6.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, 5f)
                moveTo(10f, 19f)
                horizontalLineTo(7f)
                verticalLineTo(22f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                horizontalLineTo(2f)
                verticalLineTo(17f)
                horizontalLineTo(5f)
                verticalLineTo(14f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                horizontalLineTo(10f)
                close()
            }
        }.build()

        return _TagPlusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _TagPlusOutline: ImageVector? = null
