package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ClipboardAccountOutline: ImageVector
    get() {
        if (_ClipboardAccountOutline != null) {
            return _ClipboardAccountOutline!!
        }
        _ClipboardAccountOutline = ImageVector.Builder(
            name = "ClipboardAccountOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 21f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 3f)
                horizontalLineTo(9.18f)
                curveTo(9.6f, 1.84f, 10.7f, 1f, 12f, 1f)
                curveTo(13.3f, 1f, 14.4f, 1.84f, 14.82f, 3f)
                horizontalLineTo(19f)
                moveTo(12f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 3f)
                moveTo(7f, 7f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                horizontalLineTo(17f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                moveTo(12f, 9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 9f)
                moveTo(8f, 17f)
                verticalLineTo(16f)
                curveTo(8f, 14.9f, 9.79f, 14f, 12f, 14f)
                curveTo(14.21f, 14f, 16f, 14.9f, 16f, 16f)
                verticalLineTo(17f)
                horizontalLineTo(8f)
                close()
            }
        }.build()

        return _ClipboardAccountOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ClipboardAccountOutline: ImageVector? = null
