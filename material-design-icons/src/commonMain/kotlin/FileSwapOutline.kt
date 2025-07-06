package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileSwapOutline: ImageVector
    get() {
        if (_FileSwapOutline != null) {
            return _FileSwapOutline!!
        }
        _FileSwapOutline = ImageVector.Builder(
            name = "FileSwapOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 15f)
                lineTo(14f, 12f)
                verticalLineTo(14f)
                horizontalLineTo(10f)
                verticalLineTo(12f)
                lineTo(7f, 15f)
                lineTo(10f, 18f)
                verticalLineTo(16f)
                horizontalLineTo(14f)
                verticalLineTo(18f)
                moveTo(14f, 2f)
                horizontalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 22f)
                horizontalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 20f)
                verticalLineTo(8f)
                lineTo(14f, 2f)
                moveTo(18f, 20f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _FileSwapOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FileSwapOutline: ImageVector? = null
