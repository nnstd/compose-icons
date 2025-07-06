package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ClipboardTextPlay: ImageVector
    get() {
        if (_ClipboardTextPlay != null) {
            return _ClipboardTextPlay!!
        }
        _ClipboardTextPlay = ImageVector.Builder(
            name = "ClipboardTextPlay",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5f)
                verticalLineTo(13.34f)
                curveTo(20.36f, 13.11f, 19.68f, 13f, 19f, 13f)
                curveTo(15.68f, 13f, 13f, 15.69f, 13f, 19f)
                curveTo(13f, 19.68f, 13.11f, 20.36f, 13.34f, 21f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 3f)
                horizontalLineTo(9.18f)
                curveTo(9.5f, 2.16f, 10.14f, 1.5f, 11f, 1.2f)
                curveTo(12.53f, 0.64f, 14.25f, 1.44f, 14.82f, 3f)
                horizontalLineTo(19f)
                moveTo(12f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 3f)
                moveTo(11f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                moveTo(13f, 13f)
                verticalLineTo(11f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                moveTo(17f, 9f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                horizontalLineTo(17f)
                moveTo(17f, 16f)
                lineTo(22f, 19f)
                lineTo(17f, 22f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _ClipboardTextPlay!!
    }

@Suppress("ObjectPropertyName")
private var _ClipboardTextPlay: ImageVector? = null
