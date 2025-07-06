package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TagOutline: ImageVector
    get() {
        if (_TagOutline != null) {
            return _TagOutline!!
        }
        _TagOutline = ImageVector.Builder(
            name = "TagOutline",
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
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.59f, 12.42f)
                lineTo(11.59f, 21.42f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 22f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.41f, 21.41f)
                lineTo(21.41f, 14.41f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.41f, 11.58f)
                moveTo(13f, 20f)
                lineTo(4f, 11f)
                verticalLineTo(4f)
                horizontalLineTo(11f)
                lineTo(20f, 13f)
                moveTo(6.5f, 5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, 6.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.5f, 5f)
                close()
            }
        }.build()

        return _TagOutline!!
    }

@Suppress("ObjectPropertyName")
private var _TagOutline: ImageVector? = null
