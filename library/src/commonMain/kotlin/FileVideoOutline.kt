package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileVideoOutline: ImageVector
    get() {
        if (_FileVideoOutline != null) {
            return _FileVideoOutline!!
        }
        _FileVideoOutline = ImageVector.Builder(
            name = "FileVideoOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 2f)
                lineTo(20f, 8f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 22f)
                horizontalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 20f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 2f)
                horizontalLineTo(14f)
                moveTo(18f, 20f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                moveTo(16f, 18f)
                lineTo(13.5f, 16.3f)
                verticalLineTo(18f)
                horizontalLineTo(8f)
                verticalLineTo(13f)
                horizontalLineTo(13.5f)
                verticalLineTo(14.7f)
                lineTo(16f, 13f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _FileVideoOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FileVideoOutline: ImageVector? = null
