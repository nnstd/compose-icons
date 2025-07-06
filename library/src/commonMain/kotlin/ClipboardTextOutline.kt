package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ClipboardTextOutline: ImageVector
    get() {
        if (_ClipboardTextOutline != null) {
            return _ClipboardTextOutline!!
        }
        _ClipboardTextOutline = ImageVector.Builder(
            name = "ClipboardTextOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                horizontalLineTo(14.82f)
                curveTo(14.25f, 1.44f, 12.53f, 0.64f, 11f, 1.2f)
                curveTo(10.14f, 1.5f, 9.5f, 2.16f, 9.18f, 3f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 21f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 3f)
                moveTo(12f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3f)
                moveTo(7f, 7f)
                horizontalLineTo(17f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                moveTo(17f, 11f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                horizontalLineTo(17f)
                verticalLineTo(11f)
                moveTo(15f, 15f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _ClipboardTextOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ClipboardTextOutline: ImageVector? = null
