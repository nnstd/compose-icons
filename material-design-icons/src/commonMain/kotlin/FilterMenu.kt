package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FilterMenu: ImageVector
    get() {
        if (_FilterMenu != null) {
            return _FilterMenu!!
        }
        _FilterMenu = ImageVector.Builder(
            name = "FilterMenu",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 11f)
                lineTo(16.76f, 3.62f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.59f, 2.22f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 2f)
                horizontalLineTo(2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.38f, 2.22f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.21f, 3.62f)
                lineTo(7f, 11f)
                verticalLineTo(16.87f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.29f, 17.7f)
                lineTo(9.29f, 19.7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.7f, 19.7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 18.87f)
                verticalLineTo(11f)
                moveTo(13f, 16f)
                lineTo(18f, 21f)
                lineTo(23f, 16f)
                close()
            }
        }.build()

        return _FilterMenu!!
    }

@Suppress("ObjectPropertyName")
private var _FilterMenu: ImageVector? = null
