package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountRemoveOutline: ImageVector
    get() {
        if (_AccountRemoveOutline != null) {
            return _AccountRemoveOutline!!
        }
        _AccountRemoveOutline = ImageVector.Builder(
            name = "AccountRemoveOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.46f, 8.88f)
                lineTo(2.88f, 7.46f)
                lineTo(5f, 9.59f)
                lineTo(7.12f, 7.46f)
                lineTo(8.54f, 8.88f)
                lineTo(6.41f, 11f)
                lineTo(8.54f, 13.12f)
                lineTo(7.12f, 14.54f)
                lineTo(5f, 12.41f)
                lineTo(2.88f, 14.54f)
                lineTo(1.46f, 13.12f)
                lineTo(3.59f, 11f)
                lineTo(1.46f, 8.88f)
                moveTo(15f, 4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 4f)
                moveTo(15f, 5.9f)
                arcTo(2.1f, 2.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.9f, 8f)
                arcTo(2.1f, 2.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 10.1f)
                curveTo(16.16f, 10.1f, 17.1f, 9.16f, 17.1f, 8f)
                curveTo(17.1f, 6.84f, 16.16f, 5.9f, 15f, 5.9f)
                moveTo(15f, 13f)
                curveTo(17.67f, 13f, 23f, 14.33f, 23f, 17f)
                verticalLineTo(20f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                curveTo(7f, 14.33f, 12.33f, 13f, 15f, 13f)
                moveTo(15f, 14.9f)
                curveTo(12f, 14.9f, 8.9f, 16.36f, 8.9f, 17f)
                verticalLineTo(18.1f)
                horizontalLineTo(21.1f)
                verticalLineTo(17f)
                curveTo(21.1f, 16.36f, 17.97f, 14.9f, 15f, 14.9f)
                close()
            }
        }.build()

        return _AccountRemoveOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AccountRemoveOutline: ImageVector? = null
