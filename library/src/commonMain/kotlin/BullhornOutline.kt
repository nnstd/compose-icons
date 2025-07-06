package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BullhornOutline: ImageVector
    get() {
        if (_BullhornOutline != null) {
            return _BullhornOutline!!
        }
        _BullhornOutline = ImageVector.Builder(
            name = "BullhornOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 8f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 10f)
                verticalLineTo(14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 16f)
                horizontalLineTo(5f)
                verticalLineTo(20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 21f)
                horizontalLineTo(8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 20f)
                verticalLineTo(16f)
                horizontalLineTo(12f)
                lineTo(17f, 20f)
                verticalLineTo(4f)
                lineTo(12f, 8f)
                moveTo(15f, 15.6f)
                lineTo(13f, 14f)
                horizontalLineTo(4f)
                verticalLineTo(10f)
                horizontalLineTo(13f)
                lineTo(15f, 8.4f)
                verticalLineTo(15.6f)
                moveTo(21.5f, 12f)
                curveTo(21.5f, 13.71f, 20.54f, 15.26f, 19f, 16f)
                verticalLineTo(8f)
                curveTo(20.53f, 8.75f, 21.5f, 10.3f, 21.5f, 12f)
                close()
            }
        }.build()

        return _BullhornOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BullhornOutline: ImageVector? = null
