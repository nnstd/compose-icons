package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TagHeart: ImageVector
    get() {
        if (_TagHeart != null) {
            return _TagHeart!!
        }
        _TagHeart = ImageVector.Builder(
            name = "TagHeart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.41f, 11.58f)
                lineTo(12.41f, 2.58f)
                curveTo(12.05f, 2.22f, 11.55f, 2f, 11f, 2f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 4f)
                verticalLineTo(11f)
                curveTo(2f, 11.55f, 2.22f, 12.05f, 2.59f, 12.42f)
                lineTo(11.59f, 21.42f)
                curveTo(11.95f, 21.78f, 12.45f, 22f, 13f, 22f)
                curveTo(13.55f, 22f, 14.05f, 21.78f, 14.41f, 21.41f)
                lineTo(21.41f, 14.41f)
                curveTo(21.78f, 14.05f, 22f, 13.55f, 22f, 13f)
                curveTo(22f, 12.45f, 21.77f, 11.94f, 21.41f, 11.58f)
                moveTo(5.5f, 7f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 5.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 4f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 5.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 7f)
                moveTo(17.27f, 15.27f)
                lineTo(13f, 19.54f)
                lineTo(8.73f, 15.27f)
                curveTo(8.28f, 14.81f, 8f, 14.19f, 8f, 13.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 11f)
                curveTo(11.19f, 11f, 11.82f, 11.28f, 12.27f, 11.74f)
                lineTo(13f, 12.46f)
                lineTo(13.73f, 11.73f)
                curveTo(14.18f, 11.28f, 14.81f, 11f, 15.5f, 11f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 13.5f)
                curveTo(18f, 14.19f, 17.72f, 14.82f, 17.27f, 15.27f)
                close()
            }
        }.build()

        return _TagHeart!!
    }

@Suppress("ObjectPropertyName")
private var _TagHeart: ImageVector? = null
