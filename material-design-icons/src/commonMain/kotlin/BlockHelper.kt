package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BlockHelper: ImageVector
    get() {
        if (_BlockHelper != null) {
            return _BlockHelper!!
        }
        _BlockHelper = ImageVector.Builder(
            name = "BlockHelper",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 0f)
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 12f)
                curveTo(2f, 14.4f, 2.85f, 16.6f, 4.26f, 18.33f)
                lineTo(18.33f, 4.26f)
                curveTo(16.6f, 2.85f, 14.4f, 2f, 12f, 2f)
                moveTo(12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                curveTo(22f, 9.6f, 21.15f, 7.4f, 19.74f, 5.67f)
                lineTo(5.67f, 19.74f)
                curveTo(7.4f, 21.15f, 9.6f, 22f, 12f, 22f)
                close()
            }
        }.build()

        return _BlockHelper!!
    }

@Suppress("ObjectPropertyName")
private var _BlockHelper: ImageVector? = null
