package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountHeartOutline: ImageVector
    get() {
        if (_AccountHeartOutline != null) {
            return _AccountHeartOutline!!
        }
        _AccountHeartOutline = ImageVector.Builder(
            name = "AccountHeartOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 15f)
                lineTo(4.4f, 14.5f)
                curveTo(2.4f, 12.6f, 1f, 11.4f, 1f, 9.9f)
                curveTo(1f, 8.7f, 2f, 7.7f, 3.2f, 7.7f)
                curveTo(3.9f, 7.7f, 4.6f, 8f, 5f, 8.5f)
                curveTo(5.4f, 8f, 6.1f, 7.7f, 6.8f, 7.7f)
                curveTo(8f, 7.7f, 9f, 8.6f, 9f, 9.9f)
                curveTo(9f, 11.4f, 7.6f, 12.6f, 5.6f, 14.5f)
                lineTo(5f, 15f)
                moveTo(15f, 4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 4f)
                moveTo(15f, 10.1f)
                arcTo(2.1f, 2.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.9f, 8f)
                arcTo(2.1f, 2.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 5.9f)
                curveTo(16.16f, 5.9f, 17.1f, 6.84f, 17.1f, 8f)
                curveTo(17.1f, 9.16f, 16.16f, 10.1f, 15f, 10.1f)
                moveTo(15f, 13f)
                curveTo(12.33f, 13f, 7f, 14.33f, 7f, 17f)
                verticalLineTo(20f)
                horizontalLineTo(23f)
                verticalLineTo(17f)
                curveTo(23f, 14.33f, 17.67f, 13f, 15f, 13f)
                moveTo(21.1f, 18.1f)
                horizontalLineTo(8.9f)
                verticalLineTo(17f)
                curveTo(8.9f, 16.36f, 12f, 14.9f, 15f, 14.9f)
                curveTo(17.97f, 14.9f, 21.1f, 16.36f, 21.1f, 17f)
                verticalLineTo(18.1f)
                close()
            }
        }.build()

        return _AccountHeartOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AccountHeartOutline: ImageVector? = null
