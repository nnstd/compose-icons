package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TagText: ImageVector
    get() {
        if (_TagText != null) {
            return _TagText!!
        }
        _TagText = ImageVector.Builder(
            name = "TagText",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.41f, 11.58f)
                lineTo(12.41f, 2.58f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 2f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 4f)
                verticalLineTo(11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.59f, 12.41f)
                lineTo(11.59f, 21.41f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 22f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.41f, 21.41f)
                lineTo(21.41f, 14.41f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.41f, 11.58f)
                moveTo(6.5f, 8f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8f, 6.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.5f, 8f)
                moveTo(11.59f, 15.41f)
                lineTo(7.59f, 11.41f)
                lineTo(9f, 10f)
                lineTo(13f, 14f)
                moveTo(15.59f, 14.41f)
                lineTo(10.09f, 8.91f)
                lineTo(11.5f, 7.5f)
                lineTo(17f, 13f)
                close()
            }
        }.build()

        return _TagText!!
    }

@Suppress("ObjectPropertyName")
private var _TagText: ImageVector? = null
