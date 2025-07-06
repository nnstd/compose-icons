package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ClipboardPlus: ImageVector
    get() {
        if (_ClipboardPlus != null) {
            return _ClipboardPlus!!
        }
        _ClipboardPlus = ImageVector.Builder(
            name = "ClipboardPlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                horizontalLineTo(14.82f)
                curveTo(14.4f, 1.84f, 13.3f, 1f, 12f, 1f)
                curveTo(10.7f, 1f, 9.6f, 1.84f, 9.18f, 3f)
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
                moveTo(13f, 12f)
                horizontalLineTo(16f)
                verticalLineTo(14f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
                horizontalLineTo(8f)
                verticalLineTo(12f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _ClipboardPlus!!
    }

@Suppress("ObjectPropertyName")
private var _ClipboardPlus: ImageVector? = null
