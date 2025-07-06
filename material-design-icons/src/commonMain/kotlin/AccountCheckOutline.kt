package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountCheckOutline: ImageVector
    get() {
        if (_AccountCheckOutline != null) {
            return _AccountCheckOutline!!
        }
        _AccountCheckOutline = ImageVector.Builder(
            name = "AccountCheckOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.1f, 12.5f)
                lineTo(22.5f, 13.91f)
                lineTo(15.97f, 20.5f)
                lineTo(12.5f, 17f)
                lineTo(13.9f, 15.59f)
                lineTo(15.97f, 17.67f)
                lineTo(21.1f, 12.5f)
                moveTo(11f, 4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 4f)
                moveTo(11f, 6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 6f)
                moveTo(11f, 13f)
                curveTo(11.68f, 13f, 12.5f, 13.09f, 13.41f, 13.26f)
                lineTo(11.74f, 14.93f)
                lineTo(11f, 14.9f)
                curveTo(8.03f, 14.9f, 4.9f, 16.36f, 4.9f, 17f)
                verticalLineTo(18.1f)
                horizontalLineTo(11.1f)
                lineTo(13f, 20f)
                horizontalLineTo(3f)
                verticalLineTo(17f)
                curveTo(3f, 14.34f, 8.33f, 13f, 11f, 13f)
                close()
            }
        }.build()

        return _AccountCheckOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AccountCheckOutline: ImageVector? = null
