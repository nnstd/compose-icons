package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TagRemoveOutline: ImageVector
    get() {
        if (_TagRemoveOutline != null) {
            return _TagRemoveOutline!!
        }
        _TagRemoveOutline = ImageVector.Builder(
            name = "TagRemoveOutline",
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
                moveTo(8.12f, 21.54f)
                lineTo(6f, 19.41f)
                lineTo(3.88f, 21.54f)
                lineTo(2.46f, 20.12f)
                lineTo(4.59f, 18f)
                lineTo(2.46f, 15.88f)
                lineTo(3.88f, 14.46f)
                lineTo(6f, 16.59f)
                lineTo(8.12f, 14.46f)
                lineTo(9.54f, 15.88f)
                lineTo(7.41f, 18f)
                lineTo(9.54f, 20.12f)
                close()
            }
        }.build()

        return _TagRemoveOutline!!
    }

@Suppress("ObjectPropertyName")
private var _TagRemoveOutline: ImageVector? = null
